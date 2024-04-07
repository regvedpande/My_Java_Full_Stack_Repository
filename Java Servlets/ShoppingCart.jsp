<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart</title>
</head>
<body>
<form action="processFormData.jsp" method="post">
Veggies : <input type="text" name="vegetableName">
Extra: <input type="text" name="extraItem"><br><br>

<select name="selectedStore">
<option>Big Bazaar</option>
<option>Jio Mart</option>
</select><br><br>

<input type="radio" name="favoriteDish" value="Palak Paneer">Palak Paneer
<input type="radio" name="favoriteDish" value="Gobi Manchurian">Gobi Manchurian<br><br>

<input type="submit" value="Submit">
</form>
</body>
</html>
