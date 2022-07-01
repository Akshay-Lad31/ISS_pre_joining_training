<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Web App - Home Page</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
	<body class="text-center">
  	<img src="resources/welcome.jpg" class="w-50 mt-5 rounded" >
  	<h1> Welcome &nbsp;<%= session.getAttribute("sessionUser1")%> &nbsp;, <br>
  	This is the Home page. </h1>
  	
  	<form action="<%= request.getContextPath()%>/logout">
  	<button class="w-50 btn btn-danger btn-primary" type="submit">Logout</button>
  	</form>
  </body>
</body>
</html>