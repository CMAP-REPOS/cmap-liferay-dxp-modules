-- copy contacts from contactmanager_contacts_cmapsubgroups to crm_contacts_group
TRUNCATE TABLE crm_contacts_groups;
INSERT INTO crm_contacts_groups
(companyId, crmContactId, crmGroupId)  
SELECT  '0' ,contactId, subGroupId
FROM contactmanager_contacts_cmapsubgroups;