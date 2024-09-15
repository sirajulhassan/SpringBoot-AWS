<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Test</title>
<link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
	<pre>${errorMsg}</pre> 
	<form:form method="post" modelAttribute="todo">
	<div class="form-group">
		<label>Description&nbsp;</label> <form:input type="text" path = "description" placeholder="Enter Description" />
		 <!-- to display form error -->
		 <form:errors path = "description" cssClass="text-danger" />
		<input type="submit" class="btn  btn-success">
	</div>
	</form:form>
	</div>
	<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>

</html>