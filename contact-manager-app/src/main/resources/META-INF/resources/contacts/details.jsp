<%@ include file="../init.jsp"%>

<liferay-ui:error key="409" message="This user&#39;s profile has already been created. Please check that the e-mail address does not already exist in the system" />
<liferay-ui:error key="400" message="400 Server error, message was malformed or there was a data validation error" />
<liferay-ui:error key="401" message="401 Server error, authentication failure" />
<liferay-ui:error key="406" message="406 Server error" />
<liferay-ui:error key="415" message="415 Server error" />
<liferay-ui:error key="500" message="500 Server error" />

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	CrmContact crmContact = null;
	CrmContactViewModel viewModel = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
		viewModel = new CrmContactViewModel(crmContact);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	
	renderResponse.setTitle((crmContact != null)
			? ("Contact Information for " + crmContact.getFirstName() + " " + crmContact.getLastName())
			: "Contact Information");
%>

<div class="container-fluid">
	<%
	if ("ContactManagerApp".equals(themeDisplay.getPpid()) ) { %>
	<%@ include file="nav.jsp"%>
	<% }  %>
	<aui:fieldset-group markupView="lexicon">
		<aui:row>
			<aui:col md="4">
				<div class="panel-body">
					<p>
						<strong><liferay-ui:message key="crm.label.firstName" /></strong>
					</p>
					<p><%=viewModel.getFirstName()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.middleName" /></strong>
					</p>
					<p><%=viewModel.getMiddleName()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.lastName" /></strong>
					</p>
					<p><%=viewModel.getLastName()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.organization" /></strong>
					</p>
					<p><%=viewModel.getOrganization()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.isVip" /></strong>
					</p>
					<p><%=viewModel.isVip()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.groupsList" /></strong>
					</p>
					<p><%=viewModel.getGroupsList()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.tagsList" /></strong>
					</p>
					<p><%=viewModel.getTagsList()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.prefix" /></strong>
					</p>
					<p><%=viewModel.getPrefix()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.salutation" /></strong>
					</p>
					<p><%=viewModel.getSalutation()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.jobTitle" /></strong>
					</p>
					<p><%=viewModel.getJobTitle()%></p>
				</div>
			</aui:col>
			<aui:col md="4">
				<div class="panel-body">
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryAddress1" /></strong>
					</p>
					<p><%=viewModel.getPrimaryAddress1()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryAddress2" /></strong>
					</p>
					<p><%=viewModel.getPrimaryAddress2()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryAddressCity" /></strong>
					</p>
					<p><%=viewModel.getPrimaryAddressCity()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryAddressState" /></strong>
					</p>
					<p><%=viewModel.getPrimaryAddressState()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryAddressZip" /></strong>
					</p>
					<p><%=viewModel.getPrimaryAddressZip()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryAddressCounty" /></strong>
					</p>
					<p><%=viewModel.getPrimaryAddressCounty()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.secondaryAddress1" /></strong>
					</p>
					<p><%=viewModel.getSecondaryAddress1()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.secondaryAddress2" /></strong>
					</p>
					<p><%=viewModel.getSecondaryAddress2()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.secondaryAddressCity" /></strong>
					</p>
					<p><%=viewModel.getSecondaryAddressCity()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.secondaryAddressState" /></strong>
					</p>
					<p><%=viewModel.getSecondaryAddressState()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.secondaryAddressZip" /></strong>
					</p>
					<p><%=viewModel.getSecondaryAddressZip()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.secondaryAddressCounty" /></strong>
					</p>
					<p><%=viewModel.getSecondaryAddressCounty()%></p>
				</div>
			</aui:col>
			<aui:col md="4">
				<div class="panel-body">
					<p>
						<strong><liferay-ui:message key="crm.label.primaryPhone" /></strong>
					</p>
					<p><%=viewModel.getPrimaryPhone()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryPhoneExtension" /></strong>
					</p>
					<p><%=viewModel.getPrimaryPhoneExtension()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.primaryEmailAddress" /></strong>
					</p>
					<p><%=viewModel.getPrimaryEmailAddress()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.primaryFax" /></strong>
					</p>
					<p><%=viewModel.getPrimaryFax()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.primaryCell" /></strong>
					</p>
					<p><%=viewModel.getPrimaryCell()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.alternateContact" /></strong>
					</p>
					<p><%=viewModel.getAlternateContact()%></p>
					<p>
						<strong><liferay-ui:message
								key="crm.label.alternateEmail" /></strong>
					</p>
					<p><%=viewModel.getAlternateEmail()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.facebookId" /></strong>
					</p>
					<p><%=viewModel.getFacebookId()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.twitterHandle" /></strong>
					</p>
					<p><%=viewModel.getTwitterHandle()%></p>
					<p>
						<strong><liferay-ui:message key="crm.label.linkedInUrl" /></strong>
					</p>
					<p><%=viewModel.getLinkedInUrl()%></p>
				</div>
			</aui:col>
		</aui:row>
	</aui:fieldset-group>
	<aui:fieldset-group markupView="lexicon">
		<aui:row>
			<aui:col md="4">
				<div class="panel-body">
					<p>
						<strong>Muni</strong>
					</p>
					<p><%=viewModel.getCrmMuniNames()%></p>
					<p>
						<strong>County</strong>
					</p>
					<p><%=viewModel.getCrmCountyNames()%></p>
					<p>
						<strong>LTA</strong>
					</p>
					<p><%=viewModel.getCrmLTANames()%></p>
				</div>
			</aui:col>
			<aui:col md="4">
				<div class="panel-body">
					<p>
						<strong>US Representative</strong>
					</p>
					<p><%=viewModel.getCrmUsRepNames()%></p>
					<p>
						<strong>State Representatives</strong>
					</p>
					<p><%=viewModel.getCrmStateRepNames()%></p>
					<p>
						<strong>State Senators</strong>
					</p>
					<p><%=viewModel.getCrmStateSenateNames()%></p>
				</div>
			</aui:col>
			<aui:col md="4">
				<div class="panel-body">
					<p>
						<strong>County Commissioner Districts</strong>
					</p>
					<p><%=viewModel.getCrmCountyCommissionerNames()%></p>
					<p>
						<strong>Aldermanic Wards</strong>
					</p>
					<p><%=viewModel.getCrmChiWardNames()%></p>
					<p>
						<strong>Chicago Neighborhood</strong>
					</p>
					<p><%=viewModel.getCrmCCANames()%></p>
				</div>
			</aui:col>
		</aui:row>
	</aui:fieldset-group>



</div>