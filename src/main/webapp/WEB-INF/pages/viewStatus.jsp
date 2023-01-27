<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <title>Employee Management System</title>
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
      <a class="navbar-brand" href="#">Employee Management System</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Dashboard</a></li>
        
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
        <li><a href="http://localhost:8080/capstoneproject/compliance/all" style="color:white;">Compliance</a></li>
        <li><a href="http://localhost:8080/capstoneproject/compliance/add" style="color:white;">Add Compliance</a></li>
        <li><a href="http://localhost:8080/capstoneproject/status/all"style="color:white;">Status Report</a></li>
      </ul><br>
    </div>
     <br> 
    <div class="col-sm-9">
      <div class="well" style="background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);">
        <h4 style="color:white;font-weight:bolder;">StatusReport</h4>
      </div>
<table border="1" align="center">
		<tr>
			<th>StatusId</th>
			<th>comments</th>
			<th>Date</th>
			<th>userId</th>
			<th>complianceId</th>
			<th>departId</th>
			
		
			<c:forEach items="${StatusReportList}" var="stat">
				<tr>
					<td>${stat.getStatusId()}</td>
					<td>${stat.getComments()}</td>
					<td>${stat.getDate2()}</td>
					<td>${stat.getUserId()}</td>
				    <td>${stat.getComplianceId()}</td>
				    <td>${stat.getDepartId()}</td>
                    <!--  <td><a href="add/${stat.getStatusId()}/${stat.getComments()}/${stat.getDate2()}/${stat.getUserId()}/${stat.getComplianceId()}/${stat.getDepartId()}">add</a></td>-->
                      

</tr></c:forEach>
</table>
</body>
</html>