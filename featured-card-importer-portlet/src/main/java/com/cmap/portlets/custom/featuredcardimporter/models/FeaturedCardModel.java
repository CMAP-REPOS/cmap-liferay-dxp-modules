package com.cmap.portlets.custom.featuredcardimporter.models;

public class FeaturedCardModel {

    private String cardTitle;
    private String caption;
    private String imageToDisplay;
    private String imageDescription;
    private String document;
    private String page;
    private String url;
    
	public FeaturedCardModel(String cardTitle, 
			String caption, 
			String imageToDisplay, 
			String document, 
			String page,
			String url) {
		this.setCardTitle(cardTitle);
		this.setCaption(caption);
		this.setImageToDisplay(imageToDisplay);
		this.setDocument(document);
		this.setPage(page);
		this.setUrl(url);
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImageToDisplay() {
		return imageToDisplay;
	}

	public void setImageToDisplay(String imageToDisplay) {
		this.imageToDisplay = imageToDisplay;
	}

	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
