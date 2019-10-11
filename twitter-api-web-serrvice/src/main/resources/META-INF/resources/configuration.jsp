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

		<aui:input type="text" name="postCount" label="Number of Posts to Display"
				   value="<%= postCount %>">
		</aui:input>
		
		<aui:input type="text" name="twitterScreenName" label="Twitter Screen Name"
			value="<%= twitterScreenName %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthConsumerKey" label="Twitter Consumer Key"
			value="<%= oAuthConsumerKey %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthConsumerSecret" label="Twitter Consumer Secret"
			value="<%= oAuthConsumerSecret %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthAccessToken" label="Twitter Access Token"
			value="<%= oAuthAccessToken %>">
		</aui:input>
		
		<aui:input type="text" name="oAuthAccessTokenSecret" label="Twitter Access Token Secret"
			value="<%= oAuthAccessTokenSecret %>">
		</aui:input>

		<aui:input type="text" name="fbScreenName" label="Facebook Screen Name"
				   value="<%= fbScreenName %>">
		</aui:input>

		<aui:input type="text" name="fbPageID" label="Facebook Page ID"
				   value="<%= fbPageID %>">
		</aui:input>

		<aui:input type="text" name="fbAccessToken" label="Facebook Access Token Secret"
				   value="<%= fbAccessToken %>">
		</aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>

</div>

