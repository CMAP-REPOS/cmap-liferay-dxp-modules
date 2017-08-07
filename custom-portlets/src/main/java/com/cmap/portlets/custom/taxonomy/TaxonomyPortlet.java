package com.cmap.portlets.custom.taxonomy;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.service.AssetVocabularyLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"com.liferay.portlet.display-category=CMAP",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=Taxonomy Portlet",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/taxonomy/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
	)

public class TaxonomyPortlet extends MVCPortlet {

	private static Log _log = LogFactoryUtil.getLog(TaxonomyPortlet.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) {

		List<AssetCategory> updatesTopics = getUpdateTopicsCategories();

		Map<String, String> categoriesWithAncestors = new LinkedHashMap<String, String>();

		for (AssetCategory assetCategory : updatesTopics) {
			AssetCategory parent = assetCategory.getParentCategory();
			if (parent != null) {
				categoriesWithAncestors.put(String.valueOf(assetCategory.getCategoryId()),
						String.format("%s > %s", parent.getName(), assetCategory.getName()));
			} else {
				categoriesWithAncestors.put(String.valueOf(assetCategory.getCategoryId()), assetCategory.getName());
			}
		}

		Map<String, String> sortedCategories = categoriesWithAncestors.entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		renderRequest.setAttribute("updatesTopics", sortedCategories);

		try {
			super.doView(renderRequest, renderResponse);
		} catch (IOException | PortletException ex) {
			_log.error("Exception in TaxonomyPortlet.doView" + ex.getMessage(), ex);
		}
	}

	private List<AssetCategory> getUpdateTopicsCategories() {

		List<AssetVocabulary> vocabularies = new ArrayList<AssetVocabulary>();
		List<AssetCategory> categories = new ArrayList<AssetCategory>();

		// set up query to get parent vocabulary
		DynamicQuery queryVocabularies = DynamicQueryFactoryUtil.forClass(AssetVocabulary.class)
				.add(PropertyFactoryUtil.forName("name").eq("Updates Topics"));

		try {
			vocabularies = AssetVocabularyLocalServiceUtil.dynamicQuery(queryVocabularies, 0, 1);

			if (vocabularies.size() < 1) {
				return categories;
			}

			// set up query to get categories
			DynamicQuery queryCategories = DynamicQueryFactoryUtil.forClass(AssetCategory.class)
					.add(PropertyFactoryUtil.forName("vocabularyId").eq((vocabularies.get(0)).getVocabularyId()));

			categories = AssetVocabularyLocalServiceUtil.dynamicQuery(queryCategories, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);

		} catch (SystemException ex) {
			_log.error("Exception in TaxonomyPortlet.getUpdateTopicsCategories" + ex.getMessage(), ex);
		}

		return categories;
	}
}
