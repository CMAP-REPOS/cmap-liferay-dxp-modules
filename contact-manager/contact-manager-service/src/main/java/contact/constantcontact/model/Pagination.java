package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

	private String nextLink;

	@JsonProperty("next_link")
	public String getNextLink() {
		return nextLink;
	}

	public void setNextLink(String nextLink) {
		this.nextLink = nextLink;
	}
	
	
}
