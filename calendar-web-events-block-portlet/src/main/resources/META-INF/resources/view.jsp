<%@ include file="/init.jsp" %>

<%
	//CalendarBooking event = calendarBookings.get(0);
	request.setAttribute("events", eventBlocks);
	
%>

<div class="row">
    <!-- ========= START: Event List DESKTOP version ======== -->
    <div class="col-sm-16 hidden-xs">
        <div class="b-event-list b-event-list--desktop">
            <div class="b-event-list__header">
                <h3>Events
                    <!-- Link to Events Page ======== -->
                    <a class="b-event-list__view-all" href="#">View All</a>
                </h3>
            </div>
            <div class="b-event-list__list">
                <!-- ========= START: Event ITEM ======== -->
                <c:forEach var="event" items="${events}">
                
	                <div class="b-event-item">
	                    <p class="b-event-item__event-date">
	                        <!-- Event Date -->
	                        <span class="b-event-item__date">${ event.getMonth() } ${ event.getDay() }</span>
	                        <!-- Event Day Name -->
	                        <span class="b-event-item__day">${ event.getWeekday() }</span>
	                    </p>
	                    <!-- Event Time -->
	                    <p class="b-event-item__event-time">
	                        ${ event.getDuration() }
	                    </p>
	                    <p class="b-event-item__event-name">
	                        <!-- Link to Event Detail, and Event Name -->
	                        <a href="#">
	                            ${ event.getTitle() }
	                        </a>
	                    </p>
	                </div>
	                
				</c:forEach>
                <!-- ========= END: Event ITEM ======== -->
            </div>
        </div>
    </div>
    
 
   