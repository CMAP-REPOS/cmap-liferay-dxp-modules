CREATE TABLE `lportal`.`crm_cca` (
  `uuid_` text,
  `crmCCAId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `lportal`.`crm_chiward` (
  `uuid_` text,
  `crmChiWardId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_contact` (
  `uuid_` text,
  `crmContactId` int(11) DEFAULT NULL,
  `constantContactId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `prefix` text,
  `salutation` text,
  `firstName` text,
  `middleName` text,
  `lastName` text,
  `organization` text,
  `jobTitle` text,
  `primaryAddress1` text,
  `primaryAddress2` text,
  `primaryAddressCity` text,
  `primaryAddressState` text,
  `primaryAddressZip` text,
  `primaryAddressCounty` text,
  `primaryAddressCountry` text,
  `secondaryAddress1` text,
  `secondaryAddress2` text,
  `secondaryAddressCity` text,
  `secondaryAddressState` text,
  `secondaryAddressZip` text,
  `secondaryAddressCounty` text,
  `secondaryAddressCountry` text,
  `primaryPhone` text,
  `primaryPhoneExtension` text,
  `primaryFax` text,
  `primaryCell` text,
  `primaryEmailAddress` text,
  `alternateContact` text,
  `alternateEmail` text,
  `isVip` int(11) DEFAULT NULL,
  `facebookId` text,
  `twitterHandle` text,
  `linkedInUrl` text,
  `status` text,
  `kioskUuid` text,
  `imageFileEntryId` int(11) DEFAULT NULL,
  `tagsList` text,
  `groupsList` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_contactauditlog` (
  `uuid_` text,
  `crmContactAuditLogId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `crmContactId` int(11) DEFAULT NULL,
  `constantContactId` int(11) DEFAULT NULL,
  `action` text,
  `oldSnapshot` text,
  `newSnapshot` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_contactauditlogchange` (
  `uuid_` text,
  `crmContactAuditLogChangeId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `crmContactAuditLogId` int(11) DEFAULT NULL,
  `fieldName` text,
  `oldValue` text,
  `newValue` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_contacts_groups` (
  `companyId` int(11) DEFAULT NULL,
  `crmContactId` int(11) DEFAULT NULL,
  `crmGroupId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_contacts_tags` (
  `companyId` int(11) DEFAULT NULL,
  `crmContactId` int(11) DEFAULT NULL,
  `crmTagId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_country` (
  `uuid_` text,
  `crmCountyCommissionerOrBoardDistId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `number_` int(11) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_countrycommissioner` (
  `uuid_` text,
  `crmCountyCommissionerOrBoardDistId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `number_` int(11) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_county` (
  `uuid_` text,
  `crmCountyId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_countycommissioner` (
  `uuid_` text,
  `crmCountyCommissionerOrBoardDistId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `number_` int(11) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_group` (
  `uuid_` text,
  `crmGroupId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `crmContactsCount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_lta` (
  `uuid_` text,
  `crmLTAId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_muni` (
  `uuid_` text,
  `crmMuniId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_note` (
  `uuid_` text,
  `crmNoteId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `crmContactId` int(11) DEFAULT NULL,
  `note` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_outreachlog` (
  `uuid_` text,
  `crmOutreachLogId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `crmContactId` int(11) DEFAULT NULL,
  `note` text,
  `medium` text,
  `activityType` text,
  `outreachDate` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_staterep` (
  `uuid_` text,
  `crmStateRepId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `number_` int(11) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_statesenate` (
  `uuid_` text,
  `crmStateSenateId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `number_` int(11) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_tag` (
  `uuid_` text,
  `crmTagId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lportal`.`crm_usrep` (
  `uuid_` text,
  `crmUsRepId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `userName` text,
  `createDate` text,
  `modifiedDate` text,
  `name` text,
  `number_` int(11) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
