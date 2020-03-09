/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.docs.my.button.portlet;

import com.liferay.portal.kernel.servlet.taglib.BaseDynamicInclude;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true, 
	service = DynamicInclude.class
)
public class MyNewButtonPortlet extends BaseDynamicInclude {

	@Override
	public void include(
	                HttpServletRequest request, HttpServletResponse response,
	                String key)
	        throws IOException {

	        ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
	                WebKeys.THEME_DISPLAY);

	        PrintWriter printWriter = response.getWriter();

	        StringBundler sb = new StringBundler(7);

	        sb.append("<script src=\"");
	        sb.append(themeDisplay.getPortalURL());
	        sb.append(PortalUtil.getPathProxy());
	        sb.append(_servletContext.getContextPath());
	        sb.append("/js/buttons.js");
	        sb.append("\" ");
	        sb.append("type=\"text/javascript\"></script>");

	        printWriter.println(sb.toString());
	}

   @Override
    public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
            dynamicIncludeRegistry.register(
                    "com.liferay.frontend.editor.alloyeditor.web#alloyeditor#" +
                            "additionalResources");
    }

    @Reference(
            target = "(osgi.web.symbolicname=com.liferay.docs.my.button)"
    )
    private ServletContext _servletContext;


}