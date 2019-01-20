<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="processLogin">
		
		<div align="center">
			<h3>Login Page </h3>
			Username : <input type="text" name="username" id="username"><br><br>
			Password : <input type="password" name="password" id="password"><br><br>
			<button name="login" formaction="login" id="login">Login</button>
			<button name="register" formaction="register" id="register">Goto Register</button>
		</div>

	</form>
</body>
</html>