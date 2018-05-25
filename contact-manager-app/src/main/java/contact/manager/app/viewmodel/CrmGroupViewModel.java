package contact.manager.app.viewmodel;

import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;
import java.util.List;

import contact.manager.app.util.DateUtil;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmGroupLocalServiceUtil;

public class CrmGroupViewModel {

	public CrmGroupViewModel(CrmGroup crmGroup) throws SystemException {
		
		this.crmGroupId = crmGroup.getCrmGroupId();
		this.groupId = crmGroup.getGroupId();
		this.companyId = crmGroup.getCompanyId();
		this.userId = crmGroup.getUserId();
		this.userName = crmGroup.getUserName();
		this.createDate = DateUtil.Format(crmGroup.getCreateDate());
		this.modifiedDate = DateUtil.Format(crmGroup.getModifiedDate());
		this.name = crmGroup.getName();
		this.crmContactsCount = CrmGroupLocalServiceUtil.getCrmContactsCount(crmGroup.getCrmGroupId());
	}

	public CrmGroupViewModel(long crmGroupId, long groupId, long companyId, long userId, String userName,
			Date createDate, Date modifiedDate, String name, List<CrmContact> crmContacts, int crmContactsCount) {
		
		this.crmGroupId = crmGroupId;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = DateUtil.Format(createDate);
		this.modifiedDate = DateUtil.Format(modifiedDate);
		this.name = name;
		this.crmContactsCount = crmContactsCount;
	}

	private long crmGroupId;
	private long groupId;
	private long companyId;
	private long userId;
	private String userName;
	private String createDate;
	private String modifiedDate;
	private String name;
	private int crmContactsCount;
	
	public long getCrmGroupId() {
		return crmGroupId;
	}

	public void setCrmGroupId(long crmGroupId) {
		this.crmGroupId = crmGroupId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCrmContactsCount() {
		return crmContactsCount;
	}

	public void setCrmContactsCount(int crmContactsCount) {
		this.crmContactsCount = crmContactsCount;
	}
}
