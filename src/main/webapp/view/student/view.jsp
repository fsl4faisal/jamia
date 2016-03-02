<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${student.name}</title>
</head>
<body>
	<h1>${student.name}</h1>
	
	<%--TODO --%>
	
	<h1>${user.role}</h1>
	<a href="adminHome">Back to Home</a>|
	<a href="student?id=${student.id}&edit">Edit Student</a>
</body>
</html>