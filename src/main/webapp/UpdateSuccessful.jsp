<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Successful</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <h2>Update Successful</h2>
    <h3>  Welcome : <%= session.getAttribute("username") %></h3>   
    <a href="loginSuccessful.jsp" class="btn">View Profile</a>
    <a href="update.jsp" class="btn">Update Again</a>

</div>
</body>
</html>