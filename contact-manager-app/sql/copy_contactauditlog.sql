-- copy contacts from contactmanager_contactauditlog to crm_contactauditlog
TRUNCATE TABLE crm_contactauditlog;
INSERT INTO crm_contactauditlog
(uuid_, crmContactAuditLogId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, constantContactId, action, oldSnapshot, newSnapshot)
SELECT UUID(), contactAuditLogId, groupId, companyId, userId, '', createDate, now(), contactId, constantContactId, action, oldSnapshot, newSnapshot
FROM contactmanager_contactauditlog;