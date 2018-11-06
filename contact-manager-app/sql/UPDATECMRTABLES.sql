INSERT INTO qa_liferay_4p.crm_cca
  ( uuid_, crmCCAId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), ccaId, '0', '0', '0', '', now(), now(), ccaName, zipCode
FROM qa_liferay_4p.contactmanager_cca;

INSERT INTO qa_liferay_4p.crm_chiward
  (uuid_, crmChiWardId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), chiWardId, '0', '0', '0', '', now(), now(), chiWardName, zipCode
FROM qa_liferay_4p.contactmanager_chi_ward;

INSERT INTO qa_liferay_4p.crm_contactauditlog
(uuid_, crmContactAuditLogId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, constantContactId, action, oldSnapshot, newSnapshot)
SELECT UUID(), contactAuditLogId, groupId, companyId, userId, '', createDate, now(), contactId, constantContactId, action, oldSnapshot, newSnapshot
FROM qa_liferay_4p.contactmanager_contactauditlog;

INSERT INTO qa_liferay_4p.crm_contactauditlogchange
(uuid_, crmContactAuditLogChangeId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactAuditLogId, fieldName, oldValue, newValue)
SELECT UUID(), contactAuditLogChangeId, '0', '0', '0', '', now(), now(), contactAuditLogId, fieldName, oldValue, newValue
FROM qa_liferay_4p.contactmanager_contactauditlogchange;

INSERT INTO qa_liferay_4p.crm_contacts_groups
(companyId, crmContactId, crmGroupId)  
SELECT  '0' ,contactId, subGroupId
FROM qa_liferay_4p.contactmanager_contacts_cmapsubgroups;

INSERT INTO qa_liferay_4p.crm_contacts_tags
(companyId, crmContactId, crmTagId)  
SELECT '0' ,contactId, tagId
FROM qa_liferay_4p.contactmanager_contacts_tags;

INSERT INTO qa_liferay_4p.crm_contact
  ( uuid_, crmContactId, constantContactId, groupId, companyId, userId, userName, createDate, modifiedDate, prefix, salutation, firstName, middleName, lastName, organization, jobTitle, primaryAddress1, primaryAddress2, primaryAddressCity, primaryAddressState, primaryAddressZip, primaryAddressCounty, primaryAddressCountry, secondaryAddress1, secondaryAddress2, secondaryAddressCity, secondaryAddressState, secondaryAddressZip, secondaryAddressCounty, secondaryAddressCountry, primaryPhone, primaryPhoneExtension, primaryFax, primaryCell, primaryEmailAddress, alternateContact, alternateEmail, isVip, facebookId, twitterHandle, linkedInUrl, status, kioskUuid, imageFileEntryId, tagsList, groupsList)
SELECT UUID(), contactId, constantContactId, groupId, companyId, userId, '', createDate, modifiedDate, prefix, salutation, firstName, middleName, lastName, organization, jobTitle, primaryAddress1, primaryAddress2, primaryAddressCity, primaryAddressState, primaryAddressZip, primaryAddressCounty, primaryAddressCountry, secondaryAddress1, secondaryAddress2, secondaryAddressCity, secondaryAddressState, secondaryAddressZip, secondaryAddressCounty, secondaryAddressCountry, primaryPhone, '', primaryFax, primaryCell, primaryEmailAddress, alternateContact, alternateEmail, isVip, facebookId, twitterHandle, linkedInUrl, status, kioskUuid, imageFileEntryId, tagsList, subGroupsList
FROM qa_liferay_4p.contactmanager_contact;

INSERT INTO qa_liferay_4p.crm_county
(uuid_, crmCountyId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), countyId, '0', '0', '0', '', now(), now(), countyName, zipCode 
FROM qa_liferay_4p.contactmanager_county;

INSERT INTO qa_liferay_4p.crm_group
(uuid_, crmGroupId, groupId, companyId, userId, userName, createDate, modifiedDate, name, crmContactsCount)
SELECT UUID(), subGroupId, groupId, '0', '0', '', createDate, modifiedDate, subGroupName , '0'
FROM qa_liferay_4p.contactmanager_cmapsubgroup;

update qa_liferay_4p.crm_group c
inner join (SELECT crmGroupId, count(crmContactId) as count FROM qa_liferay_4p.crm_contacts_groups group by crmGroupId) t 
on c.crmGroupId = t.crmGroupId
set c.crmContactsCount = t.count;

INSERT INTO qa_liferay_4p.crm_countycommissioner
(uuid_, crmCountyCommissionerOrBoardDistId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), ccbdId, '0', '0', '0', '', now(), now(), ccbdName, ccbdNumber, zipCode 
FROM qa_liferay_4p.contactmanager_county_commissioner_or_board_dist;

INSERT INTO qa_liferay_4p.crm_muni
(uuid_, crmMuniId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), muniId, '0', '0', '0', '', now(), now(), muniName, zipCode
FROM qa_liferay_4p.contactmanager_muni;

INSERT INTO qa_liferay_4p.crm_lta
(uuid_, crmLTAId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), ltaId, '0', '0', '0', '', now(), now(), ltaName, zipCode
FROM qa_liferay_4p.contactmanager_lta;

INSERT INTO qa_liferay_4p.crm_outreachlog
(uuid_, crmOutreachLogId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, note, medium, activityType, outreachDate)
SELECT UUID(), id_, '0', '0', userId, '', createDate, modifiedDate, contactId, note, medium, activityType, outreachDate
FROM qa_liferay_4p.contactmanager_outreachlog;

INSERT INTO qa_liferay_4p.crm_staterep
(uuid_, crmStateRepId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), stateRepId, '0', '0', '0', '', now(), now(), stateRepName, stateRepNumber, zipCode
FROM qa_liferay_4p.contactmanager_state_rep;

INSERT INTO qa_liferay_4p.crm_statesenate
(uuid_, crmStateSenateId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), stateSenateId, '0', '0', '0', '', now(), now(), stateSenateName, stateSenateNumber, zipCode
FROM qa_liferay_4p.contactmanager_state_senate;

INSERT INTO qa_liferay_4p.crm_tag
(uuid_, crmTagId, groupId, companyId, userId, userName, createDate, modifiedDate, name)
SELECT UUID(), tagId, '0', '0', '0', '', now(), now(), tagName 
FROM qa_liferay_4p.contactmanager_cmaptag;

INSERT INTO qa_liferay_4p.crm_usrep
(uuid_, crmUsRepId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), usRepId, '0', '0', '0', '', now(), now(), usRepName, usRepNumber, zipCode
FROM qa_liferay_4p.contactmanager_us_rep;

INSERT INTO qa_liferay_4p.crm_note
(uuid_, crmNoteId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, note)
SELECT UUID(), id_, '0', '0', '0', '', createDate, modifiedDate, contactId, note
FROM qa_liferay_4p.contactmanager_note;

update qa_liferay_4p.crm_contact set companyId = 10154;