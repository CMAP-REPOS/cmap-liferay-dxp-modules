-- copy contacts from contactmanager_kiosksurvey to crm_kiosksurvey
TRUNCATE TABLE crm_kiosksurvey;
--INSERT INTO crm_kiosksurvey
--(uuid_, crmKioskSurveyId, groupId, companyId, userId, userName, createDate, modifiedDate)
--SELECT UUID(), kioskSurveyId, '0', '0', '0', '', createDate, modifiedDate
--FROM contactmanager_kiosksurvey;