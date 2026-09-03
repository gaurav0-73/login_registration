<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Successful</title>
<link rel="stylesheet" href="login.css">
</head>
<body>

<div class="container">

    <h2>Login Successful</h2>
    <h3>Welcome ${sessionScope.username}</h3>
    <p><b>Username:</b>${sessionScope.username}</p>
    <p><b>Password:</b>${sessionScope.userpassword}</p>
    <a href="update.jsp" class="btn">Update Profile</a>
    <br><br>
    <form action="delete" method="post">
        <button type="submit">Delete Account</button>
    </form>
</div>
</body>
</html>