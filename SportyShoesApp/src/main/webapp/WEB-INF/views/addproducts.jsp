<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<div align="center">
		<h1>Add Product</h1>
		<form action="products" method="post">
			<table>
				<tr>
					<th>Name:</th>
					<th><input type="text" name="name" /></th>
				</tr>
				<tr>
					<th> Description:</th>
					<th> <input type="text" name="desc" /></th>
				</tr>
				<tr>
					<th> Price:</th>
					<th> <input type="text" name="price" /> </th>
				</tr>
				<tr>
					<th> Category:</th>
					<th><input type="text" name="category" /></th>
				</tr>	
					
			</table>
			<br> <input type="submit" name="Sign Up" />
		</form>
	</div>
</body>
</html>