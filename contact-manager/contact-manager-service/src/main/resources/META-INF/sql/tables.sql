create table crm_cca (
	uuid_ VARCHAR(75) null,
	crmCCAId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	zipCode VARCHAR(75) null
);

create table crm_chiward (
	uuid_ VARCHAR(75) null,
	crmChiWardId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	zipCode VARCHAR(75) null
);

create table crm_contact (
	uuid_ VARCHAR(75) null,
	crmContactId LONG not null primary key,
	constantContactId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	prefix VARCHAR(500) null,
	salutation VARCHAR(500) null,
	firstName VARCHAR(500) null,
	middleName VARCHAR(500) null,
	lastName VARCHAR(500) null,
	organization VARCHAR(500) null,
	jobTitle VARCHAR(500) null,
	primaryAddress1 VARCHAR(500) null,
	primaryAddress2 VARCHAR(500) null,
	primaryAddressCity VARCHAR(500) null,
	primaryAddressState VARCHAR(75) null,
	primaryAddressZip VARCHAR(75) null,
	primaryAddressCounty VARCHAR(500) null,
	primaryAddressCountry VARCHAR(500) null,
	secondaryAddress1 VARCHAR(500) null,
	secondaryAddress2 VARCHAR(500) null,
	secondaryAddressCity VARCHAR(500) null,
	secondaryAddressState VARCHAR(75) null,
	secondaryAddressZip VARCHAR(75) null,
	secondaryAddressCounty VARCHAR(500) null,
	secondaryAddressCountry VARCHAR(500) null,
	primaryPhone VARCHAR(75) null,
	primaryPhoneExtension VARCHAR(75) null,
	primaryFax VARCHAR(75) null,
	primaryCell VARCHAR(75) null,
	primaryEmailAddress VARCHAR(500) null,
	alternateContact VARCHAR(500) null,
	alternateEmail VARCHAR(500) null,
	isVip BOOLEAN,
	facebookId VARCHAR(500) null,
	twitterHandle VARCHAR(500) null,
	linkedInUrl VARCHAR(500) null,
	status VARCHAR(75) null,
	kioskUuid VARCHAR(75) null,
	imageFileEntryId LONG,
	tagsList TEXT null,
	groupsList TEXT null
);

create table crm_contactauditlog (
	uuid_ VARCHAR(75) null,
	crmContactAuditLogId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	crmContactId LONG,
	constantContactId LONG,
	action VARCHAR(75) null,
	oldSnapshot TEXT null,
	newSnapshot TEXT null
);

create table crm_contactauditlogchange (
	uuid_ VARCHAR(75) null,
	crmContactAuditLogChangeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	crmContactAuditLogId LONG,
	fieldName VARCHAR(75) null,
	oldValue TEXT null,
	newValue TEXT null
);

create table crm_contacts_groups (
	companyId LONG not null,
	crmContactId LONG not null,
	crmGroupId LONG not null,
	primary key (crmContactId, crmGroupId)
);

create table crm_contacts_tags (
	companyId LONG not null,
	crmContactId LONG not null,
	crmTagId LONG not null,
	primary key (crmContactId, crmTagId)
);

create table crm_county (
	uuid_ VARCHAR(75) null,
	crmCountyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	zipCode VARCHAR(75) null
);

create table crm_countycommissioner (
	uuid_ VARCHAR(75) null,
	crmCountyCommissionerOrBoardDistId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	number_ VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table crm_group (
	uuid_ VARCHAR(75) null,
	crmGroupId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	crmContactsCount LONG
);

create table crm_lta (
	uuid_ VARCHAR(75) null,
	crmLTAId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	zipCode VARCHAR(75) null
);

create table crm_muni (
	uuid_ VARCHAR(75) null,
	crmMuniId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	zipCode VARCHAR(75) null
);

create table crm_note (
	uuid_ VARCHAR(75) null,
	crmNoteId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	crmContactId LONG,
	note TEXT null
);

create table crm_outreachlog (
	uuid_ VARCHAR(75) null,
	crmOutreachLogId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	crmContactId LONG,
	note TEXT null,
	medium VARCHAR(75) null,
	activityType VARCHAR(75) null,
	outreachDate DATE null
);

create table crm_staterep (
	uuid_ VARCHAR(75) null,
	crmStateRepId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	number_ VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table crm_statesenate (
	uuid_ VARCHAR(75) null,
	crmStateSenateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	number_ VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table crm_tag (
	uuid_ VARCHAR(75) null,
	crmTagId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null
);

create table crm_usrep (
	uuid_ VARCHAR(75) null,
	crmUsRepId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(500) null,
	number_ VARCHAR(75) null,
	zipCode VARCHAR(75) null
);