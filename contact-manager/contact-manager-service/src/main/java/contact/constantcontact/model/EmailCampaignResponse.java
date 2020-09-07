package contact.constantcontact.model;

import java.util.List;

public class EmailCampaignResponse {
	private MetaDetails meta;
	private List<EmailCampaign> results;

	public MetaDetails getMeta() {
		return meta;
	}

	public void setMeta(MetaDetails meta) {
		this.meta = meta;
	}

	public List<EmailCampaign> getResults() {
		return results;
	}

	public void setResults(List<EmailCampaign> results) {
		this.results = results;
	}
}
