<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="featured-card-importer-portlet.caption"/></b>
</p>

<p>Created ${resultsCount } Featured Cards</p>

<c:forEach var="result" items="${results}">
${result}<br/>
</c:forEach>
