-- copy contacts from contactmanager_county_commissioner_or_board_dist to crm_countycommissioner
TRUNCATE TABLE crm_countycommissioner;
INSERT INTO crm_countycommissioner
(uuid_, crmCountyCommissionerOrBoardDistId, groupId, companyId, userId, userName, createDate, modifiedDate, name, number_, zipCode)
SELECT UUID(), ccbdId, '0', '0', '0', '', now(), now(), ccbdName, ccbdNumber, zipCode 
FROM contactmanager_county_commissioner_or_board_dist;