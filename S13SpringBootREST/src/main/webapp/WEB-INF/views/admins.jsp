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
	<form action="index" method="post">
		<pre>
			Name: <input type="text" name="name" />
			Email:<input type="text" name="email" />
			Password: <input type="text" name="password" />
			<input type="submit" value="Sign Up" />
		</pre>
	</form>

	<p>${message}</p>
	<ul>
		<c:forEach items="${admin}" var="admins">
			<li>${admins.name}| ${admins.email}</li>
		</c:forEach>
	</ul>
</body>
</html>