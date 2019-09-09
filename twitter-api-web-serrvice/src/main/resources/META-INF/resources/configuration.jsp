<%@ page import="com.liferay.portal.kernel.util.Constants" %>

<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
	var="configurationActionURL"
/>

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
	var="configurationRenderURL"
/>

<div class="container-fluid-1280">

<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden"
		value="<%= Constants.UPDATE %>"
	/>

	<aui:input name="redirect" type="hidden"
		value="<%= configurationRenderURL %>"
	/>
	
	<aui:fieldset>
		
		<aui:input type="text" name="screenName" label="Twitter Screen Name"
			value="<%= screenName %>">
		</aui:input>

		<aui:input type="text" name="tweetCount" label="Number of Tweets to Display"
			value="<%= tweetCount %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthConsumerKey" label="oAuth Consumer Key"
			value="<%= oAuthConsumerKey %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthConsumerSecret" label="oAuth Consumer Secret"
			value="<%= oAuthConsumerSecret %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthAccessToken" label="oAuth Access Token"
			value="<%= oAuthAccessToken %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthAccessTokenSecret" label="oAuth Access Token Secret"
			value="<%= oAuthAccessTokenSecret %>">
		</aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>

</div>

