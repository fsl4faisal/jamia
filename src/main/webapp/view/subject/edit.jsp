<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Subject</title>
</head>
<body>
	<h1>Edit Subject</h1>
	<form action="subject" method="post">
		<input type="hidden" name="id" value="${subject.id}">
		<ul>
			<li>Name:<input type="text" name="paper_name" value="${subject.paperName}"></li>
			<li>Number:<input type="text" name="paper_number" value="${subject.paperNumber}"></li>
			<li>Category:
			<select name="paper_category">
				<option value="0">(none)</option>
					<c:forEach var="category" items="${categories}">
						<c:choose>
						<%-- enum is tested like below and it is different from the one you learned in marakana --%>
							<c:when test="${category.value eq subject.paperCategory.value}">
								<option value="${category.value}" selected>${category.name}</option>
							</c:when>
							<c:otherwise>
								<option value="${category.value}">${category.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>			
				</select>
			</li>
				
			<li>Semester:
			<select name="paper_semester">
				<option value="0">(none)</option>
					<c:forEach var="semester" items="${semesters}">
						<c:choose>
							<c:when test="${semester.value eq subject.paperSemester.value}">
								<option value="${semester.value}" selected>${semester.name}</option>
							</c:when>
							<c:otherwise>
								<option value="${semester.value}">${semester.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>			
				</select>
			</li>
		</ul>
		
		<input type="submit" value="edit" name="edit">
	</form>	
	
	<a href="adminHome">Back to Home</a>

	<form action="subject" method="post">
		<input type="hidden" name="id" value="${subject.id}"> <input
			type="submit" value="delete" name="delete">
	</form>
</body>
</html>