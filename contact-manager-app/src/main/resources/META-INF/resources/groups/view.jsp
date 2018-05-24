<%@page import="contact.manager.app.viewmodel.CrmGroupViewModel"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="../init.jsp"%>

<portlet:renderURL var="addGroupURL">
	<portlet:param name="mvcPath" value="/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>

<%
	List<CrmGroupViewModel> viewModels = new ArrayList<CrmGroupViewModel>();
	List<CrmGroup> crmGroups = CrmGroupLocalServiceUtil.getCrmGroups(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	for (CrmGroup crmGroup : crmGroups) {
		viewModels.add(new CrmGroupViewModel(crmGroup));
	}
%>

<div class="container-fluid-1280">

	<%-- TODO: check role --%>
	<%=viewModels.size()%>

	<liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No groups found" total="<%=viewModels.size()%>"
		var="crmGroupsSearchContainer">
		<liferay-ui:search-container-results results="<%=viewModels%>" />
		<liferay-ui:search-container-row
			className="contact.manager.app.viewmodel.CrmGroupViewModel"
			modelVar="viewModel">
			<liferay-ui:search-container-column-text property="name" name="Name" />
			<liferay-ui:search-container-column-text property="crmContactsCount"
				name="Contacts" />
			<liferay-ui:search-container-column-text property="createDate"
				name="Created" />
			<liferay-ui:search-container-column-text property="modifiedDate"
				name="Modified" />
		</liferay-ui:search-container-row>


		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>