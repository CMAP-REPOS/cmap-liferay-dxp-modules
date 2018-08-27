<%@ include file="../init.jsp"%>

<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
	String redirect = ParamUtil.getString(request, "redirect");

	CrmGroup crmGroup = null;
	List<CrmContact> crmGroupContacts = new ArrayList<CrmContact>();

	if (crmGroupId > 0) {
		crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
		crmGroupContacts = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);
	}

	renderResponse.setTitle((crmGroup != null) ? (crmGroup.getName()) : "New Group");
%>

<portlet:actionURL name='<%=crmGroup == null ? "add" : "update"%>'
	var="editURL" />

<portlet:resourceURL var="ajaxCallResourceURL" />

<script>

var cmap = cmap || {};
cmap.groupManager =  cmap.groupManager || {};
cmap.groupManager.resourceUrl = '<%=ajaxCallResourceURL %>';

cmap.groupManager.bindEvents = function() {
	$('#<portlet:namespace />contactsLists').on('change', '.contact-toggler', function() {
		var input = $(this).next('input:hidden');
		input.prop('disabled', function(i, v) { return !v; });
	});
	
	$('#<portlet:namespace />addContacts').on('click', function(e) {
		e.preventDefault();
		cmap.groupManager.addContactsToList();
	});
}

cmap.groupManager.addContactsToList = function(data) {
	/* 
	<li>
	    <input class="contact-toggler" name="chk_662" id="chk_662" checked="checked" type="checkbox">
	    <input class="field form-control" id="_GroupManagerApp_crmContactIds" name="_GroupManagerApp_crmContactIds" value="662" type="hidden"> Bruce Gould 
	</li>
	 */	
	<!-- TODO: check for duplicates -->
	var selectedContacts = $('#<portlet:namespace />findName').select2('data');
	for (var i = 0; i < selectedContacts.length; i++) {
		var contact = selectedContacts[i];
		
		$('#<portlet:namespace />pendingContactsList').append('<li>' +
		    '<input class="contact-toggler" name="chk_'+contact.id+'" id="chk_'+contact.id+'" checked="checked" type="checkbox">' + 
		    '<input class="field form-control" id="_GroupManagerApp_crmContactIds" name="_GroupManagerApp_crmContactIds" value="'+contact.id+'" type="hidden"> '+contact.text + 
		'</li>');
	}
}

cmap.groupManager.initSelect2 = function() {
	$('#<portlet:namespace />findName').select2({
	    minimumInputLength: 2,
	    tags: [],
	    ajax: {
	        url: cmap.groupManager.resourceUrl,
	        dataType: 'json',
	        type: "GET",
	        quietMillis: 50,
	        data: function (term) {
	            return {
	            	'<portlet:namespace />name': term,
	                '<portlet:namespace />cmd': 'getPotentialContacts'
	            };
	        },
	        results: function (data) {
	            return {
	                results: $.map(data, function (item) {
	                    return {
	                        text: item.crmContactName,
	                        slug: item.crmContactName,
	                        id: item.crmContactId
	                    }
	                })
	            };
	        }
	    }
	});
}

AUI().ready(
	function () {
		cmap.groupManager.bindEvents();
		cmap.groupManager.initSelect2();
	}
)

</script>

<div class="container-fluid">

	<aui:form action="<%=editURL%>" name="<portlet:namespace />fm">
		<aui:input type="hidden" name="crmGroupId"
			value='<%=crmGroup == null ? "" : crmGroup.getCrmGroupId()%>'>
		</aui:input>

		<aui:row>
			<aui:col md="12">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="name"
							value='<%=crmGroup == null ? "" : crmGroup.getName()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:row>
							<aui:col md="6">
								<div class="form-group" id="<portlet:namespace />contactsLists">
									<label class="control-label"> Assigned Contacts </label>
									<!-- TODO: visually differentiate pending contacts -->
									<ul id="<portlet:namespace />pendingContactsList">
									</ul>
									<ul id="<portlet:namespace />assignedContactsList">
										<%
											for (CrmContact crmContact : crmGroupContacts) {
										%>
										<li><input type="checkbox" class="contact-toggler"
											name="chk_<%=crmContact.getCrmContactId()%>"
											id="chk_<%=crmContact.getCrmContactId()%>" checked="checked">
											<aui:input name="crmContactIds" class="contact-toggler-value"
												type="hidden" value="<%=crmContact.getCrmContactId()%>"></aui:input>
											<%=crmContact.getFirstName() + ' ' + crmContact.getLastName()%>
										</li>
										<%
											}
										%>
									</ul>
								</div>
							</aui:col>
							<aui:col md="6">
								<aui:input name="findName" label="Find Contacts">
								</aui:input>
								
								<button class="btn btn-primary btn-default" id="<portlet:namespace />addContacts"> <span class="lfr-btn-label">Add Contacts</span> </button>
							</aui:col>
						</aui:row>
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