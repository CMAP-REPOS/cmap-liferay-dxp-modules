<%@ include file="../init.jsp"%>

<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");

	CrmGroup crmGroup = null;

	if (crmGroupId > 0) {
		crmGroup = CrmGroupServiceUtil.getCrmGroup(crmGroupId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmGroup != null) ? ("Details for " + crmGroup.getName()) : "New Group");

	List<CrmContact> crmContactList = CrmGroupServiceUtil.getCrmContacts(crmGroupId);
%>

<portlet:renderURL var="editGroupURL">
	<portlet:param name="mvcPath" value="/groups/edit.jsp"></portlet:param>
	<portlet:param name="crmGroupId"
		value="<%=String.valueOf(crmGroupId)%>"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>

<div class="container-fluid">
	<aui:row>
		<aui:col md="12">
			<%-- TODO: check role --%>
			<aui:button onClick="<%= editGroupURL.toString() %>"
				value="Edit Group"></aui:button>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col md="12">
			<h2>Contacts for <%= crmGroup.getName() %></h2>
			<liferay-ui:search-container delta="20" deltaConfigurable="true"
				emptyResultsMessage="No contacts found"
				total="<%=crmContactList.size()%>" var="crmGroupsSearchContainer">
				<liferay-ui:search-container-results results="<%=crmContactList%>" />

				<liferay-ui:search-container-row
					className="contact.manager.model.CrmContact" modelVar="crmContact">
					<liferay-ui:search-container-column-jsp
						path="/groups/view_contact_actions.jsp" name="Actions" />
					<liferay-ui:search-container-column-text property="firstName"
						name="First Name" />
					<liferay-ui:search-container-column-text property="lastName"
						name="Last Name" />
					<liferay-ui:search-container-column-text
						property="primaryEmailAddress" name="Primary Email Address" />
					<liferay-ui:search-container-column-text property="primaryPhone"
						name="Primary Phone" />
				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>

</div>