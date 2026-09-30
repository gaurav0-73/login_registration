<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Account Deleted</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;

            background-image: url("images/IMG-20250903-WA0014.jpeg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;

            height: 100vh;

            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            background-color: rgba(255, 255, 255, 0.95);

            width: 450px;
            padding: 40px;

            text-align: center;

            border-radius: 15px;
            opacity: 0.75;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.4);
        }

        h1 {
            color: green;
            margin-bottom: 20px;
        }

        p {
            color: #333;
            font-size: 18px;
            margin-bottom: 30px;
        }

        .btn {
            display: inline-block;

            background-color: purple;
            color: white;

            padding: 12px 25px;

            text-decoration: none;

            border-radius: 5px;

            font-size: 16px;
            font-weight: bold;

            transition: 0.3s;
        }

        .btn:hover {
            background-color: #5a005a;
            transform: scale(1.05);
        }

    </style>

</head>

<body>

    <div class="container">

        <h1>Your Account Deleted Successfully</h1>

        <p>Your account has been permanently deleted.</p>

        <a href="register.html" class="btn">
            Register Again
        </a>

    </div>

</body>

</html>
