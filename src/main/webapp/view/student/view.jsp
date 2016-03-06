<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${student.studentName}</title>
</head>
<body>
	<h1>${student.studentName}</h1>
	
	<%--TODO --%>
	<div align="center">
  <table width="825" border="1">
    <tr>
      <th colspan="5" scope="col">Student Details</th>
      </tr>
    <tr>
      <td>Examination*</td>
      <td colspan="4">${student.examinationName.name}</td>
    </tr>
    <tr>
      <td>Year*</td>
      <td colspan="4">${student.year}</td>
    </tr>
    <tr>
      <td>Part/Semester*</td>
      <td colspan="4">${student.semesterName.name}</td>
    </tr>
    <tr>
      <td width="413">Name*</td>
      <td colspan="4">${student.studentName}</td>
      </tr>
    <tr>
      <td>Date of Birth*</td>
      <td colspan="4">${student.dateOfBirth}</td>
      </tr>
    <tr>
      <td rowspan="2">Place of Birth*</td>
      <td width="109">Town</td>
      <td width="115">Distt.</td>
      <td colspan="2">State</td>
      </tr>
    <tr>
      <td>${student.placeOfBirth.town}</td>
      <td>${student.placeOfBirth.distt}</td>
      <td colspan="2">${student.placeOfBirth.state}</td>
      </tr>
    <tr>
      <td>Email Address*</td>
      <td colspan="4">${student.emailAddress}</td>
    </tr>
    <tr>
      <td>Nationality*</td>
      <td colspan="4">${student.nationality}</td>
      </tr>
    <tr>
      <td>Religion*</td>
      <td colspan="4">${student.religion}</td>
      </tr>
    <tr>
      <td>Gender*</td>
      <td colspan="4">${student.gender.name}</td>
      </tr>
    <tr>
      <td>Father's Name*</td>
      <td colspan="4">${student.fatherName}</td>
      </tr>
    <tr>
      <td>Mother's Name*</td>
      <td colspan="4">${student.motherName}</td>
      </tr>
    <tr>
      <td>Spouse's Name*</td>
      <td colspan="4">${student.spouseName}</td>
      </tr>
    <tr>
      <td>Mobile Number*</td>
      <td colspan="4">${student.mobileNumber}</td>
    </tr>
    <tr>
      <td rowspan="2">Home Address*</td>
      <td>Street</td>
      <td>City</td>
      <td width="79">State</td>
      <td width="75">Pincode</td>
      </tr>
    <tr>
      <td>${student.correspondenceAddress.street}</td>
      <td>${student.correspondenceAddress.city}</td>
      <td>${student.correspondenceAddress.state}</td>
      <td>${student.correspondenceAddress.pincode}</td>
      </tr>
    <tr>
      <td rowspan="2">Permanent Address*</td>
      <td>Street</td>
      <td>City</td>
      <td>State</td>
      <td>Pincode</td>
      </tr>
    <tr>
      <td>${student.permanentAddress.street}</td>
      <td>${student.permanentAddress.city}</td>
      <td>${student.permanentAddress.state}</td>
      <td>${student.permanentAddress.pincode}</td>
      </tr>
    <tr>
      <td>Medium of Examination*</td>
      <td colspan="4">${student.mediumOfExamination.name}</td>
      </tr>
    <tr>
      <td>Enrollment Number*</td>
      <td colspan="4">${student.enrollmentNumber}</td>
      </tr>
    <tr>
      <td>Belong to  S.C/S.T/O.B.C*</td>
      <td colspan="4">${student.quotaFlag.name}</td>
      </tr>
    <tr>
      <td>Were you ever rustigated/  expelled/ disqualified/ debarred from appearing at the examination?*</td>
      <td colspan="4">${student.disqualifiedFlag.name}</td>
      </tr>
  </table>
  <p>&nbsp;</p>
</div>
<p align="center">&nbsp;</p>
<div align="center">
  <table width="870" border="1">
    <tr>
      <th width="210" rowspan="2" scope="col">Details for point 19 rustigated/expelled/disqualified/debarred from appearing at the examination?</th>
      <th width="105" scope="col">University/Board</th>
      <th width="87" scope="col">Examination</th>
      <th width="115" scope="col">Year</th>
      <th width="116" scope="col">Enrollment No.</th>
      <th width="115" scope="col">Roll No.</th>
      <th width="76" scope="col">Period of punishment</th>
    </tr>
    <tr>
      <td height="49"><p>${student.disqualifiedDescription.previousUniversityBoardName}</p></td>
      <td><p>${student.disqualifiedDescription.previousExaminationName}</p></td>
      <td><p>${student.disqualifiedDescription.previousYear}</p></td>
      <td><p>${student.disqualifiedDescription.previousEnrollmentNumber}</p></td>
      <td><p>${student.disqualifiedDescription.previousRollNumber}</p></td>
      <td><p>${student.disqualifiedDescription.periodOfPunishment}</p></td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>
    
	<a href="adminHome">Back to Home</a>|
	<a href="student?id=${student.id}&edit">Edit Student</a>
</body>
</html>