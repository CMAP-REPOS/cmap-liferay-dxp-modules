<%@ include file="/init.jsp" %>

<%
	//CalendarBooking event = calendarBookings.get(0);
	request.setAttribute("events", eventBlocks);
	
%>

<div class="row">
    <!-- ========= START: Event List DESKTOP version ======== -->
    <div class="col-md-16 hidden-xs hidden-sm">
        <div class="b-event-list b-event-list--desktop">
            <div class="b-event-list__header">
                <h2>EVENTS
                    <!-- Link to Events Page ======== -->
                    <a class="b-event-list__view-all" href="/events">View All</a>
                </h2>
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
	                    <!-- Event Detail, and Event Name -->
	                    <p class="b-event-item__event-name">
	                        ${ event.getTitle() }
	                    </p>
	                </div>       
				</c:forEach>
                <!-- ========= END: Event ITEM ======== -->
            </div>
        </div>
    </div>
    <!-- ========= END: Event List DESKTOP version ======== -->
    <!-- ========= START: Event List MOBILE version ======== -->
    <div class="col-xs-16 hidden-md hidden-lg">
        <div class="slider slider-calendar">
            <div class="b-event-list b-event-list--mobile">
                <div class="row">
                    <div class="col-xs-16 header-col">
                        <div class="b-event-list__header">
                            <h2>EVENTS
                                <!-- Link to Events page -->
                                <a class="b-event-list__view-all" href="/events">View All</a>
                            </h2>
                        </div>
                        <svg class="svg-calendar" xmlns="http://www.w3.org/2000/svg" width="46" height="46" viewBox="0 0 36 36">
							<path d="M27.857,29.5H8.142A1.663,1.663,0,0,1,6.5,27.858V10.608A1.661,1.661,0,0,1,8.142,8.965H9.785v.82A2.455,2.455,0,0,0,12.25,12.25a2.455,2.455,0,0,0,2.464-2.465v-.82h6.571v.82a2.465,2.465,0,1,0,4.929,0v-.82h1.643A1.663,1.663,0,0,1,29.5,10.608v17.25A1.665,1.665,0,0,1,27.857,29.5m0-14.785H8.143V27.857H27.857Zm-4.133-3.286a1.62,1.62,0,0,1-1.617-1.616V8.118a1.617,1.617,0,0,1,3.234,0V9.812a1.62,1.62,0,0,1-1.617,1.616m-11.5,0a1.62,1.62,0,0,1-1.617-1.616V8.118a1.617,1.617,0,0,1,3.234,0V9.812a1.62,1.62,0,0,1-1.617,1.616" fill="#3c5979"></path>
							<text x="18" y="22" dominant-baseline="middle" text-anchor="middle" font-weight="bold" font-size="60%" class="b-event-list__today" fill="#3c5979">2</text>
						</svg>
                    </div>
                </div>
                <div class="b-event-list__list slider-container slider-container-calendar">
                    <!-- ========= START: Event ITEM ======== -->
                    <c:forEach var="event" items="${events}">
	                    <div class="col-xs-16 b-event-item">
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
	                        <!-- Link to Event Detail, and Event Name -->
	                        <p class="b-event-item__event-name">
	                        	${ event.getTitle() }
	                        </p>
	                    </div>
                    </c:forEach>
                    <!-- ========= END: Event ITEM ======== -->
                </div>
            </div>
        </div>
    </div>
    <!-- ========= END: Event List MOBILE version ======== -->
</div>

<script type="text/javascript">

Liferay.on('allPortletsReady', function() {
    var $this = $('.slider-calendar');
    var $container = $this.find('.b-event-list__list');
    var $spacer = $('<div class="col-xl-4"></div>');
    var $row = $('<div class="row"></div>');
    var rows = [],
        active_index = 0;
    var $navCalendar = $('<nav class="slider-nav calendar-slider-nav"></nav>');
    var items = $container.find('.b-event-item');

    function addItem(dom) {
        var $node = $(dom);
        if ($node) {
            $node.remove();
            $row.append($node);
        } else {
            $row.append($spacer.clone());
        }
    }

    function setHeight() {
        console.log($(rows[active_index]), $(rows[active_index]).innerHeight());
        $container.css('height', $(rows[active_index]).innerHeight() + 20);
    }
    
    $(window).resize(_.throttle(setHeight, 100));
    for (var i = 0; i < Math.ceil(items.length / 1); i++) {
        $row = $('<div class="row"></div>');
        // create row
        addItem(items[(i * 1)]);
        addItem(items[(i * 1) + 1]);
        addItem(items[(i * 1) + 2]);
        addItem(items[(i * 1) + 3]);
        var $slide = $('<div class="slider-slide"></div>');
        var $navItem = $('<div class="nav-item calendar-nav-item" data-index="' + i + '"></div>');
        $navItem.on('click', function() {
            var index = $(this).data('index');
            var transform = 'translateX(-' + (index * 100) + '%)';
            $container.css('transform', transform);
            active_index = index;
            setHeight();
            $navCalendar.find('.nav-item.active').removeClass('active');
            $(this).addClass('active');
        })
        if (i === 0) {
            $navItem.addClass('active');
        }
        rows.push($row);
        $navCalendar.append($navItem);
        $slide.append($row);
        $container.append($slide);
        setHeight();
    }
    if ($navCalendar.find('.calendar-nav-item').length > 1) {
        $this.append($navCalendar);
    }
});
</script>

<script type="text/javascript">
(function() {
    $('.b-event-list__today').text(new Date().getDate());

    var $list = $('.b-event-list--desktop .b-event-list__list');

    $list.each(function() {
        var currentDate = '';
        var $this = $(this);
        var $dates = $this.find('.b-event-item__date');
        $dates.each(function() {
            var $date = $(this);
            var date = $date.text().trim();
            if (date === currentDate) {
                $date.parent().hide();
            } else {
                currentDate = date;
            }
        })
    });
    
    
    var $listMobile = $('.b-event-list--mobile .b-event-list__list');

    $listMobile.each(function() {
        var $this = $(this);
        var $items = $this.find('.b-event-item');
        
        $items.each(function() {
        	var $dates = $listMobile.find('.b-event-item__date');
        	var $item = $(this);
        	
        	var $dateCurrent = $item.find('.b-event-item__date');
        	var currentDate = $dateCurrent.text().trim();
        	var first = true;
        	
        	$dates.each(function() {
                var $date = $(this);
                var date = $date.text().trim();

                if (date === currentDate && !first) {
                	$itemTime = $date.parent().parent().find('.b-event-item__event-time').text();
                	$itemName = $date.parent().parent().find('.b-event-item__event-name').text();
                	$item.append('<p class="b-event-item__event-time">' + $itemTime + '</p>');
                	$item.append('<p class="b-event-item__event-name">' + $itemName + '</p>');
                    $date.parent().parent().remove();
                } else if(date === currentDate && first) {
                	first = false;
                }
            })
        })
    });

})();
</script>


    
 
   