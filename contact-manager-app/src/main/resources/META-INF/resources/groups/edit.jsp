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

	List<CrmContact> crmContactList = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);
%>

<portlet:actionURL name='<%=crmGroup == null ? "add" : "update"%>'
	var="editURL" />

<portlet:resourceURL var="ajaxCallResourceURL" />

<script>

var cmap = cmap || {};
cmap.groupManager =  cmap.groupManager || {};
cmap.groupManager.resourceUrl = '<%=ajaxCallResourceURL%>';

cmap.groupManager.bindEvents = function() {

	$("#_GroupManagerApp_submit").click(function(e) {
		var $form = $('#<portlet:namespace />fm')
		var contactsToAdd = $('#<portlet:namespace />findAddName').select2('data');
		var contactsToRemove = $('#<portlet:namespace />findRemoveName').select2('data');
		var formValidator = Liferay.Form.get('<portlet:namespace />fm').formValidator;
		
		$.each(contactsToAdd, function(i, v) {
			var id = v.id;
			if (!$('input[value="' + id + '"]:hidden').length) {
				$form.append('<input id="_GroupManagerApp_crmContactIds" name="_GroupManagerApp_crmContactIds" value="'+id+'" type="hidden">');
			};
		});
		
		$.each(contactsToRemove, function(i, v) {
			var id = v.id;
			$form.find('input[value="' + id + '"]:hidden').remove();
		});
		
		formValidator.validate();
		if (!formValidator.hasErrors()) {
			$form.submit();
		}

	});
}

cmap.groupManager.initSelect2 = function() {
	$('#<portlet:namespace />findAddName').val('');
	$('#<portlet:namespace />findAddName').select2({
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

	
	<% if (crmGroup != null) { %>
	
	$('#<portlet:namespace />findRemoveName').val('');
	$('#<portlet:namespace />findRemoveName').select2({
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
	            	'<portlet:namespace />crmGroupId': <%=crmGroup.getCrmGroupId()%>,
	                '<portlet:namespace />cmd': 'getExistingContacts'
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
	
	<% } %>
}

AUI().ready(
	function () {
		cmap.groupManager.bindEvents();
		cmap.groupManager.initSelect2();
	}
)

</script>

<div class="container-fluid">

	<aui:form action="<%=editURL%>" name="fm">
		<aui:input type="hidden" name="crmGroupId"
			value='<%=crmGroup == null ? "" : crmGroup.getCrmGroupId()%>'>
		</aui:input>
		<%
			for (CrmContact crmContact : crmGroupContacts) {
		%>
		<aui:input name="crmContactIds" class="contact-toggler-value"
			type="hidden" value="<%=crmContact.getCrmContactId()%>"></aui:input>
		<%
			}
		%>

		<aui:fieldset-group markupView="lexicon">
			<aui:row>
				<aui:col md="12">
					<aui:fieldset>
						<aui:input name="name"
							value='<%=crmGroup == null ? "" : crmGroup.getName()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:col>
				<aui:col md="6">
					<aui:fieldset>
						<div class="form-group input-text-wrapper">
							<label class="control-label"
								for="<portlet:namespace />findAddName"> Contacts to Add
							</label>
						</div>
						<aui:input name="findAddName" label="">
						</aui:input>
					</aui:fieldset>
				</aui:col>
				<aui:col md="6">
					<% if (crmGroup != null) { %>
					<aui:fieldset>
						<div class="form-group input-text-wrapper">
							<label class="control-label"
								for="<portlet:namespace />findRemoveName"> Contacts to
								Remove </label>
						</div>
						<aui:input name="findRemoveName" label="">
						</aui:input>
					</aui:fieldset>
					<% } %>
				</aui:col>
			</aui:row>
		</aui:fieldset-group>
		<aui:row>
			<aui:col md="12">
				<aui:button-row>
					<button class="btn btn-primary btn-default" id="_GroupManagerApp_submit" type="button"> <span class="lfr-btn-label">Save</span> </button>
					<aui:button type="cancel" onClick="<%=redirect%>"></aui:button>
				</aui:button-row>
			</aui:col>
		</aui:row>
	</aui:form>
</div>