<%@ include file="/taxonomy/init.jsp"%>

<p>
	<b>taxonomy</b>
</p>

<ul>
<c:forEach var="category" items="${updatesTopics}">
<li>
	<span>
	<a class="text-primary"
		data-value="${category.value}">
		${category.key}
	</a></span>
	</li>
</c:forEach>
</ul>

