-- copy contacts from contactmanager_contacts_cmapsubgroups to crm_contacts_group
TRUNCATE TABLE crm_contacts_group;
--INSERT INTO crm_contacts_group
--(companyId, crmContactId, crmGroupId)  
--SELECT  ,contactId, subGroupId
--FROM contactmanager_contacts_cmapsubgropus;