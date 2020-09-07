-- copy contacts from contactmanager_note to crm_note
TRUNCATE TABLE crm_note;
INSERT INTO crm_note
(uuid_, crmNoteId, groupId, companyId, userId, userName, createDate, modifiedDate, crmContactId, note)
SELECT UUID(), id_, '0', '0', '0', '', createDate, modifiedDate, contactId, note
FROM contactmanager_note;
