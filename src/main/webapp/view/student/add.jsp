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
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<%--For datepicker --%>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

<link rel="stylesheet" href="/resources/demos/style.css">

<script>
	$(function() {
		$("#datepicker").datepicker();
	});

	$(".readonly").keydown(function(e) {
		e.preventDefault();
	});
</script>

<title>Add Student</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h2>Add Student</h2>
					<form action="student" method="post" role="form">

						<div class="form-group">
							<label for="role">Role:</label> <select name="user.role"
								class="form-control" id="role" required>
								<c:forEach var="role" items="${roles}">
									<option value="${role.value}">${role.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="courseType">Course Type:</label> <select
								name="courseType" class="form-control" id="courseType"
								placeholder="Enter Course Type" required>
								<option disabled selected></option>
								<c:forEach var="course_type" items="${course_types}">
									<option value="${course_type.value}">${course_type.name}</option>
								</c:forEach>
							</select>
						</div>


						<div class="form-group">
							<label for="examinationName">Examination:</label> <select
								name="examinationName" class="form-control" id="examinationName"
								placeholder="Enter Examination Name" required>
								<option disabled selected></option>
								<c:forEach var="examination_name" items="${examination_names}">
									<option value="${examination_name.value}">${examination_name.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group ">
							<label for="year">Year:</label> <input type="number"
								class="form-control" name="year" id="year"
								placeholder="Enter year" required>
						</div>

						<div class="form-group">
							<label for="semesterName">Part/Semester:</label> <select
								name="semesterName" class="form-control" id="semesterName"
								placeholder="Enter semester Name" required>
								<option disabled selected></option>
								<c:forEach var="semester" items="${semesters}">
									<option value="${semester.value}">${semester.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group ">
							<label for="year">Name:</label> <input type="text"
								class="form-control" name="user.name" id="name"
								placeholder="Enter Name" required>
						</div>
						
						<%--class readonly will prevent the form for submission if value is empty --%>
						<div class="form-group ">
							<label for="dateOfBirth">Date of Birth:</label> <input
								type="text" class="form-control readonly" name="dateOfBirth"
								id="datepicker" required>

						</div>

						<div class="form-group ">
							<label for="placeOfBirth">Place of Birth:</label> <input
								type="text" class="form-control" name="placeOfBirth.town"
								id="placeOfBirth.town" placeholder="Enter Town" required>
							<input type="text" class="form-control" name="placeOfBirth.distt"
								id="placeOfBirth.distt" placeholder="Enter Distt" required>
							<input type="text" class="form-control" name="placeOfBirth.state"
								id="placeOfBirth.state" placeholder="Enter State" required>
						</div>

						<div class="form-group ">
							<label for="year">Email Address:</label> <input type="email"
								class="form-control" name="user.emailAddress"
								id="user.emailAddress" placeholder="Enter Email Address"
								required>
						</div>

						<div class="form-group ">
							<label for="year">Nationality:</label> <input type="text"
								class="form-control" name="nationality" id="nationality"
								placeholder="Enter Nationality" required>
						</div>

						<div class="form-group ">
							<label for="year">Religion:</label> <input type="text"
								class="form-control" name="religion" id="religion"
								placeholder="Enter Religion" required>
						</div>

						<div class="form-group">
							<label for="gender">Gender:</label> <select name="gender"
								class="form-control" id="gender"
								placeholder="Enter semester Name" required>
								<option disabled selected></option>
								<c:forEach var="gender" items="${genders}">
									<option value="${gender.value}">${gender.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group ">
							<label for="fatherName">Father's Name:</label> <input type="text"
								class="form-control" name="fatherName" id="fatherName"
								placeholder="Enter Father Name" required>
						</div>

						<div class="form-group ">
							<label for="motherName">Mother's Name:</label> <input type="text"
								class="form-control" name="motherName" id="motherName"
								placeholder="Enter Mother Name" required>
						</div>

						<div class="form-group ">
							<label for="spouseName">Spouse's Name:</label> <input type="text"
								class="form-control" name="spouseName" id="spouseName"
								placeholder="Enter Spouse Name" required>
						</div>

						<div class="form-group ">
							<label for="mobileNumber">Mobile Number:</label> <input
								type="number" class="form-control" name="mobileNumber"
								id="mobileNumber" placeholder="Enter Mobile Number" required>
						</div>

						<div class="form-group ">
							<label for="correspondenceAddress">Correspondence
								Address:</label> <input type="text" class="form-control"
								name="correspondenceAddress.street"
								id="correspondenceAddress.street" placeholder="Enter Street"
								required> <input type="text" class="form-control"
								name="correspondenceAddress.city"
								id="correspondenceAddress.city" placeholder="Enter City"
								required> <input type="text" class="form-control"
								name="correspondenceAddress.state"
								id="correspondenceAddress.state" placeholder="Enter State"
								required> <input type="number" class="form-control"
								name="correspondenceAddress.pincode"
								id="correspondenceAddress.pincode" placeholder="Enter Pincode"
								required>
						</div>

						<div class="form-group ">
							<label for="permanenteAddress">Permanent Address:</label> <input
								type="text" class="form-control" name="permanentAddress.street"
								id="permanentAddress.street" placeholder="Enter Street" required>
							<input type="text" class="form-control"
								name="permanentAddress.city" id="permanentAddress.city"
								placeholder="Enter City" required> <input type="text"
								class="form-control" name="permanentAddress.state"
								id="permanentAddress.state" placeholder="Enter State" required>
							<input type="number" class="form-control"
								name="permanentAddress.pincode" id="permanentAddress.pincode"
								placeholder="Enter Pincode" required>
						</div>


						<div class="form-group">
							<label for="mediumOfExamination">Medium of Examination:</label> <select
								name="mediumOfExamination" class="form-control"
								id="mediumOfExamination" placeholder="Enter mediumOfExamination"
								required>
								<option disabled selected></option>
								<c:forEach var="medium_of_examination"
									items="${medium_of_examinations}">
									<option value="${medium_of_examination.value}">${medium_of_examination.name}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group ">
							<label for="enrollmentNumber">Enrollment Number:</label> <input
								type="text" class="form-control" name="enrollmentNumber"
								id="enrollmentNumber" placeholder="Enter Enrollment Number"
								required>
						</div>

						<div class="form-group ">
							<label for="studentId">Student Id:</label> <input type="number"
								class="form-control" name="studentId" id="studentId"
								placeholder="Enter student Id" required>
						</div>

						<div class="form-group">
							<label for="quotaFlag">Belong to S.C/S.T/O.B.C:</label> <select
								name="quotaFlag" class="form-control" id="quotaFlag"
								placeholder="Enter quota" required>
								<option disabled selected></option>
								<c:forEach var="flag" items="${flags}">
									<option value="${flag.value}">${flag.name}</option>
								</c:forEach>
							</select>
						</div>

						<p align="left">
							<strong> Below Details are to be entered by Student.</strong>
						</p>

						
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