create index IX_5887225A on crm_cca (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_248775C on crm_cca (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_7CB97138 on crm_cca (zipCode[$COLUMN_LENGTH:75$]);

create index IX_A02B9679 on crm_chiward (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CE69673B on crm_chiward (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_1D5F0E39 on crm_chiward (zipCode[$COLUMN_LENGTH:75$]);

create index IX_98423322 on crm_contact (constantContactId);
create index IX_F1BBF5F5 on crm_contact (firstName[$COLUMN_LENGTH:500$], middleName[$COLUMN_LENGTH:500$], lastName[$COLUMN_LENGTH:500$], status[$COLUMN_LENGTH:75$]);
create index IX_8C31621E on crm_contact (isVip);
create index IX_55D6EBCB on crm_contact (primaryEmailAddress[$COLUMN_LENGTH:500$], status[$COLUMN_LENGTH:75$]);
create index IX_511088AB on crm_contact (status[$COLUMN_LENGTH:75$]);
create index IX_35C31979 on crm_contact (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DA05AA3B on crm_contact (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_52744C39 on crm_contactauditlog (constantContactId);
create index IX_AE748A5F on crm_contactauditlog (crmContactId);
create index IX_E0EE0182 on crm_contactauditlog (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D1AD0084 on crm_contactauditlog (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_AC675B18 on crm_contactauditlogchange (crmContactAuditLogId);
create index IX_312A4732 on crm_contactauditlogchange (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_969EF234 on crm_contactauditlogchange (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B260C23 on crm_contacts_groups (companyId);
create index IX_6F74C715 on crm_contacts_groups (crmGroupId);

create index IX_115C7B3E on crm_contacts_tags (companyId);
create index IX_909D5275 on crm_contacts_tags (crmTagId);

create index IX_86BE2385 on crm_county (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F613C747 on crm_county (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_72363AD on crm_county (zipCode[$COLUMN_LENGTH:75$]);

create index IX_E6A8A9DD on crm_countycommissioner (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_771C039F on crm_countycommissioner (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_7B0FDA55 on crm_countycommissioner (zipCode[$COLUMN_LENGTH:75$]);

create index IX_303BA5E3 on crm_group (name[$COLUMN_LENGTH:500$]);
create index IX_F0E29C0A on crm_group (status[$COLUMN_LENGTH:75$]);
create index IX_F137C218 on crm_group (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A179EE9A on crm_group (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E326EA32 on crm_lta (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D5685534 on crm_lta (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_4438F660 on crm_lta (zipCode[$COLUMN_LENGTH:75$]);

create index IX_BD53695E on crm_muni (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1CC2AF60 on crm_muni (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_E9A475B4 on crm_muni (zipCode[$COLUMN_LENGTH:75$]);

create index IX_8407A0CA on crm_note (crmContactId);
create index IX_F0E9EA6D on crm_note (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8ED4282F on crm_note (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4B457E75 on crm_outreachlog (crmContactId);
create index IX_55AFA98 on crm_outreachlog (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7E11471A on crm_outreachlog (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_76230F67 on crm_staterep (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_202643A9 on crm_staterep (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_5025318B on crm_staterep (zipCode[$COLUMN_LENGTH:75$]);

create index IX_920078E0 on crm_statesenate (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C911B762 on crm_statesenate (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_42198BF2 on crm_statesenate (zipCode[$COLUMN_LENGTH:75$]);

create index IX_845C9B73 on crm_tag (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DB2B62B5 on crm_tag (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9E16A8D8 on crm_usrep (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E263855A on crm_usrep (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_F56704FA on crm_usrep (zipCode[$COLUMN_LENGTH:75$]);