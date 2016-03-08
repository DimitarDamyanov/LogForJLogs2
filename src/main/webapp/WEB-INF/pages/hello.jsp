<html>
<body>
	<h1>Log Information</h1>
	<form method="POST" action="/LogForJLogs2/log/information">
		<input name="information" id="log-info" type="text">
		<input type="submit">
	</form>
	<h1>Log Error</h1>
	<form method="POST" action="/LogForJLogs2/log/error">
		<input name="error" id="log-error" type="text">
		<input type="submit">
	</form>
	<h1>Throw Exception</h1>
	<form method="POST" action="/LogForJLogs2/log/exception">
		<input type="submit">
	</form>
</body>
</html>