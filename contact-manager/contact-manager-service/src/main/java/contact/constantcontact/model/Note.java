package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class Note {
	private Date createdDate;
	private Date modifiedDate;
	private String id;
	private String note;

	public Note() {
	}

	/**
	 * Date the note was created, in ISO 8601 format
	 * 
	 * @return the created date
	 */
	@JsonProperty("created_date")
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Date that the note was last modified, in ISO-8601 format
	 * 
	 * @return the modified date
	 */
	@JsonProperty("modified_date")
	public Date getModified_date() {
		return modifiedDate;
	}

	/**
	 * Unique ID for the note
	 * 
	 * @return the id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * Text of the note
	 * 
	 * @return the note
	 */
	@JsonProperty("note")
	public String getNote() {
		return note;
	}

	/**
	 * @param created_date
	 *            the created_date to set
	 */
	public void setCreated_date(Date created_date) {
		this.createdDate = created_date;
	}

	/**
	 * @param modified_date
	 *            the modified_date to set
	 */
	public void setModified_date(Date modified_date) {
		this.modifiedDate = modified_date;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

}
