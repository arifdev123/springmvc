<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="in.co.javacoder.springmvc.dto.Employee" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<form action="registerUser" method="post">
		<pre>
			ID : <input type="text" name="id" />
			Name : <input type="text" name="name" />
			Email : <input type="text" name="email" />
			<input type="submit" value="Register" name="register" />
		</pre>
	</form>

</body>
</html>