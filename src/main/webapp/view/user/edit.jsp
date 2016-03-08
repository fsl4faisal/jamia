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
			<li>Role:
			<select name="role">
			<option value="0">(none)</option>
					<c:forEach var="role" items="${roles}">
						<c:choose>
						<%-- enum is tested like below and it is different from the one you learned in marakana --%>
							<c:when test="${role.value eq user.role.value}">
								<option value="${role.value}" selected>${role.name}</option>
							</c:when>
							<c:otherwise>
								<option value="${role.value}">${role.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>			
				</select>
				</li>
			<li>Email Address:<input type="text" name="email_address" value="${user.emailAddress}"></li>
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