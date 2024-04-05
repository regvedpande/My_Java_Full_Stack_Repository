<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Full Name of the Candidate is : ${param.fname}  ${param.lname}<br>
Favourite Country is : ${param.country}<br>
Favourite Language is : ${param.favouritelanguage}<br>
Favourite Hobby is :
<ul>
<%
String[] hobbies = request.getParameterValues("hobbies");
//Iterating Hibbies and adding it in the list
for(String list : hobbies){
	out.println("<li>" + list + "<li>");
}
%>
</ul>

</body>
</html>