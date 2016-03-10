<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${subject.paperName}</title>
</head>
<body>
	<h1>${subject.paperName}</h1>
	
	<ul>
		<li>Number: ${subject.paperNumber}</li>
		<li>Category: ${subject.paperCategory.name}</li>
		<li>Semester: ${subject.paperSemester.name}</li>
		<li>Department: ${subject.departmentName.name}</li>
	</ul>
	
	<a href="adminHome">Back to Home</a>|
	<a href="subject?id=${subject.id}&edit">Edit Subject</a>
</body>
</html>