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


<%
  String keywords = ParamUtil.getString(request, "keywords");
  keywords = keywords!=null ? keywords.toLowerCase() : "";
%>

<liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcPath" 
        value="/contacts/view_search.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="viewURL">
    <portlet:param 
        name="mvcPath" 
        value="/contacts/view.jsp" 
    />
</portlet:renderURL>


<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />

<liferay-ui:header
    backURL="<%= viewURL.toString() %>"
    title="search"
/>

    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="" name="keywords" 
            size="30" title="search-entries" type="text" />

            <aui:button type="submit" value="search" />
        </span>
    </div>
</aui:form>

<%
    SearchContext searchContext = SearchContextFactory.getInstance(request);

    searchContext.setKeywords(keywords);
    searchContext.setAttribute("paginationType", "more");
    
    
    MultiMatchQuery q = new MultiMatchQuery(keywords);
	q.addFields( "firstName", "lastName", 
            "organization", "jobTitle", "primaryAddress1", "primaryAddress2", "primaryAddressCity", "primaryAddressState", "primaryAddressZip", 
            "primaryAddressCounty", "primaryAddressCountry", "primaryPhone", "primaryPhoneExtension", "primaryFax", "primaryCell", 
            "primaryEmailAddress", "groupsList", "tagsList", "modifiedDate");
	q.setAnalyzer("whitespace");
	
	BooleanQuery query = new BooleanQueryImpl();
	query.add(q, BooleanClauseOccur.MUST);

TermQueryImpl termQuery = new TermQueryImpl("entryClassName", CrmContact.class.getName());
query.add(termQuery, BooleanClauseOccur.MUST);

Hits hits = IndexSearcherHelperUtil.search(searchContext, query);

PortletURL actionURL = renderResponse.createRenderURL();

%>

<liferay-ui:search-container delta="10" iteratorURL="<%= searchURL %>"
    emptyResultsMessage="no-entries-were-found" 
    total="<%= hits.getLength() %>"  var="crmContactsSearchContainer">
     
    	       <liferay-ui:search-container-results>
					<%
					List<CrmContactViewModel> viewModels = new ArrayList<CrmContactViewModel>();

					for (int i = crmContactsSearchContainer.getStart(); i<hits.getDocs().length && i<crmContactsSearchContainer.getEnd(); i++) {
						Document doc = hits.doc(i);
						
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
							 viewModels.add(new CrmContactViewModel(entry));
						}
					}

						pageContext.setAttribute("results", viewModels);
					%>
				</liferay-ui:search-container-results>
        
        <liferay-ui:search-container-row
					className="contact.manager.app.viewmodel.CrmContactViewModel"
					modelVar="viewModel" escapedModel="<%=true%>">
					<liferay-ui:search-container-column-jsp
						path="/contacts/view_actions.jsp" name="Actions" />
        
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
						property="primaryEmailAddress" name="Email Address"
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
