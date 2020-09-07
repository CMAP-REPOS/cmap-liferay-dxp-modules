-- copy contacts from contactmanager_county to crm_county
TRUNCATE TABLE crm_county;
INSERT INTO crm_county
(uuid_, crmCountyId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), countyId, '0', '0', '0', '', now(), now(), countyName, zipCode 
FROM contactmanager_county;
