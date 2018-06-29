package contact.manager.app.viewmodel;

import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import contact.manager.app.util.DateUtil;
import contact.manager.app.util.ZipCodeUtil;
import contact.manager.model.CrmCCA;
import contact.manager.model.CrmChiWard;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmCounty;
import contact.manager.model.CrmCountyCommissioner;
import contact.manager.model.CrmLTA;
import contact.manager.model.CrmMuni;
import contact.manager.model.CrmStateRep;
import contact.manager.model.CrmStateSenate;
import contact.manager.model.CrmUsRep;

public class CrmContactViewModel {

	public CrmContactViewModel(CrmContact crmContact) throws SystemException {

		this.crmContactId = crmContact.getCrmContactId();
		this.constantContactId = crmContact.getConstantContactId();
		this.groupId = crmContact.getGroupId();
		this.companyId = crmContact.getCompanyId();
		this.userId = crmContact.getUserId();
		this.userName = crmContact.getUserName();
		this.createDate = DateUtil.Format(crmContact.getCreateDate());
		this.modifiedDate = DateUtil.Format(crmContact.getModifiedDate());
		this.prefix = crmContact.getPrefix();
		this.salutation = crmContact.getSalutation();
		this.firstName = crmContact.getFirstName();
		this.middleName = crmContact.getMiddleName();
		this.lastName = crmContact.getLastName();
		this.organization = crmContact.getOrganization();
		this.jobTitle = crmContact.getJobTitle();
		this.primaryAddress1 = crmContact.getPrimaryAddress1();
		this.primaryAddress2 = crmContact.getPrimaryAddress2();
		this.primaryAddressCity = crmContact.getPrimaryAddressCity();
		this.primaryAddressState = crmContact.getPrimaryAddressState();
		this.primaryAddressZip = crmContact.getPrimaryAddressZip();
		this.primaryAddressCounty = crmContact.getPrimaryAddressCounty();
		this.primaryAddressCountry = crmContact.getPrimaryAddressCountry();
		this.secondaryAddress1 = crmContact.getSecondaryAddress1();
		this.secondaryAddress2 = crmContact.getSecondaryAddress2();
		this.secondaryAddressCity = crmContact.getSecondaryAddressCity();
		this.secondaryAddressState = crmContact.getSecondaryAddressState();
		this.secondaryAddressZip = crmContact.getSecondaryAddressZip();
		this.secondaryAddressCounty = crmContact.getSecondaryAddressCounty();
		this.secondaryAddressCountry = crmContact.getSecondaryAddressCountry();
		this.primaryPhone = crmContact.getPrimaryPhone();
		this.primaryPhoneExtension = crmContact.getPrimaryPhoneExtension();
		this.primaryFax = crmContact.getPrimaryFax();
		this.primaryCell = crmContact.getPrimaryCell();
		this.primaryEmailAddress = crmContact.getPrimaryEmailAddress();
		this.alternateContact = crmContact.getAlternateContact();
		this.alternateEmail = crmContact.getAlternateEmail();
		this.isVip = crmContact.getIsVip();
		this.facebookId = crmContact.getFacebookId();
		this.twitterHandle = crmContact.getTwitterHandle();
		this.linkedInUrl = crmContact.getLinkedInUrl();
		this.status = crmContact.getStatus();
		this.kioskUuid = crmContact.getKioskUuid();
		this.imageFileEntryId = crmContact.getImageFileEntryId();
		this.tagsList = crmContact.getTagsList();
		this.groupsList = crmContact.getGroupsList();
		this.crmCCANames = getCrmCCANames(crmContact.getPrimaryAddressZip());
		this.crmChiWardNames = getCrmChiWardNames(crmContact.getPrimaryAddressZip());
		this.crmCountyNames = getCrmCountyNames(crmContact.getPrimaryAddressZip());
		this.crmCountyCommissionerNames = getCrmCountyCommissionerNames(crmContact.getPrimaryAddressZip());
		this.crmLTANames = getCrmLTANames(crmContact.getPrimaryAddressZip());
		this.crmMuniNames = getCrmMuniNames(crmContact.getPrimaryAddressZip());
		this.crmStateRepNames = getCrmStateRepNumbers(crmContact.getPrimaryAddressZip());
		this.crmStateSenateNames = getCrmStateSenateNumbers(crmContact.getPrimaryAddressZip());
		this.crmUsRepNames = getCrmUsRepNumbers(crmContact.getPrimaryAddressZip());
	}

	public CrmContactViewModel(long crmContactId, long constantContactId, long groupId, long companyId, long userId,
			String userName, Date createDate, Date modifiedDate, String prefix, String salutation, String firstName,
			String middleName, String lastName, String organization, String jobTitle, String primaryAddress1,
			String primaryAddress2, String primaryAddressCity, String primaryAddressState, String primaryAddressZip,
			String primaryAddressCounty, String primaryAddressCountry, String secondaryAddress1,
			String secondaryAddress2, String secondaryAddressCity, String secondaryAddressState,
			String secondaryAddressZip, String secondaryAddressCounty, String secondaryAddressCountry,
			String primaryPhone, String primaryPhoneExtension, String primaryFax, String primaryCell,
			String primaryEmailAddress, String alternateContact, String alternateEmail, boolean isVip,
			String facebookId, String twitterHandle, String linkedInUrl, String status, String kioskUuid,
			long imageFileEntryId, String tagsList, String groupsList, List<String> crmCCANames,
			List<String> crmChiWardNames, List<String> crmCountyNames, List<String> crmCountyCommissionerNames,
			List<String> crmLTANames, List<String> crmMuniNames, List<String> crmStateRepNames,
			List<String> crmStateSenateNames, List<String> crmUsRepNames) {

		this.crmContactId = crmContactId;
		this.constantContactId = constantContactId;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = DateUtil.Format(createDate);
		this.modifiedDate = DateUtil.Format(modifiedDate);
		this.prefix = prefix;
		this.salutation = salutation;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.organization = organization;
		this.jobTitle = jobTitle;
		this.primaryAddress1 = primaryAddress1;
		this.primaryAddress2 = primaryAddress2;
		this.primaryAddressCity = primaryAddressCity;
		this.primaryAddressState = primaryAddressState;
		this.primaryAddressZip = primaryAddressZip;
		this.primaryAddressCounty = primaryAddressCounty;
		this.primaryAddressCountry = primaryAddressCountry;
		this.secondaryAddress1 = secondaryAddress1;
		this.secondaryAddress2 = secondaryAddress2;
		this.secondaryAddressCity = secondaryAddressCity;
		this.secondaryAddressState = secondaryAddressState;
		this.secondaryAddressZip = secondaryAddressZip;
		this.secondaryAddressCounty = secondaryAddressCounty;
		this.secondaryAddressCountry = secondaryAddressCountry;
		this.primaryPhone = primaryPhone;
		this.primaryPhoneExtension = primaryPhoneExtension;
		this.primaryFax = primaryFax;
		this.primaryCell = primaryCell;
		this.primaryEmailAddress = primaryEmailAddress;
		this.alternateContact = alternateContact;
		this.alternateEmail = alternateEmail;
		this.isVip = isVip;
		this.facebookId = facebookId;
		this.twitterHandle = twitterHandle;
		this.linkedInUrl = linkedInUrl;
		this.status = status;
		this.kioskUuid = kioskUuid;
		this.imageFileEntryId = imageFileEntryId;
		this.tagsList = tagsList;
		this.groupsList = groupsList;
		this.crmCCANames = crmCCANames;
		this.crmChiWardNames = crmChiWardNames;
		this.crmCountyNames = crmCountyNames;
		this.crmCountyCommissionerNames = crmCountyCommissionerNames;
		this.crmLTANames = crmLTANames;
		this.crmMuniNames = crmMuniNames;
		this.crmStateRepNames = crmStateRepNames;
		this.crmStateSenateNames = crmStateSenateNames;
		this.crmUsRepNames = crmUsRepNames;
	}

	private long crmContactId;
	private long constantContactId;
	private long groupId;
	private long companyId;
	private long userId;
	private String userName;
	private String createDate;
	private String modifiedDate;

	private String prefix;
	private String salutation;
	private String firstName;
	private String middleName;
	private String lastName;
	private String organization;
	private String jobTitle;
	private String primaryAddress1;
	private String primaryAddress2;
	private String primaryAddressCity;
	private String primaryAddressState;
	private String primaryAddressZip;
	private String primaryAddressCounty;
	private String primaryAddressCountry;
	private String secondaryAddress1;
	private String secondaryAddress2;
	private String secondaryAddressCity;
	private String secondaryAddressState;
	private String secondaryAddressZip;
	private String secondaryAddressCounty;
	private String secondaryAddressCountry;
	private String primaryPhone;
	private String primaryPhoneExtension;
	private String primaryFax;
	private String primaryCell;
	private String primaryEmailAddress;
	private String alternateContact;
	private String alternateEmail;
	private boolean isVip;
	private String facebookId;
	private String twitterHandle;
	private String linkedInUrl;
	private String status;
	private String kioskUuid;
	private long imageFileEntryId;
	private String tagsList;
	private String groupsList;

	public List<String> crmCCANames;
	public List<String> crmChiWardNames;
	public List<String> crmCountyNames;
	public List<String> crmCountyCommissionerNames;
	public List<String> crmLTANames;
	public List<String> crmMuniNames;
	public List<String> crmStateRepNames;
	public List<String> crmStateSenateNames;
	public List<String> crmUsRepNames;

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

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPrimaryAddress1() {
		return primaryAddress1;
	}

	public void setPrimaryAddress1(String primaryAddress1) {
		this.primaryAddress1 = primaryAddress1;
	}

	public String getPrimaryAddress2() {
		return primaryAddress2;
	}

	public void setPrimaryAddress2(String primaryAddress2) {
		this.primaryAddress2 = primaryAddress2;
	}

	public String getPrimaryAddressCity() {
		return primaryAddressCity;
	}

	public void setPrimaryAddressCity(String primaryAddressCity) {
		this.primaryAddressCity = primaryAddressCity;
	}

	public String getPrimaryAddressState() {
		return primaryAddressState;
	}

	public void setPrimaryAddressState(String primaryAddressState) {
		this.primaryAddressState = primaryAddressState;
	}

	public String getPrimaryAddressZip() {
		return primaryAddressZip;
	}

	public void setPrimaryAddressZip(String primaryAddressZip) {
		this.primaryAddressZip = primaryAddressZip;
	}

	public String getPrimaryAddressCounty() {
		return primaryAddressCounty;
	}

	public void setPrimaryAddressCounty(String primaryAddressCounty) {
		this.primaryAddressCounty = primaryAddressCounty;
	}

	public String getPrimaryAddressCountry() {
		return primaryAddressCountry;
	}

	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		this.primaryAddressCountry = primaryAddressCountry;
	}

	public String getSecondaryAddress1() {
		return secondaryAddress1;
	}

	public void setSecondaryAddress1(String secondaryAddress1) {
		this.secondaryAddress1 = secondaryAddress1;
	}

	public String getSecondaryAddress2() {
		return secondaryAddress2;
	}

	public void setSecondaryAddress2(String secondaryAddress2) {
		this.secondaryAddress2 = secondaryAddress2;
	}

	public String getSecondaryAddressCity() {
		return secondaryAddressCity;
	}

	public void setSecondaryAddressCity(String secondaryAddressCity) {
		this.secondaryAddressCity = secondaryAddressCity;
	}

	public String getSecondaryAddressState() {
		return secondaryAddressState;
	}

	public void setSecondaryAddressState(String secondaryAddressState) {
		this.secondaryAddressState = secondaryAddressState;
	}

	public String getSecondaryAddressZip() {
		return secondaryAddressZip;
	}

	public void setSecondaryAddressZip(String secondaryAddressZip) {
		this.secondaryAddressZip = secondaryAddressZip;
	}

	public String getSecondaryAddressCounty() {
		return secondaryAddressCounty;
	}

	public void setSecondaryAddressCounty(String secondaryAddressCounty) {
		this.secondaryAddressCounty = secondaryAddressCounty;
	}

	public String getSecondaryAddressCountry() {
		return secondaryAddressCountry;
	}

	public void setSecondaryAddressCountry(String secondaryAddressCountry) {
		this.secondaryAddressCountry = secondaryAddressCountry;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getPrimaryPhoneExtension() {
		return primaryPhoneExtension;
	}

	public void setPrimaryPhoneExtension(String primaryPhoneExtension) {
		this.primaryPhoneExtension = primaryPhoneExtension;
	}

	public String getPrimaryFax() {
		return primaryFax;
	}

	public void setPrimaryFax(String primaryFax) {
		this.primaryFax = primaryFax;
	}

	public String getPrimaryCell() {
		return primaryCell;
	}

	public void setPrimaryCell(String primaryCell) {
		this.primaryCell = primaryCell;
	}

	public String getPrimaryEmailAddress() {
		return primaryEmailAddress;
	}

	public void setPrimaryEmailAddress(String primaryEmailAddress) {
		this.primaryEmailAddress = primaryEmailAddress;
	}

	public String getAlternateContact() {
		return alternateContact;
	}

	public void setAlternateContact(String alternateContact) {
		this.alternateContact = alternateContact;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getTwitterHandle() {
		return twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	public String getLinkedInUrl() {
		return linkedInUrl;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKioskUuid() {
		return kioskUuid;
	}

	public void setKioskUuid(String kioskUuid) {
		this.kioskUuid = kioskUuid;
	}

	public long getImageFileEntryId() {
		return imageFileEntryId;
	}

	public void setImageFileEntryId(long imageFileEntryId) {
		this.imageFileEntryId = imageFileEntryId;
	}

	public String getTagsList() {
		return tagsList;
	}

	public void setTagsList(String tagsList) {
		this.tagsList = tagsList;
	}

	public String getGroupsList() {
		return groupsList;
	}

	public void setGroupsList(String groupsList) {
		this.groupsList = groupsList;
	}

	public List<String> getCrmCCANames() {
		return crmCCANames;
	}

	public void setCrmCCANames(List<String> crmCCANames) {
		this.crmCCANames = crmCCANames;
	}

	public List<String> getCrmChiWardNames() {
		return crmChiWardNames;
	}

	public void setCrmChiWardNames(List<String> crmChiWardNames) {
		this.crmChiWardNames = crmChiWardNames;
	}

	public List<String> getCrmCountyNames() {
		return crmCountyNames;
	}

	public void setCrmCountyNames(List<String> crmCountyNames) {
		this.crmCountyNames = crmCountyNames;
	}

	public List<String> getCrmCountyCommissionerNames() {
		return crmCountyCommissionerNames;
	}

	public void setCrmCountyCommissionerNames(List<String> crmCountyCommissionerNames) {
		this.crmCountyCommissionerNames = crmCountyCommissionerNames;
	}

	public List<String> getCrmLTANames() {
		return crmLTANames;
	}

	public void setCrmLTANames(List<String> crmLTANames) {
		this.crmLTANames = crmLTANames;
	}

	public List<String> getCrmMuniNames() {
		return crmMuniNames;
	}

	public void setCrmMuniNames(List<String> crmMuniNames) {
		this.crmMuniNames = crmMuniNames;
	}

	public List<String> getCrmStateRepNames() {
		return crmStateRepNames;
	}

	public void setCrmStateRepNames(List<String> crmStateRepNames) {
		this.crmStateRepNames = crmStateRepNames;
	}

	public List<String> getCrmStateSenateNames() {
		return crmStateSenateNames;
	}

	public void setCrmStateSenateNames(List<String> crmStateSenateNames) {
		this.crmStateSenateNames = crmStateSenateNames;
	}

	public List<String> getCrmUsRepNames() {
		return crmUsRepNames;
	}

	public void setCrmUsRepNames(List<String> crmUsRepNames) {
		this.crmUsRepNames = crmUsRepNames;
	}

	private List<String> getCrmCCANames(String zipCode) {
		List<String> names = new ArrayList<String>();
		List<CrmCCA> items = ZipCodeUtil.getCrmCCAByZipCode(zipCode);
		for (CrmCCA item : items) {
			names.add(item.getName());
		}
		return names;
	}

	private List<String> getCrmChiWardNames(String zipCode) {
		List<String> names = new ArrayList<String>();
		List<CrmChiWard> items = ZipCodeUtil.getCrmChiWardByZipCode(zipCode);
		for (CrmChiWard item : items) {
			names.add(item.getName());
		}
		return names;
	}

	private List<String> getCrmCountyNames(String zipCode) {
		List<String> names = new ArrayList<String>();
		List<CrmCounty> items = ZipCodeUtil.getCrmCountyByZipCode(zipCode);
		for (CrmCounty item : items) {
			names.add(item.getName());
		}
		return names;
	}

	private List<String> getCrmCountyCommissionerNames(String zipCode) {
		List<String> names = new ArrayList<String>();
		List<CrmCountyCommissioner> items = ZipCodeUtil.getCrmCountyCommissionerByZipCode(zipCode);
		for (CrmCountyCommissioner item : items) {
			names.add(item.getName());
		}
		return names;
	}

	private List<String> getCrmLTANames(String zipCode) {
		List<String> names = new ArrayList<String>();
		List<CrmLTA> items = ZipCodeUtil.getCrmLTAByZipCode(zipCode);
		for (CrmLTA item : items) {
			names.add(item.getName());
		}
		return names;
	}

	private List<String> getCrmMuniNames(String zipCode) {
		List<String> names = new ArrayList<String>();
		List<CrmMuni> items = ZipCodeUtil.getCrmMuniByZipCode(zipCode);
		for (CrmMuni item : items) {
			names.add(item.getName());
		}
		return names;
	}

	private List<String> getCrmStateRepNumbers(String zipCode) {
		List<String> numbers = new ArrayList<String>();
		List<CrmStateRep> items = ZipCodeUtil.getCrmStateRepByZipCode(zipCode);
		for (CrmStateRep item : items) {
			numbers.add(item.getNumber());
		}
		return numbers;
	}

	private List<String> getCrmStateSenateNumbers(String zipCode) {
		List<String> numbers = new ArrayList<String>();
		List<CrmStateSenate> items = ZipCodeUtil.getCrmStateSenateByZipCode(zipCode);
		for (CrmStateSenate item : items) {
			numbers.add(item.getNumber());
		}
		return numbers;
	}

	private List<String> getCrmUsRepNumbers(String zipCode) {
		List<String> numbers = new ArrayList<String>();
		List<CrmUsRep> items = ZipCodeUtil.getCrmUsRepByZipCode(zipCode);
		for (CrmUsRep item : items) {
			numbers.add(item.getNumber());
		}
		return numbers;
	}
}