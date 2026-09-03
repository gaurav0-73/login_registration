<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Address</title>
</head>
<body>

<h2>Update Address</h2>

<form action="update" method="post">
    <input type="hidden" name="type" value="address">
    <input type="text" name="value" placeholder="Enter new address">
    <button type="submit">Update Address</button>

</form>
</body>
</html>