<!-- You always have to add JAR File in Lib -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- c is  prefix in which we store this files-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="stuff" value="<%=new java.util.Date() %>"/>
The Time on the server is ${stuff}
<!-- c: is called JSTL Tag -->
<c:set var="cal" value="<%=10*5 %>"/><br>
Result is : ${cal}

</body>
</html>