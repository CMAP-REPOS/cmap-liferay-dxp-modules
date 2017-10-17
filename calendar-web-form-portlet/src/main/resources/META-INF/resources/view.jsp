<%@ include file="/init.jsp"%>

<portlet:defineObjects />
<portlet:resourceURL var="ajaxCallResourceURL" />

<script type="text/javascript">
$(function() {

	var cmap = cmap || {};
	cmap.calendar = cmap.calendar || {};
	cmap.calendar.form = cmap.calendar.form || {};
	cmap.calendar.form.resourceUrl = '<%=ajaxCallResourceURL.toString()%>';
	
	cmap.calendar.form.emailEvent = function() {
		$.post(cmap.calendar.form.resourceUrl, $('#emailEventFormClone').serialize(), function(data) {
			if (data === 'success') {
				$('.scheduler-event-recorder-body').html('<p>Your email has been sent.</p>');
			} else {
				$('.scheduler-event-recorder-body').html('<p>Your email could not be sent. Please try again later.</p>');
			}
		});
	}
	
	cmap.calendar.form.init = function() {
		$('#<portlet:namespace />fromEmail').val('');
		$('#<portlet:namespace />toEmail').val('');
	}

	cmap.calendar.form.bindEvents = function() {
		$('#_com_liferay_calendar_web_portlet_CalendarPortlet_scheduler').on('click', '.emailFriend', function(e) {
			e.preventDefault();
			e.stopPropagation();
			var $button = $(this);
			console.log();
			if ($('#emailEventForm').length) {

				$('.scheduler-event-recorder-body').html($('#emailEventForm').clone(true).attr('id','emailEventFormClone').removeClass('hidden'));
				
				$('.scheduler-event-recorder-body').find('#<portlet:namespace />title').val($button.data('event-name'));
				$('.scheduler-event-recorder-body').find('#<portlet:namespace />date').val($button.data('event-date'));
				$('.scheduler-event-recorder-body').find('#<portlet:namespace />time').val($button.data('event-time'));
				$('.scheduler-event-recorder-body').find('#<portlet:namespace />location').val($button.data('event-location'));

				$('#emailEventFormClone').find('button').on('click', function(e) {
					e.preventDefault();
					cmap.calendar.form.emailEvent();
				});
			}
		});
	}
	
	cmap.calendar.form.init();
	cmap.calendar.form.bindEvents();
});
</script>

<form name="emailEventForm" id="emailEventForm" class="hidden">

	<p>Please enter your email address, your friend's email address,
		and then click "send."</p>

	<div class="form-group liferay-ddm-form-field-text">
		<label class="control-label" for="<portlet:namespace />fromEmail">Your
			email address</label>
		<div class="input-group-container ">
			<input class="field form-control" 
				id="<portlet:namespace />fromEmail"
				name="<portlet:namespace />fromEmail" 
				type="text">
		</div>
	</div>
	<div class="form-group liferay-ddm-form-field-text">
		<label class="control-label" for="<portlet:namespace />toEmail">Your
			friend's email address</label>
		<div class="input-group-container ">
			<input class="field form-control" id="<portlet:namespace />toEmail"
				name="<portlet:namespace />toEmail" type="text">
		</div>
	</div>
	<input id="<portlet:namespace />title" name="<portlet:namespace />title" type="hidden"> 
	<input id="<portlet:namespace />date" name="<portlet:namespace />date" type="hidden"> 
	<input id="<portlet:namespace />time" name="<portlet:namespace />time" type="hidden"> 
	<input id="<portlet:namespace />location" name="<portlet:namespace />location" type="hidden"> 
	<input id="<portlet:namespace />requestedResource" name="<portlet:namespace />requestedResource" value="emailEventResource" type="hidden">

	<p>
		<button class="btn btn-lg btn-primary lfr-ddm-form-submit pull-right emailEventSend"
			type="submit" name="emailEventSend">Send</button>
	</p>

</form>
