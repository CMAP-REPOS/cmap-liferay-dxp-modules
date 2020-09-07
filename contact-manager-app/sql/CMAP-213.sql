ALTER TABLE crm_group ADD COLUMN `status` TEXT NULL DEFAULT NULL AFTER `crmContactsCount`;

update crm_group set status='ACTIVE';