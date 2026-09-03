<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Number</title>
</head>
<body>
<h2>Update Number</h2>

<form action="update" method="post">
    <input type="hidden" name="type" value="number">
    <input type="text" name="value" placeholder="Enter 10 digit number"maxlength="10"required>
    <button type="submit">Update Number</button>

</form>
</body>
</html>