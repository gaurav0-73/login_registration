<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Account</title>
<link rel="stylesheet" href="update.css">
</head>

<body>

<div class="container">

    <h2>Update Account</h2>

    <p> Welcome <b>${sessionScope.username}</b></p>
    <p><a href="updateName.jsp" class="btn"> Update Name</a></p>
    <p><a href="updateAddress.jsp" class="btn">Update Address</a></p>
    <p><a href="updateNumber.jsp" class="btn">Update Number</a></p>
    <br>
    <a href="loginSucc.jsp">Back to Profile</a>

</div>
</body>
</html>