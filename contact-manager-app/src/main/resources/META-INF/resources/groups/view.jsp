<%@ include file="../init.jsp"%>

<portlet:renderURL var="addGroupURL">
	<portlet:param name="mvcPath" value="/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>

<%
	List<CrmGroupViewModel> viewModels = new ArrayList<CrmGroupViewModel>();
	String name = ParamUtil.getString(request, "orderByCol", "name");
	String crmContactsCount = ParamUtil.getString(request, "orderByCol", "crmContactsCount");
	String createDate = ParamUtil.getString(request, "orderByCol", "createDate");
	String modifiedDate = ParamUtil.getString(request, "orderByCol", "modifiedDate");

	boolean orderByAsc = false;

	String orderByType = ParamUtil.getString(request, "orderByType", "asc");

	if (orderByType.equals("asc")) {
	    orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

   if (name.equals("name")) {
	    orderByComparator = new CrmGroupNameComparator(orderByAsc);
	}

   if (crmContactsCount.equals("crmContactsCount")) {
	    orderByComparator = new CrmGroupCrmContactsCountComparator(orderByAsc);
	}

    if (createDate.equals("createDate")) {
    	orderByComparator = new CrmGroupCreateDateComparator(orderByAsc);
	}

    if (modifiedDate.equals("modifiedDate")) {
	    orderByComparator = new CrmGroupModifiedDateComparator(orderByAsc);
	} 
%>


<div class="container-fluid-1280">

	<liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No groups found" total="<%=CrmGroupLocalServiceUtil.countAll()%>"
		var="crmGroupsSearchContainer">
		<%-- <liferay-ui:search-container-results results="<%=viewModels%>" /> --%>
		
		<liferay-ui:search-container-results >
			   <%
			   List<CrmGroup> crmGroups = CrmGroupLocalServiceUtil.findAll(crmGroupsSearchContainer.getStart(), crmGroupsSearchContainer.getEnd(), orderByComparator);
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
				 name="Name" orderable="true" orderableProperty="name"/>
			<liferay-ui:search-container-column-text property="crmContactsCount"
				name="Contacts" orderable="true" orderableProperty="crmContactsCount"/>
			<liferay-ui:search-container-column-text property="createDate"
				name="Created" orderable="true" orderableProperty="createDate"/>
			<liferay-ui:search-container-column-text property="modifiedDate"
				name="Modified" orderable="true" orderableProperty="modifiedDate"/>
		</liferay-ui:search-container-row>


		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>