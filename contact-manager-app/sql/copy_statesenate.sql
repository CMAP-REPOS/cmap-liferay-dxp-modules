-- copy contacts from contactmanager_state_senate to crm_statesenate
TRUNCATE TABLE crm_statesenate;
INSERT INTO crm_statesenate
(uuid_, crmStateSenateId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), stateSenateId, '0', '0', '0', '', now(), now(), stateSenateName, stateSenateNumber, zipCode
FROM contactmanager_state_senate;
