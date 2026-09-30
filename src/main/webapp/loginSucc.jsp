
<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page session="true"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Login Successful</title>

    <link rel="stylesheet" href="loginSuccess.css">
</head>

<body>

    <div class="container">

        <h2>Login Successful</h2>

        <h3>Welcome ${sessionScope.username}</h3>

        <p>
            <b>Username:</b>
            ${sessionScope.username}
        </p>

        <p>
            <b>Password:</b>
            ${sessionScope.userpassword}
        </p>

        <!-- View Profile -->
        <a href="${pageContext.request.contextPath}/profile"
           class="btn">
            View Profile
        </a>

        <br><br>

        <!-- Update Profile -->
        <a href="${pageContext.request.contextPath}/update.jsp"
           class="btn">
            Update Profile
        </a>

        <br><br>

        <!-- Delete Account -->
        <form action="${pageContext.request.contextPath}/delete"
              method="post">

            <button type="submit">
                Delete Account
            </button>

        </form>

    </div>

</body>

</html>
