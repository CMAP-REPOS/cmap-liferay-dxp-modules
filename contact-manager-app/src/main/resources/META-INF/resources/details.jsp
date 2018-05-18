<%@ include file="/init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	CrmContact crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
%>

<liferay-ui:panel title="Contact Manager">

	<liferay-ui:panel title="Contact Details">

		<aui:row>
			<aui:col md="4">
				<p>
					<strong>First Name</strong>
				</p>
				<p><%=crmContact.getFirstName() %></p>
				<p>
					<strong>Middle Name/Initial</strong>
				</p>
				<p><%=crmContact.getFirstName() %></p>
				<p>
					<strong>Last Name</strong>
				</p>
				<p><%=crmContact.getLastName() %></p>
				<p>
					<strong>Organization</strong>
				</p>
				<p><%=crmContact.getOrganization() %></p>
				<p>
					<strong>Subscriber Alert</strong>
				</p>
				<p></p>
				<p>
					<strong>Groups</strong>
				</p>
				<p></p>
				<p>
					<strong>Tags</strong>
				</p>
				<p></p>
				<p>
					<strong>Prefix</strong>
				</p>
				<p></p>
				<p>
					<strong>Salutation</strong>
				</p>
				<p></p>
				<p>
					<strong>Job Title</strong>
				</p>
			</aui:col>
			<aui:col md="4">
				<p>
					<strong>Primary Address</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Address 2</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Address City</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Address State</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Address Zip</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary County</strong>
				</p>
				<p></p>
				<p>
					<strong>Secondary Address</strong>
				</p>
				<p></p>
				<p>
					<strong>Secondary Address 2</strong>
				</p>
				<p></p>
				<p>
					<strong>Secondary Address City</strong>
				</p>
				<p></p>
				<p>
					<strong>Secondary Address State</strong>
				</p>
				<p></p>
				<p>
					<strong>Secondary Address Zip</strong>
				</p>
				<p></p>
				<p>
					<strong>Secondary County</strong>
				</p>
				<p></p>
			</aui:col>
			<aui:col md="4">
				<p>
					<strong>Primary Phone</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Email Address</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Fax</strong>
				</p>
				<p></p>
				<p>
					<strong>Primary Cell</strong>
				</p>
				<p></p>
				<p>
					<strong>Alternate Contact</strong>
				</p>
				<p></p>
				<p>
					<strong>Alternate Email</strong>
				</p>
				<p></p>
				<p>
					<strong>Facebook ID</strong>
				</p>
				<p></p>
				<p>
					<strong>Twitter Handle</strong>
				</p>
				<p></p>
				<p>
					<strong>LinkedIn URL</strong>
				</p>
				<p></p>
			</aui:col>
		</aui:row>

	</liferay-ui:panel>

</liferay-ui:panel>
