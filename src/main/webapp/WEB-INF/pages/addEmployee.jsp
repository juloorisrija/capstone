<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add a new employee!</h1>
	<form action="add" method="post">
		<!--  <input type="text" name="userId" placeholder="Enter user ID"/><br>-->
		<br>
		FirstName<br> <input type="text" name="firstName"placeholder="Enter firstname"/><br> <br> 
		LastName<br> <input type="text" name="lastName" placeholder="Enter lastname"/><br><br> 
		Date of Birth<br><input type="text" name="dob"/><br> <br> 
		Email<br><input type="text" name="email" placeholder="Enter email address"/><br><br> 
		DepartmentId<br><input type="number" name="departId" > <br><br>
		<input type="submit" value="Add employee"/><br> <br>
	</form>
	<h3 style="color: red">${msg}</h3>
</body>
</html>