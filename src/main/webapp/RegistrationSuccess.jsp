<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>
<link rel="stylesheet" href="style.css">
</head>

<body>

<div class="container">

    <h2>Your data</h2>
     <p><b>Name:</b> <%= session.getAttribute("name") %></p>
    <p><b>Email:</b> <%= session.getAttribute("email") %></p>
    <p><b>Address:</b> <%= session.getAttribute("address") %></p>
    <p><b>Contact Number:</b> <%= session.getAttribute("number") %></p>
    <p><b>Gender:</b> <%= session.getAttribute("gender") %></p>
    <br>

    <a href="index.html" class="login">Go to Main</a>

</div>

</body>
</html>