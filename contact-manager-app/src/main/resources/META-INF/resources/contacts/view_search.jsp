<%@page import="com.liferay.portal.kernel.service.ServiceContextFactory"%>
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

<%
  List<Integer> crmContactsId = new ArrayList<Integer>();

  String keywords = "";
  String[] columns =  new String[1];

  String parameterAdd ="";
  
  if (!"".equals(ParamUtil.getString(request, "keywords"))){
	  keywords = ParamUtil.getString(request, "keywords");
	  columns =  new String[]{"firstName", "lastName", 
          "organization", "jobTitle", "primaryAddress1", "primaryAddress2", "primaryAddressCity", "primaryAddressZip", 
          "primaryAddressCounty", "primaryPhone", "primaryCell", 
          "primaryEmailAddress", "groupsList", "tagsList", "modifiedDate"};
  } else if ( !"".equals(ParamUtil.getString(request, "first-name"))){
	  keywords = ParamUtil.getString(request, "first-name");
	  columns = new String[]{"firstName"};
	  parameterAdd = "first-name";
  } else if ( !"".equals(ParamUtil.getString(request, "last-name"))){
	  keywords = ParamUtil.getString(request, "last-name");
	  columns = new String[]{"lastName"};
	  parameterAdd = "last-name";
  } else if ( !"".equals(ParamUtil.getString(request, "organization"))){
	  keywords = ParamUtil.getString(request, "organization");
	  columns = new String[]{"organization"};
	  parameterAdd = "organization";
  } else if (!"".equals( ParamUtil.getString(request, "job-title") )){
	  keywords = ParamUtil.getString(request, "job-title");
	  columns = new String[]{"jobTitle"};
	  parameterAdd = "job-title";
  } else if ( !"".equals(ParamUtil.getString(request, "address-1") )){
	  keywords = ParamUtil.getString(request, "address-1");
	  columns = new String[]{"primaryAddress1"};
	  parameterAdd = "address-1";
  } else if ( !"".equals(ParamUtil.getString(request, "address-2"))){
	  keywords = ParamUtil.getString(request, "address-2");
	  columns = new String[]{"primaryAddress2"};
	  parameterAdd = "address-2";
  } else if ( !"".equals(ParamUtil.getString(request, "city") )){
	  keywords = ParamUtil.getString(request, "city");
	  columns = new String[]{"primaryAddressCity"};
	  parameterAdd = "city";
  } else if ( !"".equals(ParamUtil.getString(request, "zip"))){
	  keywords = ParamUtil.getString(request, "zip");
	  columns = new String[]{"primaryAddressZip"};
	  parameterAdd = "zip";
  } else if ( !"".equals(ParamUtil.getString(request, "county") )){
	  keywords = ParamUtil.getString(request, "county");
	  columns = new String[]{"primaryAddressCounty"};
	  parameterAdd = "county";
  } else if ( !"".equals(ParamUtil.getString(request, "phone") )){
	  keywords = ParamUtil.getString(request, "phone");
	  columns = new String[]{"primaryPhone"};
	  parameterAdd = "phone";
  } else if (!"".equals( ParamUtil.getString(request, "cell") )){
	  keywords = ParamUtil.getString(request, "cell");
	  columns = new String[]{"primaryCell"};
	  parameterAdd = "cell";
  } else if (!"".equals(ParamUtil.getString(request, "email-address"))){
	  keywords = ParamUtil.getString(request, "email-address");
	  columns = new String[]{"primaryEmailAddress"};
	  parameterAdd = "email-address";
  } else if (!"".equals( ParamUtil.getString(request, "groups") )){
	  keywords = ParamUtil.getString(request, "groups");
	  columns = new String[]{"groupsList"};
	  parameterAdd = "groups";
  }  else if ( !"".equals(ParamUtil.getString(request, "tags") )){
	  keywords = ParamUtil.getString(request, "tags");
	  columns = new String[]{"tagsList"};
	  parameterAdd = "tags";
  } else if ( !"".equals(ParamUtil.getString(request, "modified"))){
	  keywords = ParamUtil.getString(request, "modified");
	  columns = new String[]{"modifiedDate"};
	  parameterAdd = "modified";
  }
  String kp2 = keywords;
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


Indexer indexer = IndexerRegistryUtil.getIndexer(CrmContact.class);
System.out.println("indexer: "+indexer);
System.out.println("param: "+ParamUtil.getString(request, "indexer"));
if (indexer != null && "unreg".equals(ParamUtil.getString(request, "indexer"))){
	IndexerRegistryUtil.unregister(indexer);
	System.out.println("go in one: ");
} else if (indexer == null && "reg".equals(ParamUtil.getString(request, "indexer"))){
	CrmContactIndexer contactIndexer = new CrmContactIndexer();
	IndexerRegistryUtil.register(contactIndexer);
	System.out.println("go in tow: ");
}

if ("initCrmContactResourcePermissions".equals(ParamUtil.getString(request, "indexer"))){
	CrmContactLocalServiceUtil.initCrmContactResourcePermissions(ServiceContextFactory.getInstance(CrmContact.class.getName(), request));
	System.out.println("go in tree: ");
}

    SearchContext searchContext = SearchContextFactory.getInstance(request);    
    
	String s = keywords.replaceAll("[^a-zA-Z0-9.]", " ");
	System.out.println("=======String s --->" + s);
	
	searchContext.setAttribute("paginationType", "more");
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
	
	List<String> valueList = new ArrayList<String>(Arrays.asList(s.split(" ")));
	BooleanQuery query = new BooleanQueryImpl();
	
	for(String value:valueList)
	{
		Query q = null;
	    if (columns.length == 1 && "primaryEmailAddress".equals(columns[0])){
	    	StringQuery qq = new StringQuery("default_field=primaryEmailAddress, query="+keywords);
	    	q = qq;
	    } else {
	    	MultiMatchQuery qq = new MultiMatchQuery(value);
	    	qq.addFields(columns);
	    	qq.setAnalyzer("whitespace");
	    	q = qq;	
	    }
	    query.add(q, BooleanClauseOccur.MUST);
	}
	
	TermQueryImpl termQuery = new TermQueryImpl("entryClassName", CrmContact.class.getName());
	query.add(termQuery, BooleanClauseOccur.MUST);
	termQuery = new TermQueryImpl("status", ConstantContactKeys.CC_STATUS_ACTIVE);
	query.add(termQuery, BooleanClauseOccur.MUST);
	
	System.out.println("=======Query --->" + query);
	
	Hits hits = IndexSearcherHelperUtil.search(searchContext, query);

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
					    CrmContact entry = CrmContactLocalServiceUtil.getCrmContact(entryId);

						if (entry != null){
							viewModels.add(new CrmContactViewModel(entry));
						}
					}
					
					for (int i = crmContactsSearchContainer.getStart(); i<hits.getDocs().length; i++) {
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
							crmContactsId.add((int)entry.getCrmContactId());
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
						name="Organization" orderable="true" orderableProperty="organization" />
					
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

<%
	StringBuilder strbul  = new StringBuilder();
	Iterator<Integer> iter = crmContactsId.iterator();
	while(iter.hasNext())
	{
	    strbul.append(iter.next());
	   if(iter.hasNext()){
	    strbul.append(",");
	   }
	}

	//System.out.println("=======Id string -> " + strbul.toString() + "=======");
%>

<portlet:resourceURL  var="exportCSVURL">
	<portlet:param name="cmd" value="exportSearchCSV"/>
	<portlet:param name="idString" value="<%= strbul.toString() %>"/>
</portlet:resourceURL>

<aui:row>
		<aui:col md="12">
			<%-- TODO: check role --%>
			<aui:button onClick="<%= exportCSVURL.toString() %>"
				value="Export to CSV"></aui:button>
		</aui:col>
</aui:row>


<script type="text/javascript">

AUI().ready(function(){
	if (<%=!"".equals(parameterAdd)%>){
		document.querySelectorAll(".lfr-pagination a").forEach(function(element){
			if (element.href.indexOf("http")>-1){
				element.href = element.href + "&_ContactManagerApp_<%=parameterAdd%>=<%=java.net.URLEncoder.encode(kp2, "UTF-8")%>";
			}
		});
		
		document.querySelectorAll(".table-sort-liner a").forEach(function(element){
			if (element.href.indexOf("http")>-1){
				element.href = element.href + "&_ContactManagerApp_<%=parameterAdd%>=<%=java.net.URLEncoder.encode(kp2, "UTF-8")%>";
			}
		});
	} 
});

var toTitleCase = function(txt) {
    return txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase();
}

AUI().ready(function(){
	/*getting the headers and removing the actions column*/
	var tableTR = document.querySelector("table tr");
	var baseTH = tableTR.querySelectorAll("th");
	var tableColumnsArray = [].slice.call(baseTH, 1);
	
	/*creating element and adding the actions column*/
	var searchRow = document.createElement('tr');
	var emptyTHElement =  document.createElement('th');
	emptyTHElement.textContent = "Search by: ";
	searchRow.appendChild(emptyTHElement);

	/*crating base searchElement*/
	var existingForm = document.querySelector("form");/*getting the existing search form*/
	var hiddenElementsinForm = existingForm.querySelectorAll("input[type='hidden']");/*getting the hidden inputs in the form*/
	var baseSearchElement = document.createElement('th');/*create TH*/
	baseSearchElement.className = "table-first-header";
	var baseInnerForm = document.createElement('form');/*create form*/
	baseInnerForm.setAttribute("action", existingForm.action);
	var fmNameSpace = existingForm.getAttribute("data-fm-namespace");
	baseInnerForm.setAttribute("data-fm-namespace", fmNameSpace);
	baseInnerForm.setAttribute("name", existingForm.name);
	var addingElements = function (element) {
		baseInnerForm.appendChild(element.cloneNode(false));
	};
	hiddenElementsinForm.forEach(addingElements);
	
	var baseInnerInput = document.createElement('input');/*creating input for search*/
	baseInnerInput.setAttribute("type", "text");
	baseInnerInput.setAttribute("name", "");
	baseInnerForm.appendChild(baseInnerInput);/*adding input to the form*/
	baseSearchElement.appendChild(baseInnerForm);/*add form in TH*/
	
	/*creating new search elements based on the existing header*/
	var arrangingColumns = function (element) {
		elementID = element.id.substring(element.id.indexOf("_col-")+5, element.id.length);/*generating an id*/
		var newSearchElement = baseSearchElement.cloneNode(true);/*cloning the TH*/
		var newElement = newSearchElement.querySelector("input[type='text']");
		newElement.name = fmNameSpace + elementID;
		newElement.setAttribute("placeholder", elementID.replace("-", " ").replace(/\w\S*/g, toTitleCase));
		searchRow.appendChild(newSearchElement);
	};
	
	tableColumnsArray.forEach(arrangingColumns);
	
	tableTR.parentNode.insertBefore(searchRow, tableTR.nextSibling);
	
	if (<%=!"".equals(parameterAdd)%>){
		document.querySelector("form [name=_ContactManagerApp_<%=parameterAdd%>]").value = "<%=kp2%>";		
	}
});

</script>