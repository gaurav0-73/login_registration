<%@ page session="true" %>

<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Update Name</title>


<link rel="stylesheet" href="updateName.css">


</head>

<body>


<div class="container">

    <h2>Update Name</h2>

    <p class="welcome">
        Current Name : <%= session.getAttribute("username") %>
    </p>

    <form action="update" method="post">

        <input type="hidden" name="type" value="name">

        <input type="text"
               name="value"
               placeholder="Enter new name"
               required>

        <button type="submit" class="update-btn">
            Update Name
        </button>

    </form>

    <a href="update.jsp" class="back-btn">
        Back
    </a>

</div>


</body>
</html>
