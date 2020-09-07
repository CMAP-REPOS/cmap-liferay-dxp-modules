-- copy contacts from contactmanager_cca to crm_cca
TRUNCATE TABLE crm_cca;
INSERT INTO crm_cca
  ( uuid_, crmCCAId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), ccaId, '0', '0', '0', '', now(), now(), ccaName, zipCode
FROM contactmanager_cca;