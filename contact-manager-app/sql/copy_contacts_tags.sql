-- copy contacts from contactmanager_contacts_tags to crm_contacts_tags
TRUNCATE TABLE crm_contacts_tags;
INSERT INTO crm_contacts_tags
(companyId, crmContactId, crmTagId)  
SELECT '0' ,contactId, tagId
FROM contactmanager_contacts_tags;