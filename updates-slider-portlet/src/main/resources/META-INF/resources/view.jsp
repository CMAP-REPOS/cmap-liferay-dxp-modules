<%@ include file="/init.jsp" %>

<%
boolean notConfigured = Validator.isNull(assetCategoryId) ||
	"0".equals(assetCategoryId) ||
	Validator.isNull(assetCount) ||
	"0".equals(assetCount);
%>

<c:choose>
	<c:when test="<%= notConfigured %>">
		This Updates Slider is not configured yet. Please select "Configuration" from the widget menu.
	</c:when>
	<c:otherwise>
	<section class="update-slider slider" id="<%=themeDisplay.getPortletDisplay().getId() %>">
		<header class="row row-header">
			<div class="col-sm-16 no-padding">
				<div class="buttons">
					<h3>UPDATES</h3>
					<div class="view-all">
						<a href="/updates/all/-/categories/<%=assetCategoryId %>">View all</a>
					</div>
				</div>
			</div>
		</header>
		<div class="slider-container slider-container-updates">
	 		<c:forEach var="assetModel" items="${assetModels}">
			<div class="item col-lg-4 col-md-8 col-xs-16">
				<h4 class="item-date">${assetModel.getDate()}</h4>
				<h3 class="item-title">
					<a href="${assetModel.getLink()}">${assetModel.getTitle()}</a>
				</h3>
				<p class="item-description">${assetModel.getSummary()}</p>
				<!--a class="read-more-link"
					href="${assetModel.getLink()}">
					Read more <span class="sr-only">about ${assetModel.getTitle()}</span></a-->
			</div>
			</c:forEach>
		</div>
		
		<div class="hidden-md hidden-lg hidden-xl view-all-mobile">
			<a href="/updates/all/-/categories/<%=assetCategoryId %>">View All Updates</a>
		</div>
		
	</section>
	</c:otherwise>
</c:choose>

<script>
Liferay.on('allPortletsReady', function () {
  var $this = $('#<%=themeDisplay.getPortletDisplay().getId() %>');
  var $container = $this.find('.slider-container-updates');
  var $spacer = $('<div class="col-lg-4"></div>');
  var $row = $('<div class="row"></div>');
	var rows = [], active_index = 0;
  var $nav = $('<nav class="hidden-xs hidden-sm slider-nav updates-slider-nav"></nav>');
  var $viewall = $('');

  var items = $container.find('.item');

  function addItem(dom) {
    var $node = $(dom);
    if ($node) {
      $node.remove();
      $row.append($node);
    } else {
      $row.append($spacer.clone());
    }
  }

	function setHeight(){
		console.log($(rows[active_index]), $(rows[active_index]).innerHeight());
		$container.css('height', $(rows[active_index]).innerHeight());
	}
	$(window).resize(_.throttle(setHeight, 100));

  for (var i = 0; i < Math.ceil(items.length / 4); i++) {
		$row = $('<div class="row"></div>');

    // create row
    addItem(items[(i * 4)]);
    addItem(items[(i * 4) + 1]);
    addItem(items[(i * 4) + 2]);
    addItem(items[(i * 4) + 3]);

    var $slide = $('<div class="slider-slide"></div>');
    var $navItem = $('<div class="nav-item updates-nav-item" data-index="'+i+'"></div>');

		$navItem.on('click', function () {
			var index = $(this).data('index');
			var transform = 'translateX(-' + (index * 100) + '%)';
      $container.css('transform', transform);
			active_index = index;
			setHeight();
      $nav.find('.nav-item.active').removeClass('active');
      $(this).addClass('active');
    })

    if (i === 0) {
      $navItem.addClass('active');
    }

		rows.push($row);
    $nav.append($navItem);
    $slide.append($row);
    $container.append($slide);
		setHeight();
  }

	if($nav.find('.updates-nav-item').length > 1){
		$this.append($nav);
	}
	
	
});

</script>
