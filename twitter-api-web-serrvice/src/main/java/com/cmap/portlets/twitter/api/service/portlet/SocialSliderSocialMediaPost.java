package com.cmap.portlets.twitter.api.service.portlet;

public class SocialSliderSocialMediaPost {
	
//	<div class="item col-xl-4 col-sm-8 col-xs-16">
//		<span>socialSite</span>
//		<p class="post">ON TO 2050 is our region’s plan for succeeding together. 
//			Learn more about the Chicago region’s new comprehensive plan and how working collaboratively to 
//			achieve its goals will help all residents thrive. ...
//		</p>
//		<h3 class="postAuthor">@ONTO2050</h3>
//		<h3 class="date">May 01, 2014</h3>
//		<h3 class="likes">21</h3>
//	</div>
	
	private String date;
    private String socialSite;
    private String post;
    private String postAuthor;
    private int likes;
    private boolean isRetweet;
    
    public SocialSliderSocialMediaPost(String date,String socialSite, String post,  String postAuthor,
    	String link, int likes, boolean isRetweet) {
		this.setDate(date);
		this.setSocialSite(socialSite);
		this.setPost(post);
		this.setPostAuthor(postAuthor);
		this.setLikes(likes);
		this.setIsRetweet(isRetweet);
	}
    
    public String getDate(){
    	return date;
    }
    
    public String getSocialSite(){
    	return socialSite;
    }
    
    public String getPost(){
    	return post;
    }
    
    public String getPostAuthor(){
    	return postAuthor;
    }

    public int getLikes(){
    	return likes;
    }
    
    public boolean getIsRetweet(){
    	return isRetweet;
    }


	public void setIsRetweet(boolean isRetweet) {
		this.isRetweet = isRetweet;
	}

	public void setPostAuthor(String postAuthor) {
		this.postAuthor = postAuthor;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public void setSocialSite(String socialSite) {
		this.socialSite = socialSite;
	}

	public void setDate(String date) {
		this.date = date;
	}
    
    
}
