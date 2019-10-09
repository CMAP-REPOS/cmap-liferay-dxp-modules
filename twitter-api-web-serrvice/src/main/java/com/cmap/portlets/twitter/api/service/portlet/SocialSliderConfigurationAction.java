package com.cmap.portlets.twitter.api.service.portlet;

import com.cmap.portlets.twitter.api.service.constants.SocialSliderPortletKeys;
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
		configurationPid = "com.cmap.portlets.twitter.api.service.portlet.SocialSliderConfiguration",
		configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true,
		property = {
			"javax.portlet.name=" + SocialSliderPortletKeys.SocialSliderPortlet
		},
		service = ConfigurationAction.class
	)

public class SocialSliderConfigurationAction 
	extends DefaultConfigurationAction {
	
	private static final Log _log = LogFactoryUtil.getLog(SocialSliderConfigurationAction.class);
	private volatile SocialSliderConfiguration _socialSliderConfiguration;
	
	@Override
	public void include(
			PortletConfig portletConfig, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception {

		if (_log.isDebugEnabled()) {
			_log.debug("Blade Message Portlet configuration include");
		}

		httpServletRequest.setAttribute(
			SocialSliderConfiguration.class.getName(),
			_socialSliderConfiguration);

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
		
		String twitterScreenName = ParamUtil.getString(actionRequest, "twitterScreenName");
		String postCount = ParamUtil.getString(actionRequest, "postCount");
		String oAuthConsumerKey = ParamUtil.getString(actionRequest, "oAuthConsumerKey");
		String oAuthConsumerSecret = ParamUtil.getString(actionRequest, "oAuthConsumerSecret");
		String oAuthAccessToken = ParamUtil.getString(actionRequest, "oAuthAccessToken");
		String oAuthAccessTokenSecret = ParamUtil.getString(actionRequest, "oAuthAccessTokenSecret");
		String fbScreenName = ParamUtil.getString(actionRequest, "fbScreenName");
		String fbPageID = ParamUtil.getString(actionRequest, "fbPageID");
		String fbAccessToken = ParamUtil.getString(actionRequest, "fbAccessToken");

		setPreference(actionRequest, "twitterScreenName", twitterScreenName);
		setPreference(actionRequest, "postCount", postCount);
		setPreference(actionRequest, "oAuthConsumerKey", oAuthConsumerKey);
		setPreference(actionRequest, "oAuthConsumerSecret", oAuthConsumerSecret);
		setPreference(actionRequest, "oAuthAccessToken", oAuthAccessToken);
		setPreference(actionRequest, "oAuthAccessTokenSecret", oAuthAccessTokenSecret);
		setPreference(actionRequest, "fbScreenName", fbScreenName);
		setPreference(actionRequest, "fbPageID", fbPageID);
		setPreference(actionRequest, "fbAccessToken", fbAccessToken);

		super.processAction(portletConfig, actionRequest, actionResponse);
	}
	
	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_socialSliderConfiguration = ConfigurableUtil.createConfigurable(
			SocialSliderConfiguration.class, properties);
	}
}
