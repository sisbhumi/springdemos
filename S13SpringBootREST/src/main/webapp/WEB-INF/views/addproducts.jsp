<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<h1>Manage Products</h1>
	<form action="products" method="post">
		<pre>
			Name: <input type="text" name="name" />
			Description: <input type="text" name="desc" />
			Price: <input type="text" name="price" />
			Category:<input type="text" name="category" />
			<input type="submit" name="Sign Up" />
		</pre>
	</form>

	<p>${message}</p>
	<ul>
		<c:forEach items="${products}" var="product">
			<li>${product.name} | ${product.desc} | ${product.price}  | ${product.category} </li>
		</c:forEach>
	</ul>
</body>
</html>