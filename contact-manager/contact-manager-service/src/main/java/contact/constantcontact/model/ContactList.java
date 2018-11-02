package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ContactList {
	public String id;
	public String status;

	public ContactList() {
	}
}
