-- copy contacts from contactmanager_cmapsubgroup to crm_group
TRUNCATE TABLE crm_group;
INSERT INTO crm_group
(crmGroupId, groupId, companyId, userId, userName, createDate, modifiedDate, name)
SELECT subGroupId, groupId, '0', '0', '', createDate, modifiedDate, subGroupName
FROM contactmanager_cmapsubgroup;