
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Hey ${name}, Your ToDOs are:</h1>
	<hr>
	${todos}
	<hr>
	now only doing for hard coded one due to jsp list issue 
	<a href="add-todo" class="btn btn-success">Add</a>&nbsp;
	<%-- href="delete-todo?id=${todo.id}" --%>
	<a href="update-todo?id=2" class="btn btn-warning">Update</a>&nbsp; 
	<a href="delete-todo?id=2" class="btn btn-danger">Delete</a>&nbsp;
</div>
<%@ include file="common/footer.jspf"%>

