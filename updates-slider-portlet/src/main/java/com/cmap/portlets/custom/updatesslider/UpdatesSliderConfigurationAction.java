package com.cmap.portlets.custom.updatesslider;

import com.cmap.portlets.custom.updatesslider.constants.UpdatesSliderPortletKeys;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
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

@Component(
	configurationPid = "com.cmap.portlets.custom.updatesslider.UpdatesSliderConfiguration",
	configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true,
	property = {
		"javax.portlet.name=" + UpdatesSliderPortletKeys.UpdatesSliderPortlet
	},
	service = ConfigurationAction.class
)
public class UpdatesSliderConfigurationAction
	extends DefaultConfigurationAction {

	@Override
	public void include(
			PortletConfig portletConfig, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception {

		if (_log.isDebugEnabled()) {
			_log.debug("Blade Message Portlet configuration include");
		}

		httpServletRequest.setAttribute(
			UpdatesSliderConfiguration.class.getName(),
			_updatesSliderConfiguration);

		super.include(portletConfig, httpServletRequest, httpServletResponse);
	}

	@Override
	public void processAction(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		if (_log.isDebugEnabled()) {
			_log.debug("Blade Message Portlet configuration action");
		}

		String assetCategoryId = ParamUtil.getString(actionRequest, "assetCategoryId");

		setPreference(actionRequest, "assetCategoryId", assetCategoryId);

		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_updatesSliderConfiguration = ConfigurableUtil.createConfigurable(
			UpdatesSliderConfiguration.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		UpdatesSliderConfigurationAction.class);

	private volatile UpdatesSliderConfiguration _updatesSliderConfiguration;

}