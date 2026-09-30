<%@ page session="true" %>

<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Update Number</title>

<link rel="stylesheet" href="updateNumber.css">


</head>

<body>

<div class="container">

    <h2>Update Contact Number</h2>

    <p class="welcome">
        Enter your new 10-digit contact number
    </p>

    <form action="update" method="post">

        <input type="hidden" name="type" value="number">

        <input type="text"
               name="value"
               placeholder="Enter 10-digit number"
               maxlength="10"
               required>

        <button type="submit" class="update-btn">
            Update Number
        </button>

    </form>

    <a href="update.jsp" class="back-btn">
        Back
    </a>

</div>


</body>
</html>
