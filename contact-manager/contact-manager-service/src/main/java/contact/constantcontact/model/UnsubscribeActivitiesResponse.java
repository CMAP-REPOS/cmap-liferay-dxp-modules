package contact.constantcontact.model;

import java.util.List;

public class UnsubscribeActivitiesResponse {
	private MetaDetails meta;
	private List<Activity> results;

	public MetaDetails getMeta() {
		return meta;
	}

	public void setMeta(MetaDetails meta) {
		this.meta = meta;
	}

	public List<Activity> getResults() {
		return results;
	}

	public void setResults(List<Activity> results) {
		this.results = results;
	}
}
