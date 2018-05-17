create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5887225A on crm_cca (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_248775C on crm_cca (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A02B9679 on crm_chiward (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CE69673B on crm_chiward (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_35C31979 on crm_contact (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DA05AA3B on crm_contact (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E0EE0182 on crm_contactauditlog (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D1AD0084 on crm_contactauditlog (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_312A4732 on crm_contactauditlogchange (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_969EF234 on crm_contactauditlogchange (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_86BE2385 on crm_county (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F613C747 on crm_county (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E6A8A9DD on crm_countycommissioner (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_771C039F on crm_countycommissioner (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5995A412 on crm_kioskcontact (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_21FC0714 on crm_kioskcontact (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EFFC8FDC on crm_kiosksurvey (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A3DF5D5E on crm_kiosksurvey (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E326EA32 on crm_lta (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D5685534 on crm_lta (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BD53695E on crm_muni (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1CC2AF60 on crm_muni (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F0E9EA6D on crm_note (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8ED4282F on crm_note (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_55AFA98 on crm_outreachlog (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7E11471A on crm_outreachlog (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_76230F67 on crm_staterep (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_202643A9 on crm_staterep (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_920078E0 on crm_statesenate (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C911B762 on crm_statesenate (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_845C9B73 on crm_tag (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DB2B62B5 on crm_tag (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9E16A8D8 on crm_usrep (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E263855A on crm_usrep (uuid_[$COLUMN_LENGTH:75$], groupId);