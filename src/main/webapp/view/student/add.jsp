<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h1>Add Student</h1>
	
<form action="student" method="post">
	<div align="center">
	  <input type="hidden" name="add">
	  
	  <table width="823" border="1">
	    <tr>
	      <th colspan="5" scope="col">Student Details</th>
        </tr>
	    <tr>
	      <td>Examination*</td>
	      <td colspan="4">
	        <select name="examination_name">
	          <option value="0">(none)</option>
	          <c:forEach var="examination_name" items="${examination_names}">
	            <option value="${examination_name.value}">${examination_name.name}</option>
	            </c:forEach>			
            </select>
          </td>
        </tr>
	    <tr>
	      <td>Year*</td>
	      <td colspan="4"><input name="year" type="text"></td>
        </tr>
	    <tr>
	      <td>Part/Semester*</td>
	      <td colspan="4">
	        <select name="semester_name">
	          <option value="0">(none)</option>
	          <c:forEach var="semester" items="${semesters}">
	            <option value="${semester.value}">${semester.name}</option>
	            </c:forEach>			
	          </select>	
	        </td>
        </tr>
	    <tr>
	      <td width="213">Name*</td>
	      <td colspan="4"><input type="text" name="name"></td>
        </tr>
	    <tr>
	      <td>Date of Birth*</td>
	      <td colspan="4"><input type="text" name="date_of_birth">(yyyy/mm/dd)</td>
        </tr>
	    <tr>
	      <td rowspan="2">Place of Birth*</td>
	      <td width="144">Town*</td>
	      <td width="144">Distt.*</td>
	      <td colspan="2">State*</td>
        </tr>
	    <tr>
	      <td><input type="text" name="DOB_town"></td>
	      <td><input type="text" name="DOB_distt"></td>
	      <td colspan="2"><input type="text" name="DOB_state"></td>
        </tr>
	    <tr>
	      <td>Email Address*</td>
	      <td colspan="4"><input type="text" name="email_address"></td>
        </tr>
	    <tr>
	      <td>Nationality*</td>
	      <td colspan="4"><input type="text" name="nationality"></td>
        </tr>
	    <tr>
	      <td>Religion*</td>
	      <td colspan="4"><input type="text" name="religion"></td>
        </tr>
	    <tr>
	      <td>Gender*</td>
	      <td colspan="4">
	        <select name="gender">
	          <option value="0">(none)</option>
	          <c:forEach var="gender" items="${genders}">
	            <option value="${gender.value}">${gender.name}</option>
	            </c:forEach>			
            </select></td>
        </tr>
	    <tr>
	      <td>Father's Name*</td>
	      <td colspan="4"><input type="text" name="father_name"></td>
        </tr>
	    <tr>
	      <td>Mother's Name*</td>
	      <td colspan="4"><input type="text" name="mother_name"></td>
        </tr>
	    <tr>
	      <td>Spouse's Name*</td>
	      <td colspan="4"><input type="text" name="spouse_name"></td>
        </tr>
         <tr>
	      <td>Mobile Number*</td>
	      <td colspan="4"><input type="text" name="mobile_number"></td>
        </tr>
	    <tr>
	      <td rowspan="2">Correspondence Address*</td>
	      <td>Street</td>
	      <td>City</td>
	      <td width="144">State</td>
	      <td width="144">Pincode</td>
        </tr>
	    <tr>
	      <td><input type="text" name="correspondence_street"></td>
	      <td><input type="text" name="correspondence_city"></td>
	      <td><input type="text" name="correspondence_state"></td>
	      <td><input type="text" name="correspondence_pincode"></td>
        </tr>
	    <tr>
	      <td rowspan="2">Permanent Address*</td>
	      <td>Street</td>
	      <td>City</td>
	      <td>State</td>
	      <td>Pincode</td>
        </tr>
	    <tr>
	      <td><input type="text" name="permanent_street"></td>
	      <td><input type="text" name="permanent_city"></td>
	      <td><input type="text" name="permanent_state"></td>
	      <td><input type="text" name="permanent_pincode"></td>
        </tr>
	    <tr>
	      <td>Medium of Examination*</td>
	      <td colspan="4">
	        <select name="medium_of_examination">
	          <option value="0">(none)</option>
	          <c:forEach var="medium_of_examination" items="${medium_of_examinations}">
	            <option value="${medium_of_examination.value}">${medium_of_examination.name}</option>
	            </c:forEach>			
	          </select>
          </td>
        </tr>
	    <tr>
	      <td>Enrollment Number*</td>
	      <td colspan="4"><input type="text" name="enrollment_number"></td>
        </tr>
	    <tr>
	      <td>Belong to  S.C/S.T/O.B.C*</td>
	      <td colspan="4"><select name="belong_to_SC_ST_OBC">
	        <option value="0">(none)</option>
	        <c:forEach var="flag" items="${flags}">
	          <option value="${flag.value}">${flag.name}</option>
	          </c:forEach>			
	        </select></td>
        </tr>
      </table>
  </div>
  <p align="left"><strong>	Below Details are to be entered by Student.</strong></p>
  <div align="center">
    <table width="835" border="1">
      <tr>
        <th width="656" scope="col">Were you ever rustigated/  expelled/ disqualified/ debarred from appearing at the examination?</th>
        <th width="163" scope="col">
          <select name="rusticted_expelled_disqualified_debarred_flag">
              <option value="0">(none)</option>
              <c:forEach var="flag" items="${flags}">
                <option value="${flag.value}">${flag.name}</option>
                </c:forEach>			
          </select>	
          </th>
      </tr>
    </table>
  </div>
  <p align="center">&nbsp;</p>
  <div align="center">
    <table height="100" border="1">
      <tr>
        <td width="152" rowspan="2"><strong>Details for above point</strong></td>
        <td width="144"><strong>University/Board</strong></td>
        <td width="144"><strong>Examination</strong></td>
        <td width="144"><strong>Year</strong></td>
        <td width="144"><strong>Enrollment No.</strong></td>
        <td width="144"><strong>Roll No.</strong></td>
        <td width="140"><strong>Period of punishment</strong></td>
      </tr>
      <tr>
        <td><input type="text" name="previous_university_board"></td>
        <td><input type="text" name="previous_examination"></td>
        <td><input type="text" name="previous_year"></td>
        <td><input type="text" name="previous_enrollment_number"></td>
        <td><input type="text" name="previous_roll_number"></td>
        <td><input type="text" name="period_of_punishment"></td>
      </tr>
    </table>
  </div>
  <p align="center">
    <input type="submit" name="add" value="Submit"/>
</p>
</form>
<a href="adminHome">Back to Home</a>    
</body>
</html>