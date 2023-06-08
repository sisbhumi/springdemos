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
<br><br><br>
	<div align="center">
	<h1>Products</h1><hr><br>
	<table border=2px>
		<tr>
			<th>Name</th>
			<th>Cayegory</th>
			<th>Price</th>
			<th>Descritpion</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.name} </td>
				<td>${product.category}</td>
				<td>${product.price} </td>
				<td>${product.desc}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</ul>
</body>
</html>