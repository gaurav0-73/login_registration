<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Successful</title>

<link rel="stylesheet" href="updateSuccessful.css">
</head>
<body>
<div class="container">

    <h2>Update Successful!</h2>

    <h3>Welcome : <%= session.getAttribute("username") %></h3>
    <p class="message"> Your information has been updated successfully.</p>
    <p class="message">Do you want to update more?</p>
    <a href="update.jsp" class="btn">Yes, Update More</a>
    <a href="loginSuccessful.jsp" class="btn">No, Go to Profile</a>

</div>
</body>
</html>
