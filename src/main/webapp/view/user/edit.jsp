<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


<title>Edit User ${user.name}</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4">
					<h2>Edit User: ${user.name}</h2>
					<form action="user" method="post" role="form">
						<input type="hidden" name="id" value="${user.id}" required>

						<div class="form-group ">
							<label for="user">User Name:</label> <input type="text"
								class="form-control" name="name" id="name" value="${user.name}"
								placeholder="Enter User Name" required>
						</div>


						<div class="form-group">
							<label for="email">Email Address:</label> <input type="email"
								name="emailAddress" class="form-control" id="email"
								placeholder="Enter email Address" value="${user.emailAddress}" required>
						</div>

						<div class="form-group">
							<label for="role">Role:</label> 
							<select name="role"
								class="form-control" id="role" placeholder="Enter Role" required>
								
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

						</div>

						<button type="submit" value="Edit" name="edit"
							class="btn btn-info active">Edit</button>
					</form>


					<form action="user" method="post">
						<input type="hidden" name="id" value="${user.id}">
						<button type="submit" value="delete" name="delete"
							class="btn btn-info active">Delete</button>
					</form>

					<a href="adminHome" class="btn btn-info" role="button">Back</a>




				</div>

			</div>
		</div>

	</div>
</body>
</html>