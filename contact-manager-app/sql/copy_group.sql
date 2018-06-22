-- copy contacts from contactmanager_cmapsubgroup to crm_group
TRUNCATE TABLE crm_group;
INSERT INTO crm_group
(uuid_, crmGroupId, groupId, companyId, userId, userName, createDate, modifiedDate, name, crmContactsCount)
SELECT UUID(), subGroupId, groupId, '0', '0', '', createDate, modifiedDate, subGroupName , '0'
FROM contactmanager_cmapsubgroup;

-- In case if safe updates are on, the update query below will fail becasue this update is without a where clause so you
-- may want to turn off your safe updates by running 
-- SET SQL_SAFE_UPDATES = 0;
-- and then run the query.
update crm_group c
inner join (SELECT crmGroupId, count(crmContactId) as count FROM lportal2.crm_contacts_groups group by crmGroupId) t 
on c.crmGroupId = t.crmGroupId
set c.crmContactsCount = t.count;