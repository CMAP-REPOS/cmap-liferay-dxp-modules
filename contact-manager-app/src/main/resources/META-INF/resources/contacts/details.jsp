<%@ include file="../init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");

	CrmContact crmContact = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmContact != null) ? (crmContact.getFirstName() + " " + crmContact.getLastName())
			: "New Contact");
%>

<div class="container-fluid-1280">

	<aui:fieldset-group markupView="lexicon">
		<aui:row>
			<aui:col md="4">
				<p>
					<strong><liferay-ui:message key="crm.label.firstName" /></strong>
				</p>
				<p><%=crmContact.getFirstName()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.middleName" /></strong>
				</p>
				<p><%=crmContact.getMiddleName()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.lastName" /></strong>
				</p>
				<p><%=crmContact.getLastName()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.organization" /></strong>
				</p>
				<p><%=crmContact.getOrganization()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.isVip" /></strong>
				</p>
				<p></p>
				<p>
					<strong><liferay-ui:message key="crm.label.groupsList" /></strong>
				</p>
				<p><%=crmContact.getGroupsList()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.tagsList" /></strong>
				</p>
				<p><%=crmContact.getTagsList()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.prefix" /></strong>
				</p>
				<p><%=crmContact.getPrefix()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.salutation" /></strong>
				</p>
				<p><%=crmContact.getSalutation()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.jobTitle" /></strong>
				</p>
				<p><%=crmContact.getJobTitle()%></p>
			</aui:col>
			<aui:col md="4">
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryAddress1" /></strong>
				</p>
				<p><%=crmContact.getPrimaryAddress1()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryAddress2" /></strong>
				</p>
				<p><%=crmContact.getPrimaryAddress2()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryAddressCity" /></strong>
				</p>
				<p><%=crmContact.getPrimaryAddressCity()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryAddressState" /></strong>
				</p>
				<p><%=crmContact.getPrimaryAddressState()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryAddressZip" /></strong>
				</p>
				<p><%=crmContact.getPrimaryAddressZip()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryAddressCounty" /></strong>
				</p>
				<p><%=crmContact.getPrimaryAddressCounty()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.secondaryAddress1" /></strong>
				</p>
				<p><%=crmContact.getSecondaryAddress1()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.secondaryAddress2" /></strong>
				</p>
				<p><%=crmContact.getSecondaryAddress2()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.secondaryAddressCity" /></strong>
				</p>
				<p><%=crmContact.getSecondaryAddressCity()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.secondaryAddressState" /></strong>
				</p>
				<p><%=crmContact.getSecondaryAddressState()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.secondaryAddressZip" /></strong>
				</p>
				<p><%=crmContact.getSecondaryAddressZip()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.secondaryAddressCounty" /></strong>
				</p>
				<p><%=crmContact.getSecondaryAddressCounty()%></p>
			</aui:col>
			<aui:col md="4">
				<p>
					<strong><liferay-ui:message key="crm.label.primaryPhone" /></strong>
				</p>
				<p><%=crmContact.getPrimaryPhone()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryPhoneExtension" /></strong>
				</p>
				<p><%=crmContact.getPrimaryPhoneExtension()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.primaryEmailAddress" /></strong>
				</p>
				<p><%=crmContact.getPrimaryEmailAddress()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.primaryFax" /></strong>
				</p>
				<p><%=crmContact.getPrimaryFax()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.primaryCell" /></strong>
				</p>
				<p><%=crmContact.getPrimaryCell()%></p>
				<p>
					<strong><liferay-ui:message
							key="crm.label.alternateContact" /></strong>
				</p>
				<p><%=crmContact.getAlternateContact()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.alternateEmail" /></strong>
				</p>
				<p><%=crmContact.getAlternateEmail()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.facebookId" /></strong>
				</p>
				<p><%=crmContact.getFacebookId()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.twitterHandle" /></strong>
				</p>
				<p><%=crmContact.getTwitterHandle()%></p>
				<p>
					<strong><liferay-ui:message key="crm.label.linkedInUrl" /></strong>
				</p>
				<p><%=crmContact.getLinkedInUrl()%></p>
			</aui:col>
		</aui:row>
	</aui:fieldset-group>
</div>