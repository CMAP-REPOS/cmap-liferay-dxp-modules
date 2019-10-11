<%@page import="contact.manager.service.persistence.CrmGroupUtil"%>
<%@ include file="../init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	List<CrmGroup> crmGroups = CrmContactLocalServiceUtil.getCrmGroups(crmContactId);
	List<CrmGroup> crmGroups2 = CrmGroupLocalServiceUtil.getCrmContactCrmGroups(crmContactId);
	
	String groupsString = GroupUtil.getCrmGroupsByContactId(crmContactId);
	
	for (CrmGroup crmGroup : crmGroups) {
		System.out.println("######   Group Contact -> " + crmGroup  + "######");
	}
	
	for (CrmGroup crmGroup : crmGroups2) {
		System.out.println("######  Group Local -> " + crmGroup  + "######");
	}
	
	System.out.println("######  Group String -> " + groupsString + "######");

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

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/contacts/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL
	name='<%=crmContact == null ? "addContact" : "updateContact"%>'
	var="editContactURL" />

<portlet:resourceURL var="ajaxCallResourceURL" />

<script>

var cmap = cmap || {};
cmap.contactManager =  cmap.contactManager || {};
cmap.contactManager.resourceUrl = '<%=ajaxCallResourceURL %>';
cmap.existingGroups = <%= GroupUtil.getCrmGroupsByContactId(crmContactId) %>;

cmap.contactManager.initSelect2 = function() {
	$('#<portlet:namespace />crmGroupIds').select2({
	    minimumInputLength: 2,
	    tags: [],
	    ajax: {
	        url: cmap.contactManager.resourceUrl,
	        dataType: 'json',
	        type: "GET",
	        quietMillis: 50,
	        data: function (term) {
	            return {
	            	'<portlet:namespace />name': term,
	                '<portlet:namespace />cmd': 'getPotentialGroups'
	            };
	        },
	        results: function (data) {
	            return {
	                results: $.map(data, function (item) {
	                    return {
	                        text: item.crmGroupName,
	                        slug: item.crmGroupName,
	                        id: item.crmGroupId
	                    }
	                })
	            };
	        }
	    }
	});
	
	if (cmap.existingGroups) {
		$('#<portlet:namespace />crmGroupIds').select2('data', cmap.existingGroups);
	}
}


AUI().ready(
	function () {
		cmap.contactManager.initSelect2();
	}
)

</script>



<div class="container-fluid">

	<aui:form action="<%=editContactURL%>" name="<portlet:namespace />fm">
		<aui:input type="hidden" name="crmContactId"
			value='<%=crmContact == null ? "" : crmContact.getCrmContactId()%>'>
		</aui:input>
		<aui:row>
			<aui:col md="4">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="firstName"
							value='<%=crmContact == null ? "" : crmContact.getFirstName()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="middleName"
							value='<%=crmContact == null ? "" : crmContact.getMiddleName()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="lastName"
							value='<%=crmContact == null ? "" : crmContact.getLastName()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="organization"
							value='<%=crmContact == null ? "" : crmContact.getOrganization()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="isVip" label="Subscriber Alert" type="checkbox" 
						checked="<%=crmContact == null ? false : crmContact.isIsVip()%>" >
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="crmGroupIds" label="Groups">
						</aui:input>
						<aui:input name="crmTags" label="Tags"
							value='<%=crmContact == null ? "" : crmContact.getTagsList()%>'>
						</aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="prefix" label="Prefix"
							value='<%=crmContact == null ? "" : crmContact.getPrefix()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="salutation" label="Salutation"
							value='<%=crmContact == null ? "" : crmContact.getSalutation()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="jobTitle" label="Job Title"
							value='<%=crmContact == null ? "" : crmContact.getJobTitle()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
			</aui:col>
			<aui:col md="4">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="primaryAddress1" label="Primary Address"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddress1()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="primaryAddress2" label="Primary Address 2"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddress2()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="primaryAddressCity" label="Primary Address City"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddressCity()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="primaryAddressState"
							label="Primary Address State"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddressState()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">2</aui:validator>
						</aui:input>
						<aui:input name="primaryAddressZip" label="Primary Address ZIP"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddressZip()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">10</aui:validator>
						</aui:input>
						<aui:input name="primaryAddressCounty"
							label="Primary Address County"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddressCounty()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="primaryAddressCountry"
							label="Primary Address Country"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryAddressCountry()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="secondaryAddress1" label="Secondary Address"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddress1()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="secondaryAddress2" label="Secondary Address 2"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddress2()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="secondaryAddressCity"
							label="Secondary Address City"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddressCity()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="secondaryAddressState"
							label="Secondary Address State"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddressState()%>'>
							<aui:validator name="maxLength">2</aui:validator>
						</aui:input>
						<aui:input name="secondaryAddressZip"
							label="Secondary Address ZIP"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddressZip()%>'>
							<aui:validator name="maxLength">10</aui:validator>
						</aui:input>
						<aui:input name="secondaryAddressCounty"
							label="Secondary Address County"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddressCounty()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="secondaryAddressCountry"
							label="Secondary Address Country"
							value='<%=crmContact == null ? "" : crmContact.getSecondaryAddressCountry()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
			</aui:col>
			<aui:col md="4">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="primaryPhone" label="Primary Phone"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryPhone()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">75</aui:validator>
						</aui:input>
						<aui:input name="primaryPhoneExtension"
							label="Primary Phone Extension"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryPhoneExtension()%>'>
							<aui:validator name="maxLength">75</aui:validator>
						</aui:input>
						<aui:input name="primaryFax" label="Primary Fax"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryFax()%>'>
							<aui:validator name="maxLength">75</aui:validator>
						</aui:input>
						<aui:input name="primaryCell" label="Primary Cell"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryCell()%>'>
							<aui:validator name="maxLength">75</aui:validator>
						</aui:input>
						<aui:input name="primaryEmailAddress"
							label="Primary Email Address"
							value='<%=crmContact == null ? "" : crmContact.getPrimaryEmailAddress()%>'>
							<aui:validator name="required" />
							<aui:validator name="email" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="alternateContact" label="Alternate Contact"
							value='<%=crmContact == null ? "" : crmContact.getAlternateContact()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="alternateEmail" label="Alternate Email Address"
							value='<%=crmContact == null ? "" : crmContact.getAlternateEmail()%>'>
							<aui:validator name="email" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="facebookId" label="Facebook ID"
							value='<%=crmContact == null ? "" : crmContact.getFacebookId()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="twitterHandle" label="Twitter Handle"
							value='<%=crmContact == null ? "" : crmContact.getTwitterHandle()%>'>
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
						<aui:input name="linkedInUrl" label="LinkedIn URL"
							value='<%=crmContact == null ? "" : crmContact.getLinkedInUrl()%>'>
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