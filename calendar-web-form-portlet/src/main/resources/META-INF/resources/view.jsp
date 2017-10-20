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
		$('#<portlet:namespace />jumpTo').find('option:eq(0)').prop('selected', true);
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
		
		$('#<portlet:namespace />jumpTo').on('change', function() {
			window._com_liferay_calendar_web_portlet_CalendarPortlet_scheduler.set('date', new Date($(this).val())); 
		});
	}
	
	cmap.calendar.form.init();
	cmap.calendar.form.bindEvents();
});
</script>

<%
	Order order = OrderFactoryUtil.asc("startTime");
	DynamicQuery calendarQuery = CalendarBookingLocalServiceUtil.dynamicQuery();
	calendarQuery.add(RestrictionsFactoryUtil.eq("calendarId", 738411L)).addOrder(order);
	
	List<CalendarBooking> calendarBookings = CalendarBookingLocalServiceUtil.dynamicQuery(calendarQuery, 0, 1);
	Date firstBookingDate = new Date(calendarBookings.get(0).getStartTime());
	
	Calendar firstBookingCalendar = Calendar.getInstance();
	firstBookingCalendar.setTime(firstBookingDate);
	
	int firstBookingYear = firstBookingCalendar.get(Calendar.YEAR);
	int firstBookingMonth = firstBookingCalendar.get(Calendar.MONTH);
	
	Calendar todayCalendar = Calendar.getInstance();
	int todayYear = todayCalendar.get(Calendar.YEAR);
	int todayMonth = todayCalendar.get(Calendar.MONTH);

	Map<String, String> bookingOptions = new HashMap<String, String>();
	
	java.text.DateFormatSymbols dfs = new java.text.DateFormatSymbols();
	String[] monthNames = dfs.getMonths();

	%>

<div id="<portlet:namespace />jumpToContainer" class="jump-to-container hidden form-group form-inline">
	<div class="col-xl-6 col-xl-offset-10 col-sm-16 col-sm-offset-0">
		<div class="input-select-wrapper">
			<label for="<portlet:namespace />jumpTo">Jump to</label>
			<select id="<portlet:namespace />jumpTo" name="<portlet:namespace />jumpTo" class="form-control">
			<% 		
			for (int i = todayYear; i >= firstBookingYear; i--) {
				for (int j = 11; j >= 0; j--) {
					if (i == firstBookingYear && j < firstBookingMonth) {
						break;
					}
					if (!(i == todayYear && j > todayMonth)) {
						String key = monthNames[j] + " " + String.valueOf(i);
						/* add one to the month because new Date("2017, 2, 1") is not the same as new Date(2017, 2, 1) */
						String value = String.valueOf(i) + ", " + String.valueOf(j+1) + ", 1";
						bookingOptions.put(key, value);
						%>
						<option value="<%= value %>"><%= key %></option>
						<% 
					}
				}
			}
			%>
			</select>
		</div>
	</div>
</div>

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
