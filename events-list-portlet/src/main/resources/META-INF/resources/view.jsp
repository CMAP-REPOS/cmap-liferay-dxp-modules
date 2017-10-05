<%@ include file="/init.jsp" %>

<jsp:useBean id="startDateValue" class="java.util.Date"/>
<jsp:useBean id="endDateValue" class="java.util.Date"/>

<h2>Recent and Upcoming Events</h2>

<p>Total Events: <%=calendarEvents.size() %></p>

<c:forEach var="calendarBooking" items="<%=calendarEvents %>">
	<div style="padding: 1em; margin: 1em 0; border: 1px solid #3C5976">
	<ul class="list-unstyled">
		<li>${calendarBooking.getDate()}</li>
		<li>${calendarBooking.getTime()}</li>
		<li><h3>${calendarBooking.getTitle()}</h3></li>
		<li>${calendarBooking.getDescription()}</li>
		<li>${calendarBooking.getLocation()}</li>
		<li><a href="#">Learn More</a></li>
	</ul>

	<ul class="list-unstyled list-inline">
		<c:if test="${not empty calendarBooking.getLocation()}">
		      <a href="<c:url value="https://www.google.com/maps/place/${calendarBooking.getLocation() }"/>"><i class="icon-map-marker"></i> Get Directions</a></a>
		</c:if>
		<li>
		      <a href="<c:url value="data:text/calendar;base64,${calendarBooking.getAppointment() }"/>" download="ical.ics"><i class="icon-calendar"></i> Add to Calendar</a></a>
		</li>
		<li><a href="#"><i class="icon-envelope"></i> Email</a></li>
	</ul>
	</div>
</c:forEach>

