-- copy contacts from contactmanager_contactauditlogchange to crm_contactauditlogchange
TRUNCATE TABLE crm_contactauditlogchange;
INSERT INTO crm_contactauditlogchange
(uuid_, crmContactAuditLogChangeId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactAuditLogId, fieldName, oldValue, newValue)
SELECT UUID(), contactAuditLogChangeId, '0', '0', '0', '', now(), now(), contactAuditLogId, fieldName, oldValue, newValue
FROM contactmanager_contactauditlogchange;

