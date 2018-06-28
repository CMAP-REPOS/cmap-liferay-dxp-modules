package contact.manager.app.viewmodel;

import java.util.Date;

import contact.manager.app.util.DateUtil;
import contact.manager.model.CrmContactAuditLog;

public class CrmContactAuditLogViewModel {

	public CrmContactAuditLogViewModel(CrmContactAuditLog crmContactAuditLog) {

		this.crmContactAuditLogId = crmContactAuditLog.getCrmContactAuditLogId();
		this.groupId = crmContactAuditLog.getGroupId();
		this.companyId = crmContactAuditLog.getCompanyId();
		this.userId = crmContactAuditLog.getUserId();
		this.userName = crmContactAuditLog.getUserName();
		this.createDate = DateUtil.Format(crmContactAuditLog.getCreateDate());
		this.modifiedDate = DateUtil.Format(crmContactAuditLog.getModifiedDate());
		this.crmContactId = crmContactAuditLog.getCrmContactId();
		this.constantContactId = crmContactAuditLog.getConstantContactId();
		this.setAction(crmContactAuditLog.getAction());
		this.oldSnapshot = crmContactAuditLog.getOldSnapshot();
		this.newSnapshot = crmContactAuditLog.getNewSnapshot();
	}

	public CrmContactAuditLogViewModel(long crmContactAuditLogId, long groupId, long companyId, long userId,
			String userName, Date createDate, Date modifiedDate, long crmContactId, long constantContactId,
			String action, String oldSnapshot, String newSnapshot) {

		this.crmContactAuditLogId = crmContactAuditLogId;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = DateUtil.Format(createDate);
		this.modifiedDate = DateUtil.Format(modifiedDate);
		this.crmContactId = crmContactId;
		this.constantContactId = constantContactId;
		this.setAction(action);
		this.oldSnapshot = oldSnapshot;
		this.newSnapshot = newSnapshot;
	}

	private long crmContactAuditLogId;
	private long groupId;
	private long companyId;
	private long userId;
	private String userName;
	private String createDate;
	private String modifiedDate;
	private long crmContactId;
	private long constantContactId;
	private String action;
	private String oldSnapshot;
	private String newSnapshot;

	public long getCrmContactAuditLogId() {
		return crmContactAuditLogId;
	}

	public void setCrmContactAuditLogId(long crmContactAuditLogId) {
		this.crmContactAuditLogId = crmContactAuditLogId;
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

	public long getCrmContactId() {
		return crmContactId;
	}

	public void setCrmContactId(long crmContactId) {
		this.crmContactId = crmContactId;
	}

	public long getConstantContactId() {
		return constantContactId;
	}

	public void setConstantContactId(long constantContactId) {
		this.constantContactId = constantContactId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getOldSnapshot() {
		return oldSnapshot;
	}

	public void setOldSnapshot(String oldSnapshot) {
		this.oldSnapshot = oldSnapshot;
	}

	public String getNewSnapshot() {
		return newSnapshot;
	}

	public void setNewSnapshot(String newSnapshot) {
		this.newSnapshot = newSnapshot;
	}

}
