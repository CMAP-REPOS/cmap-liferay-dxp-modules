package contact.manager.app.viewmodel;

import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmGroupLocalServiceUtil;

public class CrmGroupViewModel {

	public CrmGroupViewModel(CrmGroup crmGroup) throws SystemException {
		super();

		this.companyId = crmGroup.getCompanyId();
		this.crmContacts = CrmGroupLocalServiceUtil.getCrmContacts(crmGroup.getCrmGroupId());
		this.crmContactsCount = CrmGroupLocalServiceUtil.getCrmContactsCount(crmGroup.getCrmGroupId());
		this.createDate = crmGroup.getCreateDate();
		this.crmGroupId = crmGroup.getCrmGroupId();
		this.groupId = crmGroup.getGroupId();
		this.modifiedDate = crmGroup.getModifiedDate();
		this.name = crmGroup.getName();
		this.userId = crmGroup.getUserId();
		this.userName = crmGroup.getUserName();
	}

	private long companyId;
	private List<CrmContact> crmContacts;
	private int crmContactsCount;
	private Date createDate;
	private long crmGroupId;
	private long groupId;
	private Date modifiedDate;
	private String name;
	private long userId;
	private String userName;

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public List<CrmContact> getCrmContacts() {
		return crmContacts;
	}

	public int getCrmContactsCount () {
		return crmContactsCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
