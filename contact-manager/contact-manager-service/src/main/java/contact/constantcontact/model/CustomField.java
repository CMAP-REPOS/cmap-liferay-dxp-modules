package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CustomField {
	public String label;
	public String name;
	public String value;

	public CustomField() {
	}
}
