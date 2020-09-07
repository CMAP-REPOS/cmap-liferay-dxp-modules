package contact.constantcontact.model.enums;

public enum BounceDescriptions {

	B("non-existent address"), D("undeliverable"), F("mailbox full"), S("suspended"), V(
			"vacation or autoreply"), Z("blocked"), X("other");

	private String description;

	private BounceDescriptions(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}