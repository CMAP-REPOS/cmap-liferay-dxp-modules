/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

// https://www.google.com/search?q=print+to+console+java+liferay+portlet&oq=print+to+console+java+liferay+portlet&aqs=chrome..69i57.7014j0j9&sourceid=chrome&ie=UTF-8

package com.cmap.ckeditor.config;

import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.osgi.service.component.annotations.Component;

// import java.util.Map;
import java.util.*;

@Component(
  property = {
		 "editor.name=ckeditor",
		 "service.ranking:Integer=100"
  },

  // https://docs.liferay.com/portal/7.0/javadocs/portal-kernel/com/liferay/portal/kernel/editor/configuration/EditorConfigContributor.html
  service = EditorConfigContributor.class
)



public class CMAPCKEditorConfigContributor extends BaseEditorConfigContributor {

	final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	@Override
	public void populateConfigJSONObject(
			JSONObject jsonObject, 
			Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay,
			RequestBackedPortletURLFactory requestBackedPortletURLFactory
		) {
		// https://docs.liferay.com/portal/7.0/javadocs/portal-kernel/com/liferay/portal/kernel/theme/ThemeDisplay.html
		// https://docs.liferay.com/portal/7.0/javadocs/portal-kernel/com/liferay/portal/kernel/json/JSONObject.html
		// https://docs.liferay.com/portal/7.0/javadocs/portal-kernel/com/liferay/portal/kernel/json/JSONArray.html

		jsonObject.put("bodyClass", "journal-content-article");
		jsonObject.put("bodyId", "cmap-ckeditor");
		
		JSONArray contentsCss = JSONFactoryUtil.createJSONArray();
		contentsCss.put("/o/cmap-onto-2050-theme/css/main.css");
		contentsCss.put("/o/cmap-onto-2050-theme/css/aui.css");
		contentsCss.put("https://cloud.webtype.com/css/2f300d46-99ee-4656-bf09-870688012aaf.css");
		contentsCss.put("https://cloud.typography.com/7947314/7427752/css/fonts.css");
		jsonObject.put("contentsCss", contentsCss);

		jsonObject.put("emailProtection", "encode");
		jsonObject.put("extraPlugins", "scayt,itemselector,lfrpopup,widget,advertisement,page-cards,actions,recommendations,full-width-image");
		jsonObject.put("format_tags", "p;h1;h2");

		try{
			jsonObject.put("format_h1", JSONFactoryUtil.createJSONObject("{ element: 'h1', attributes: { 'class': 'page-headline bold alt-color' } }"));
			jsonObject.put("format_h2", JSONFactoryUtil.createJSONObject("{ element: 'h2', attributes: { 'class': 'section-sub-headline bold alt-color' } }"));
			jsonObject.put("format_p", JSONFactoryUtil.createJSONObject("{ element: 'p', attributes: { 'class': 'presna-normal' } }"));
			// jsonObject.put("format_h3", JSONFactoryUtil.createJSONObject("{ element: 'h3', attributes: { 'class': 'normal-headline bold' } }"));
			// jsonObject.put("format_h4", JSONFactoryUtil.createJSONObject("{ element: 'h4', attributes: { 'class': 'section-sub-headline bold' } }"));
			// jsonObject.put("format_h5", JSONFactoryUtil.createJSONObject("{ element: 'h5', attributes: { 'class': 'normal-headline bold' } }"));
			// jsonObject.put("format_h6", JSONFactoryUtil.createJSONObject("{ element: 'h6', attributes: { 'class': 'small-headline bold' } }"));

		} catch( Exception e ){
			logger.error(e.getMessage());

		}

		jsonObject.put("grayt_autoStartup", true);
		jsonObject.put("height", 320);
		jsonObject.put("notification_duration", 0);
		jsonObject.put("language_list", JSONFactoryUtil.createJSONArray());
		jsonObject.put("removeButtons", "Save,NewPage,Preview,Print,Form,Checkbox,Radio,TextField,Textarea,Select,Button,ImageButton,HiddenField,CreateDiv,Flash,Smiley,Iframe,Language,BidiRtl,BidiLtr,About,Font,FontSize");
		jsonObject.put("scayt_autoStartup", true);
		jsonObject.put("scayt_ignoreAllCapsWords", true);
		jsonObject.put("scayt_ignoreDomainNames", true);
		jsonObject.put("scayt_userDictionaryName", "CMAP");
		// jsonObject.put("scayt_ignoreWordsWithNumbers", true);
		// jsonObject.put("scayt_elementsToIgnore", "del,pre");
		// jsonObject.put("scayt_contextCommands", "ignoreall|add");
		// jsonObject.put("scayt_uiTabs", "1,0,0");
		jsonObject.put("stylesSet", "cmap_styles");
		jsonObject.put("templates", "cmap");
		jsonObject.put("templates_replaceContent", false);
		jsonObject.put("toolbarCanCollapse", true);
		jsonObject.put("uiColor", "#E4EBEE");
		try{
			jsonObject.put("toolbarGroups", JSONFactoryUtil.createJSONArray("[{ name: 'document', groups: [ 'mode', 'document', 'doctools' ] }, { name: 'clipboard', groups: [ 'clipboard', 'undo' ] }, { name: 'editing', groups: [ 'find', 'selection', 'spellchecker', 'editing' ] }, { name: 'insert', groups: [ 'insert' ] }, { name: 'tools', groups: [ 'tools' ] }, { name: 'forms', groups: [ 'forms' ] }, '/', { name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] }, { name: 'links', groups: [ 'links' ] }, { name: 'colors', groups: [ 'colors' ] }, { name: 'paragraph', groups: [ 'align', 'list', 'indent', 'blocks', 'bidi', 'paragraph' ] }, { name: 'styles', groups: [ 'styles' ] }, { name: 'others', groups: [ 'others' ] }, { name: 'about', groups: [ 'about' ] } ]"));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		if(false){
			jsonObject.put("dialog_startupFocusTab", true);
			jsonObject.put("fillEmptyBlocks", false);
			jsonObject.put("ignoreEmptyParagraph", false);
			jsonObject.put("startupFocus", "end");
			jsonObject.put("fontSize_sizes", "Small/12px;Normal/15px;Large/18px;H3/26px;H2/30px;H1/36px;Huge/72px;");
			jsonObject.put("font_names", "Whitney/'Whitney SSm A', 'Whitney SSm B', sans-serif;Prensa/'Prensa LF', serif");
			jsonObject.put("colorButton_colors", "000,3C5976,004F93,88a0b2,E4EBEE,FFF,750709,DB2028,F47932,5E5011,9E7A38,E7BB20,346139,6CAD4E,A2D06D,008FD4,5E7A87,E2E7EA,587387,F7F9FA");
			jsonObject.put("colorButton_enableAutomatic", false);
		}

		logger.warn(jsonObject.toString());
	}
}