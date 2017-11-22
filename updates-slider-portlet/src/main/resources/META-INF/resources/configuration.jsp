<%@ page import="com.liferay.portal.kernel.util.Constants" %>

<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
	var="configurationActionURL"
/>

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
	var="configurationRenderURL"
/>

<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden"
		value="<%= Constants.UPDATE %>"
	/>

	<aui:input name="redirect" type="hidden"
		value="<%= configurationRenderURL %>"
	/>
	
	<aui:fieldset>	
		<aui:select name="assetCategoryId" label="Asset Category"
			value="<%= assetCategoryId %>">
		<c:forEach var="assetCategory" items="<%=assetCategories%>">
			<aui:option value="${assetCategory.getCategoryId()}">${assetCategory.getName()}</aui:option>
		</c:forEach>
		</aui:select>

		<aui:input type="text" name="assetCount" label="Number of Items to Display"
			value="<%= assetCount %>">
		</aui:input>

		<aui:input type="text" name="summaryLength" label="Summary Length"
			value="<%= summaryLength %>">
		</aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>
