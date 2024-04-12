<%@page import="java.util.List, com.mkpits.books.MyBooks"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Tracker App</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<%
    // Get the list of books from the request
    List<MyBooks> books = (List<MyBooks>) request.getAttribute("BOOK_LIST");
%>
<body>
<div id="wrapper">
    <div id="header">
        <h2>Book Library</h2>
    </div>
</div>

<div id="container">
    <div id="content">
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Date</th>
                <th>Genres</th>
                <th>Characters</th>
                <th>Synopsis</th>
            </tr>
            <c:forEach var="book" items="${BOOK_LIST}">
            <tr>
               <td>${book.id}</td>
               <td>${book.title}</td>
               <td>${book.author}</td>
               <td>${book.date}</td>
               <td>${book.genres}</td>
               <td>${book.characters}</td>
               <td>${book.synopsis}</td>
           </tr>
            </c:forEach>

        </table>
    </div>
</div>
</body>
</html>
