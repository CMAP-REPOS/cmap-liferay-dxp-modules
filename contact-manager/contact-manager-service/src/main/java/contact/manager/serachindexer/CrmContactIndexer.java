package contact.manager.serachindexer;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelperUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalServiceUtil;

@Component(immediate = true, service = Indexer.class)
public class CrmContactIndexer extends BaseIndexer<CrmContact> {

    public static final String CLASS_NAME = CrmContact.class.getName();
    public static String [] sortableElements = new String[]{"firstName","lastName","organization","jobTitle","primaryAddress1","primaryAddress2","primaryAddressCity","primaryAddressZip","primaryAddressCountry","primaryPhone"
    		,"primaryCell","primaryEmailAddress","modifiedDate"};
    
    
    public CrmContactIndexer() {

        setDefaultSelectedFieldNames(
            Field.COMPANY_ID, Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
            Field.UID, Field.SCOPE_GROUP_ID, Field.GROUP_ID);
        setDefaultSelectedLocalizedFieldNames("crmContactId", "companyId", "userId", "userName", "createDate", "modifiedDate", "prefix", "salutation", "firstName", "middleName", "lastName", 
                "organization", "jobTitle", "primaryAddress1", "primaryAddress2", "primaryAddressCity", "primaryAddressState", "primaryAddressZip", 
                "primaryAddressCounty", "primaryAddressCountry", "secondaryAddress1", "secondaryAddress2", "secondaryAddressCity", "secondaryAddressState", 
                "secondaryAddressZip", "secondaryAddressCounty", "secondaryAddressCountry", "primaryPhone", "primaryPhoneExtension", "primaryFax", "primaryCell", 
                "primaryEmailAddress", "alternateContact", "alternateEmail", "isVip", "facebookId", "twitterHandle", "linkedInUrl", "status", "kioskUuid", "tagsList", "groupsList");
        
        setFilterSearch(true);
        setPermissionAware(true);
    }

    @Override
    public String getClassName() {
    	
        return CLASS_NAME;
    }

    @Override
    public boolean hasPermission(
        PermissionChecker permissionChecker, String CrmContactClassName,
        long CrmContactClassPK, String actionId)
        throws Exception {

        return true;
    }

    @Override
    public void postProcessContextBooleanFilter(
        BooleanFilter contextBooleanFilter, SearchContext searchContext)
        throws Exception {

        addStatus(contextBooleanFilter, searchContext);
    }

    @Override
    public void postProcessSearchQuery(BooleanQuery searchQuery, BooleanFilter fullQueryBooleanFilter, SearchContext searchContext) throws Exception {

    	addSearchLocalizedTerm(searchQuery, searchContext, "crmContactId", false);
    	addSearchLocalizedTerm(searchQuery, searchContext, "companyId", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "userId", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "userName", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "createDate", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "modifiedDate", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "prefix", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "salutation", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "firstName", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "middleName", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "lastName",  false);
    	addSearchLocalizedTerm(searchQuery, searchContext, "organization", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "jobTitle", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddress1", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddress2", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddressCity", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddressState", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddressZip", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddressCounty", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryAddressCountry", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddress1", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddress2", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddressCity", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddressState", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddressZip", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddressCounty", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "secondaryAddressCountry", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryPhone", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryPhoneExtension", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryFax", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryCell", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "primaryEmailAddress", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "alternateContact", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "alternateEmail", false); 
//    	addSearchLocalizedTerm(searchQuery, searchContext, "isVip", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "facebookId", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "twitterHandle", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "linkedInUrl", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "status", false);
    	addSearchLocalizedTerm(searchQuery, searchContext, "kioskUuid", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "tagsList", false); 
    	addSearchLocalizedTerm(searchQuery, searchContext, "groupsList", false); 

    }

    @Override
    protected void doDelete(CrmContact CrmContact)
        throws Exception {

        deleteDocument(CrmContact.getCompanyId(), CrmContact.getCrmContactId());
    }

    @Override
    protected Document doGetDocument(CrmContact CrmContact)
        throws Exception {

    	//"firstName","lastName","organization","jobTitle","primaryAddress1","primaryAddress2","primaryAddressCity","primaryAddressZip","primaryAddressCountry","primaryPhone"
		//,"primaryCell","primaryEmailAddress","modifiedDate"
    	
        Document document = getBaseModelDocument(CLASS_NAME, CrmContact);
        document.setSortableTextFields(sortableElements);
        
        document.addNumber("crmContactId", CrmContact.getCrmContactId());
        document.addNumber("companyId", CrmContact.getCompanyId()); 
    	document.addNumber("userId", CrmContact.getUserId()); 
    	document.addText("userName", CrmContact.getUserName()); 
    	document.addDate("createDate", CrmContact.getCreateDate()); 
    	document.addDateSortable("modifiedDate", CrmContact.getModifiedDate()); 
    	document.addText("prefix", CrmContact.getPrefix()); 
    	document.addText("salutation", CrmContact.getSalutation()); 
    	document.addTextSortable("firstName", CrmContact.getFirstName()); 
    	document.addText("middleName", CrmContact.getMiddleName()); 
    	document.addTextSortable("lastName", CrmContact.getLastName());
    	document.addTextSortable("organization", CrmContact.getOrganization()); 
    	document.addTextSortable("jobTitle", CrmContact.getJobTitle()); 
    	document.addTextSortable("primaryAddress1", CrmContact.getPrimaryAddress1()); 
    	document.addTextSortable("primaryAddress2", CrmContact.getPrimaryAddress2()); 
    	document.addTextSortable("primaryAddressCity", CrmContact.getPrimaryAddressCity()); 
    	document.addText("primaryAddressState", CrmContact.getPrimaryAddressState()); 
    	document.addTextSortable("primaryAddressZip", CrmContact.getPrimaryAddressZip()); 
    	document.addTextSortable("primaryAddressCounty", CrmContact.getPrimaryAddressCounty()); 
    	document.addText("primaryAddressCountry", CrmContact.getPrimaryAddressCountry()); 
    	document.addText("secondaryAddress1", CrmContact.getSecondaryAddress1()); 
    	document.addText("secondaryAddress2", CrmContact.getSecondaryAddress2()); 
    	document.addText("secondaryAddressCity", CrmContact.getSecondaryAddressCity()); 
    	document.addText("secondaryAddressState", CrmContact.getSecondaryAddressState()); 
    	document.addText("secondaryAddressZip", CrmContact.getSecondaryAddressZip()); 
    	document.addText("secondaryAddressCounty", CrmContact.getSecondaryAddressCounty()); 
    	document.addText("secondaryAddressCountry", CrmContact.getSecondaryAddressCountry()); 
    	document.addTextSortable("primaryPhone", CrmContact.getPrimaryPhone()); 
    	document.addText("primaryPhoneExtension", CrmContact.getPrimaryPhoneExtension()); 
    	document.addText("primaryFax", CrmContact.getPrimaryFax()); 
    	document.addTextSortable("primaryCell", CrmContact.getPrimaryCell()); 
    	document.addTextSortable("primaryEmailAddress", CrmContact.getPrimaryEmailAddress()); 
    	document.addText("alternateContact", CrmContact.getAlternateContact()); 
    	document.addText("alternateEmail", CrmContact.getAlternateEmail()); 
//    	document.addText("isVip", Boolean.toString(CrmContact.getIsVip())); 
    	document.addText("facebookId", CrmContact.getFacebookId()); 
    	document.addText("twitterHandle", CrmContact.getTwitterHandle()); 
    	document.addText("linkedInUrl", CrmContact.getLinkedInUrl());
    	document.addText("status", CrmContact.getStatus());
    	document.addText("kioskUuid", CrmContact.getKioskUuid()); 
    	document.addText("tagsList", CrmContact.getTagsList()); 
    	document.addText("groupsList", CrmContact.getGroupsList()); 
    	
        return document;
    }
    
    @Override
    protected Summary doGetSummary(
        Document document, Locale locale, String snippet,
        PortletRequest portletRequest, PortletResponse portletResponse)
        throws Exception {

        Summary summary = createSummary(document);

        summary.setMaxContentLength(200);

        return summary;
    }

    @Override
    protected void doReindex(CrmContact entry)
        throws Exception {

    	Document document = getDocument(entry);
    	
    	IndexWriterHelperUtil.updateDocument(
            getSearchEngineId(), entry.getCompanyId(), document,
            isCommitImmediately());
    }

    @Override
    protected void doReindex(String className, long classPK)
        throws Exception {

        CrmContact entry = _entryLocalService.getCrmContact(classPK);
        doReindex(entry);
    }

    @Override
    protected void doReindex(String[] ids)
        throws Exception {

        long companyId = GetterUtil.getLong(ids[0]);
        reindexEntries(companyId);
    }

    protected void reindexEntries(long companyId)
        throws PortalException {
    	
        final IndexableActionableDynamicQuery indexableActionableDynamicQuery =
            _entryLocalService.getIndexableActionableDynamicQuery();
        indexableActionableDynamicQuery.setCompanyId(companyId);
        indexableActionableDynamicQuery.setPerformActionMethod(
            new ActionableDynamicQuery.PerformActionMethod<CrmContact>() {
            	
                @Override
                public void performAction(CrmContact entry) {
                    try {
                        Document document = getDocument(entry);
                        indexableActionableDynamicQuery.addDocuments(document);
                    }
                    catch (PortalException pe) {
                        if (_log.isWarnEnabled()) {
                            _log.warn(
                                "Unable to index entry " + entry.getCrmContactId(),
                                pe);
                        }
                    }
                }
            });
        indexableActionableDynamicQuery.setSearchEngineId(getSearchEngineId());
        indexableActionableDynamicQuery.performActions();
        
        System.out.println("Reindex Completed for CRM");
    }

    private static final Log _log = LogFactoryUtil.getLog(CrmContactIndexer.class);

    @Reference
    private CrmContactLocalServiceUtil _entryLocalService;


}