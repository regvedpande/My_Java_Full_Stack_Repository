<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Add this line -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
		<thead>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</thead>
		</tr>


		<c:forEach var="tempStudent" items="${student_list}">

			<tr>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td>${tempStudent.email}</td>
			</tr>
			<br>
		</c:forEach>
	</table>
</body>
</html>
