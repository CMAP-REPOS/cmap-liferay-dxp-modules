<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="featured-card-importer-portlet.caption"/></b>
</p>

<ol>
<c:forEach var="result" items="${results}">
	<li>${result}</li>
</c:forEach>
</ol>