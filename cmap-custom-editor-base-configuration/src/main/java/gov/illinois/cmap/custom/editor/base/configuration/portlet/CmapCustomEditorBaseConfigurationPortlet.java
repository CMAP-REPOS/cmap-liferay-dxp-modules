package gov.illinois.cmap.custom.editor.base.configuration.portlet;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

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
public class CmapCustomEditorBaseConfigurationPortlet extends BaseEditorConfigContributor {

	@Override
	public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {
		
		// CLEAN THE DROPDOWN STYLES
		// Get the Dropdown Styles from the Toolbars Styles Selections Text Buttons
		JSONArray dropdownStyles = jsonObject.getJSONObject("toolbars").getJSONObject("styles").getJSONArray("selections").getJSONObject(3).
				getJSONArray("buttons").getJSONObject(0).getJSONObject("cfg").getJSONArray("styles");
      
		// Clean the dropdown from all the formats not needed for our project
		JSONArray cleanDropdown = cleanDropdownStyles(dropdownStyles, 2);
		// Insert the cleanDropdown into the Toolbar Configuration
		jsonObject.getJSONObject("toolbars").getJSONObject("styles").getJSONArray("selections").getJSONObject(3).getJSONArray("buttons").getJSONObject(0).getJSONObject("cfg")
			.put("styles", cleanDropdown);
		
		// GET TOOLBARS
		JSONObject toolbarsJSONObject = jsonObject.getJSONObject("toolbars");
		if (toolbarsJSONObject == null) {
		        toolbarsJSONObject = JSONFactoryUtil.createJSONObject();
		}
		
		// ADD CKeditor Plugins
		/*
		 * The following CKEditor Plugins have been added:
		 * 
		 * Clipboard = Cut/Copy/Paste
		 * Font = FontFamily/FontSize
		 * Undo = Undo/Redo
		 * Pagebreak = Pagebreak
		 * Indent = IndentBlock
		 * SelectAll = SelectAll
		 * Find = Find/Replace
		 * SpecialChar = SpecialChar
		 * Templates = Templates
		 * Format = FormatDropdown
		 * BasicStyles = Bold/Italic/Underline/Strike/Subscript/Superscript
		 * SCAYT = Spell Check As You Type
		 * 
		 * All the other plugins
		 */
		String extraPlugins = jsonObject.getString("extraPlugins");
		if (Validator.isNotNull(extraPlugins)) {
		  extraPlugins = extraPlugins + ",ae_uibridge,ae_buttonbridge,ae_menubridge,ae_panelmenubuttonbridge,ae_richcombobridge,ae_autolink,ae_placeholder," +
				  "clipboard,font,undo,pagebreak,indent,selectall,find,specialchar,templates,format";
		}
		else {
		  extraPlugins = "ae_uibridge,ae_buttonbridge,ae_menubridge,ae_panelmenubuttonbridge,ae_richcombobridge,ae_autolink,ae_placeholder," + 
				  "clipboard,font,undo,pagebreak,indent,selectall,find,specialchar,templates,format";
		}
		jsonObject.put("extraPlugins", extraPlugins);
		
		// ADD TOOLBAR
		JSONObject addToolbar = toolbarsJSONObject.getJSONObject("add");
		JSONArray addToolbarButtons = addToolbar.getJSONArray("buttons");
		
		// Add buttons to add toolbar
        addToolbarButtons.put("PageBreak");
        addToolbarButtons.put("SpecialChar");
        
        // TODO:
        // Add templates URL
        addToolbarButtons.put("Templates");
		
		// Add config too AlloyEditor
		addToolbar.put("buttons", addToolbarButtons);
		toolbarsJSONObject.put("add", addToolbar);
		jsonObject.put("toolbars", toolbarsJSONObject);
		
		// STYLES TOOLBAR
		JSONObject stylesToolbar = toolbarsJSONObject.getJSONObject("styles");
		if (stylesToolbar == null) {
		        stylesToolbar = JSONFactoryUtil.createJSONObject();
		}
		JSONArray selectionsJSONArray = stylesToolbar.getJSONArray("selections");
		
		// Iterate through selections Array 
		// Text/EmbedURL/Table/Link/Image
		for (int i = 0; i < selectionsJSONArray.length(); i++) {
	        JSONObject selection = selectionsJSONArray.getJSONObject(i);
	        
	        // Get text selection
	        if (Objects.equals(selection.get("name"), "text")) {
	                JSONArray buttons = selection.getJSONArray("buttons");
	                
	                // Add buttons to style toolbar
	                /* 
	                 * NOT WORKING OOTB ALLOYEDITOR:
	                 * strike
	                 * superscript
	                 * subscript
	                 * quote
	                 * indentBlock
	                 * 
	                 * NOT WORKING OOTB CKEDITOR PLUGINS:
	                 * Format
	                 * BasicStyles
	                 * pagebreak
	                 * SCAYT
	                 * IndentBlock (only lists)
	                */
	                buttons.put("Indent");
	                buttons.put("removeFormat");
	                buttons.put("Font");
	                buttons.put("FontSize");
	                buttons.put("Copy");
	                buttons.put("Cut");
	                buttons.put("Paste");
	                buttons.put("Undo");
	                buttons.put("Redo");
	                buttons.put("paragraphRight");
	                buttons.put("paragraphLeft");
	                buttons.put("paragraphCenter");
	                buttons.put("paragraphJustify");
	                buttons.put("SelectAll");
	                buttons.put("Find");
	                buttons.put("Replace");
//	                buttons.put("Scayt");
	                //AlloyEditor Strike
	                //buttons.put("strike");
	                //CKEditor Strike
	                //buttons.put("Strike");
	                
	        }
		}
		
		// Add config to AlloyEditor
		stylesToolbar.put("selections", selectionsJSONArray);
		toolbarsJSONObject.put("styles", stylesToolbar);
		jsonObject.put("toolbars", toolbarsJSONObject);
		
	}
	
	/*
	 * Helper function to remove the Format Styles Dropdown
	 * @param: styleButtonsJSONArray = the buttonToolbar to clean
	 * @param: index = the limit to which we will remove itmes from the dropdown
	 * @return: newJSONArray = a new Array that has all the elements of styleButtonsArray except index
	 */
	private JSONArray cleanDropdownStyles (JSONArray dropdownStyles, int index) {
		
		JSONArray newJSONArray = JSONFactoryUtil.createJSONArray();
		
		for (int i = 0; i <= index; i++) {
			newJSONArray.put(dropdownStyles.get(i));
		}
		
		return newJSONArray;
	}
}