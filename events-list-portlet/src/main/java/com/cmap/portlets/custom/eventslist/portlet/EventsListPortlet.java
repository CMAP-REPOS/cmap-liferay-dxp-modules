package com.cmap.portlets.custom.eventslist.portlet;

import com.cmap.portlets.custom.eventslist.configuration.EventsListConfiguration;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

/**
 * @author jon
 */
@Component(
		configurationPid = "com.cmap.portlets.custom.configuration.EventsListConfiguration", 
		immediate = true, property = {
			"com.liferay.portlet.display-category=category.sample", 
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=events-list-portlet Portlet", 
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user" 
		}, 
		service = Portlet.class
)

public class EventsListPortlet extends MVCPortlet {

	private static final Log _log = LogFactoryUtil.getLog(EventsListPortlet.class);
	private volatile EventsListConfiguration _configuration;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		renderRequest.setAttribute(EventsListConfiguration.class.getName(), _configuration);

		super.doView(renderRequest, renderResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_configuration = ConfigurableUtil.createConfigurable(EventsListConfiguration.class, properties);
	}
}