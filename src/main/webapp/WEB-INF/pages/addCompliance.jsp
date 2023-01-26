<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Compliance List</h1>
	<form action="add" method="post">
		<!--  <input type="text" name="complianceId" placeholder="Enter comp ID"/><br><br>-->
		Details <br><input type="text" name="details" placeholder="Enter details"/><br><br>
		Date<br> <input type="text" name="date1" placeholder="Enter date"/><br> <br>
		DepartmentId<br> <input type="text" name="departId" placeholder="Enter departid"/><br><br> 
		EmployeeCount<br> <input type="number" name="emplcount"/><br><br> 
		Status<br> <input type="text" name="status1" placeholder="Enter status"/><br><br> 
		UserId<br> <input type="number" name="userId" ><br>
		 <br> <input type="submit" value="Add compliance"/><br><br>
	</form>
	<h3 style="color: red">${msg}</h3>
</body>
</html>