package com.liferay.docs.my.button.portlet;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import java.util.Map;
import java.util.Objects;
import org.osgi.service.component.annotations.Component;

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
public class MyEditorConfigContributorPortlet extends BaseEditorConfigContributor {

	@Override
	public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {
		
		// Adding functionality to the Editor's toolbar
		
		// Get the toolbar object
		JSONObject toolbarsJSONObject = jsonObject.getJSONObject("toolbars");
		// if the object does not exist, create it
		if (toolbarsJSONObject == null) {
			toolbarsJSONObject = JSONFactoryUtil.createJSONObject();
		}
		
		// Adding items to the ADD toolbar
		JSONObject addToolbar = toolbarsJSONObject.getJSONObject("add");
		JSONArray addToolbarButtons = addToolbar.getJSONArray("buttons");
		
		// Add a button
		addToolbarButtons.put("logSelectedText");
		addToolbarButtons.put("marquee");
		
		// Update AlloyEditor's configuration

		addToolbar.put("buttons", addToolbarButtons);
		toolbarsJSONObject.put("add", addToolbar);
		jsonObject.put("toolbars", toolbarsJSONObject);
		// After this the indentBlock button will be added to the Add toolbar. This will appear in ALL alloyeditors
		
		// Adding items to the STYLES toolbar
		// Get the styles toolbar inside the toolbar object
		JSONObject stylesToolbar = toolbarsJSONObject.getJSONObject("styles");
		// If the object does not exist, create it
		if (stylesToolbar == null) {
		        stylesToolbar = JSONFactoryUtil.createJSONObject();
		}
		// Get the selections toolbar (style toolbar wrapper object)
		JSONArray selectionsJSONArray = stylesToolbar.getJSONArray("selections");
		// Iterate through the selections toolbar
		for (int i = 0; i < selectionsJSONArray.length(); i++) {
			// Get all the styles toolbars
	        JSONObject selection = selectionsJSONArray.getJSONObject(i);

	        // Grab the toolbar you want (text in this case)
	        if (Objects.equals(selection.get("name"), "text")) {	
	        		// Grab the buttons
	                JSONArray buttons = selection.getJSONArray("buttons");
	                
	                // CLEAN STYLES/TEXT TOOLBAR
	                
	                // Add the functionalities
	                buttons.put("code");
	        		// NOT WORKING buttons.put("strike");
	        		buttons.put("h1");
	        		buttons.put("h2");
	        		buttons.put("paragraphLeft");
	        		buttons.put("paragraphRight");
	        		buttons.put("paragraphCenter");
	        		buttons.put("paragraphJustify");
	        		// NOT WORKING buttons.put("superscript");
	        		// NOT WORKING buttons.put("subscript");
	        		// NOT WORKING buttons.put("indentBlock");
	        		// NOT WORKING buttons.put("quote");
	        		buttons.put("removeFormat");
	        }
		}
		
		// Update AlloyEditor's configuration
		stylesToolbar.put("selections", selectionsJSONArray);
		toolbarsJSONObject.put("styles", stylesToolbar);
		jsonObject.put("toolbars", toolbarsJSONObject);
		
	}
}