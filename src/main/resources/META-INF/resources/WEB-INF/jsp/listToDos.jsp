<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Hey ${name}, Your ToDOs are:</h1>
	<hr>
	${todos}
	<hr>
	
	<table class="table table-striped">
        <thead>
            <tr>
                <th>#</th>
                <th>Description</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through the todos list -->
            <c:forEach var="todo" items="${todos}" varStatus="status">
                <tr>
                    <!-- Display row number -->
                    <td>${status.index + 1}</td>
                    <!-- Display todo description -->
                    <td>${todo.description}</td>
                    <!-- Add Update and Delete buttons in action column -->
                    <td>
                        <a href="update-todo?id=${todo.id}" class="btn btn-warning">Update</a>&nbsp; 
                        <a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>&nbsp;
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
	<a href="add-todo" class="btn btn-success">Add</a>&nbsp;
</div>
<%@ include file="common/footer.jspf"%>

