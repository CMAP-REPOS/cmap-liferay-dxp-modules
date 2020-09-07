-- copy contacts from contactmanager_state_rep to crm_staterep
TRUNCATE TABLE crm_staterep;
INSERT INTO crm_staterep
(uuid_, crmStateRepId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), stateRepId, '0', '0', '0', '', now(), now(), stateRepName, stateRepNumber, zipCode
FROM contactmanager_state_rep;