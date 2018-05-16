create table contactmanager_CCA (
	ccaId LONG not null primary key,
	ccaName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_Chi_Ward (
	chiWardId LONG not null primary key,
	chiWardName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_CmapGroup (
	groupId LONG not null primary key,
	groupName VARCHAR(75) null
);

create table contactmanager_CmapSubGroup (
	subGroupId LONG not null primary key,
	subGroupName VARCHAR(75) null,
	groupId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table contactmanager_CmapTag (
	tagId LONG not null primary key,
	tagName VARCHAR(75) null
);

create table contactmanager_Contact (
	contactId LONG not null primary key,
	constantContactId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	prefix VARCHAR(75) null,
	salutation VARCHAR(75) null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	organization VARCHAR(75) null,
	jobTitle VARCHAR(75) null,
	primaryAddress1 VARCHAR(75) null,
	primaryAddress2 VARCHAR(75) null,
	primaryAddressCity VARCHAR(75) null,
	primaryAddressState VARCHAR(75) null,
	primaryAddressZip VARCHAR(75) null,
	primaryAddressCounty VARCHAR(75) null,
	primaryAddressCountry VARCHAR(75) null,
	secondaryAddress1 VARCHAR(75) null,
	secondaryAddress2 VARCHAR(75) null,
	secondaryAddressCity VARCHAR(75) null,
	secondaryAddressState VARCHAR(75) null,
	secondaryAddressZip VARCHAR(75) null,
	secondaryAddressCounty VARCHAR(75) null,
	secondaryAddressCountry VARCHAR(75) null,
	primaryPhone VARCHAR(75) null,
	primaryFax VARCHAR(75) null,
	primaryCell VARCHAR(75) null,
	primaryEmailAddress VARCHAR(75) null,
	alternateContact VARCHAR(75) null,
	alternateEmail VARCHAR(75) null,
	isVip BOOLEAN,
	facebookId VARCHAR(75) null,
	twitterHandle VARCHAR(75) null,
	linkedInUrl VARCHAR(75) null,
	status VARCHAR(75) null,
	kioskUuid VARCHAR(75) null,
	imageFileEntryId LONG,
	tagsList VARCHAR(75) null,
	subGroupsList VARCHAR(75) null
);

create table contactmanager_ContactAuditLog (
	contactAuditLogId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	action VARCHAR(75) null,
	constantContactId LONG,
	oldSnapshot VARCHAR(75) null,
	newSnapshot VARCHAR(75) null,
	contactId LONG
);

create table contactmanager_ContactAuditLogChange (
	contactAuditLogChangeId LONG not null primary key,
	contactAuditLogId LONG,
	fieldName VARCHAR(75) null,
	oldValue VARCHAR(75) null,
	newValue VARCHAR(75) null
);

create table contactmanager_Contacts_CmapSubGroups (
	companyId LONG not null,
	subGroupId LONG not null,
	contactId LONG not null,
	primary key (subGroupId, contactId)
);

create table contactmanager_Contacts_Tags (
	companyId LONG not null,
	tagId LONG not null,
	contactId LONG not null,
	primary key (tagId, contactId)
);

create table contactmanager_County (
	countyId LONG not null primary key,
	countyName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_County_Commissioner_or_Board_Dist (
	ccbdId LONG not null primary key,
	ccbdNumber INTEGER,
	ccbdName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_LTA (
	ltaId LONG not null primary key,
	ltaName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_Muni (
	muniId LONG not null primary key,
	muniName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_Note (
	id_ LONG not null primary key,
	contactId LONG,
	userId LONG,
	note VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table contactmanager_OutreachLog (
	id_ LONG not null primary key,
	userId LONG,
	contactId LONG,
	note VARCHAR(75) null,
	medium VARCHAR(75) null,
	activityType VARCHAR(75) null,
	outreachDate DATE null,
	createDate DATE null,
	modifiedDate DATE null
);

create table contactmanager_State_Rep (
	stateRepId LONG not null primary key,
	stateRepNumber INTEGER,
	stateRepName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_State_Senate (
	stateSenateId LONG not null primary key,
	stateSenateNumber INTEGER,
	stateSenateName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);

create table contactmanager_US_Rep (
	usRepId LONG not null primary key,
	usRepNumber VARCHAR(75) null,
	usRepName VARCHAR(75) null,
	zipCode VARCHAR(75) null
);