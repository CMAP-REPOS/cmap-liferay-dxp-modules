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

		<label class="control-label"> Categories </label>

		<aui:select name="assetCategoryId" label=""
			value="<%= assetCategoryId %>">
			<aui:option value="0">Select a Category</aui:option>
			<c:forEach var="assetCategory" items="<%=assetCategories%>">
				<aui:option value="${assetCategory.getCategoryId()}">${assetCategory.getName()}</aui:option>
			</c:forEach>
		</aui:select>

		<aui:select name="assetCategoryId2"  label=""
			value="<%= assetCategoryId2 %>">
			<aui:option value="0">Select a Category</aui:option>
			<c:forEach var="assetCategory" items="<%=assetCategories%>">
				<aui:option value="${assetCategory.getCategoryId()}">${assetCategory.getName()}</aui:option>
			</c:forEach>
		</aui:select>

		<aui:select name="assetCategoryId3"  label=""
			value="<%= assetCategoryId3 %>">
			<aui:option value="0">Select a Category</aui:option>
			<c:forEach var="assetCategory" items="<%=assetCategories%>">
				<aui:option value="${assetCategory.getCategoryId()}">${assetCategory.getName()}</aui:option>
			</c:forEach>
		</aui:select>

		<aui:input type="text" name="assetCount" label="Number of Items to Display"
			value="<%= assetCount %>">
		</aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>

</div>
