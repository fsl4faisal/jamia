<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Student Details</title>
</head>

<body>
<p>&nbsp;</p>
<p align="center">&nbsp;</p>
<form action="studentDetails" method="post">
<div align="center">
  <table width="870" border="1">
    <tr>
      <th width="39" scope="col">S.N.</th>
      <th colspan="5" scope="col">Student Details</th>
      </tr>
    <tr>
      <td><p>1</p></td>
      <td width="413">Name</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>2</td>
      <td>Date of Birth</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td rowspan="2">3</td>
      <td rowspan="2">Place of Birth</td>
      <td width="109">Town</td>
      <td width="115">Distt.</td>
      <td colspan="2">State</td>
      </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td colspan="2">&nbsp;</td>
      </tr>
    <tr>
      <td>4</td>
      <td>Nationality</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>5</td>
      <td>Religion</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>6</td>
      <td>Gender</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>7</td>
      <td>Father's Name</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>8</td>
      <td>Mother's Name</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>9</td>
      <td>Spouse's Name</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td rowspan="2">10</td>
      <td rowspan="2">Home Address</td>
      <td>Street</td>
      <td>City</td>
      <td width="79">State</td>
      <td width="75">Pincode</td>
      </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      </tr>
    <tr>
      <td rowspan="2">11</td>
      <td rowspan="2">Permanent Address</td>
      <td>Street</td>
      <td>City</td>
      <td>State</td>
      <td>Pincode</td>
      </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      </tr>
    <tr>
      <td>12</td>
      <td>Medium of Examination</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>13</td>
      <td>Enrollment Number</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>14</td>
      <td>Whether do you belong to  S.C/S.T/O.B.C</td>
      <td colspan="4">&nbsp;</td>
      </tr>
    <tr>
      <td>15</td>
      <td>Were you ever rustigated/  expelled/ disqualified/ debarred from appearing at the examination?</td>
      <td colspan="4">&nbsp;</td>
      </tr>
  </table>
</div>
<p align="center">&nbsp;</p>
<div align="center">
  <table width="870" border="1">
    <tr>
      <th width="210" scope="col">Details for point 16 rustigated/ expelled/ disqualified/ debarred from appearing at the examination?</th>
      <th width="105" scope="col">University/ Board</th>
      <th width="87" scope="col">Examination</th>
      <th width="115" scope="col">Year</th>
      <th width="116" scope="col">Enrollment No.</th>
      <th width="115" scope="col">Roll No.</th>
      <th width="76" scope="col">Period of punishment</th>
      </tr>
    <tr>
      <td height="49">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      </tr>
  </table>
</div>
<p>&nbsp;</p>
<p align="center">&nbsp;</p>
<p align="center">
  <input type="submit" name="Proceed" value="Proceed"/>
</p>
</form>
</body>
</html>