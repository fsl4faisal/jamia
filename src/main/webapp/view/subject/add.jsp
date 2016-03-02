<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Subject</title>
</head>
<body>
	<h1>Add Subject</h1>
	<form action="subject" method="post">
		<input type="hidden" name="add">
		<ul>
			<li>Number:<input type="text" name="paper_number"></li>
			<li>Name:<input type="text" name="paper_name"></li>
			<li>Category:
			<select name="paper_category">
				<option value="0">(none)</option>
					<c:forEach var="category" items="${categories}">
						<option value="${category.value}">${category.name}</option>
					</c:forEach>			
				</select>
			</li>
			
			
			
			
			<li>Semester:
			<select name="paper_semester">
				<option value="0">(none)</option>
					<c:forEach var="semester" items="${semesters}">
						<option value="${semester.value}">${semester.name}</option>
					</c:forEach>			
				</select>
			</li>
		</ul>
		<input type="submit" value="Submit" name="add">
	</form>
	<a href="adminHome">Back to Home</a>
</body>
</html>