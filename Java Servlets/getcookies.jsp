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
String like = request.getParameter("language");

Cookie mycook = new Cookie("myApp.language", like);

mycook.setMaxAge(60*60*24*365);

response.addCookie(mycook);

%>
We Set your Favourite Language to : ${param.language};
<hr>
<a href="CookieResponse.jsp">Click to Redirect</a>
</body>
</html>