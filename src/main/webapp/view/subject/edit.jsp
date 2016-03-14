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


<title>Edit Subject ${subject.paperName}</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4">
					<h2>Edit Subject: ${subject.paperName}</h2>
					<form action="subject" method="post" role="form">
					<input type="hidden" name="id" value="${subject.id}">

						<div class="form-group ">
							<label for="paperNumber">Paper Number:</label> <input type="text"
								class="form-control" name="paperNumber" id="paperNumber"
								placeholder="Enter paperNumber" value="${subject.paperNumber}"
								required>
						</div>

						<div class="form-group ">
							<label for="paperName">Paper Name:</label> <input type="text"
								class="form-control" name="paperName" id="paperName"
								placeholder="Enter paperName" value="${subject.paperName}"
								required>
						</div>

						<div class="form-group">
							<label for="paperCategory">Category:</label> <select
								name="paperCategory" class="form-control" id="paperCategory"
								required>
								<c:forEach var="category" items="${categories}">
									<c:choose>
										<c:when
											test="${category.value eq subject.paperCategory.value}">
											<option value="${category.value}" selected>${category.name}</option>
										</c:when>
										<c:otherwise>
											<option value="${category.value}">${category.name}</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="paperSemester">Semester:</label> <select
								name="paperSemester" class="form-control" id="paperSemester"
								required>

								<c:forEach var="semester" items="${semesters}">
									<c:choose>
										<c:when
											test="${semester.value eq subject.paperSemester.value}">
											<option value="${semester.value}" selected>${semester.name}</option>
										</c:when>
										<c:otherwise>
											<option value="${semester.value}">${semester.name}</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="departmentName">Department:</label> <select
								name="departmentName" class="form-control" id="departmentName"
								 required>

								<c:forEach var="department" items="${departments}">
									<c:choose>
										<c:when
											test="${department.value eq subject.departmentName.value}">
											<option value="${department.value}" selected>${department.name}</option>
										</c:when>
										<c:otherwise>
											<option value="${department.value}">${department.name}</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</select>
						</div>


						<button type="submit" value="Edit" name="edit"
							class="btn btn-info active">Edit</button>
					</form>


					<form action="subject" method="post">
						<input type="hidden" name="id" value="${subject.id}">
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