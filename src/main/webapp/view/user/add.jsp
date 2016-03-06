<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<h1>Add User</h1>
	<form action="user" method="post">
		<input type="hidden" name="add">
		<ul>
			<li>Name:<input type="text" name="name"></li>
			<li>Role:<select name="role">
			<option value="0">(none)</option>
					<c:forEach var="role" items="${roles}">
						<option value="${role.value}">${role.name}</option>
					</c:forEach>			
				</select>	
			</li>
		</ul>
		<input type="submit" value="Submit" name="add">
	</form>
	<a href="adminHome">Back to Home</a>
</body>
</html>