<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Name</title>
</head>
<body>

<h2>Update Name</h2>
<form action="update" method="post">

    <input type="hidden" name="type" value="name">
    <input type="text" name="value" placeholder="Enter new name">
    <button type="submit">Update Name</button>

</form>
</body>
</html>