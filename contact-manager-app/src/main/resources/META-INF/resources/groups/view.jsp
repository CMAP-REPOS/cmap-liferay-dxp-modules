<%@ include file="../init.jsp"%>

<%
	String name = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.NAME);
	String crmContactsCount = ParamUtil.getString(request, "orderByCol",
			CrmContactFieldKeys.CRM_CONTACTS_COUNT);
	String createDate = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.CREATE_DATE);
	String modifiedDate = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.MODIFIED_DATE);

	boolean orderByAsc = false;

	String orderByType = ParamUtil.getString(request, "orderByType", "asc");

	if (orderByType.equals("asc")) {
		orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

	if (name.equals(CrmContactFieldKeys.NAME)) {
		orderByComparator = new CrmGroupNameComparator(orderByAsc);
	}

	if (crmContactsCount.equals(CrmContactFieldKeys.CRM_CONTACTS_COUNT)) {
		orderByComparator = new CrmGroupCrmContactsCountComparator(orderByAsc);
	}

	if (createDate.equals(CrmContactFieldKeys.CREATE_DATE)) {
		orderByComparator = new CrmGroupCreateDateComparator(orderByAsc);
	}

	if (modifiedDate.equals(CrmContactFieldKeys.MODIFIED_DATE)) {
		orderByComparator = new CrmGroupModifiedDateComparator(false);
	}
%>

<portlet:renderURL var="addGroupURL">
	<portlet:param name="mvcPath" value="/groups/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>

<div class="container-fluid">
	<%
		if (PermissionUtil.userHasRole(currentUser, ContactManagerAppPortletKeys.ROLE_MANAGER)) {
	%>
	<aui:row>
		<aui:col md="12">
			<aui:button onClick="<%= addGroupURL.toString() %>" value="Add Group"></aui:button>
		</aui:col>
	</aui:row>
	<%
		}
	%>
	<aui:row>
		<aui:col md="12">
			<liferay-ui:search-container delta="20" deltaConfigurable="true"
				emptyResultsMessage="No groups found"
				total="<%=CrmGroupLocalServiceUtil.countAll()%>"
				var="crmGroupsSearchContainer">
				<liferay-ui:search-container-results>
					<%
						List<CrmGroupViewModel> viewModels = new ArrayList<CrmGroupViewModel>();
						List<CrmGroup> crmGroups = CrmGroupLocalServiceUtil.getCrmGroupByStatus(ConstantContactKeys.CC_STATUS_ACTIVE, crmGroupsSearchContainer.getStart(), crmGroupsSearchContainer.getEnd(),
							orderByComparator);
					
						for (CrmGroup crmGroup : crmGroups) {
							viewModels.add(new CrmGroupViewModel(crmGroup));
						}
						
						pageContext.setAttribute("results", viewModels);
					
					%>
				</liferay-ui:search-container-results>
				<liferay-ui:search-container-row
					className="contact.manager.app.viewmodel.CrmGroupViewModel"
					modelVar="viewModel">
					<liferay-ui:search-container-column-jsp
						path="/groups/view_group_actions.jsp" name="Actions" />
					<liferay-ui:search-container-column-text property="name"
						name="Name" orderable="true" orderableProperty="name" />
					<liferay-ui:search-container-column-text
						property="crmContactsCount" name="Contacts" orderable="true"
						orderableProperty="crmContactsCount" />
					<liferay-ui:search-container-column-text property="createDate"
						name="Created" orderable="true" orderableProperty="createDate" />
					<liferay-ui:search-container-column-text property="modifiedDate"
						name="Modified" orderable="true" orderableProperty="modifiedDate" />
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>
</div>