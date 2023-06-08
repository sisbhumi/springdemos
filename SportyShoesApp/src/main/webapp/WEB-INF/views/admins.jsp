<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<h1>Admin Login</h1>
	<form action="admin" method="post">
		<pre>
			Name: <input type="text" name="name" />
			Email:<input type="text" name="email" />
			Password: <input type="text" name="password" />
			<input type="submit" value="Sign Up" />
		</pre>
	</form>
	<h3>${message}</h3>

</body>
</html>