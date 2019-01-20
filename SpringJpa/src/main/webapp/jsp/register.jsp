<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Here</title>
</head>
<body>
<form action="processRegister">
<div align="center">
	<h3>Register Page</h3>
	Username  :<input type="text" 	  name="username"  id="username"><br><br>
	Firstname :<input type="text" 	  name="firstname" id="firstname"><br><br>
	Lastname  :<input type="text" 	  name="lastname"  id="lastname"><br><br>
	Password  :<input type="password" name="password"  id="password"><br><br>
	Confirm
	Password  :<input type="password" name="password2"  id="password2"><br><br>
	Mobile No.:<input type="text" name="mobilenum"  id="mobilenum"><br><br>
		<div align="center">
		<button name="register" formaction="register" id="register">Register</button>
		<button name="login" formaction="login" id="login">Goto Login</button>
		</div>
	</div>
</form>
</body>
</html>