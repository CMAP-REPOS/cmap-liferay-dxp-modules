package com.cmap.portlets.twitter.api.service.portlet;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
	id = "com.cmap.portlets.twitter.api.service.portlet.SocialSliderConfiguration"
)

public interface SocialSliderConfiguration {
	
	@Meta.AD(required = false)
	public String screenName();
	
	@Meta.AD(deflt = "10",
			required = false)
	public String tweetCount();

	@Meta.AD(required = false)
	public String oAuthConsumerKey();

	@Meta.AD(required = false)
	public String oAuthConsumerSecret();
	
	@Meta.AD(required = false)
	public String oAuthAccessToken();

	@Meta.AD(required = false)
	public String oAuthAccessTokenSecret();

}