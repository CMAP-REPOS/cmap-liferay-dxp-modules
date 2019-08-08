<%@ include file="../init.jsp"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.search.Indexer" %>
<%@ page import="com.liferay.portal.kernel.search.IndexerRegistryUtil" %>
<%@ page import="com.liferay.portal.kernel.search.SearchContext" %>
<%@ page import="com.liferay.portal.kernel.search.SearchContextFactory" %>
<%@ page import="com.liferay.portal.kernel.search.IndexSearcherHelperUtil" %>
<%@ page import="com.liferay.portal.kernel.search.Hits" %>
<%@ page import="com.liferay.portal.kernel.search.Document" %>
<%@ page import="com.liferay.portal.kernel.search.Field" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.search.generic.*" %>
<%@ page import="com.liferay.portal.kernel.search.*" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="contact.manager.serachindexer.CrmContactIndexer" %>
<%@ page import="contact.manager.app.viewmodel.CrmContactViewModelModifiedDateComparator" %>

<%

String[] columns =  new String[1];

String parameterAdd ="";


if ( !"".equals(ParamUtil.getString(request, "first-name"))){
	  columns = new String[]{"firstName"};
	  parameterAdd = "first-name";
} else if ( !"".equals(ParamUtil.getString(request, "last-name"))){
	  columns = new String[]{"lastName"};
	  parameterAdd = "last-name";
} else if ( !"".equals(ParamUtil.getString(request, "organization"))){
	  columns = new String[]{"organization"};
	  parameterAdd = "organization";
} else if (!"".equals( ParamUtil.getString(request, "job-title") )){
	  columns = new String[]{"jobTitle"};
	  parameterAdd = "job-title";
} else if ( !"".equals(ParamUtil.getString(request, "address-1") )){
	  columns = new String[]{"primaryAddress1"};
	  parameterAdd = "address-1";
} else if ( !"".equals(ParamUtil.getString(request, "address-2"))){
	  columns = new String[]{"primaryAddress2"};
	  parameterAdd = "address-2";
} else if ( !"".equals(ParamUtil.getString(request, "city") )){
	  columns = new String[]{"primaryAddressCity"};
	  parameterAdd = "city";
} else if ( !"".equals(ParamUtil.getString(request, "zip"))){
	  columns = new String[]{"primaryAddressZip"};
	  parameterAdd = "zip";
} else if ( !"".equals(ParamUtil.getString(request, "county") )){
	  columns = new String[]{"primaryAddressCounty"};
	  parameterAdd = "county";
} else if ( !"".equals(ParamUtil.getString(request, "phone") )){
	  columns = new String[]{"primaryPhone"};
	  parameterAdd = "phone";
} else if (!"".equals( ParamUtil.getString(request, "cell") )){
	  columns = new String[]{"primaryCell"};
	  parameterAdd = "cell";
} else if (!"".equals(ParamUtil.getString(request, "email-address"))){
	  columns = new String[]{"primaryEmailAddress"};
	  parameterAdd = "email-address";
} else if (!"".equals( ParamUtil.getString(request, "groups") )){
	  columns = new String[]{"groupsList"};
	  parameterAdd = "groups";
}  else if ( !"".equals(ParamUtil.getString(request, "tags") )){
	  columns = new String[]{"tagsList"};
	  parameterAdd = "tags";
} else if ( !"".equals(ParamUtil.getString(request, "modified"))){
	  columns = new String[]{"modifiedDate"};
	  parameterAdd = "modified";
}

	SearchContext searchContext = SearchContextFactory.getInstance(request);
	
	String orderByCol = ParamUtil.getString(request, "orderByCol");
    String orderByType = ParamUtil.getString(request, "orderByType");
    if (!"".equals(orderByCol) && !"".equals(orderByType)){
    	try{
    		 Sort[] sorts = { SortFactoryUtil.getSort(CrmContact.class, orderByCol+"_String_sortable", orderByType) };
    		 searchContext.setSorts(sorts);
    	 } catch(Exception e){
    		 e.printStackTrace();
    	 }
    }
	
	BooleanQuery query = new BooleanQueryImpl();
	TermQueryImpl termQuery = new TermQueryImpl("entryClassName", CrmContact.class.getName());
	query.add(termQuery, BooleanClauseOccur.MUST);
	termQuery = new TermQueryImpl("status", ConstantContactKeys.CC_STATUS_REMOVED);
	query.add(termQuery, BooleanClauseOccur.MUST);
	
	Hits hits = IndexSearcherHelperUtil.search(searchContext, query);
	List<Document> docList = hits.toList();
	
	//OrderByComparator orderByComparator = new CrmContactViewModelModifiedDateComparator(false);
	Collections.reverse(docList);
	
	List<CrmContactViewModel> viewModelsOrdered = new ArrayList<CrmContactViewModel>();

	for (int i = 0; i<docList.size(); i++) {
		Document doc = docList.get(i);
		
	    long entryId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));
	    CrmContact entry = null;
	    try {
	    	entry = CrmContactLocalServiceUtil.getCrmContact(entryId);
	    } catch (PortalException pe) {
	    	pe.printStackTrace();
	    } catch (SystemException se) {
	    	se.printStackTrace();
	    }
		if (entry != null){
			 viewModelsOrdered.add(new CrmContactViewModel(entry));
		}
	}
	
	OrderByComparator orderByComparator = new CrmContactViewModelModifiedDateComparator(false);
	
	Collections.sort(viewModelsOrdered, orderByComparator);
%>

<portlet:actionURL name="deleteContact" var="deleteContactURL">
	<portlet:param name="crmContactId" value="XXXXX" />
</portlet:actionURL>

<div class="container-fluid">


	
	<aui:row>
		<aui:col md="12">
			<liferay-ui:search-container delta="20" deltaConfigurable="true"
				emptyResultsMessage="No contacts found"
				total="<%=hits.getLength()%>"
				var="crmContactsSearchContainer">

				<liferay-ui:search-container-results>
				<%
					List<CrmContactViewModel> viewModels = new ArrayList<CrmContactViewModel>();
					

					for (int i = crmContactsSearchContainer.getStart(); i<viewModelsOrdered.size() && i<crmContactsSearchContainer.getEnd(); i++) {
						viewModels.add(viewModelsOrdered.get(i));
					}
					
					
					//OrderByComparator orderByComparator = new CrmContactViewModelModifiedDateComparator(false);
					
					//Collections.sort(viewModels, orderByComparator);

					pageContext.setAttribute("results", viewModels);
				%>
				</liferay-ui:search-container-results>
				
				<liferay-ui:search-container-row
					className="contact.manager.app.viewmodel.CrmContactViewModel"
					modelVar="viewModel">
					<%
						String mailtoPrimaryEmailBin = "mailto:" + viewModel.getPrimaryEmailAddress();
					%>
					<liferay-ui:search-container-column-button name="Delete" href="<%="window.location.href='"+deleteContactURL.toString().replaceAll("XXXXX", Long.toString(viewModel.getCrmContactId()))+"'"%>"/> 
					
					<liferay-ui:search-container-column-text property="firstName"
						name="First Name" orderable="true" orderableProperty="firstName" />
					<liferay-ui:search-container-column-text property="lastName"
						name="Last Name" orderable="true" orderableProperty="lastName" />
					<liferay-ui:search-container-column-text property="organization"
						name="Organization" orderable="true"
						orderableProperty="organization" />
					<liferay-ui:search-container-column-text property="jobTitle"
						name="Job Title" orderable="true" orderableProperty="jobTitle" />
					<liferay-ui:search-container-column-text property="primaryAddress1"
						name="Address 1" orderable="true"
						orderableProperty="primaryAddress1" />
					<liferay-ui:search-container-column-text property="primaryAddress2"
						name="Address 2" orderable="true"
						orderableProperty="primaryAddress2" />
					<liferay-ui:search-container-column-text
						property="primaryAddressCity" name="City" orderable="true"
						orderableProperty="primaryAddressCity" />
					<liferay-ui:search-container-column-text
						property="primaryAddressZip" name="ZIP" orderable="true"
						orderableProperty="primaryAddressZip" />
					<liferay-ui:search-container-column-text
						property="primaryAddressCounty" name="County" orderable="true"
						orderableProperty="primaryAddressCounty" />
					<liferay-ui:search-container-column-text property="primaryPhone"
						name="Phone" orderable="true" orderableProperty="primaryPhone" />
					<liferay-ui:search-container-column-text property="primaryCell"
						name="Cell" orderable="true" orderableProperty="primaryCell" />
					<liferay-ui:search-container-column-text
						property="primaryEmailAddress" href="<%=mailtoPrimaryEmailBin%>" name="Email Address"
						orderable="true" orderableProperty="primaryEmailAddress" />
					<liferay-ui:search-container-column-text property="groupsList"
						name="Groups" />
					<liferay-ui:search-container-column-text property="tagsList"
						name="Tags" />
					<liferay-ui:search-container-column-text property="modifiedDate"
						name="Modified" orderable="true" orderableProperty="modifiedDate" />
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>

</div>
