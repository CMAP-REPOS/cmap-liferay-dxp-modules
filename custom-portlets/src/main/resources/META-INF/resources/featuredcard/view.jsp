<%@ include file="/featuredcard/init.jsp" %>

<p>
	<b>featuredcard</b>
</p>

<ul>
<c:forEach var="result" items="${results}">
	<li>
	${result}
	</li>
</c:forEach>
</ul>

