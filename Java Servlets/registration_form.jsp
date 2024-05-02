
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <style>
        /* Your CSS styles here */
             body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        
        form {
            width: 50%;
            margin: 0 auto;
            border: 1px solid #579214;
            padding: 20px;
            border-radius: 10px;
            background-color: #f9f9f9;
        }

        input[type="text"],
        input[type="password"],
        select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px;
            outline: none;
        }

        input[type="submit"] {
            background-color: #579214;
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            outline: none;
        }

        input[type="submit"]:hover {
            background-color: #3e7e06;
        }

        h2 {
            color: #579214;
        }
    </style>
</head>
<body>
    <h2>User Registration Form</h2>
    <form action="Registrar" method="post">
        <!-- <label for="id">ID:</label><br>
        <input type="text" id="id" name="id" required><br> -->
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br>
        <label for="email">Email:</label><br>
        <input type="text" id="email" name="email" required><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br>
        <label for="gender">Gender:</label><br>
        <select id="gender" name="gender">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select><br>
        <label for="city">City:</label><br>
        <input type="text" id="city" name="city" required><br>
        <label for="mobile">Mobile:</label><br>
        <input type="text" id="mobile" name="mobile" required><br><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
