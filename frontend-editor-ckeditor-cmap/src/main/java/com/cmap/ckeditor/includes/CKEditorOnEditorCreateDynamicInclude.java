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

package com.cmap.ckeditor.includes;

import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;
import com.liferay.portal.kernel.util.StreamUtil;

import java.io.IOException;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * @author Chema Balsas
 */
@Component(
	immediate = true, 
	service = DynamicInclude.class
)
public class CKEditorOnEditorCreateDynamicInclude implements DynamicInclude {

	@Override
	public void include(HttpServletRequest request, HttpServletResponse response, String key) throws IOException {

		Bundle bundle = _bundleContext.getBundle();

		URL editor_characters = bundle.getEntry("/META-INF/resources/ckeditor/characters.js");
		URL editor_styles = bundle.getEntry("/META-INF/resources/ckeditor/styles.js");
		URL editor_templates = bundle.getEntry("/META-INF/resources/ckeditor/templates.js");
		URL endnotes_plugin = bundle.getEntry("/META-INF/resources/plugins/endnotes/plugin.js");
		URL endnotes_dialog = bundle.getEntry("/META-INF/resources/plugins/endnotes/dialogs/endnotes.js");
		URL actions_plugin = bundle.getEntry("/META-INF/resources/plugins/actions/plugin.js");
		URL advertisement_plugin = bundle.getEntry("/META-INF/resources/plugins/advertisement/plugin.js");

		StreamUtil.transfer(editor_characters.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(editor_styles.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(editor_templates.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(endnotes_plugin.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(endnotes_dialog.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(actions_plugin.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(advertisement_plugin.openStream(), response.getOutputStream(), false);
	}

	@Override
	public void register(DynamicInclude.DynamicIncludeRegistry dynamicIncludeRegistry) {
		dynamicIncludeRegistry.register("com.liferay.frontend.editor.ckeditor.web#ckeditor#onEditorCreate");
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;
	}

	private BundleContext _bundleContext;

}