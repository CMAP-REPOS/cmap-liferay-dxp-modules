<%@ include file="../init.jsp"%>
<%@ page import="java.lang.Math" %>


<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");

	CrmGroup crmGroup = null;

	if (crmGroupId > 0) {
		crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
		/*System.out.println("=======We in details=======");
		
		System.out.println("######  Group (HOW) ->" + crmGroup  + "######");
		System.out.println("=======Group Info ->" + crmGroup);
		System.out.println("=======Group Count ->" + CrmGroupLocalServiceUtil.getCrmContactsCount(crmGroupId));*/
		
		List<CrmContact> contactList = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);
		
		/*for(CrmContact crmContact:contactList){
			System.out.println("=======Group Contact Info ->" + crmContact);
			System.out.println("=======Group Contact Group ->" + CrmGroupLocalServiceUtil.getCrmContactCrmGroups(crmContact.getCrmContactId()));
		}*/
		
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/groups/details.jsp");
	iteratorURL.setParameter("crmGroupId", String.valueOf(crmGroupId));

	renderResponse.setTitle((crmGroup != null) ? ("Details for " + crmGroup.getName()) : "New Group");
	
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
				iteratorURL="<%=iteratorURL%>"
				emptyResultsMessage="No contacts found"
				total="<%=Math.toIntExact(crmGroup.getCrmContactsCount())%>" var="crmGroupsSearchContainer">
				<% 
				
					
				
				%>
				<liferay-ui:search-container-results results="<%=CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId, crmGroupsSearchContainer.getStart(), crmGroupsSearchContainer.getEnd())%>" />
				
				<liferay-ui:search-container-row
					className="contact.manager.model.CrmContact" modelVar="crmContact">
					<%
					
					%>
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