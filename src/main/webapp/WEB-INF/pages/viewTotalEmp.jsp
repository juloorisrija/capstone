<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	

<!DOCTYPE html>
<html>
<head>
  <title>Employee Dashboard</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 550px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);
      height: 100%;
    }
        
    /* On small screens, set height to 'auto' for the grid */
    @media screen and (max-width: 767px) {
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>
<nav class="navbar navbar-inverse visible-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="dashboard">Dashboard</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav hidden-xs">
	<br><br>
      <ul class="nav nav-pills nav-stacked">
       <li class="active"><a href="login">Login</a></li><br>
        <li class="active"><a href="http://localhost:8080/capstoneproject/dashboard">Dasboard</a></li>
        <li><a href="http://localhost:8080/capstoneproject/employee/action"style="color:white;">Employee Details</a></li>
        <li><a href="http://localhost:8080/capstoneproject/employee/add"style="color:white;"> Add Employee Details</a></li>
        <li><a href="http://localhost:8080/capstoneproject/employee/all"style="color:white;">Delete and update Employee</a></li>
        <li><a href="http://localhost:8080/capstoneproject/employee/count"style="color:white;">Total Employees</a></li>
      </ul><br>
    </div>
    <br> 
    <div class="col-sm-9">
      <div class="well" style="background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);">
        <h4 style="color:white;font-weight:bolder;">Employee List</h4>
      </div>
	
	
	<table border="1"align="center">
		<tr>
			<th>userId</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>dob</th>
			<th>email</th>
			<th>departmentId</th>
			<c:forEach items="${employeeList}" var="employee">
				<tr>
					<td>${employee.getUserId()}</td>
					<td>${employee.getFirstName()}</td>
					<td>${employee.getLastName()}</td>
					<td>${employee.getDob()}</td>
					<td>${employee.getEmail()}</td>
					<td>${employee.getDepartId()}</td>
					
				</tr>
			</c:forEach>
	</table>
</body>
</html>