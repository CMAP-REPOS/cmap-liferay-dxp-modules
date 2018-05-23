-- copy contacts from contactmanager_kioskcontact to crm_kioskcontact
TRUNCATE TABLE crm_kioskcontact;
--INSERT INTO crm_kioskcontact
--(uuid_, crmKioskContactId, groupId, companyId, userId, userName, createDate, modifiedDate)
--SELECT uuid_, id_, '0', '0', '0', '', now(), now()
--FROM contactmanager_kioskcontact;

--# id_, uuid_, email, zipCode, deviceName, added, ignored, imported, ignored_date, imported_date