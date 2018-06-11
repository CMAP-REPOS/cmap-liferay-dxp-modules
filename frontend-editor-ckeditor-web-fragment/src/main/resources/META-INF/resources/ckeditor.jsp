<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
String portletId = portletDisplay.getRootPortletId();

boolean autoCreate = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:input-editor:autoCreate"));
String contents = (String)request.getAttribute("liferay-ui:input-editor:contents");
String cssClass = GetterUtil.getString((String)request.getAttribute("liferay-ui:input-editor:cssClass"));
Map<String, Object> data = (Map<String, Object>)request.getAttribute("liferay-ui:input-editor:data");
String editorName = (String)request.getAttribute("liferay-ui:input-editor:editorName");
String initMethod = (String)request.getAttribute("liferay-ui:input-editor:initMethod");
boolean inlineEdit = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:input-editor:inlineEdit"));
String inlineEditSaveURL = GetterUtil.getString((String)request.getAttribute("liferay-ui:input-editor:inlineEditSaveURL"));
String name = GetterUtil.getString((String)request.getAttribute("liferay-ui:input-editor:name"));

String onBlurMethod = (String)request.getAttribute("liferay-ui:input-editor:onBlurMethod");

if (Validator.isNotNull(onBlurMethod)) {
	onBlurMethod = namespace + onBlurMethod;
}

String onChangeMethod = (String)request.getAttribute("liferay-ui:input-editor:onChangeMethod");

if (Validator.isNotNull(onChangeMethod)) {
	onChangeMethod = namespace + onChangeMethod;
}

String onFocusMethod = (String)request.getAttribute("liferay-ui:input-editor:onFocusMethod");

if (Validator.isNotNull(onFocusMethod)) {
	onFocusMethod = namespace + onFocusMethod;
}

String onInitMethod = (String)request.getAttribute("liferay-ui:input-editor:onInitMethod");

if (Validator.isNotNull(onInitMethod)) {
	onInitMethod = namespace + onInitMethod;
}

boolean skipEditorLoading = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:input-editor:skipEditorLoading"));

String toolbarSet = (String)request.getAttribute("liferay-ui:input-editor:toolbarSet");

if (!inlineEdit) {
	name = namespace + name;
}

JSONObject editorConfigJSONObject = null;

if (data != null) {
	editorConfigJSONObject = (JSONObject)data.get("editorConfig");
}

EditorOptions editorOptions = null;

if (data != null) {
	editorOptions = (EditorOptions)data.get("editorOptions");
}

Map<String, Object> editorOptionsDynamicAttributes = null;

if (editorOptions != null) {
	editorOptionsDynamicAttributes = editorOptions.getDynamicAttributes();
}
%>

<c:if test="<%= !skipEditorLoading %>">
	<liferay-util:html-top outputKey="js_editor_ckeditor_skip_editor_loading">
		<style type="text/css">
			table.cke_dialog {
				position: absolute !important;
			}
		</style>

		<%
		long javaScriptLastModified = PortalWebResourcesUtil.getLastModified(PortalWebResourceConstants.RESOURCE_TYPE_EDITOR_CKEDITOR);
		%>

		<script>
		console.log('<%= PortalUtil.getStaticResourceURL(request, themeDisplay.getCDNHost() + PortalWebResourcesUtil.getContextPath(PortalWebResourceConstants.RESOURCE_TYPE_EDITOR_CKEDITOR) + "/ckeditor/ckeditor.js", javaScriptLastModified) %>');
		</script>

		<script data-senna-track="temporary" src="<%= HtmlUtil.escapeAttribute(PortalUtil.getStaticResourceURL(request, themeDisplay.getCDNHost() + PortalWebResourcesUtil.getContextPath(PortalWebResourceConstants.RESOURCE_TYPE_EDITOR_CKEDITOR) + "/ckeditor/ckeditor.js", javaScriptLastModified)) %>" type="text/javascript"></script>

		<c:if test="<%= inlineEdit && Validator.isNotNull(inlineEditSaveURL) %>">
			<script data-senna-track="temporary" src="<%= HtmlUtil.escapeAttribute(PortalUtil.getStaticResourceURL(request, themeDisplay.getCDNHost() + PortalWebResourcesUtil.getContextPath(PortalWebResourceConstants.RESOURCE_TYPE_EDITOR_CKEDITOR) + "/ckeditor/main.js", javaScriptLastModified)) %>" type="text/javascript"></script>
		</c:if>

		<liferay-util:dynamic-include key='<%= "com.liferay.frontend.editor.ckeditor.web#" + editorName + "#additionalResources" %>' />

		<script data-senna-track="temporary" type="text/javascript">
			Liferay.namespace('EDITORS')['<%= editorName %>'] = true;

			CKEDITOR.scriptLoader.loadScripts = function(scripts, success, failure) {
				CKEDITOR.scriptLoader.load(scripts, success, failure);
			};

			CKEDITOR.getNextZIndex = function() {
				return CKEDITOR.dialog._.currentZIndex ? CKEDITOR.dialog._.currentZIndex + 10 : Liferay.zIndex.WINDOW + 10;
			};

			var destroyGlobalEditor = function() {
				window.CKEDITOR = undefined;
				Liferay.detach('beforeScreenFlip', destroyGlobalEditor);
			};

			Liferay.on('beforeScreenFlip', destroyGlobalEditor);
		</script>
	</liferay-util:html-top>
</c:if>

<%
String textareaName = HtmlUtil.escapeAttribute(name);
String modules = "aui-node-base";
if (inlineEdit && Validator.isNotNull(inlineEditSaveURL)) {
	textareaName = textareaName + "_original";
	modules += ",inline-editor-ckeditor";
}
%>

<liferay-util:buffer var="editor">
	<textarea id="<%= textareaName %>" name="<%= textareaName %>" style="display: none;"></textarea>
</liferay-util:buffer>

<div class="<%= HtmlUtil.escapeAttribute(cssClass) %>" id="<%= HtmlUtil.escapeAttribute(name) %>Container">
	<c:if test="<%= autoCreate %>">
		<%= editor %>
	</c:if>
</div>

<script type="text/javascript">
	CKEDITOR.disableAutoInline = true;
</script>

<%
name = HtmlUtil.escapeJS(name);
%>

<aui:script use="<%= modules %>">
	var UA = A.UA;

	var getInitialContent = function() {
		var data;
		if (window['<%= HtmlUtil.escapeJS(namespace + initMethod) %>']) {
			data = <%= HtmlUtil.escapeJS(namespace + initMethod) %>();
		} else {
			data = '<%= contents != null ? HtmlUtil.escapeJS(contents) : StringPool.BLANK %>';
		}
		return data;
	};

	window['<%= name %>'] = {
		create: function() {
			if (!window['<%= name %>'].instanceReady) {
				var editorNode = A.Node.create('<%= HtmlUtil.escapeJS(editor) %>');
				var editorContainer = A.one('#<%= name %>Container');
				editorContainer.appendChild(editorNode);
				createEditor();
			}
		},

		destroy: function() {
			window['<%= name %>'].dispose();
			window['<%= name %>'] = null;
		},

		dispose: function() {
			var editor = CKEDITOR.instances['<%= name %>'];
			if (editor) {
				editor.destroy();
				window['<%= name %>'].instanceReady = false;
			}
			var editorEl = document.getElementById('<%= name %>');
			if (editorEl) {
				editorEl.parentNode.removeChild(editorEl);
			}
		},

		focus: function() {
			CKEDITOR.instances['<%= name %>'].focus();
		},

		getCkData: function() {
			var data;
			if (!window['<%= name %>'].instanceReady) {
				data = getInitialContent();
			} else {
				data = CKEDITOR.instances['<%= name %>'].getData();
				if (CKEDITOR.env.gecko && (CKEDITOR.tools.trim(data) == '<br />')) {
					data = '';
				}
			}
			return data;
		},

		getHTML: function() {
			return window['<%= name %>'].getCkData();
		},

		getNativeEditor: function() {
			return CKEDITOR.instances['<%= name %>'];
		},

		getText: function() {
			var data;
			if (!window['<%= name %>'].instanceReady) {
				data = getInitialContent();
			} else {
				var editor = CKEDITOR.instances['<%= name %>'];
				data = editor.editable().getText();
			}
			return data;
		},

		instanceReady: false,

		<c:if test="<%= Validator.isNotNull(onBlurMethod) %>">
			onBlurCallback: function() {
				window['<%= HtmlUtil.escapeJS(onBlurMethod) %>'](CKEDITOR.instances['<%= name %>']);
			},
		</c:if>

		<c:if test="<%= Validator.isNotNull(onChangeMethod) %>">
			onChangeCallback: function() {
				var ckEditor = CKEDITOR.instances['<%= name %>'];
				var dirty = ckEditor.checkDirty();
				if (dirty) {
					window['<%= HtmlUtil.escapeJS(onChangeMethod) %>'](window['<%= name %>'].getHTML());
					ckEditor.resetDirty();
				}
			},
		</c:if>

		<c:if test="<%= Validator.isNotNull(onFocusMethod) %>">
			onFocusCallback: function() {
				window['<%= HtmlUtil.escapeJS(onFocusMethod) %>'](CKEDITOR.instances['<%= name %>']);
			},
		</c:if>

		setHTML: function(value) {
			var ckEditorInstance = CKEDITOR.instances['<%= name %>'];
			var win = window['<%= name %>'];
			var setHTML = function(data) {
				ckEditorInstance.setData(data);
				win._setStyles();
			};
			if (win.instanceReady) {
				setHTML(value);
			}
			else {
				ckEditorInstance.on(
					'instanceReady',
					function() {
						setHTML(value);
					}
				);
			}
		}
	};

	var addAUIClass = function(iframe) {
		if (iframe) {
			var iframeWin = iframe.getDOM().contentWindow;
			if (iframeWin) {
				var iframeDoc = iframeWin.document.documentElement;
				A.one(iframeDoc).addClass('aui');
			}
		}
	};

	window['<%= name %>']._setStyles = function() {
		var ckEditor = A.one('#cke_<%= name %>');
		if (ckEditor) {
			var iframe = ckEditor.one('iframe');
			addAUIClass(iframe);

			var ckePanelDelegate = Liferay.Data['<%= name %>Handle'];
			if (!ckePanelDelegate) {
				ckePanelDelegate = ckEditor.delegate(
					'click',
					function(event) {
						var panelFrame = A.one('.cke_combopanel .cke_panel_frame');
						addAUIClass(panelFrame);
						ckePanelDelegate.detach();
						Liferay.Data['<%= name %>Handle'] = null;
					},
					'.cke_combo'
				);
				Liferay.Data['<%= name %>Handle'] = ckePanelDelegate;
			}
		}
	};

	Liferay.fire(
		'editorAPIReady',
		{
			editor: window['<%= name %>'],
			editorName: '<%= name %>'
		}
	);

	<c:if test="<%= inlineEdit && Validator.isNotNull(inlineEditSaveURL) %>">
		var inlineEditor;

		Liferay.on(
			'toggleControls',
			function(event) {
				if (event.src === 'ui') {
					var ckEditor = CKEDITOR.instances['<%= name %>'];

					if (event.enabled && !ckEditor) {
						createEditor();
					}
					else if (ckEditor) {
						inlineEditor.destroy();
						ckEditor.destroy();

						var editorNode = A.one('#<%= name %>');

						editorNode.removeAttribute('contenteditable');
						editorNode.removeClass('lfr-editable');
					}
				}
			}
		);
	</c:if>

	var ckEditorContent;
	var currentToolbarSet;

	var initialToolbarSet = '<%= TextFormatter.format(HtmlUtil.escapeJS(toolbarSet), TextFormatter.M) %>';

	function getToolbarSet(toolbarSet) {
		var Util = Liferay.Util;

		if (Util.isPhone()) {
			toolbarSet = 'phone';
		}
		else if (Util.isTablet()) {
			toolbarSet = 'tablet';
		}

		return toolbarSet;
	}

	var afterVal = function() {
		return new A.Do.AlterReturn(
			'Return editor content',
			window['<%= name %>'].getHTML()
		);
	};

	var createEditor = function() {
		var editorNode = A.one('#<%= name %>');

		editorNode.attr('contenteditable', true);
		editorNode.addClass('lfr-editable');

		var eventHandles = [
			A.Do.after(afterVal, editorNode, 'val', this)
		];

		function initData() {
			<c:if test="<%= Validator.isNotNull(initMethod) && !(inlineEdit && Validator.isNotNull(inlineEditSaveURL)) %>">
				if (!ckEditorContent) {
					<c:choose>
						<c:when test="<%= contents != null %>">
							ckEditorContent = '<%= HtmlUtil.escapeJS(contents) %>';
						</c:when>
						<c:otherwise>
							ckEditorContent = window['<%= HtmlUtil.escapeJS(namespace + initMethod) %>']();
						</c:otherwise>
					</c:choose>
				}

				ckEditor.setData(
					ckEditorContent,
					function() {
						ckEditor.resetDirty();
						ckEditorContent = '';
					}
				);
			</c:if>

			window['<%= name %>']._setStyles();

			<c:if test="<%= Validator.isNotNull(onInitMethod) %>">
				window['<%= HtmlUtil.escapeJS(onInitMethod) %>']();
			</c:if>

			window['<%= name %>'].instanceReady = true;
		}

		currentToolbarSet = getToolbarSet(initialToolbarSet);

		var defaultConfig = {
			filebrowserBrowseUrl: '',
			filebrowserFlashBrowseUrl: '',
			filebrowserImageBrowseLinkUrl: '',
			filebrowserImageBrowseUrl: '',
			filebrowserUploadUrl: null,
			toolbar: currentToolbarSet
		};

		var editorConfig = <%= Validator.isNotNull(editorConfigJSONObject) ? editorConfigJSONObject : "{}" %>;

		var config = A.merge(defaultConfig, editorConfig);

		// CMAP - apply the current page's them to CKEDITOR config
		// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_styles.html
		// editor is in an IFRAME, so query the parent window
		var pathThemeImages = window.parent.Liferay.ThemeDisplay.getPathThemeImages();
		var themePathRoot = window.parent.Liferay.ThemeDisplay.getPathThemeRoot();
		var serverAddr = window.parent.Liferay.ThemeDisplay.getCDNBaseURL();

		if (pathThemeImages.indexOf('cmap') > -1) {

			// find out user roles to limit editor options
			var roles = [];
			Liferay.Service('/role/get-user-roles', {
				userId: Liferay.ThemeDisplay.getUserId()
			}, function(response) {
				response.forEach(function(e){
					roles.push(e.name); // or e.roleId
				});
			});

			if(roles.includes("Administrator")){ }

			// All CKEditor config options
			// https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_config.html
			var cmapConfig = {

				// Loads every possible toolbar button
				toolbar: null,
				toolbarCanCollapse: true,

				// Include external files, including main theme css file
				contentsCss: [
					pathThemeImages.replace(/\/images$/, '/css/main.css'),
					(serverAddr + themePathRoot + '/css/main.css'),
					(serverAddr + themePathRoot + '/css/aui.css'),
					'https://cloud.webtype.com/css/2f300d46-99ee-4656-bf09-870688012aaf.css',
					'https://cloud.typography.com/7947314/7427752/css/fonts.css'
				],

				// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_spellcheck.html
				// extraPlugins: 'scayt,filebrowser,lfrpopup,itemselector',
				extraPlugins: 'scayt,itemselector',

				// spell check as you type
				scayt_autoStartup: true,
				// scayt_contextCommands: 'ignoreall|add',
				scayt_ignoreAllCapsWords: true, // like CMAP
				// scayt_elementsToIgnore: 'del,pre',
				// scayt_ignoreWordsWithNumbers: true,
				scayt_ignoreDomainNames: true,

				// remove the language and dictionary ui tabs
				scayt_uiTabs: '1,0,0',
				// set dictionary name manually
				scayt_userDictionaryName: 'CMAP',

				// grammer review as you type
				grayt_autoStartup: true,

				// Create custom templates to output layout
				// https://github.com/ckeditor/ckeditor-dev/blob/master/plugins/templates/templates/default.js
				templates: 'cmap',
				// templates_files: [ '/editor_templates/site_default.js', 'http://www.example.com/user_templates.js' ],

				// prevent people from deleting content when adding a template
				templates_replaceContent: false,

				// menu_groups: 'clipboard,table,anchor,link,image',
				toolbarGroups: [
					{ name: 'document', groups: [ 'mode', 'document', 'doctools' ] },
					{ name: 'clipboard', groups: [ 'clipboard', 'undo' ] },
					{ name: 'editing', groups: [ 'find', 'selection', 'spellchecker', 'editing' ] },
					{ name: 'insert', groups: [ 'insert' ] },
					{ name: 'tools', groups: [ 'tools' ] },
					{ name: 'forms', groups: [ 'forms' ] },
					'/',
					{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
					{ name: 'links', groups: [ 'links' ] },
					{ name: 'colors', groups: [ 'colors' ] },
					{ name: 'paragraph', groups: [ 'align', 'list', 'indent', 'blocks', 'bidi', 'paragraph' ] },
					{ name: 'styles', groups: [ 'styles' ] },
					{ name: 'others', groups: [ 'others' ] },
					{ name: 'about', groups: [ 'about' ] }
				],

				format_h1: { element: 'h1', attributes: { 'class': 'whitney-huge' } },
				format_h2: { element: 'h2', attributes: { 'class': 'whitney-large' } },
				format_h3: { element: 'h3', attributes: { 'class': 'whitney-semi-large' } },
				format_h4: { element: 'h4', attributes: { 'class': 'whitney-middle' } },
				format_h5: { element: 'h5', attributes: { 'class': 'whitney-normal' } },
				format_h6: { element: 'h6', attributes: { 'class': 'whitney-small' } },
				format_p: { element: 'p', attributes: { 'class': 'presna-normal' } },


				devtools_styles: '#cke_tooltip { padding: 5px; border: 2px solid #333; background: #ffffff } #cke_tooltip h2 { font-size: 1.1em; border-bottom: 1px solid; margin: 0; padding: 1px; } #cke_tooltip ul { padding: 0pt; list-style-type: none; }',

				// obfuscated email addresses to prevent spam
				emailProtection: 'encode',

				// disables info and success notifications
				notification_duration: 0,

				// don't load any languages besides english
				language_list: [],

				// to apply our own custom styles in the theme
				bodyId: 'cmap-ckeditor',
				// to apply styles from the rest of the website
				bodyClass: 'journal-content-article',

				// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_uicolor.html
				uiColor: '#E4EBEE',

				removeButtons:  'Save,NewPage,Preview,Print,Form,Checkbox,Radio,TextField,Textarea,Select,Button,ImageButton,HiddenField,CreateDiv,Flash,Smiley,Iframe,Language,BidiRtl,BidiLtr,About,Font,FontSize',

				stylesSet: 'cmap_styles',
			};

			var extraConfig = {
				// HIGHLIGHT THE FIRST FIELD IN A POPUP
				// dialog_startupFocusTab: true,

				// PREVENTS &nbws; IN EMPTY PARAGRAPHS
				// fillEmptyBlocks: false,
				// ignoreEmptyParagraph: false,

				// EVENT CALLBACKS
				// on: {
				// 	instanceReady: function(){
				// 		console.log(this.name, this);
				// 	}
				// },

				// GRABS FOCUS RIGHT AWAY
				// startupFocus: 'end',

				fontSize_sizes: 'Small/12px;Normal/15px;Large/18px;H3/26px;H2/30px;H1/36px;Huge/72px;',

				font_names: 'Whitney/"Whitney SSm A", "Whitney SSm B", sans-serif;Prensa/"Prensa LF", serif',

				// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_colorbutton.html
				colorButton_colors: '000,3C5976,004F93,88a0b2,E4EBEE,FFF,750709,DB2028,F47932,5E5011,9E7A38,E7BB20,346139,6CAD4E,A2D06D,008FD4,5E7A87,E2E7EA,587387,F7F9FA',
				colorButton_enableAutomatic: false,
			}

			if(Object.keys(CKEDITOR.stylesSet.registered).includes('cmap_styles')){
				console.log('cmap_styles already registered, ignoring');
			} else {
				// INLINE STYLES LIKE TEXT COLOR AND MARGINS
				// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_styles.html
				CKEDITOR.stylesSet.add( 'cmap_styles', [
			    { name: 'Huge Paragraph', element: 'p', attributes: { 'class': 'presna-large' } },
			    { name: 'Button', element: 'a', attributes: { 'href': '', 'class': 'button' } },
			    { name: 'Grey Blue Color', element: 'span', attributes: { 'class': 'grey-blue-color' } },
			    { name: 'Dark Blue Color', element: 'span', attributes: { 'class': 'dark-blue-color' } },
			    { name: 'Light Blue Color', element: 'span', attributes: { 'class': 'light-blue-color' } },
			    { name: 'Off White Color', element: 'span', attributes: { 'class': 'off-white-color' } },
			    { name: 'Small Top Margin', element: 'span', attributes: { 'class': 'margin-top-small' } },
			    { name: 'Small Bottom Margin', element: 'span', attributes: { 'class': 'margin-bottom-small' } },
					{ name: 'Large Top Margin', element: 'span', attributes: { 'class': 'margin-top-large' } },
			    { name: 'Large Bottom Margin', element: 'span', attributes: { 'class': 'margin-bottom-large' } },
				]);
			}

			CKEDITOR.addTemplates( 'cmap', {
				imagesPath: pathThemeImages,
				templates: [
					{
						title: 'Center Column',
						image: '',
						description: 'Used to place centered content inside of a full width widget. Generates a grid with the center column at the correct size.',
						html: '<div class="inline-center-col row"><div class="col-lg-4 col-md-3 col-sm-16"></div><div class="col-lg-8 col-md-10 col-sm-16"><h4>Hello World</h4><p>Enter content here...</p></div><div class="col-lg-4 col-md-3 col-sm-16"></div></div>'
					},
					{
						title: 'Advertisement',
						image: 'https://clarknelson.com/drop/Screen-Shot-2018-05-31-15-36-08.png',
						description: 'A widget designed to point to another page. Should contain a picture, headline, description, and button.',
						html: '<div class="advertisement"><div class="row"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><h5>Headline</h5><p class="margin-bottom-small">Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p><a href="google.com" class="button">Double click to edit</a></div></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div>'
					},
					{
						title: 'Page Cards (Single)',
						image: '',
						description: 'A widget designed to point to another page. Should contain an image above, and link to the page below.',
						html: '<div class="page-cards"><div class="row"><div class="page-card col-sm-8 col-xs-16"><div class="top"><img src="https://clarknelson.com/drop/Cook_116.jpg" /></div><div class="bottom"><h5><a href="google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a></h5></div></div></div></div>'
					},
					{
						title: 'Page Cards (Double)',
						image: '',
						description: 'Similar to previous page cards widget, but contains two blocks side-by-side.',
						html: '<div class="page-cards"><div class="row"><div class="page-card col-sm-8 col-xs-16"><div class="top"><img src="https://clarknelson.com/drop/Cook_116.jpg" /></div><div class="bottom"><h5><a href="google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a></h5></div></div><div class="page-card col-sm-8 col-xs-16"><div class="top"><img src="https://clarknelson.com/drop/Cook_116.jpg" /></div><div class="bottom"><h5><a href="google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a></h5></div></div></div></div>'
					},
					{
						title: 'Ad Grid (Single)',
						image: '',
						description: 'Similar to advertisement, but in a grid.',
						html: '<div class="ad-grid"><div class="row"> <div class="left advertisement"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><h5>Headline</h5><p class="margin-bottom-small">Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image</p><a href="" class="button">View Page</a></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div> </div></div>'
					},
					{
						title: 'Ad Grid (Double)',
						image: '',
						description: 'Similar to advertisement, but in a grid.',
						html: '<div class="ad-grid"><div class="row"> <div class="left advertisement"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><h5>Headline</h5><p class="margin-bottom-small">Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p><a href="" class="button">View Page</a></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div> <div class="right advertisement"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><h5>Headline</h5><p class="margin-bottom-small">Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p><a href="" class="button">View Page</a></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div></div></div>'
					}
				]
			});



			// removed the simple characters such as letters, numbers, and punctuation
			// keep the actual special characters not available on the keyboard
			CKEDITOR.config.specialChars = [
				'&euro;', '&lsquo;', '&rsquo;', '&ldquo;', '&rdquo;', '&ndash;', '&mdash;', '&iexcl;', '&cent;', '&pound;', '&curren;', '&yen;', '&brvbar;', '&sect;', '&uml;', '&copy;', '&ordf;', '&laquo;', '&not;', '&reg;', '&macr;', '&deg;', '&sup2;', '&sup3;', '&acute;', '&micro;', '&para;', '&middot;', '&cedil;', '&sup1;', '&ordm;', '&raquo;', '&frac14;', '&frac12;', '&frac34;', '&iquest;', '&Agrave;', '&Aacute;', '&Acirc;', '&Atilde;', '&Auml;', '&Aring;', '&AElig;', '&Ccedil;', '&Egrave;', '&Eacute;', '&Ecirc;', '&Euml;', '&Igrave;', '&Iacute;', '&Icirc;', '&Iuml;', '&ETH;', '&Ntilde;', '&Ograve;', '&Oacute;', '&Ocirc;', '&Otilde;', '&Ouml;', '&times;', '&Oslash;', '&Ugrave;', '&Uacute;', '&Ucirc;', '&Uuml;', '&Yacute;', '&THORN;', '&szlig;', '&agrave;', '&aacute;', '&acirc;', '&atilde;', '&auml;', '&aring;', '&aelig;', '&ccedil;', '&egrave;', '&eacute;', '&ecirc;', '&euml;', '&igrave;', '&iacute;', '&icirc;', '&iuml;', '&eth;', '&ntilde;', '&ograve;', '&oacute;', '&ocirc;', '&otilde;', '&ouml;', '&divide;', '&oslash;', '&ugrave;', '&uacute;', '&ucirc;', '&uuml;', '&yacute;', '&thorn;', '&yuml;', '&OElig;', '&oelig;', '&#372;', '&#374', '&#373', '&#375;', '&sbquo;', '&#8219;', '&bdquo;', '&hellip;', '&trade;', '&#9658;', '&bull;', '&rarr;', '&rArr;', '&hArr;', '&diams;', '&asymp;'
			];

			// LIFERAY CKEDITOR CONFIGURATION DOCS
			// https://dev.liferay.com/pt/develop/reference/-/knowledge_base/7-0/ckeditor-plugin-reference-guide
			// https://dev.liferay.com/pt/develop/tutorials/-/knowledge_base/7-0/using-ckeditor-plugins-in-alloyeditor

			config = A.merge(config, cmapConfig);
		}
		CKEDITOR.<%= inlineEdit ? "inline" : "replace" %>('<%= name %>', config);

		Liferay.on(
			'<%= name %>selectItem',
			function(event) {
				CKEDITOR.tools.callFunction(event.ckeditorfuncnum, event.value);
			}
		);

		var ckEditor = CKEDITOR.instances['<%= name %>'];

		<liferay-util:dynamic-include key='<%= "com.liferay.frontend.editor.ckeditor.web#" + editorName + "#onEditorCreate" %>' />

		<c:if test="<%= inlineEdit && Validator.isNotNull(inlineEditSaveURL) %>">
			inlineEditor = new Liferay.CKEditorInline(
				{
					editor: ckEditor,
					editorName: '<%= name %>',
					namespace: '<portlet:namespace />',
					saveURL: '<%= inlineEditSaveURL %>'
				}
			);
		</c:if>

		var customDataProcessorLoaded = false;

		<%
		boolean useCustomDataProcessor = (editorOptionsDynamicAttributes != null) && GetterUtil.getBoolean(editorOptionsDynamicAttributes.get("useCustomDataProcessor"));
		%>

		<c:if test="<%= useCustomDataProcessor %>">
			ckEditor.on(
				'customDataProcessorLoaded',
				function() {
					customDataProcessorLoaded = true;
					if (instanceReady) {
						initData();
					}
				}
			);
		</c:if>

		var instanceReady = false;

		ckEditor.on(
			'instanceReady',
			function() {

				<c:choose>
					<c:when test="<%= useCustomDataProcessor %>">
						instanceReady = true;
						if (customDataProcessorLoaded) {
							initData();
						}
					</c:when>
					<c:otherwise>
						initData();
					</c:otherwise>
				</c:choose>

				<c:if test="<%= Validator.isNotNull(onBlurMethod) %>">
					CKEDITOR.instances['<%= name %>'].on('blur', window['<%= name %>'].onBlurCallback);
				</c:if>

				<c:if test="<%= Validator.isNotNull(onChangeMethod) %>">
					var contentChangeHandle = setInterval(
						function() {
							try {
								window['<%= name %>'].onChangeCallback();
							}
							catch (e) { }
						},
						300
					);

					var clearContentChangeHandle = function(event) {
						if (event.portletId === '<%= portletId %>') {
							clearInterval(contentChangeHandle);
							Liferay.detach('destroyPortlet', clearContentChangeHandle);
						}
					};

					Liferay.on('destroyPortlet', clearContentChangeHandle);
				</c:if>

				<c:if test="<%= Validator.isNotNull(onFocusMethod) %>">
					CKEDITOR.instances['<%= name %>'].on('focus', window['<%= name %>'].onFocusCallback);
				</c:if>

				<c:if test="<%= !(inlineEdit && Validator.isNotNull(inlineEditSaveURL)) %>">
					var initialEditor = CKEDITOR.instances['<%= name %>'].id;

					A.getWin().on(
						'resize',
						A.debounce(
							function() {
								if (currentToolbarSet != getToolbarSet(initialToolbarSet)) {
									var ckeditorInstance = CKEDITOR.instances['<%= name %>'];

									if (ckeditorInstance) {
										var currentEditor = ckeditorInstance.id;

										if (currentEditor === initialEditor) {
											var currentDialog = CKEDITOR.dialog.getCurrent();
											if (currentDialog) {
												currentDialog.hide();
											}
											ckEditorContent = ckeditorInstance.getData();
											window['<%= name %>'].dispose();
											window['<%= name %>'].create();
											window['<%= name %>'].setHTML(ckEditorContent);
											initialEditor = CKEDITOR.instances['<%= name %>'].id;
										}
									}
								}
							},
							250
						)
					);
				</c:if>

				var destroyInstance = function(event) {
					if (event.portletId === '<%= portletId %>') {
						try {
							var ckeditorInstances = window.CKEDITOR.instances;

							A.Object.each(
								ckeditorInstances,
								function(value, key) {
									var inst = ckeditorInstances[key];

									delete ckeditorInstances[key];

									inst.destroy();
								}
							);
						}
						catch (e) {
						}
						(new A.EventHandle(eventHandles)).detach();
						Liferay.detach('destroyPortlet', destroyInstance);
					}
				};

				Liferay.on('destroyPortlet', destroyInstance);
			}
		);

		ckEditor.on('dataReady', window['<%= name %>']._setStyles);

		if (UA.edge && parseInt(UA.edge, 10) >= 14) {
			var resetActiveElementValidation = function(activeElement) {
				activeElement = A.one(activeElement);

				var activeElementAncestor = activeElement.ancestor();

				if (activeElementAncestor.hasClass('has-error') || activeElementAncestor.hasClass('has-success')) {
					activeElementAncestor.removeClass('has-error');
					activeElementAncestor.removeClass('has-success');

					var formValidatorStack = activeElementAncestor.one('.form-validator-stack');

					if (formValidatorStack) {
						formValidatorStack.remove();
					}
				}
			};

			var onBlur = function(activeElement) {
				resetActiveElementValidation(activeElement);

				setTimeout(
					function() {
						if (activeElement) {
							ckEditor.focusManager.blur(true);
							activeElement.focus();
						}
					},
					0
				);
			};

			ckEditor.on(
				'instanceReady',
				function() {
					var editorWrapper = A.one('#cke_<%= name %>');
					if (editorWrapper) {
						editorWrapper.once(
							'mouseenter',
							function(event) {
								ckEditor.once('focus', onBlur.bind(this, document.activeElement));
								ckEditor.focus();
							}
						);
					}
				}
			);
		}
	};

	<%
	String toogleControlsStatus = GetterUtil.getString(SessionClicks.get(request, "com.liferay.frontend.js.web_toggleControls", "visible"));
	%>

	<c:if test='<%= autoCreate && ((inlineEdit && toogleControlsStatus.equals("visible")) || !inlineEdit) %>'>
		createEditor();
	</c:if>
</aui:script>

<%!
public String marshallParams(Map<String, String> params) {
	if (params == null) {
		return StringPool.BLANK;
	}

	StringBundler sb = new StringBundler(4 * params.size());

	for (Map.Entry<String, String> configParam : params.entrySet()) {
		sb.append(StringPool.AMPERSAND);
		sb.append(configParam.getKey());
		sb.append(StringPool.EQUAL);
		sb.append(URLCodec.encodeURL(configParam.getValue()));
	}

	return sb.toString();
}
%>
