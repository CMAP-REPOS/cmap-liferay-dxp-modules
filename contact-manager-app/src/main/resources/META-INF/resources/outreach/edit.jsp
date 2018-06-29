<%@ include file="../init.jsp"%>

<%
	long crmOutreachLogId = ParamUtil.getLong(request, "crmOutreachLogId");
	long crmContactId = ParamUtil.getLong(request, "crmContactId");

	CrmOutreachLog crmOutreachLog = null;
	CrmContact crmContact = null;

	if (crmOutreachLogId > 0) {
		crmOutreachLog = CrmOutreachLogLocalServiceUtil.getCrmOutreachLog(crmOutreachLogId);
	}

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}

	Calendar today = Calendar.getInstance();

	String redirect = ParamUtil.getString(request, "redirect");

	renderResponse.setTitle((crmContact != null)
			? ("New Outreach Log for " + crmContact.getFirstName() + " " + crmContact.getLastName())
			: "New Outreach Log");
%>

<portlet:actionURL
	name='<%=crmOutreachLog == null ? "addOutreachLog" : "updateOutreachLog"%>'
	var="editOutreachLogURL" />

<div class="container-fluid">

	<aui:form action="<%=editOutreachLogURL%>"
		name="<portlet:namespace />fm">
		<aui:input type="hidden" name="crmContactId"
			value='<%=String.valueOf(crmContactId)%>'>
		</aui:input>
		<aui:row>
			<aui:col md="12">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<div class="form-group input-text-wrapper">
							<label class="control-label"
								for="_ContactManagerApp_outreachDate"> Date </label>
							<liferay-ui:input-date name="outreachDate"
								formName="<portlet:namespace />fm" dayParam="outreachDateDay"
								dayValue="<%=today.get(Calendar.DAY_OF_MONTH)%>"
								monthParam="outreachDateMont"
								monthValue="<%=today.get(Calendar.MONTH)%>"
								yearParam="outreachDateYear"
								yearValue="<%=today.get(Calendar.YEAR)%>">
								<aui:validator name="required" />
							</liferay-ui:input-date>
						</div>
						<aui:select name="medium" label="Medium">
							<aui:option value=""></aui:option>
							<aui:option value="email">Email</aui:option>
							<aui:option value="person">In person</aui:option>
							<aui:option value="phone">Phone</aui:option>
							<aui:option value="other">Other</aui:option>
							<aui:validator name="required" />
						</aui:select>
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