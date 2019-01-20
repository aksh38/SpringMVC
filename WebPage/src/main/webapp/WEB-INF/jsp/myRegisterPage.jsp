<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register here...</title>
</head>
<body>
<div align="center">
	<form id="registrationForm" modelAttribute="user" action="registerProcess" method="post">
	
		First Name : <input  name="firstName" id="firstName" type="text"/><br/>
		Last Name  : <input  name="lastName"  id="lastName"  type="text"/><br/>
		User Name  : <input  name="userName"  id="userName"  type="text"/><br/>
		Email Id   : <input  name="email"     id="email"     type="email"/><br/>
		Password   :<input 	name="passWord"  id="passWord"  type="passWord"><br/>
		Confirm Password:<input  name="passWord2" id="passWord2" type="passWord"><br/>
		<!-- Address    : <input  name="address" 	 id="address"   type="text"><br/> -->
		Mobile Num :<input  name="mobileNum" id="mobileNum" type="text"><br/>
		<input  name="submit"    id="submit"    type="submit"><br/>
	
	</form>
	</div>
</body>
</html>