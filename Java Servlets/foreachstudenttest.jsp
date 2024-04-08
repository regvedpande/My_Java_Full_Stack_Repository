<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, java.util.ArrayList, com.mkpits.model.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>
<%
    List<Student> data = new ArrayList<Student>(); 
    data.add(new Student("Regved", "Pande", false));
    data.add(new Student("Vinay", "Bro", false));
    data.add(new Student("Ashik", "Bro", false));
    data.add(new Student("Chetan", "Bro", false));
    
    pageContext.setAttribute("myStudents", data);
%>
<c:forEach var="tempStudent" items="${myStudents}">
    <p>
        First Name: ${tempStudent.firstName}<br>
        Last Name: ${tempStudent.lastName}<br>
        Gold Customer: ${tempStudent.isGoldCustomer}<br>
    </p>
</c:forEach>
</body>
</html>