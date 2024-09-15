
<html>
<head>

<title>List Todos</title>
<link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
	rel="stylesheet">



</head>

<body>
	<div class="container">

		<h1>Hey ${name}, Your ToDOs are:</h1>
		<hr>
		${todos}
		<hr>
	<a href="add-todo" class= "btn btn-success">Add Todo</a>
	for now manuelly for only one
	<%-- href="delete-todo?id=${todo.id}" --%> 
	<a href="delete-todo?id=2" class= "btn btn-warning">Delete</a>
	</div>
	<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>

</body>

</html>





<!-- 

<c:forEach items="${todos}" var = todo></c:forEach>
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
				</tr>
				
				
				
				



 -->