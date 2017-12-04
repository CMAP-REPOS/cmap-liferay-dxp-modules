package com.cmap.portlets.custom.eventslist.configuration;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import aQute.bnd.annotation.metatype.Configurable;

@Component(
		configurationPid = "com.cmap.portlets.custom.eventslist.configuration.EventsListConfiguration",
		configurationPolicy = ConfigurationPolicy.OPTIONAL, 
        immediate = true,
        property = {
            "javax.portlet.name=com_cmap_portlets_custom_eventslist_portlet_EventsListPortlet"
        },
        service = ConfigurationAction.class
)

public class EventsListConfigurationAction extends DefaultConfigurationAction {

    @Override
    public void include(PortletConfig portletConfig, HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws Exception {

        httpServletRequest.setAttribute(EventsListConfiguration.class.getName(), _configuration);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {

		String numberOfDaysInThePast = ParamUtil.getString(actionRequest, "numberOfDaysInThePast");
		String numberOfEventsToShow = ParamUtil.getString(actionRequest, "numberOfEventsToShow");

		setPreference(actionRequest, "numberOfDaysInThePast", numberOfDaysInThePast);
		setPreference(actionRequest, "numberOfEventsToShow", numberOfEventsToShow);

		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_configuration = Configurable.createConfigurable(EventsListConfiguration.class, properties);
	}

	private volatile EventsListConfiguration _configuration;

}