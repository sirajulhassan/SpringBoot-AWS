<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Todo App</title>
	<link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
	<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">			
</head>

<body>
	<div class="container">
	<pre>${errorMsg}</pre> 
	<form:form method="post" modelAttribute="todo">
	<div class="form-group">
		<fieldset class="mb-3">
			<form:label path = "description" >Description</form:label> 
			<form:input type="text" path = "description" placeholder="Enter Description" />
			<form:errors path = "description" cssClass="text-danger" />
		</fieldset>
		
		<fieldset class="mb-3">
			<form:label path = "targetDate" >Target Date&nbsp;</form:label> 
			<form:input type="text" path = "targetDate" />
			<form:errors path = "targetDate" cssClass="text-danger" />
		</fieldset>
		<input type="submit" class="btn  btn-success"/>
	
	</div>
	</form:form>
	</div>
	<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript">
		$('#targetDate').datepicker({
		    format: 'mm/dd/yyyy',
		    startDate: '-3d'
		});
	</script>
</body>

</html>