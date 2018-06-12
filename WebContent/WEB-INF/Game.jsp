<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet"   href="style.css" type="text/css">
<title>Great Number Game</title>
<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container text-center">
		<h1 >Welcome to the Great Number Game</h1>
		<h4>Im thinking of a number between 1 and 100</h4>
		<h4>Take a guess</h4>
		
		<%final String answer = (String) request.getAttribute("result"); %>
		<div style="margin: auto; margin-bottom: 10px; height: 150px; width: 150px; background-color: red;">
		<% if(answer == "You win!") {%>
			<h3>You Win!</h3>
		<% } else if(answer == "Too High!") { %>
			<h3>Too High!</h3>
		<% } else { %>
			<h3>Too low!</h3>
		<% } %>
		
		
		</div>
		
		
		<form action="GameCounter" method="post">
		<input type="number" name="guess" class="form-control" style="margin:auto; margin-bottom: 5px; width: 100px;">
		
		<button type="submit" class="btn btn-outline-info">Guess</button>
		</form>
		
	</div>

</body>
</html>