<%@ include file="../init.jsp"%>

<%
	long crmNoteId = ParamUtil.getLong(request, "crmNoteId");
	long crmContactId = ParamUtil.getLong(request, "crmContactId");

	CrmNote crmNote = null;
	CrmContact crmContact = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}

	if (crmNoteId > 0) {
		crmNote = CrmNoteLocalServiceUtil.getCrmNote(crmNoteId);
	}

	Calendar today = Calendar.getInstance();

	String redirect = ParamUtil.getString(request, "redirect");

	renderResponse.setTitle((crmContact != null)
			? ("New Note for " + crmContact.getFirstName() + " " + crmContact.getLastName())
			: "New Note");
%>

<portlet:actionURL
	name='<%=crmNote == null ? "addNote" : "updateNote"%>'
	var="editNoteURL" />

<div class="container-fluid">

	<aui:form action="<%=editNoteURL%>"
		name="<portlet:namespace />fm">
		<aui:input type="hidden" name="crmContactId"
			value='<%=String.valueOf(crmContactId)%>'>
		</aui:input>
		<aui:row>
			<aui:col md="12">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="note" label="Notes" type="textarea">
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col md="12">
				<aui:button-row>
					<aui:button type="submit"></aui:button>
					<aui:button type="cancel" onClick="<%=redirect%>"></aui:button>
				</aui:button-row>
			</aui:col>
		</aui:row>
	</aui:form>

</div>