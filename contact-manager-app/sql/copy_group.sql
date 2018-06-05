-- copy contacts from contactmanager_cmapsubgroup to crm_group
TRUNCATE TABLE crm_group;
INSERT INTO crm_group
(uuid_, crmGroupId, groupId, companyId, userId, userName, createDate, modifiedDate, name)
SELECT UUID(), subGroupId, groupId, '0', '0', '', createDate, modifiedDate, subGroupName
FROM contactmanager_cmapsubgroup;