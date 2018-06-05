-- copy contacts from contactmanager_cmaptag to crm_tag
TRUNCATE TABLE crm_tag;
INSERT INTO crm_tag
(uuid_, crmTagId, groupId, companyId, userId, userName, createDate, modifiedDate, name)
SELECT UUID(), tagId, '0', '0', '0', '', now(), now(), tagName 
FROM contactmanager_cmaptag;