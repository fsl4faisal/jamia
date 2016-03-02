<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h1>Add Student</h1>
	<form action="student" method="post">
		<input type="hidden" name="add">
		
		<%--TODO --%>
		
		<ul>
			<li>Name:<input type="text" name="name"></li>
			<li>Role:<input type="text" name="role"></li>
		</ul>
		<input type="submit" value="Submit" name="add">
	</form>
	<a href="adminHome">Back to Home</a>
</body>
</html>