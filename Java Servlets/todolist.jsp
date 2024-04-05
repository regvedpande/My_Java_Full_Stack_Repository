<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>To Do List</title>
</head>
<body>

<form action="todolist.jsp" method="post">
    Enter Items: <input type="text" name="todoitem" placeholder="Enter the List of Items">
    <input type="submit" value="Add">
</form><br>

Item Entered: <%= request.getParameter("todoitem") %>

<%
List<String> items = (List<String>)session.getAttribute("todoservlet");

if (items == null) {
    items = new ArrayList<>();
    session.setAttribute("todoservlet", items);
}

String theItem = request.getParameter("todoitem");
if (theItem != null && !theItem.trim().equals("")) {
    items.add(theItem);
}
%>

<hr>
<b>To-do List Items</b>

<ol>
<%
for (String temp : items) {
    out.println("<li>" + temp + "</li>");
}
%>
</ol>
</body>
</html>
