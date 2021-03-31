package com.cmap.custom.alloyeditor.configuration.portlet;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import com.liferay.dynamic.data.mapping.constants.DDMPortletKeys;

import org.osgi.service.component.annotations.Component;

import java.util.Map;
import java.util.Objects;

/**
 * @author alejandroroiz
 */
@Component(
	immediate = true,
	property = {
		"editor.name=alloyeditor",
		"javax.portlet.name=" + DDMPortletKeys.DYNAMIC_DATA_MAPPING_FORM_ADMIN,
		"service.ranking:Integer=100"
	},
	service = EditorConfigContributor.class
)
public class CMAPEditorConfigContributorPortlet extends BaseEditorConfigContributor {

	@Override
	public void populateConfigJSONObject( JSONObject jsonObject,
	Map<String, Object> inputEditorTaglibAttributes,
	ThemeDisplay themeDisplay,
	RequestBackedPortletURLFactory requestBackedPortletURLFactory ) {

		// Retrieve all AlloyEditor toolbars
		JSONObject toolbarsJSONObject = jsonObject.getJSONObject("toolbars");

		if (toolbarsJSONObject == null) {
			toolbarsJSONObject = JSONFactoryUtil.createJSONObject();
		}

		// Add extra CKEditor plugins
		String extraPlugins = jsonObject.getString("extraPlugins");

		if (Validator.isNotNull(extraPlugins)) {
			extraPlugins = extraPlugins + ",ae_uibridge,ae_autolink,ae_buttonbridge,ae_menubridge,ae_panelmenubuttonbridge,ae_placeholder,ae_richcombobridge,clipboard,font";
		}
		else {
			extraPlugins = "ae_uibridge,ae_autolink,ae_buttonbridge,ae_menubridge,ae_panelmenubuttonbridge,ae_placeholder,ae_richcombobridge,clipboard,font";
		}

		jsonObject.put("extraPlugins", extraPlugins);

		// Retrieve the style toolbar
		JSONObject stylesToolbar = toolbarsJSONObject.getJSONObject("styles");

		if (stylesToolbar == null) {
			stylesToolbar = JSONFactoryUtil.createJSONObject();
		}

		/* Get the selections array. There are 5 types of selections in the style toolbar
		 * embedurl: Appears when embedded content is selected.
		 * image: Appears when an image is selected.
		 * link: Appears when a hyperlink is selected.
		 * table: Appears when a table is selected.
		 * text: Appears when text is highlighted.
		 */
		JSONArray selectionsJSONArray = stylesToolbar.getJSONArray("selections");

		for (int i = 0; i < selectionsJSONArray.length(); i++) {
			JSONObject selection = selectionsJSONArray.getJSONObject(i);

			if ( Objects.equals(selection.get("name"), "text")) {
				JSONArray buttons = selection.getJSONArray("buttons");

				buttons.put("Copy");
				buttons.put("Cut");
				buttons.put("Paste");

				buttons.put("Font");
				buttons.put("FontSize");
			}
		}

		stylesToolbar.put("selections", selectionsJSONArray);

		toolbarsJSONObject.put("styles", stylesToolbar);

		jsonObject.put("toolbars", toolbarsJSONObject);

		System.out.println(jsonObject + "\n");
	}
}