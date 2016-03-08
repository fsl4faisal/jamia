<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${user.name}</title>
</head>
<body>
	<h1>${user.name}</h1>
	<h1>${user.role.name}</h1>
	<h1>${user.emailAddress}</h1>
	<a href="adminHome">Back to Home</a>|
	<a href="user?id=${user.id}&edit">Edit User</a>
</body>
</html>