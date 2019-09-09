<%@ include file="/init.jsp" %>
<%
	boolean notConfigured = 
		Validator.isNull(screenName) || Validator.isNull(oAuthConsumerKey) || Validator.isNull(oAuthConsumerSecret) || 
		Validator.isNull(oAuthAccessToken) || Validator.isNull(oAuthAccessTokenSecret) || "0".equals(tweetCount);
%>

<c:choose>
	<c:when test="<%= notConfigured %>">
		This Twitter Slider is not configured yet. Please select "Configuration" from the widget menu.
	</c:when>
	<c:otherwise>
		<section class="social-slider slider" id="<%=themeDisplay.getPortletDisplay().getId() %>">
		<div class="slider-container">
		<c:forEach var="socialMediaPost" items="${socialMediaPosts}">
			<div class="item item-post col-lg-4 col-md-8 col-xs-16">
				<div class="social-icon">
					<svg xmlns="http://www.w3.org/2000/svg" width="28" height="28">
						<g fill="white" stroke-width="5">
						  	<circle cx="14" cy="14" r="10" />
						</g>
						<g fill="#3C5976" transform="scale(0.05)">
					  		<path d="m256 0c-141.363281 0-256 114.636719-256 256s114.636719 256 256 256 256-114.636719 256-256-114.636719-256-256-256zm116.886719 
					  			199.601562c.113281 2.519532.167969 5.050782.167969 7.59375 0 77.644532-59.101563 167.179688-167.183594 
					  			167.183594h.003906-.003906c-33.183594 0-64.0625-9.726562-90.066406-26.394531 4.597656.542969 9.277343.8125 
					  			14.015624.8125 27.53125 0 52.867188-9.390625 72.980469-25.152344-25.722656-.476562-47.410156-17.464843-54.894531-40.8125 3.582031.6875 
					  			7.265625 1.0625 11.042969 1.0625 5.363281 0 10.558593-.722656 15.496093-2.070312-26.886718-5.382813-47.140624-29.144531-47.140624-57.597657 
					  			0-.265624 0-.503906.007812-.75 7.917969 4.402344 16.972656 7.050782 26.613281 7.347657-15.777343-10.527344-26.148437-28.523438-26.148437-48.910157 
					  			0-10.765624 2.910156-20.851562 7.957031-29.535156 28.976563 35.554688 72.28125 58.9375 121.117187 61.394532-1.007812-4.304688-1.527343-8.789063-1.527343-13.398438 
					  			0-32.4375 26.316406-58.753906 58.765625-58.753906 16.902344 0 32.167968 7.144531 42.890625 18.566406 13.386719-2.640625 25.957031-7.53125 37.3125-14.261719-4.394531 
					  			13.714844-13.707031 25.222657-25.839844 32.5 11.886719-1.421875 23.214844-4.574219 33.742187-9.253906-7.863281 11.785156-17.835937 22.136719-29.308593 30.429687zm0 0">
					  		</path>
					  	</g>
					</svg>
				</div>
				<c:if test="${socialMediaPost.getIsRetweet()}">
					<p class="retweet">${screenName} Retweeted:</p>
				</c:if>
				<span class="post">${socialMediaPost.getPost()}</span>
				<p class="post-info">@${socialMediaPost.getPostAuthor()} ${socialMediaPost.getDate()} 
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16">
					  	<g fill="#3C5976" transform="scale(0.03)">
						 	 <path d="M433.601,67.001c-24.7-24.7-57.4-38.2-92.3-38.2s-67.7,13.6-92.4,38.3l-12.9,12.9l-13.1-13.1
								c-24.7-24.7-57.6-38.4-92.5-38.4c-34.8,0-67.6,13.6-92.2,38.2c-24.7,24.7-38.3,57.5-38.2,92.4c0,34.9,13.7,67.6,38.4,92.3
								l187.8,187.8c2.6,2.6,6.1,4,9.5,4c3.4,0,6.9-1.3,9.5-3.9l188.2-187.5c24.7-24.7,38.3-57.5,38.3-92.4
								C471.801,124.501,458.301,91.701,433.601,67.001z M414.401,232.701l-178.7,178l-178.3-178.3c-19.6-19.6-30.4-45.6-30.4-73.3
								s10.7-53.7,30.3-73.2c19.5-19.5,45.5-30.3,73.1-30.3c27.7,0,53.8,10.8,73.4,30.4l22.6,22.6c5.3,5.3,13.8,5.3,19.1,0l22.4-22.4
								c19.6-19.6,45.7-30.4,73.3-30.4c27.6,0,53.6,10.8,73.2,30.3c19.6,19.6,30.3,45.6,30.3,73.3
								C444.801,187.101,434.001,213.101,414.401,232.701z">
							</path>
					 	 </g>
					</svg>
					${socialMediaPost.getLikes()}
				</p>
			</div>
		</c:forEach>
	</c:otherwise>
</c:choose>

<script>

</script>

<script>
//Auto-link URLs in a string
//Usage: mystring.parseURL()
String.prototype.parseURL = function() {
	return this.replace(/[A-Za-z]+:\/\/[A-Za-z0-9-_]+\.[A-Za-z0-9-_:%&~\?\/.=]+/g, function( url ) {
 	return url.link( url );
	});
};

//Auto-link Twitter usernames in a string
//Usage: mystring.parseUsername()
String.prototype.parseUsername = function() {
return this.replace(/[@]+[A-Za-z0-9-_]+/g, function( u ) {
 	var username = u.replace("@","");
 	return u.link( 'http://twitter.com/' + username );
	});
};

//Auto-link Twitter hashtags in a string
//Usage: mystring.parseHashtag()
String.prototype.parseHashtag = function() {
return this.replace(/[#]+[A-Za-z0-9-_]+/g, function( t ) {
	var tag = t.replace("#","");
 	return t.link( 'https://twitter.com/hashtag/' + tag + '?src=hashtag_click' );
	});
};

Liferay.on('allPortletsReady', function () {
	
  var $this = $('#<%=themeDisplay.getPortletDisplay().getId() %>');
  var $container = $this.find('.slider-container');
  var $spacer = $('<div class="col-lg-4"></div>');
  var $row = $('<div class="row"></div>');
	var rows = [], active_index = 0;
  var $nav = $('<nav class="slider-nav social-slider-nav"></nav>');
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
	
	var width = $(window).width(); 
	var item_number;
	if (width <= 768  ) {
		item_number = 1;
	}
	else {
		item_number = 4;
	}

  for (var i = 0; i < Math.ceil(items.length / item_number); i++) {
	$row = $('<div class="row"></div>');

    // create row
    addItem(items[(i * item_number)]);
    addItem(items[(i * item_number) + 1]);
    addItem(items[(i * item_number) + 2]);
    addItem(items[(i * item_number) + 3]);

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
	
	var $listPosts = $('.item-post');
	
	$listPosts.each(function() {
        var $this = $(this);
        var $post = $this.find('.post');
        var tweetText = $post.text();
    	tweetText = tweetText.parseURL().parseUsername().parseHashtag();
    	$post.html(tweetText);
	});
});

</script>