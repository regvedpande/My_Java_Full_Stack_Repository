<%@page import="java.util.List,com.mkpits.jdbc1.Student_Model"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<%
//get the student the RequestDispatcher
List<Student_Model> theStudents = (List<Student_Model>) request.getAttribute("STUDENT_LIST");
%>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
		<input type="button" value="Add Student" onclick="window.location.href='add-student-form.jsp';return false;"
		class="add-student-button">
			<table border="1">
				<tr>
				<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				<!-- Set up a link link for each student -->
				<c:url var="tempLink" value="StudentControllerServletNew">
				<c:param name="command" value="LOAD"/>
				<c:param name="studentId" value="${tempStudent.id}"/>
				</c:url>
				
				<!-- Set up a link to delete student -->
				<c:url var="deleteLink" value="StudentControllerServletNew">
				<c:param name="command" value="DELETE"/>
				<c:param name="studentId" value="${tempStudent.id}"/>
				</c:url>
                <tr>
				<td>${tempStudent.id}</td>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.email}</td>
					<td><a href="${tempLink}">Update</a>
						|
						<a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this student ?'))) return false">Delete</a>
						
						</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>