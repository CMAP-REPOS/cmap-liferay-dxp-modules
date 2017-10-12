<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="featured-card-importer-portlet.caption"/></b>
</p>

<p>noPage: ${noPage}</p>
<p>yesPage: ${yesPage }</p>
<p>noUrl: ${noUrl}</p>
<p>yesUrl: ${yesUrl}</p>

<c:forEach var="page" items="${pages}">
	<li>${page}</li>
</c:forEach>

<c:forEach var="url" items="${urls}">
	<li>${url}</li>
</c:forEach>


<%-- <ol>
<c:forEach var="result" items="${results}">
	<li>
	getCardTitle: ${result.getCardTitle()}<br>
	getCaption: ${result.getCaption()}<br>
	getImageToDisplay: ${result.getImageToDisplay()}<br>
		getDocument: ${result.getDocument()}<br>
	getPage: ${result.getPage()}<br>
	getUrl: ${result.getUrl()}<br>
	
	</li>
</c:forEach>
</ol> --%>