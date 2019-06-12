package contact.constantcontact.util;

import java.util.Date;

public class UnsubscribedContact {

	private final String _constantContactId;
	private final String _constantContactActivityEmailAddress;
	private final Date _constantContactActivityUnsubscribeDate;
	private final Boolean _removed;
	
	public UnsubscribedContact( String constantContactId, String constantContactActivityEmailAddress, Date constantContactActivityUnsubscribeDate, Boolean isRemoved ) {
		
		_constantContactId = constantContactId;
		_constantContactActivityEmailAddress = constantContactActivityEmailAddress;
		_constantContactActivityUnsubscribeDate = constantContactActivityUnsubscribeDate;
		_removed = isRemoved;
	}

	public String getConstantContactId() {
		return _constantContactId;
	}

	public String getConstantContactActivityEmailAddress() {
		return _constantContactActivityEmailAddress;
	}

	public Date getConstantContactActivityUnsubscribeDate() {
		return _constantContactActivityUnsubscribeDate;
	}
	
	public Boolean isRemoved() {
		return _removed;
	}
}
