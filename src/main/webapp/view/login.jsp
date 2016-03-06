<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%--below is to include style.css  --%>

<link href="<c:url value="/resources/style.css" />" rel="stylesheet">

<title>Login</title>
</head>
<body>
	<div class="container">
		<div class="content">
			<h1>Banner</h1>
			<hr />
			<center>
				<font size="5"><a href="index.htm">Home</a> | <a
					href="about.htm">About</a> | <a href="contact.htm">Contact</a></font>
			</center>
			<hr />


			<p align="center">&nbsp;</p>
			<div align="center">
				<form action="login" method="post">

					<table width="200" border="1">
						<tr>
							<th colspan="2" scope="col">User Login</th>
						</tr>
						<tr>
							<td>User Id</td>
							<td><input type="text" name="user_name"></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td colspan="2"><div align="center">
									<input type="submit" name="Submit">
								</div></td>
						</tr>


					</table>
				</form>

			</div>
			<p>&nbsp;</p>
		</div>
	</div>
</body>
</html>