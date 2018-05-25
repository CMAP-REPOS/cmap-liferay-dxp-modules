<%@ include file="../init.jsp"%>

<portlet:renderURL var="addContactURL">
	<portlet:param name="mvcPath" value="/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>

<%
	List<CrmContactViewModel> viewModels = new ArrayList<CrmContactViewModel>();
	List<CrmContact> crmContacts = CrmContactLocalServiceUtil.findByStatus(ConstantContactKeys.CC_STATUS_ACTIVE);

	for (CrmContact crmContact : crmContacts) {
		viewModels.add(new CrmContactViewModel(crmContact));
	}
%>

<div class="container-fluid-1280">

	<%-- TODO: check role --%>
	<aui:button onClick="<%= addContactURL.toString() %>"
		value="Add Contact"></aui:button>

	<liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No contacts found" total="<%=viewModels.size()%>"
		var="crmContactsSearchContainer">
		<liferay-ui:search-container-results
			results="<%=ListUtil.subList(viewModels, crmContactsSearchContainer.getStart(),
						crmContactsSearchContainer.getEnd())%>" />
		<liferay-ui:search-container-row
			className="contact.manager.app.viewmodel.CrmContactViewModel" modelVar="viewModel">
			<liferay-ui:search-container-column-jsp
				path="/contacts/view_actions.jsp" name="Actions" />
			<liferay-ui:search-container-column-text property="firstName"
				name="First Name" />
			<liferay-ui:search-container-column-text property="lastName"
				name="Last Name" />
			<liferay-ui:search-container-column-text property="organization"
				name="Organization" />
			<liferay-ui:search-container-column-text property="jobTitle"
				name="Job Title" />
			<liferay-ui:search-container-column-text property="primaryAddress1"
				name="Address 1" />
			<liferay-ui:search-container-column-text property="primaryAddress2"
				name="Address 2" />
			<liferay-ui:search-container-column-text
				property="primaryAddressCity" name="City" />
			<liferay-ui:search-container-column-text property="primaryAddressZip"
				name="ZIP" />
			<liferay-ui:search-container-column-text
				property="primaryAddressCounty" name="County" />
			<liferay-ui:search-container-column-text property="primaryPhone"
				name="Phone" />
			<liferay-ui:search-container-column-text property="primaryCell"
				name="Cell" />
			<liferay-ui:search-container-column-text
				property="primaryEmailAddress" name="Email Address" />
			<liferay-ui:search-container-column-text property="groupsList"
				name="Groups" />
			<liferay-ui:search-container-column-text property="tagsList"
				name="Tags" />
			<liferay-ui:search-container-column-text property="modifiedDate"
				name="Modified" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>