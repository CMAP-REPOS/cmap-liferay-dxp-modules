<%@ include file="/init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	CrmContact crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
%>

<%=crmContact.getFirstName()%>