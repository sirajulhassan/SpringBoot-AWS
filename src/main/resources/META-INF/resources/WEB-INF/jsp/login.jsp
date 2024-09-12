<html>
<head>
<title>Test</title>
<link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
	${errorMsg}
	<form method="post">
		<label>Name:&nbsp;</label> <input type="text" name = "name" placeholder="Enter UserName" />
		<label>Password:&nbsp;</label> <input type="password" name = "password" />
		<button type="submit">Submit</button>
	</form>
	</div>
	<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>

</html>