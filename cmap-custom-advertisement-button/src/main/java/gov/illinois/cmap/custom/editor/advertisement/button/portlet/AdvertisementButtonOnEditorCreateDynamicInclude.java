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

package gov.illinois.cmap.custom.editor.advertisement.button.portlet;
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

public class AdvertisementButtonOnEditorCreateDynamicInclude implements DynamicInclude {

	@Override
	public void include(HttpServletRequest request, HttpServletResponse response, String key) throws IOException {

		Bundle bundle = _bundleContext.getBundle();

		URL imagesURL = bundle.getEntry("/META-INF/resources/images");
		StreamUtil.transfer(imagesURL.openStream(), response.getOutputStream(), false);
	}

	@Override
	public void register(DynamicInclude.DynamicIncludeRegistry dynamicIncludeRegistry) {
		dynamicIncludeRegistry.register("com.liferay.frontend.editor.alloyeditor.web#alloyeditor#onEditorCreate");
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;
	}

	private BundleContext _bundleContext;

}