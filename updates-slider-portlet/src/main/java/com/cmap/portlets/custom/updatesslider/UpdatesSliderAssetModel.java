package com.cmap.portlets.custom.updatesslider;

public class UpdatesSliderAssetModel {

//	<div class="item col-xl-4 col-sm-8 col-xs-16">
//		<h4 class="item-date">May 01, 2014</h4>
//		<h3 class="item-title">
//			<a
//				href="/about/updates/-/asset_publisher/UIMfSLnFfMB6/content/innovation">Innovation</a>
//		</h3>
//		<p class="item-description">Innovation New ideas and technologies
//			help produce high-quality goods and services that keep metropolitan
//			Chicago competitive in today's global marketplace.&nbsp; Innovation
//			is spurred...</p>
//		<a class="read-more-link"
//			href="/about/updates/-/asset_publisher/UIMfSLnFfMB6/content/innovation">
//			Read more </a>
//	</div>
	
    private String date;
    private String title;
    private String summary;
    private String link;

	public UpdatesSliderAssetModel(String date, String title, String summary,
			String link) {
		this.date = date;
		this.setTitle(title);
		this.setSummary(summary);
		this.setLink(link);
	}

   	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
