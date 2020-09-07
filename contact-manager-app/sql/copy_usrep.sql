-- copy contacts from contactmanager_us_rep to crm_usrep
TRUNCATE TABLE crm_usrep;
INSERT INTO crm_usrep
(uuid_, crmUsRepId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), usRepId, '0', '0', '0', '', now(), now(), usRepName, usRepNumber, zipCode
FROM contactmanager_us_rep;