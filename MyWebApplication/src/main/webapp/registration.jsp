<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SignUp Page </title>
	<script src="javascript/verification.js"> </script>
	<link href="bootstrap/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
	<div class="h-50 mt-10 inline-block text-center">
        <h1 class= "h1 mt-10">Hello</h1>
    <main class="form-signin w-50 h-50 mx-auto">
	<form name="registration" onsubmit="return verify()" action="<%= request.getContextPath() %>/register" method="post">
	 	<h1 class="h1 my-3 font-monospace">Fill in your details to SignUp! </h1>
	
		<div class="form-floating">
		  <input name = "userName" type="text" class="form-control" id="floatingInput" placeholder="John Doe">
		  <label for="floatingInput">Full Name</label>
		</div>
		
		<div class="form-floating">
		  <input name = "userEmailID" type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
		  <label for="floatingInput">Email address</label>
		</div>
		<div class="form-floating">
		  <input name = "userPassword" type="password" class="form-control" id="floatingPassword" placeholder="Password">
		  <label for="floatingPassword">Password</label>
		</div>
		
		<div class="form-floating">
		  <input name = "confirmPassword" type="password" class="form-control" id="floatingPassword" placeholder="Password">
		  <label for="floatingPassword">Confirm Password</label>
		</div>
		
		<div>
			<p> Already have an account?
			<a href="<%= request.getContextPath()%>/">Login</a>
			</p>
		</div>
	
	  	<button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
	  	<p class="mt-5 mb-3 text-muted">&copy; 2022-23 (For project purpose only)</p>
	</form>
</main>
</div>
</body>
</html>