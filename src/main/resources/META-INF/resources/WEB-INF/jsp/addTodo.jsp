<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<pre>${errorMsg}</pre>
	<form:form method="post" modelAttribute="todo">
		<div class="form-group">
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description"
					placeholder="Enter Description" />
				<form:errors path="description" cssClass="text-danger" />
			</fieldset>

			<fieldset class="mb-3">
				<form:label path="targetDate">Target Date&nbsp;</form:label>
				<form:input type="text" path="targetDate" />
				<form:errors path="targetDate" cssClass="text-danger" />
			</fieldset>
			<input type="submit" class="btn  btn-success" />
		</div>
	</form:form>
</div>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
		$('#targetDate').datepicker({
		    format: 'dd/mm/yyyy'
		});
</script>

<%@ include file="common/footer.jspf"%>