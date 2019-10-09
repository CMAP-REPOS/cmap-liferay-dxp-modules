
<%@ page import="com.cmap.portlets.twitter.api.service.portlet.SocialSliderConfiguration" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil" %>
<%@page import="java.util.List"%> 
<%@page import="com.liferay.portal.kernel.util.Constants"%>




<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	SocialSliderConfiguration socialSliderConfiguration = (SocialSliderConfiguration) 
		renderRequest.getAttribute(SocialSliderConfiguration.class.getName());

	String twitterScreenName = null;
	int postCount = 0;
	String oAuthConsumerKey = null;
	String oAuthConsumerSecret = null;
	String oAuthAccessToken = null;
	String oAuthAccessTokenSecret = null;
	String fbScreenName = null;
	String fbPageID =  null;
	String fbAccessToken = null;
	
	if (Validator.isNotNull(socialSliderConfiguration)) {
		
		twitterScreenName = portletPreferences.getValue("twitterScreenName", socialSliderConfiguration.twitterScreenName());
	
		String postCountPref =
		portletPreferences.getValue("postCount", socialSliderConfiguration.postCount());
	
		oAuthConsumerKey = 
		portletPreferences.getValue("oAuthConsumerKey", socialSliderConfiguration.oAuthConsumerKey());
	
		oAuthConsumerSecret = 
		portletPreferences.getValue("oAuthConsumerSecret", socialSliderConfiguration.oAuthConsumerSecret());
	
		oAuthAccessToken = 
		portletPreferences.getValue("oAuthAccessToken", socialSliderConfiguration.oAuthAccessToken());
	
		oAuthAccessTokenSecret = 
		portletPreferences.getValue("oAuthAccessTokenSecret", socialSliderConfiguration.oAuthAccessTokenSecret());

		fbScreenName =
				portletPreferences.getValue("fbScreenName", socialSliderConfiguration.fbScreenName());

		fbPageID =
				portletPreferences.getValue("fbPageID", socialSliderConfiguration.fbPageID());

		fbAccessToken =
				portletPreferences.getValue("fbAccessToken", socialSliderConfiguration.fbAccessToken());
	
		if (Validator.isDigit(postCountPref)) {
			postCount = Integer.parseInt(postCountPref);
		}
	}
%>