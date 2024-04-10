<%@page import="com.mkpits.jdbc.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
</head>
<%
List<Student> theStudents = (List<Student>)request.getAttribute("STUDENT_LIST");
%>
<body>
<div id="wrapper">
<div id="header">
<h2>MKPITS University</h2>
</div>
</div>
<div id="container">

<div id="content">
<table>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>
<% for(Student tempStudent : theStudents) { %>
<tr>
<td><%= tempStudent.getId() %></td>
<td><%= tempStudent.getFirstName() %></td>
<td><%= tempStudent.getLastName() %></td>
<td><%= tempStudent.getEmail() %></td>
</tr>
<% } %>
</table>

</div>
</div>
</body>
</html>
