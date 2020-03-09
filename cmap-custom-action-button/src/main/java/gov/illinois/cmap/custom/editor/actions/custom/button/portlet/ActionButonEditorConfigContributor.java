package gov.illinois.cmap.custom.editor.actions.custom.button.portlet;

import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.Map;

/**
 * @author alejandroroiz
 */
@Component(
    immediate = true,
    property = {
      "editor.name=alloyeditor",
      "service.ranking:Integer=100"
    },
    service = EditorConfigContributor.class  
)

public class ActionButonEditorConfigContributor extends BaseEditorConfigContributor {

	@Override
	public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {
		JSONObject toolbarsJSONObject = jsonObject.getJSONObject("toolbars");

		if (toolbarsJSONObject == null) {
		        toolbarsJSONObject = JSONFactoryUtil.createJSONObject();
		}
		JSONObject addToolbar = toolbarsJSONObject.getJSONObject("add");
		JSONArray addToolbarButtons = addToolbar.getJSONArray("buttons");
		
		//put
		addToolbarButtons.put("actionButton");
		
		addToolbar.put("buttons", addToolbarButtons);
		toolbarsJSONObject.put("add", addToolbar);
		jsonObject.put("toolbars", toolbarsJSONObject);
		
	}
}