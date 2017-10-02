<%@ include file="/init.jsp" %>

<jsp:useBean id="dateValue" class="java.util.Date"/>


<h2>Recent and Upcoming Events</h2>

<b>numberOfDaysInThePast:</b><%=numberOfDaysInThePast%>
<br/>
<b>numberOfEventsToShow:</b><%=numberOfEventsToShow%>

<c:forEach var="calendarBooking" items="<%=calendarBookings %>">
	<div style="padding: 1em; margin: 1em 0; border: 1px solid #3C5976">
	<ul class="list-unstyled">
		<li><jsp:setProperty name="dateValue" property="time" value="${calendarBooking.getStartTime()}"/>
		<fmt:formatDate value="${dateValue}" pattern="MM/dd/yyyy HH:mm"/></li>
		<li><h3>${calendarBooking.getTitle()}</h3></li>
		<li>${calendarBooking.getLocation()}</li>
		<li>${calendarBooking.getDescription()}</li>
		<li><a href="#">Learn More</a></li>
	</ul>

	<ul class="list-unstyled list-inline">
		<li><a href="#"><i class="icon-map-marker"></i> Get Directions</a></li>
		<li><a href="#"><i class="icon-calendar"></i> Add to Calendar</a></li>
		<li><a href="#"><i class="icon-envelope"></i> Email</a></li>
	</ul>
	<p>  </p>
	</div>
</c:forEach>

