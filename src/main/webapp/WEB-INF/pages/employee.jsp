<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee List</h1>
	
	
	<table border="1">
		<tr>
			<th>userId</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>dob</th>
			<th>email</th>
			<th>departmentId</th>
			<th>Action</th>
			<c:forEach items="${employeeList}" var="employee">
				<tr>
					<td>${employee.getUserId()}</td>
					<td>${employee.getFirstName()}</td>
					<td>${employee.getLastName()}</td>
					<td>${employee.getDob()}</td>
					<td>${employee.getEmail()}</td>
					<td>${employee.getDepartId()}</td>
					<td>
						<a href="delete/${employee.getUserId()}">Delete</a>&nbsp;
						 <a href="update/${employee.getUserId()}/${employee.getFirstName()}/${employee.getLastName()}/${employee.getDob()}/${employee.getEmail()}/${employee.getDepartId()}">Update</a></td>
				</tr>
			</c:forEach>
	</table>


	<h3 style="color: red">${delMsg}</h3>


</body>
</html>