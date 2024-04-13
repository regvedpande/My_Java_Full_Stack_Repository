<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>
	
	<div id="container">
	<h3>Update Student</h3>
	<form action="StudentControllerServletNew" method="get">
	<input type="hidden" name="command" value="UPDATE"/>
	<input type="hidden" name="studentId" value="${THE_STUDENT.id}">
	
	<table>
	<tbody>
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="firstName" value="${THE_STUDENT.firstName}"/></td>
	</tr>
	
	
	<tr> 
	<td><label>Last Name:</label></td>
	<td><input type="text" name="lastName" value="${THE_STUDENT.lastName}"/></td>
	</tr>
	
	<tr> 
	<td><label>Email:</label></td>
	<td><input type="email" name="email" value="${THE_STUDENT.email}"/></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Update" class="save"></td>
	</tr>
	</tbody>
	
	</table>
	</form>
	<div style="clear:both;"></div>
	<p>
	<a href="StudentControllerServletNew">Back To List</a>
	</p>
	</div>
</body>
</html>