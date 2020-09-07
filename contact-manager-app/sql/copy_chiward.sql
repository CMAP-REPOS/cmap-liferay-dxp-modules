-- copy contacts from contactmanager_chi_ward to crm_chiward
TRUNCATE TABLE crm_chiward;
INSERT INTO crm_chiward
  (uuid_, crmChiWardId, groupId, companyId, userId, userName, createDate, modifiedDate, name, zipCode)
SELECT UUID(), chiWardId, '0', '0', '0', '', now(), now(), chiWardName, zipCode
FROM contactmanager_chi_ward;
