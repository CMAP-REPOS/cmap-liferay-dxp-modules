package com.cmap.portlets.custom.portlet;

import com.cmap.portlets.custom.constants.CalendarEventImporterPortletKeys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author jon
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Calendar Event Importer Portlet",
		"javax.portlet.name=" + CalendarEventImporterPortletKeys.CalendarEventImporter,
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CalendarEventImporterPortlet extends GenericPortlet {

	@Override
	protected void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		PrintWriter printWriter = renderResponse.getWriter();

		printWriter.print("calendar-event-importer-portlet Portlet - Hello World!");
	}

}