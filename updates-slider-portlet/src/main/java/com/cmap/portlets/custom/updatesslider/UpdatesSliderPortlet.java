package com.cmap.portlets.custom.updatesslider;

import com.cmap.portlets.custom.updatesslider.constants.UpdatesSliderPortletKeys;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

@Component(
	configurationPid = "com.cmap.portlets.custom.updatesslider.UpdatesSliderConfiguration",
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=CMAP",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Updates Slider",
		"javax.portlet.init-param.config-template=/configuration.jsp",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UpdatesSliderPortletKeys.UpdatesSliderPortlet,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UpdatesSliderPortlet extends MVCPortlet {

	private static final Log _log = LogFactoryUtil.getLog(UpdatesSliderPortlet.class);
	private static final Locale _locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
	private static final String _linkPrefix = "/updates/all/-/asset_publisher/UIMfSLnFfMB6/content/";
	private volatile UpdatesSliderConfiguration _updatesSliderConfiguration;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			PortletPreferences portletPreferences = renderRequest.getPreferences();
			long assetCategoryId = 0;
			int assetCount = 0;
			int summaryLength = 0;

			if (Validator.isNotNull(_updatesSliderConfiguration)) {
				String assetCategoryIdPref = portletPreferences.getValue("assetCategoryId",
						_updatesSliderConfiguration.assetCategoryId());

				String assetCountPref = portletPreferences.getValue("assetCount",
						_updatesSliderConfiguration.assetCount());

				String summaryLengthPref = portletPreferences.getValue("summaryLength",
						_updatesSliderConfiguration.summaryLength());

				if (Validator.isDigit(assetCategoryIdPref)) {
					assetCategoryId = Long.parseLong(assetCategoryIdPref);
				}

				if (Validator.isDigit(assetCountPref)) {
					assetCount = Integer.parseInt(assetCountPref);
				}

				if (Validator.isDigit(summaryLengthPref)) {
					summaryLength = Integer.parseInt(summaryLengthPref);
				}
			}

			if (assetCategoryId != 0) {

				AssetEntryPublishDateComparator comparator = new AssetEntryPublishDateComparator();

				List<AssetEntry> assetEntries = AssetEntryLocalServiceUtil.getAssetCategoryAssetEntries(assetCategoryId,
						0, assetCount, comparator);

				List<UpdatesSliderAssetModel> assetModels = new ArrayList<UpdatesSliderAssetModel>();

				for (AssetEntry assetEntry : assetEntries) {
					UpdatesSliderAssetModel assetModel = getAssetModel(assetEntry, summaryLength);
					if (assetModel != null) {
						assetModels.add(assetModel);
					}
				}

				renderRequest.setAttribute("assetModels", assetModels);
			}

			renderRequest.setAttribute(UpdatesSliderConfiguration.class.getName(), _updatesSliderConfiguration);

		} catch (Exception ex) {
			_log.error("Exception in UpdatesSliderPortlet.doView(): " + ex.getMessage());
		}

		super.doView(renderRequest, renderResponse);
	}

	protected UpdatesSliderAssetModel getAssetModel(AssetEntry assetEntry, int summaryLength) {

		UpdatesSliderAssetModel assetModel = new UpdatesSliderAssetModel(StringPool.BLANK, StringPool.BLANK,
				StringPool.BLANK, StringPool.BLANK);

		try {
			DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
			AssetRenderer<?> assetRenderer = assetEntry.getAssetRenderer();

			Date publishDate = assetEntry.getPublishDate();
			String title = assetEntry.getTitle(_locale);
			String summary = assetRenderer.getSummary();
			String dateFormatted = dateFormat.format(publishDate);
			String link = _linkPrefix + assetRenderer.getUrlTitle();

			if (summary.isEmpty()) {
				summary = assetEntry.getDescription(_locale);
			}

			if (summary.length() > summaryLength) {
				summary = summary.substring(0, summaryLength - 3) + "...";
			}

			if (title.isEmpty() || summary.isEmpty() || link.isEmpty() || dateFormatted.isEmpty()) {
				assetModel = null;
				_log.warn("Warning in UpdatesSliderPortlet.getAssetModel(): returning null UpdatesSliderAssetModel");
			} else {
				assetModel.setTitle(title);
				assetModel.setDate(dateFormatted);
				assetModel.setSummary(summary);
				assetModel.setLink(link);
			}

		} catch (Exception ex) {
			_log.error("Exception in UpdatesSliderPortlet.getAssetModel(): " + ex.getMessage());
			assetModel = null;
		}

		return assetModel;
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		try {
			_updatesSliderConfiguration = ConfigurableUtil.createConfigurable(UpdatesSliderConfiguration.class,
					properties);
		} catch (Exception ex) {
			_log.error("Exception in UpdatesSliderPortlet.activate(): " + ex.getMessage());
		}
	}
}