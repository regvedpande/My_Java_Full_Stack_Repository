<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String [] cities = {"Nagpur", "Mumbai", "Pune"};
pageContext.setAttribute("myCities", cities ); /*Key Value Pairs  */
%>

<c:forEach var="citylist" items="${myCities}">
${citylist}
<br>
</c:forEach>

</body>
</html>
