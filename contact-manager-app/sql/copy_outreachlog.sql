-- copy contacts from contactmanager_outreachlog to crm_outreachlog
TRUNCATE TABLE crm_outreachlog;
INSERT INTO crm_outreachlog
(uuid_, crmOutreachLogId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, note, medium, activityType, outreachDate)
SELECT UUID(), id_, '0', '0', userId, '', createDate, modifiedDate, contactId, note, medium, activityType, outreachDate
FROM contactmanager_outreachlog;
