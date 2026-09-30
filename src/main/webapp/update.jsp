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
    <p class="welcome">Welcome <%= session.getAttribute("username") %></p>
    <!-- Update Name -->
    <a href="updateName.jsp" class="update-btn">Update Name</a>
    <!-- Update Address -->
    <a href="updateAddress.jsp" class="update-btn">Update Address</a>
    <!-- Update Number -->
    <a href="updateNumber.jsp" class="update-btn">Update Number</a><br>
    <a href="loginSucc.jsp" class="back-btn">Back to Profile</a>
</div>
</body>
</html>
