create index IX_632147C9 on contactmanager_CCA (zipCode[$COLUMN_LENGTH:75$]);

create index IX_E78E39CF on contactmanager_Chi_Ward (zipCode[$COLUMN_LENGTH:75$]);

create index IX_1A1A0A40 on contactmanager_CmapGroup (groupName[$COLUMN_LENGTH:75$]);

create index IX_C1B5C8EE on contactmanager_CmapSubGroup (subGroupName[$COLUMN_LENGTH:75$]);

create index IX_73CF33F3 on contactmanager_Contact (constantContactId);
create index IX_EF24546F on contactmanager_Contact (isVip);
create index IX_73D9DB5C on contactmanager_Contact (primaryEmailAddress[$COLUMN_LENGTH:75$], status[$COLUMN_LENGTH:75$]);
create index IX_4C7BE07A on contactmanager_Contact (status[$COLUMN_LENGTH:75$]);

create index IX_B2B1800A on contactmanager_ContactAuditLog (constantContactId);
create index IX_AA0CBB4E on contactmanager_ContactAuditLog (contactId);

create index IX_E19FB6C7 on contactmanager_ContactAuditLogChange (contactAuditLogId);

create index IX_5AFB4221 on contactmanager_Contacts_CmapSubGroups (companyId);
create index IX_7BB8A044 on contactmanager_Contacts_CmapSubGroups (contactId);
create index IX_D4E6E2B5 on contactmanager_Contacts_CmapSubGroups (subGroupId);

create index IX_25E9BC2F on contactmanager_Contacts_Tags (companyId);
create index IX_46A71A52 on contactmanager_Contacts_Tags (contactId);
create index IX_3057734C on contactmanager_Contacts_Tags (tagId);

create index IX_28EBB7C on contactmanager_County (zipCode[$COLUMN_LENGTH:75$]);

create index IX_47EEE8C1 on contactmanager_County_Commissioner_or_Board_Dist (zipCode[$COLUMN_LENGTH:75$]);

create index IX_2AA0CCF1 on contactmanager_LTA (zipCode[$COLUMN_LENGTH:75$]);

create index IX_DC517543 on contactmanager_Muni (zipCode[$COLUMN_LENGTH:75$]);

create index IX_D608F7C1 on contactmanager_Note (contactId);

create index IX_1609EF98 on contactmanager_OutreachLog (contactId);

create index IX_7AF9DDBB on contactmanager_State_Rep (zipCode[$COLUMN_LENGTH:75$]);

create index IX_850B31C2 on contactmanager_State_Senate (zipCode[$COLUMN_LENGTH:75$]);

create index IX_5682B24A on contactmanager_US_Rep (zipCode[$COLUMN_LENGTH:75$]);