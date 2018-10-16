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

@Component(
	immediate = true, 
	service = DynamicInclude.class
)

public class CKEditorOnEditorCreateDynamicInclude implements DynamicInclude {

	@Override
	public void include(HttpServletRequest request, HttpServletResponse response, String key) throws IOException {

		Bundle bundle = _bundleContext.getBundle();

		URL editor_config = bundle.getEntry("/META-INF/resources/ckeditor/config.js");
		URL editor_characters = bundle.getEntry("/META-INF/resources/ckeditor/characters.js");
		URL editor_styles = bundle.getEntry("/META-INF/resources/ckeditor/styles.js");
		URL editor_templates = bundle.getEntry("/META-INF/resources/ckeditor/templates.js");

		URL plugin_actions = bundle.getEntry("/META-INF/resources/plugins/actions.js");
		URL plugin_advertisement = bundle.getEntry("/META-INF/resources/plugins/cta.js");
		URL plugin_page_cards = bundle.getEntry("/META-INF/resources/plugins/page-cards.js");
		URL plugin_recommendation = bundle.getEntry("/META-INF/resources/plugins/recommendations.js");
		URL plugin_full_width_image = bundle.getEntry("/META-INF/resources/plugins/full-image.js");
		URL plugin_endnotes = bundle.getEntry("/META-INF/resources/plugins/endnotes.js");
		URL plugin_centered = bundle.getEntry("/META-INF/resources/plugins/centered.js");

		// URL site_javascript = bundle.getEntry("/o/cmap-onto-2050-theme/js/main.js");

		StreamUtil.transfer(editor_config.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(editor_characters.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(editor_styles.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(editor_templates.openStream(), response.getOutputStream(), false);

		StreamUtil.transfer(plugin_actions.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(plugin_advertisement.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(plugin_page_cards.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(plugin_recommendation.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(plugin_full_width_image.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(plugin_endnotes.openStream(), response.getOutputStream(), false);
		StreamUtil.transfer(plugin_centered.openStream(), response.getOutputStream(), false);

		// StreamUtil.transfer(site_javascript.openStream(), response.getOutputStream(), false);
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