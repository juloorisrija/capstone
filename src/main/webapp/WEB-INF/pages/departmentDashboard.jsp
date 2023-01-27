<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Department Dashboard</title>
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
      <a class="navbar-brand" href="#">Logo</a>
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
      
      <ul class="nav nav-pills nav-stacked">
         <br><br>
        <li class="active"><a href="login">Login</a></li><br>
        <li class="active"><a href="dashboard">Dasboard</a></li>
        <li><a href="department/All"style="color:white;">Total Departments</a></li>
        <li><a href="department/addDepart"style="color:white;"> Add Department Details</a></li>
        <li><a href="department/Alldepart"style="color:white;">Delete Department</a></li>
        <li><a href="department/count"style="color:white;">Total Department Count</a></li>
      </ul><br>
    </div>
    <br> 
     <div class="col-sm-9">
      <div class="well"style="background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);">
       
      </div>
      <div class="row">
        <div class="col-sm-3">
          <div class="well" style="background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);">
            <h4 style="color:white;font-weight:bolder;">Total Departments</h4>
            <a href="department/All"><button type="button" class="btn btn-primary" style="margin-left: 130px;">-></button></a>
          </div>
        </div>
         <div class="row">
        <div class="col-sm-3">
          <div class="well"style="background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);">
            <h4 style="color:white;font-weight:bolder;">Add Departments</h4>
            <a href="department/addDepart"><button type="button" class="btn btn-primary" style="margin-left: 150px;">-></button></a>
          </div>
        </div>
        <div class="row">
        <div class="col-sm-3">
          <div class="well"style="background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://img.freepik.com/free-vector/gradient-network-connection-background_23-2148865393.jpg?size=626&ext=jpg);">
            <h4 style="color:white;font-weight:bolder;">Delete Department</h4>
            <a href="department/Alldepart"><button type="button" class="btn btn-primary" style="margin-left: 150px;">-></button></a>
          </div>
        </div>
      
    </div>
  </div>
</body>
</html>
    