<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="profile.css">
</head>
<body>
	<div class="profile-container">
		<h1>My Profile</h1>
		<div class="profile-box">
			<p>
				<strong>Name:</strong> ${user.name}
			</p>
			<p>
				<strong>Email:</strong> ${user.email}
			</p>
			<p>
				<strong>Address:</strong> ${user.address}
			</p>
			<p>
				<strong>Contact Number:</strong> ${user.number}
			</p>
			<p>
				<strong>Gender:</strong> ${user.gender}
			</p>
		</div>
		<a href="loginSucc.jsp">Back</a>
	</div>

	</div>
</body>
</html>


