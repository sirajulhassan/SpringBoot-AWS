
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
	now only doing for hard coded one due to jsp list issue
	<a href="add-todo" class= "btn btn-success">Add</a>&nbsp;
	<%-- href="delete-todo?id=${todo.id}" --%> 
	<a href="update-todo?id=2" class= "btn btn-warning">Update</a>&nbsp;
	<a href="delete-todo?id=2" class= "btn btn-danger">Delete</a>&nbsp;
	</div>
	<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>

</body>

</html>


