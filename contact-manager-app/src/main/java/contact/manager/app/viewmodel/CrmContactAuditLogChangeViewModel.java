package contact.manager.app.viewmodel;

import java.util.Date;

import contact.manager.app.util.DateUtil;
import contact.manager.model.CrmContactAuditLogChange;

public class CrmContactAuditLogChangeViewModel {

	public CrmContactAuditLogChangeViewModel(CrmContactAuditLogChange crmContactAuditLogChange) {

		this.crmContactAuditLogChangeId = crmContactAuditLogChange.getCrmContactAuditLogChangeId();
		this.groupId = crmContactAuditLogChange.getGroupId();
		this.companyId = crmContactAuditLogChange.getCompanyId();
		this.userId = crmContactAuditLogChange.getUserId();
		this.userName = crmContactAuditLogChange.getUserName();
		this.createDate = DateUtil.Format(crmContactAuditLogChange.getCreateDate());
		this.modifiedDate = DateUtil.Format(crmContactAuditLogChange.getModifiedDate());
		this.crmContactAuditLogId = crmContactAuditLogChange.getCrmContactAuditLogId();
		this.fieldName = crmContactAuditLogChange.getFieldName();
		this.oldValue = crmContactAuditLogChange.getOldValue();
		this.newValue = crmContactAuditLogChange.getNewValue();
	}

	public CrmContactAuditLogChangeViewModel(long crmContactAuditLogChangeId, long groupId, long companyId, long userId,
			String userName, Date createDate, Date modifiedDate, long crmContactAuditLogId, String fieldName,
			String oldValue, String newValue) {

		this.crmContactAuditLogChangeId = crmContactAuditLogChangeId;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = DateUtil.Format(createDate);
		this.modifiedDate = DateUtil.Format(modifiedDate);
		this.crmContactAuditLogId = crmContactAuditLogId;
		this.fieldName = fieldName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	private long crmContactAuditLogChangeId;
	private long groupId;
	private long companyId;
	private long userId;
	private String userName;
	private String createDate;
	private String modifiedDate;
	private long crmContactAuditLogId;
	private String fieldName;
	private String oldValue;
	private String newValue;

	public long getCrmContactAuditLogChangeId() {
		return crmContactAuditLogChangeId;
	}

	public void setCrmContactAuditLogChangeId(long crmContactAuditLogChangeId) {
		this.crmContactAuditLogChangeId = crmContactAuditLogChangeId;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public long getCrmContactAuditLogId() {
		return crmContactAuditLogId;
	}

	public void setCrmContactAuditLogId(long crmContactAuditLogId) {
		this.crmContactAuditLogId = crmContactAuditLogId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
}
