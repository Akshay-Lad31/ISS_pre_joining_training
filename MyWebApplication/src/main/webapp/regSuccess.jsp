<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Web APP - Login Success</title>
</head>
<body>
	<body class="text-center">
  	<h1><%= session.getAttribute("RegistrationSuccess")%></h1>
  	
  	<form action="<%= request.getContextPath()%>/login">
  	<p>To Login in click this Button</p> 
  	<button class="w-50 btn btn-lg btn-primary" type="submit">Login</button>
  	</form>
  	
</body>
</html>