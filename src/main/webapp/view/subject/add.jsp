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


<title>Add Subject</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4">
					<h2>Add Subject</h2>
					<form action="subject" method="post" role="form">


						<div class="form-group ">
							<label for="paperNumber">Paper Number:</label> 
							<input type="text"
								class="form-control" name="paperNumber" id="paperNumber"
								placeholder="Enter paperNumber" required>
						</div>

						<div class="form-group ">
							<label for="paperName">Paper Name:</label> 
							<input type="text"
								class="form-control" name="paperName" id="paperName"
								placeholder="Enter paperName" required>
						</div>

						<div class="form-group">
							<label for="paperCategory">Category:</label> 
							<select name="paperCategory"
								class="form-control" id="paperCategory" placeholder="Enter Paper Category" required>
								<option disabled selected></option>
								<c:forEach var="category" items="${categories}">
									<option value="${category.value}">${category.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="paperSemester">Semester:</label> 
							<select name="paperSemester"
								class="form-control" id="paperSemester" placeholder="Enter Semester Name" required>
								<option disabled selected></option>
								<c:forEach var="semester" items="${semesters}">
									<option value="${semester.value}">${semester.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="departmentName">Department:</label> 
							<select name="departmentName"
								class="form-control" id="departmentName" placeholder="Enter departmentName" required>
								<option disabled selected></option>
								<c:forEach var="department" items="${departments}">
									<option value="${department.value}">${department.name}</option>
								</c:forEach>
							</select>
						</div>




						<button type="submit" value="Submit" name="add"
							class="btn btn-info active">Submit</button>
						<a href="adminHome" class="btn btn-info" role="button">Back</a>

					</form>


				</div>
				<div class="col-md-4">
					<div class="col-md-4"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>