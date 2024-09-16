<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<pre>${errorMsg}</pre>
	<form method="post">
		<label>Name:&nbsp;</label> <input type="text" name="name"
			placeholder="Enter UserName" /> <label>Password:&nbsp;</label> <input
			type="password" name="password" />
		<button type="submit">Submit</button>
	</form>
</div>
<%@ include file="common/footer.jspf"%>