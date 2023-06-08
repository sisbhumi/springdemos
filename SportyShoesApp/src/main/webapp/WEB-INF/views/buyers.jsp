<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes.com</title>
</head>
<body>
	<h3 align="center">Buyers All the buyers appears here!
	<div align="center">
	<form action="buyer" method="post"><br>
		Name: <input type="text" name="name" /><br><br>
		Email: <input type="text" name="email" /><br><br>
		 <input type="submit" value="Search" />
	</form>
	</div>
	
	<h2 align="center">${message}</h2>
	
	<br><br><br>
	<hr>
	<h3 align="center">List of Signed Up Users</h3>
	<table align="center" border=2px>
		<tr>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${buyer}" var="product">
		<tr>
			<td>${product.name}</td>
			<td> ${product.email}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>