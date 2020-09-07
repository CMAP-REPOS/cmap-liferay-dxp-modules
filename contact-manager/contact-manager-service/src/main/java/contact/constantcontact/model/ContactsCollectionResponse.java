package contact.constantcontact.model;

import java.util.List;

public class ContactsCollectionResponse {
	private MetaDetails meta;
	private List<ContactApiModel> results;

	public MetaDetails getMeta() {
		return meta;
	}

	public void setMeta(MetaDetails meta) {
		this.meta = meta;
	}

	public List<ContactApiModel> getResults() {
		return results;
	}

	public void setResults(List<ContactApiModel> results) {
		this.results = results;
	}

}
