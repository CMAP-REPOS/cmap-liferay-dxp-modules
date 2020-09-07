-- copy contacts from contactmanager_muni to crm_muni
TRUNCATE TABLE crm_muni;
INSERT INTO crm_muni
(uuid_, crmMuniId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), muniId, '0', '0', '0', '', now(), now(), muniName, zipCode
FROM contactmanager_muni;