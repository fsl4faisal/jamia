<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<h1>Edit User</h1>
	<form action="user" method="post">
		<input type="hidden" name="id" value="${user.id}">
		<ul>
			<li>Name:<input type="text" name="name" value="${user.name}"></li>
			<li>Role:<input type="text" name="role" value="${user.role}"></li>
		</ul>
		<input type="submit" value="edit" name="edit">
	</form>
	<a href="adminHome">Back to Home</a>

	<form action="user" method="post">
		<input type="hidden" name="id" value="${user.id}"> <input
			type="submit" value="delete" name="delete">
	</form>
</body>
</html>