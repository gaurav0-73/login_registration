<%@ page session="true" %>

<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Update Address</title>


<link rel="stylesheet" href="updateAddress.css">

</head>

<body>

<div class="container">

    <h2>Update Address</h2>

    <p class="welcome">
        Update your address
    </p>

    <form action="update" method="post">

        <input type="hidden" name="type" value="address">

        <input type="text"
               name="value"
               placeholder="Enter new address"
               required>

        <button type="submit" class="update-btn">
            Update Address
        </button>

    </form>

    <a href="update.jsp" class="back-btn">
        Back
    </a>

</div>


</body>
</html>
