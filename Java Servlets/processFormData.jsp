<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>

Veggies Picked is: ${param.vegetableName}<br>
Extras is: ${param.extraItem}<br>
Favourite Dish is :
<ul>
<%
String[] favoriteDishes = request.getParameterValues("favoriteDish");
for(String dish : favoriteDishes){
    out.println("<li>" + dish + "</li>");
}
%>
</ul>

</body>
</html>