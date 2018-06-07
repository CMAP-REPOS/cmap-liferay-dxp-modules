<%@ include file="../init.jsp"%>

<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");

	CrmGroup crmGroup = null;

	if (crmGroupId > 0) {
		crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmGroup != null) ? (crmGroup.getName()) : "New Group");

	List<CrmContact> crmContactList = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);
%>

<div class="container-fluid-1280">

	<aui:fieldset-group markupView="lexicon">
		<aui:row>
			<aui:col md="12">
				<p>
					<strong><liferay-ui:message key="crm.label.name" /></strong>
				</p>
				<p><%=crmGroup.getName()%></p>
			</aui:col>
		</aui:row>
	</aui:fieldset-group>

	 <liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No contacts found" total="<%=crmContactList.size()%>"
		var="crmGroupsSearchContainer">
		<liferay-ui:search-container-results results="<%=crmContactList%>" />

	    <liferay-ui:search-container-row
			className="contact.manager.model.CrmContact" modelVar="crmContact">

			<liferay-ui:search-container-column-jsp
				path="/groups/view_contact_actions.jsp" name="Actions" />

			<liferay-ui:search-container-column-text property="firstName" name="First Name"  orderableProperty="firstName" orderable="<%= true %>" />
			<liferay-ui:search-container-column-text property="lastName" name="Last Name" />
			<liferay-ui:search-container-column-text property="primaryEmailAddress" name="Primary Email Address" />
			<liferay-ui:search-container-column-text property="primaryPhone" name="Primary Phone" />
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>