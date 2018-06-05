-- copy contacts from contactmanager_lta to crm_lta
TRUNCATE TABLE crm_lta;
INSERT INTO crm_lta
(uuid_, crmLTAId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), ltaId, '0', '0', '0', '', now(), now(), ltaName, zipCode
FROM contactmanager_lta;
