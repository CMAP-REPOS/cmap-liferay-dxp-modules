INSERT INTO crm_cca
  ( uuid_, crmCCAId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), ccaId, '0', '0', '0', '', now(), now(), ccaName, zipCode
FROM contactmanager_cca;

INSERT INTO crm_chiward
  (uuid_, crmChiWardId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), chiWardId, '0', '0', '0', '', now(), now(), chiWardName, zipCode
FROM contactmanager_chi_ward;

INSERT INTO crm_contactauditlog
(uuid_, crmContactAuditLogId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, constantContactId, action, oldSnapshot, newSnapshot)
SELECT UUID(), contactAuditLogId, groupId, companyId, userId, '', createDate, now(), contactId, constantContactId, action, oldSnapshot, newSnapshot
FROM contactmanager_contactauditlog;

INSERT INTO crm_contactauditlogchange
(uuid_, crmContactAuditLogChangeId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactAuditLogId, fieldName, oldValue, newValue)
SELECT UUID(), contactAuditLogChangeId, '0', '0', '0', '', now(), now(), contactAuditLogId, fieldName, oldValue, newValue
FROM contactmanager_contactauditlogchange;

INSERT INTO crm_contacts_groups
(companyId, crmContactId, crmGroupId)  
SELECT  '0' ,contactId, subGroupId
FROM contactmanager_contacts_cmapsubgroups;

INSERT INTO crm_contacts_tags
(companyId, crmContactId, crmTagId)  
SELECT '0' ,contactId, tagId
FROM contactmanager_contacts_tags;

INSERT INTO crm_contact
  ( uuid_, crmContactId, constantContactId, groupId, companyId, userId, userName, createDate, modifiedDate, prefix, salutation, firstName, middleName, lastName, organization, jobTitle, primaryAddress1, primaryAddress2, primaryAddressCity, primaryAddressState, primaryAddressZip, primaryAddressCounty, primaryAddressCountry, secondaryAddress1, secondaryAddress2, secondaryAddressCity, secondaryAddressState, secondaryAddressZip, secondaryAddressCounty, secondaryAddressCountry, primaryPhone, primaryPhoneExtension, primaryFax, primaryCell, primaryEmailAddress, alternateContact, alternateEmail, isVip, facebookId, twitterHandle, linkedInUrl, status, kioskUuid, imageFileEntryId, tagsList, groupsList)
SELECT UUID(), contactId, constantContactId, groupId, companyId, userId, '', createDate, modifiedDate, prefix, salutation, firstName, middleName, lastName, organization, jobTitle, primaryAddress1, primaryAddress2, primaryAddressCity, primaryAddressState, primaryAddressZip, primaryAddressCounty, primaryAddressCountry, secondaryAddress1, secondaryAddress2, secondaryAddressCity, secondaryAddressState, secondaryAddressZip, secondaryAddressCounty, secondaryAddressCountry, primaryPhone, '', primaryFax, primaryCell, primaryEmailAddress, alternateContact, alternateEmail, isVip, facebookId, twitterHandle, linkedInUrl, status, kioskUuid, imageFileEntryId, tagsList, subGroupsList
FROM contactmanager_contact;

INSERT INTO crm_county
(uuid_, crmCountyId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), countyId, '0', '0', '0', '', now(), now(), countyName, zipCode 
FROM contactmanager_county;

INSERT INTO crm_group
(uuid_, crmGroupId, groupId, companyId, userId, userName, createDate, modifiedDate, name, crmContactsCount)
SELECT UUID(), subGroupId, groupId, '0', '0', '', createDate, modifiedDate, subGroupName , '0'
FROM contactmanager_cmapsubgroup;

update crm_group c
inner join (SELECT crmGroupId, count(crmContactId) as count FROM crm_contacts_groups group by crmGroupId) t 
on c.crmGroupId = t.crmGroupId
set c.crmContactsCount = t.count;

INSERT INTO crm_countycommissioner
(uuid_, crmCountyCommissionerOrBoardDistId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), ccbdId, '0', '0', '0', '', now(), now(), ccbdName, ccbdNumber, zipCode 
FROM contactmanager_county_commissioner_or_board_dist;

INSERT INTO crm_muni
(uuid_, crmMuniId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), muniId, '0', '0', '0', '', now(), now(), muniName, zipCode
FROM contactmanager_muni;

INSERT INTO crm_lta
(uuid_, crmLTAId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), ltaId, '0', '0', '0', '', now(), now(), ltaName, zipCode
FROM contactmanager_lta;

INSERT INTO crm_outreachlog
(uuid_, crmOutreachLogId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, note, medium, activityType, outreachDate)
SELECT UUID(), id_, '0', '0', userId, '', createDate, modifiedDate, contactId, note, medium, activityType, outreachDate
FROM contactmanager_outreachlog;

INSERT INTO crm_staterep
(uuid_, crmStateRepId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), stateRepId, '0', '0', '0', '', now(), now(), stateRepName, stateRepNumber, zipCode
FROM contactmanager_state_rep;

INSERT INTO crm_statesenate
(uuid_, crmStateSenateId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), stateSenateId, '0', '0', '0', '', now(), now(), stateSenateName, stateSenateNumber, zipCode
FROM contactmanager_state_senate;

INSERT INTO crm_tag
(uuid_, crmTagId, groupId, companyId, userId, userName, createDate, modifiedDate, name)
SELECT UUID(), tagId, '0', '0', '0', '', now(), now(), tagName 
FROM contactmanager_cmaptag;

INSERT INTO crm_usrep
(uuid_, crmUsRepId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), usRepId, '0', '0', '0', '', now(), now(), usRepName, usRepNumber, zipCode
FROM contactmanager_us_rep;

INSERT INTO crm_note
(uuid_, crmNoteId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, note)
SELECT UUID(), id_, '0', '0', '0', '', createDate, modifiedDate, contactId, note
FROM contactmanager_note;

update crm_contact set companyId = 10154;