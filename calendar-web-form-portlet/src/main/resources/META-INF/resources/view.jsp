<%@ include file="/init.jsp" %>

<portlet:defineObjects />
<portlet:resourceURL  var="ajaxCallResourceURL"/>

<script type="text/javascript">
$(function() {
	
	$('#<portlet:namespace />fromEmail').val('');
	$('#<portlet:namespace />toEmail').val('');

	$('#emailEventSend').on('click', function(e) {
		e.preventDefault();
		$.post('<%=ajaxCallResourceURL.toString()%>', $("#emailEventForm").serialize(), function(data) {
			if (data === 'success') {
				$('.scheduler-event-recorder-body').html('<p>Your email has been sent.</p>');
			} else {
				$('.scheduler-event-recorder-body').html('<p>Your email could not be sent. Please try again later.</p>');
			}
		});
	});

	$('#_com_liferay_calendar_web_portlet_CalendarPortlet_scheduler').on('click', 'a.emailFriend', function(e) {
		console.log('emailFriend')
		e.preventDefault();
		e.stopPropagation();
		if ($('#emailEventForm').length) {
			$('.scheduler-event-recorder-body').html($('#emailEventForm').clone(true).removeClass('hidden'));
		}
	});
});
</script>

<form name="emailEventForm" id="emailEventForm" class="hidden">

	<p>Please enter your email address, your friend's email address,
		and then click "send."</p>

	<div class="form-group liferay-ddm-form-field-text "
		data-fieldname="<portlet:namespace />fromEmail">
		<label class="control-label" for="<portlet:namespace />fromEmail">Your
			email address</label>
		<div class="input-group-container ">
			<input class="field form-control" dir="undefined"
				id="<portlet:namespace />fromEmail"
				name="<portlet:namespace />fromEmail" placeholder="" value=""
				type="text">
		</div>
	</div>
	<div class="form-group liferay-ddm-form-field-text "
		data-fieldname="<portlet:namespace />toEmail">
		<label class="control-label" for="<portlet:namespace />toEmail">Your
			friend's email address</label>
		<div class="input-group-container ">
			<input class="field form-control" dir="undefined"
				id="<portlet:namespace />toEmail"
				name="<portlet:namespace />toEmail" placeholder="" value=""
				type="text">
		</div>
	</div>

	<p>
		<button class="btn btn-lg btn-primary lfr-ddm-form-submit pull-right"
			type="submit" id="emailEventSend" name="emailEventSend">Send</button>
	</p>

</form>
