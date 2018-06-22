<%@ include file="../init.jsp"%>
<%@ include file="init.jsp"%>

<%
	long crmContactAuditLogId = ParamUtil.getLong(request, "auditLogId");
	CrmContactAuditLog crmContactAuditLog = null;

	if (crmContactAuditLogId > 0) {
		crmContactAuditLog = CrmContactAuditLogLocalServiceUtil.getCrmContactAuditLog(crmContactAuditLogId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle("Audit Log Details");
%>

<%=crmContactAuditLog.getCreateDate() %>