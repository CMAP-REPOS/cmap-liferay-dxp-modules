<%@ include file="/init.jsp"%>

<portlet:resourceURL var="ajaxCallResourceURL" />

<form name="emailEventForm" id="emailEventForm">
	From : <input type="text" name="<portlet:namespace />fromEmail"
		id="fromEmail"><br> To :<input type="text"
		name="<portlet:namespace />toEmail" id="toEmail"><br> <input
		type="hidden" name="<portlet:namespace />requestedResource"
		id="requestedResource" value="emailEventResource">
	<button type="submit" name="emailEventSend" id="emailEventSend">Send</button>
</form>

<h2>Recent and Upcoming Events</h2>

<p>
	Total Events:
	<%=calendarEvents.size()%></p>

<c:forEach var="calendarEvent" items="<%=calendarEvents%>">
	<div style="padding: 1em; margin: 1em 0; border: 1px solid #3C5976">
		<ul class="list-unstyled">
			<li>${calendarEvent.getDate()},${calendarEvent.getTime()}</li>
			<li><h3>${calendarEvent.getTitle()}</h3></li>
			<li>${calendarEvent.getDescription()}</li>
			<li>${calendarEvent.getLocation()}</li>
			<li><a href="#">Learn More</a></li>
		</ul>

		<ul class="list-unstyled list-inline">
			<c:if test="${not empty calendarEvent.getLocation()}">
				<a
					href="<c:url value="https://www.google.com/maps/place/${calendarEvent.getLocation() }"/>"><i
					class="icon-map-marker"></i> Get Directions</a>
				</a>
			</c:if>
			<li><a
				href="<c:url value="data:text/calendar;base64,${calendarEvent.getAppointment() }"/>"
				download="ical.ics"><i class="icon-calendar"></i> Add to
					Calendar</a></a></li>
			<li><a href="#" class="emailFriend" data-event-name="${calendarEvent.getTitle()}"
				data-event-date="${calendarEvent.getDate()}"
				data-event-time="${calendarEvent.getTime()}"
				data-event-location="${calendarEvent.getLocation()}"
				data-event-link="" data-toggle="modal" data-target="#myModal"><i
					class="icon-envelope"></i> Email</a></li>
		</ul>
	</div>
</c:forEach>

<script type="text/javascript">
$(function() {
	$('#emailEventSend').on('click', function(e) {
		e.preventDefault();
		$.post('<%=ajaxCallResourceURL.toString()%>', $("#emailEventForm").serialize(), function(data) {
			alert(data);
		});
	});
});
</script>

