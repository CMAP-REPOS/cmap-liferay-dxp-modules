package com.cmap.portlets.twitter.api.service.portlet;

import com.cmap.portlets.twitter.api.service.util.NvpComparator;
import com.cmap.portlets.twitter.api.service.constants.SocialSliderPortletKeys;
import com.cmap.portlets.twitter.api.service.util.SocialMediaPostDateComparator;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.Portlet;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

@Component(configurationPid = "com.cmap.portlets.twitter.api.service.portlet.SocialSliderConfiguration",
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=CMAP",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Social Updates Slider",
		"javax.portlet.init-param.config-template=/configuration.jsp",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SocialSliderPortletKeys.SocialSliderPortlet,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SocialSliderPortlet extends MVCPortlet {
	private static final Log _log = LogFactoryUtil.getLog(SocialSliderPortlet.class);
	private volatile SocialSliderConfiguration _socialSliderConfiguration;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("doView");
		
		try {
			PortletPreferences portletPreferences = renderRequest.getPreferences();
			String twitterScreenName = "";
			int postCountNum = 0;
			String postCount = "";
			String oAuthConsumerKey = "";
			String oAuthConsumerSecret = "";
			String oAuthAccessToken = "";
			String oAuthAccessTokenSecret = "";
//			String fbScreenName = "";
//			String fbPageID =  "";
//			String fbAccessToken = "";
			
			String twitterScreenNamePref = null;
			String postCountPref = null;
			String oAuthConsumerKeyPref = null;
			String oAuthConsumerSecretPref = null;
			String oAuthAccessTokenPref = null;
			String oAuthAccessTokenSecretPref = null;
//			String fbScreenNamePref = null;
//			String fbPageIDPref =  null;
//			String fbAccessTokenPref = null;
			
			int postLength = 150;
			
			if (Validator.isNotNull(_socialSliderConfiguration)) {
				twitterScreenNamePref = portletPreferences.getValue("twitterScreenName",
						_socialSliderConfiguration.twitterScreenName());

				postCountPref = portletPreferences.getValue("postCount",
						_socialSliderConfiguration.postCount());
			
				oAuthConsumerKeyPref = portletPreferences.getValue("oAuthConsumerKey",
						_socialSliderConfiguration.oAuthConsumerKey());

				oAuthConsumerSecretPref = portletPreferences.getValue("oAuthConsumerSecret",
						_socialSliderConfiguration.oAuthConsumerSecret());
			
				oAuthAccessTokenPref = portletPreferences.getValue("oAuthAccessToken",
						_socialSliderConfiguration.oAuthAccessToken());
			
				oAuthAccessTokenSecretPref = portletPreferences.getValue("oAuthAccessTokenSecret",
						_socialSliderConfiguration.oAuthAccessTokenSecret());

//				fbScreenNamePref = portletPreferences.getValue("fbScreenName",
//						_socialSliderConfiguration.fbScreenName());
//
//				fbPageIDPref = portletPreferences.getValue("fbPageID",
//						_socialSliderConfiguration.fbPageID());
//
//				fbAccessTokenPref = portletPreferences.getValue("fbAccessToken",
//						_socialSliderConfiguration.fbAccessToken());
			
				if (Validator.isDigit(postCountPref)) {
					postCountNum = Integer.parseInt(postCountPref);
				}
				
				twitterScreenName = twitterScreenNamePref;
				postCount = postCountPref;
				oAuthConsumerKey = oAuthConsumerKeyPref;
				oAuthConsumerSecret = oAuthConsumerSecretPref;
				oAuthAccessToken = oAuthAccessTokenPref;
				oAuthAccessTokenSecret = oAuthAccessTokenSecretPref;
//				fbScreenName = fbScreenNamePref;
//				fbPageID =  fbPageIDPref;
//				fbAccessToken =fbAccessTokenPref;
			}
			
			JSONArray jsonResponseArrayTwitter = getTwitterRequest(twitterScreenName, postCount, oAuthConsumerKey, oAuthConsumerSecret, oAuthAccessToken, oAuthAccessTokenSecret);
//			JSONArray jsonResponseArrayFB = getFacebookRequest(fbPageID, fbAccessToken, postCount);

			List<SocialSliderSocialMediaPost> socialMediaPostsUnordered = new ArrayList<SocialSliderSocialMediaPost>();
			List<SocialSliderSocialMediaPost> socialMediaPosts = new ArrayList<SocialSliderSocialMediaPost>();
			
			for (int i=0; i < jsonResponseArrayTwitter.length(); i++) {
				SocialSliderSocialMediaPost socialMediaPost = getMediaPostTwitter(jsonResponseArrayTwitter.getJSONObject(i), postLength);
				
				if (socialMediaPost != null) {
					socialMediaPostsUnordered.add(socialMediaPost);
				}
			}
			
//
//			for (int i=0; i < jsonResponseArrayFB.length(); i++) {
//				SocialSliderSocialMediaPost socialMediaPost = getMediaPostFB(jsonResponseArrayFB.getJSONObject(i), fbScreenName, postLength);
//
//				if (socialMediaPost != null) {
//					socialMediaPostsUnordered.add(socialMediaPost);
//				}
//			}

			OrderByComparator orderByComparator = new SocialMediaPostDateComparator(false);

			Collections.sort(socialMediaPostsUnordered,orderByComparator);

			for (int i=0; i < postCountNum - 1; i++) {
				socialMediaPosts.add(socialMediaPostsUnordered.get(i));
			}
			
			renderRequest.setAttribute("twitterScreenName", twitterScreenName);
//			renderRequest.setAttribute("fbScreenName", fbScreenName);
			renderRequest.setAttribute("socialMediaPosts", socialMediaPosts);
			renderRequest.setAttribute(SocialSliderConfiguration.class.getName(), _socialSliderConfiguration);

		}catch (Exception ex) {
			_log.error("Exception in UpdatesSliderPortlet.doView(): " + ex.getMessage());
		}

		super.doView(renderRequest, renderResponse);
	}
	
	public JSONArray getTwitterRequest(String twitterScreenName, String tweetCount, String oAuthConsumerKey,
			String oAuthConsumerSecret, String oAuthAccessToken, String oAuthAccessTokenSecret) throws Exception{
		
		System.out.println("getTwitterRequest");
		
		StringBuffer urlWithParams;
		
		String excludeReplies = "true";
		String tweetMode = "extended";
		
		List<NameValuePair> urlParams = new ArrayList<NameValuePair>();
	    urlParams.add( new NameValuePair("screen_name", twitterScreenName));	//usename
	    urlParams.add( new NameValuePair("count", tweetCount));	//count
	    urlParams.add( new NameValuePair("exclude_replies", excludeReplies));
	    urlParams.add( new NameValuePair("tweet_mode", tweetMode));
	    
	    
	    String oAuthNonce = String.valueOf(System.currentTimeMillis());
	    String oAuthSignatureMethod = "HMAC-SHA1";
	    String oAuthTimestamp = time();
	    String oAuthVersion = "1.0";
		
	    String signatureBaseString1 = SocialSliderPortletKeys.METHOD;
	    String signatureBaseString2 = SocialSliderPortletKeys.TWITTER_URL;
	    
	    List<NameValuePair> allParams = new ArrayList<NameValuePair>();
	    allParams.add(new NameValuePair("oauth_consumer_key", oAuthConsumerKey));
	    allParams.add(new NameValuePair("oauth_nonce", oAuthNonce));
	    allParams.add(new NameValuePair("oauth_signature_method", oAuthSignatureMethod));
	    allParams.add(new NameValuePair("oauth_timestamp", oAuthTimestamp));
	    allParams.add(new NameValuePair("oauth_token", oAuthAccessToken));
	    allParams.add(new NameValuePair("oauth_version", oAuthVersion));
	    allParams.addAll(urlParams);
	    
	    Collections.sort(allParams, new NvpComparator());
	    
	    StringBuffer signatureBaseString3 = new StringBuffer();
	    for(int i=0;i<allParams.size();i++)
	    {
	        NameValuePair nvp = allParams.get(i);
	        if (i>0) {
	            signatureBaseString3.append("&");
	        }
	        signatureBaseString3.append(nvp.getName() + "=" + nvp.getValue());
	    }
	    
	    String signatureBaseStringTemplate = "%s&%s&%s";
	    String signatureBaseString =  String.format(signatureBaseStringTemplate, URLEncoder.encode(signatureBaseString1, "UTF-8"), 
	    		URLEncoder.encode(signatureBaseString2, "UTF-8"),URLEncoder.encode(signatureBaseString3.toString(), "UTF-8"));

	    String compositeKey = URLEncoder.encode(oAuthConsumerSecret, "UTF-8") + "&" + URLEncoder.encode(oAuthAccessTokenSecret, "UTF-8");

	    String oAuthSignature =  computeSignature(signatureBaseString, compositeKey);
	    

	    String oAuthSignatureEncoded = URLEncoder.encode(oAuthSignature, "UTF-8");
	  

	    String authorizationHeaderValueTempl = "OAuth oauth_consumer_key=\"%s\", oauth_nonce=\"%s\", oauth_signature=\"%s\", oauth_signature_method=\"%s\", oauth_timestamp=\"%s\", oauth_token=\"%s\", oauth_version=\"%s\"";

	    String authorizationHeaderValue = String.format(authorizationHeaderValueTempl,
                oAuthConsumerKey,
                oAuthNonce,
                oAuthSignatureEncoded,
                oAuthSignatureMethod,
                oAuthTimestamp,
                oAuthAccessToken,
                oAuthVersion);
	    
	    urlWithParams = new StringBuffer(SocialSliderPortletKeys.TWITTER_URL);
	    for(int i=0;i<urlParams.size();i++) {
	        if(i==0) {
	            urlWithParams.append("?");
	        }
	        else {
	            urlWithParams.append("&");
	        }
	        NameValuePair urlParam = urlParams.get(i);
	        urlWithParams.append(urlParam.getName() + "=" + urlParam.getValue());
	    }
	    
	    System.out.println("urlWithParams: ");
	    System.out.println(urlWithParams);
	    
	    GetMethod getMethod = new GetMethod(urlWithParams.toString());

	    getMethod.addRequestHeader("Authorization", authorizationHeaderValue);
	    
	    HttpClient cli = new HttpClient();
		cli.executeMethod(getMethod);
	
		String response1 = null;
	
		response1 = getMethod.getResponseBodyAsString();
		
		System.out.println("response1: " + response1);
	
		JSONArray jsonResponseArray = JSONFactoryUtil.createJSONArray(response1);
		
		return jsonResponseArray;
	}

	public JSONArray getFacebookRequest(String fbPageID, String fbAccessToken, String postCount) throws Exception{

		StringBuffer urlWithParams;
		String fields = "likes.limit(0).summary(true),message,permalink_url,created_time";
		String dateFormatFB = "r";

		List<NameValuePair> urlParams = new ArrayList<NameValuePair>();
		urlParams.add( new NameValuePair("fields", fields));	//fields
        urlParams.add( new NameValuePair("limit", postCount));	//number of posts
		urlParams.add( new NameValuePair("date_format", dateFormatFB));	//same format definitions as the PHP date() function
		urlParams.add( new NameValuePair("access_token", fbAccessToken ));  //access token


		StringBuffer signatureBaseString3 = new StringBuffer();

		for(int i=0;i<urlParams.size();i++)
		{
			NameValuePair nvp = urlParams.get(i);
			if (i>0) {
				signatureBaseString3.append("&");
			}
			signatureBaseString3.append(nvp.getName() + "=" + nvp.getValue());
		}

		urlWithParams = new StringBuffer(SocialSliderPortletKeys.FACEBOOK_URL);
		urlWithParams.append(fbPageID + "/posts");

		for(int i=0;i<urlParams.size();i++) {
			if(i==0) {
				urlWithParams.append("?");
			}
			else {
				urlWithParams.append("&");
			}
			NameValuePair urlParam = urlParams.get(i);
			urlWithParams.append(urlParam.getName() + "=" + urlParam.getValue());
		}

		GetMethod getMethod = new GetMethod(urlWithParams.toString());

		HttpClient cli = new HttpClient();
		cli.executeMethod(getMethod);

		String response1 = null;

		response1 = getMethod.getResponseBodyAsString();

		JSONObject jsonResponseObject = JSONFactoryUtil.createJSONObject(response1);
		JSONArray jsonResponseArray = jsonResponseObject.getJSONArray("data");

		return jsonResponseArray;
	}
	
	protected SocialSliderSocialMediaPost getMediaPostTwitter(JSONObject jsonPost, int postLength) {

		System.out.println("getMediaPostTwitter");
		
		SocialSliderSocialMediaPost socialMediaPost = new SocialSliderSocialMediaPost(StringPool.BLANK, StringPool.BLANK,
				StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, 0, false);
		
		SimpleDateFormat twitterFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy", Locale.ENGLISH);
		twitterFormat.setLenient(true);
		
		boolean isRetweet = false;
		String post = null;
		int likes = 0;
		Date dateTwitter = null;
		String oldDate = null;
		String date = null;
		String postAuthor = null;
		String link = null;
		String postId = null;
		JSONArray userMentionsArray = null;
		
		try {
			
			if (jsonPost.get("retweeted_status") == null) {
				isRetweet = false;
				post = jsonPost.getString("full_text");
				postAuthor = jsonPost.getJSONObject("user").getString("screen_name"); 
				postId = jsonPost.getString("id_str");
				
			} else {
				isRetweet = true;
				post = jsonPost.getJSONObject("retweeted_status").getString("full_text"); 
				userMentionsArray = jsonPost.getJSONObject("entities").getJSONArray("user_mentions");
				postAuthor = userMentionsArray.getJSONObject(0).getString("screen_name");
				postId = jsonPost.getJSONObject("retweeted_status").getString("id_str"); 
		 
			}
			
			if (post.length() > postLength) {
				post = post.substring(0, postLength) + "...";
			}
			
			likes = jsonPost.getInt("favorite_count");
			link = "https://twitter.com/"+ postAuthor + "/status/" + postId;
			oldDate = jsonPost.getString("created_at");
			dateTwitter = twitterFormat.parse(oldDate); 
			date = new SimpleDateFormat("MMMM d, yyyy").format(dateTwitter);
			
			if (postAuthor.isEmpty() || post.isEmpty() || date.isEmpty()) {
				socialMediaPost = null;
				_log.warn("Warning in SocialSliderPortlet.getAssetModel(): returning null SocialMediaPost");
			} else {
				socialMediaPost.setPost(post);
				socialMediaPost.setPostAuthor(postAuthor);
				socialMediaPost.setIsRetweet(isRetweet);
				socialMediaPost.setDate(date);
				socialMediaPost.setLikes(likes);
				socialMediaPost.setLink(link);
				socialMediaPost.setSocialSite("twitter");
			}
		} catch (Exception ex) {
			_log.error("Exception in UpdatesSliderPortlet.getAssetModel(): " + ex.getMessage());
			socialMediaPost = null;
		}

		return socialMediaPost;
	}

	protected SocialSliderSocialMediaPost getMediaPostFB(JSONObject jsonPost, String fbScreenName, int postLength) {

		SocialSliderSocialMediaPost socialMediaPost = new SocialSliderSocialMediaPost(StringPool.BLANK, StringPool.BLANK,
				StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, 0, false);

		SimpleDateFormat fbFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
		fbFormat.setLenient(true);

		String post = null;
		int likes = 0;
		Date dateFB;
		String oldDate;
		String date = null;
		String postAuthor = null;
		String link;

		try {
			post = jsonPost.getString("message");
			postAuthor = fbScreenName;

			if (post.length() > postLength) {
				post = post.substring(0, postLength) + "...";
			}

			likes = jsonPost.getJSONObject("likes").getJSONObject("summary").getInt("total_count");
			link = jsonPost.getString("permalink_url");
			oldDate = jsonPost.getString("created_time");
			dateFB = fbFormat.parse(oldDate);
			date = new SimpleDateFormat("MMMM d, yyyy").format(dateFB);

			if (postAuthor.isEmpty() || post.isEmpty() || date.isEmpty()) {
				socialMediaPost = null;
				_log.warn("Warning in SocialSliderPortlet.getAssetModel(): returning null SocialMediaPost");
			} else {
				socialMediaPost.setPost(post);
				socialMediaPost.setPostAuthor(postAuthor);
				socialMediaPost.setIsRetweet(false);
				socialMediaPost.setDate(date);
				socialMediaPost.setLikes(likes);
				socialMediaPost.setLink(link);
				socialMediaPost.setSocialSite("facebook");
			}
		} catch (Exception ex) {
			_log.error("Exception in UpdatesSliderPortlet.getAssetModel(): " + ex.getMessage());
			socialMediaPost = null;
		}

		return socialMediaPost;
	}

	private static String computeSignature(String baseString, String keyString) throws GeneralSecurityException, UnsupportedEncodingException, Exception
	{
		SecretKey secretKey = null;

		byte[] keyBytes = keyString.getBytes();
		secretKey = new SecretKeySpec(keyBytes, "HmacSHA1");

		Mac mac = Mac.getInstance("HmacSHA1");

		mac.init(secretKey);

		byte[] text = baseString.getBytes();
		return new String(Base64.encodeBase64(mac.doFinal(text))).trim();
	}

	protected String time() {
		long millis = System.currentTimeMillis();
		long secs = millis / 1000;
		return String.valueOf( secs );
	}
	
	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		try {
			_socialSliderConfiguration = ConfigurableUtil.createConfigurable(SocialSliderConfiguration.class,
					properties);
		} catch (Exception ex) {
			_log.error("Exception in TwitterSliderPortlet.activate(): " + ex.getMessage());
		}
	}
	
}

