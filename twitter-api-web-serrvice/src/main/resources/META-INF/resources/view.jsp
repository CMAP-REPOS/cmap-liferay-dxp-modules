<%@ include file="/init.jsp" %>
<%
	boolean notConfigured = 
		Validator.isNull(twitterScreenName) || Validator.isNull(oAuthConsumerKey) || Validator.isNull(oAuthConsumerSecret) ||
				Validator.isNull(oAuthAccessToken) || Validator.isNull(oAuthAccessTokenSecret) || "0".equals(postCount);
				//Validator.isNull(fbScreenName) || Validator.isNull(fbPageID) || Validator.isNull(fbAccessToken)
				
%>

<c:choose>
	<c:when test="<%= notConfigured %>">
		This Twitter Slider is not configured yet. Please select "Configuration" from the widget menu.
	</c:when>
	<c:otherwise>
		<section class="social-slider slider" id="<%=themeDisplay.getPortletDisplay().getId() %>">
		<div class="slider-container">
		<c:forEach var="socialMediaPost" items="${socialMediaPosts}">
			<div class="item item-post col-md-4 col-xs-16">
				<div class="social-icon">
					<c:choose>
						<c:when test="${socialMediaPost.getSocialSite() == 'facebook'}">
							<svg xmlns="http://www.w3.org/2000/svg" width="28" height="28">
								<g transform="scale(0.09)">
									<path fill="#3C5976" d="M145.659,0c80.45,0,145.66,65.219,145.66,145.66c0,80.45-65.21,145.659-145.66,145.659 S0,226.109,0,145.66C0,65.219,65.21,0,145.659,0z"></path>
									<path fill="white" transform="scale(1.2) translate(45, 40)" d="M89.584,155.139V84.378h23.742l3.562-27.585H89.584V39.184
									c0-7.984,2.208-13.425,13.67-13.425l14.595-0.006V1.08C115.325,0.752,106.661,0,96.577,0C75.52,0,61.104,12.853,61.104,36.452
									v20.341H37.29v27.585h23.814v70.761H89.584z">
									</path>
								</g>
							</svg>
						</c:when>
						<c:otherwise>
							<svg xmlns="http://www.w3.org/2000/svg" width="28" height="28">
								<g transform="scale(0.09)">
									<path fill="#3C5976" d="M145.659,0c80.45,0,145.66,65.219,145.66,145.66c0,80.45-65.21,145.659-145.66,145.659   S0,226.109,0,145.66C0,65.219,65.21,0,145.659,0z"></path>
									<path fill="white" d="M236.724,98.129c-6.363,2.749-13.21,4.597-20.392,5.435c7.338-4.27,12.964-11.016,15.613-19.072
									c-6.864,3.96-14.457,6.828-22.55,8.366c-6.473-6.691-15.695-10.87-25.909-10.87c-19.591,0-35.486,15.413-35.486,34.439
									 c0,2.704,0.31,5.335,0.919,7.857c-29.496-1.438-55.66-15.158-73.157-35.996c-3.059,5.089-4.807,10.997-4.807,17.315
									 c0,11.944,6.263,22.504,15.786,28.668c-5.826-0.182-11.289-1.721-16.086-4.315v0.437c0,16.696,12.235,30.616,28.476,33.784
									 c-2.977,0.783-6.109,1.211-9.35,1.211c-2.285,0-4.506-0.209-6.673-0.619c4.515,13.692,17.625,23.651,33.165,23.925
									 c-12.153,9.249-27.457,14.748-44.089,14.748c-2.868,0-5.69-0.164-8.476-0.482c15.722,9.777,34.367,15.485,54.422,15.485
									 c65.292,0,100.997-52.51,100.997-98.029l-0.1-4.461C225.945,111.111,231.963,105.048,236.724,98.129z">
									</path>
								</g>
							</svg>
						</c:otherwise>
					</c:choose>
				</div>
				<c:if test="${socialMediaPost.getIsRetweet()}">
					<p class="retweet">${twitterScreenName} Retweeted:</p>
				</c:if>
				<div class="post">${socialMediaPost.getPost()}</div>
				<div class="read-more-link">
					<a href="${socialMediaPost.getLink()}" target="_blank">Read more</a>
				</div>
				<p class="post-info">@${socialMediaPost.getPostAuthor()} ${socialMediaPost.getDate()}
						<c:choose>
							<c:when test="${socialMediaPost.getSocialSite() == 'facebook'}">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" style="transform: translateY(17%)">
									<g fill="#3C5976" transform="scale(0.03)">
										<path xmlns="http://www.w3.org/2000/svg" d="M512,217.229c0-27.618-22.469-50.087-50.087-50.087H341.119l17.585-47.974c0.057-0.155,0.111-0.309,0.163-0.465
										c8.475-25.422,6.342-52.096-6.17-77.145c-9.441-18.883-28.417-30.613-49.522-30.613h-5.868c-14.212,0-26.233,11.103-27.37,25.274
										C267.951,61,257.322,84.472,240.009,102.32l-96.738,98.214h-9.706v-16.696c0-9.22-7.475-16.696-16.696-16.696H16.696
										C7.475,167.142,0,174.618,0,183.838V484.36c0,9.22,7.475,16.696,16.696,16.696H116.87c9.22,0,16.696-7.475,16.696-16.696v-16.696
										h278.261c27.618,0,50.087-22.469,50.087-50.087c0-8.924-2.344-17.309-6.452-24.573c13.911-8.909,23.148-24.5,23.148-42.21
										c0-8.924-2.344-17.309-6.452-24.573c13.911-8.909,23.148-24.5,23.148-42.21c0-8.924-2.344-17.309-6.452-24.573
										C502.763,250.531,512,234.939,512,217.229z M100.174,217.229v233.739v16.696H33.391v-267.13h66.783V217.229z M461.913,233.925
										h-16.696h-33.391c-9.22,0-16.696,7.475-16.696,16.696s7.475,16.696,16.696,16.696h33.391c9.206,0,16.696,7.49,16.696,16.696
										s-7.49,16.696-16.696,16.696h-16.696H395.13c-9.22,0-16.696,7.475-16.696,16.696s7.475,16.696,16.696,16.696h33.391
										c9.206,0,16.696,7.49,16.696,16.696s-7.49,16.696-16.696,16.696h-16.696c-0.875,0-1.727,0.088-2.567,0.217h-31.933
										c-9.22,0-16.696,7.475-16.696,16.696c0,9.22,7.475,16.696,16.696,16.696h33.391c0.749,0,1.48-0.067,2.203-0.162
										c8.696,0.568,15.602,7.804,15.602,16.64c0,9.206-7.49,16.696-16.696,16.696H133.565V233.924h16.696
										c4.472,0,8.756-1.794,11.895-4.98l101.687-103.239c0.028-0.028,0.056-0.057,0.082-0.085
										c21.459-22.098,35.096-50.784,38.752-81.286h0.498c8.375,0,15.908,4.658,19.653,12.15c8.553,17.121,10.043,34.424,4.433,51.436
										l-25.72,70.171c-1.878,5.121-1.134,10.836,1.989,15.307c3.123,4.471,8.232,7.135,13.687,7.135h144.696
										c9.206,0,16.696,7.49,16.696,16.696S471.119,233.925,461.913,233.925z">
										</path>
									</g>
								</svg>
							</c:when>
							<c:otherwise>
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" style="transform: translateY(25%)">
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
							</c:otherwise>
						</c:choose>
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
		$container.css('height', 'fit-content'); //$(rows[active_index]).innerHeight());
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