<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Welcome</title>
    <style>
        body{
	min-height: 100vh;
    width: 100%;
    background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)),url(https://wallpapercave.com/dwp1x/wp11876506.jpg);
    background-position: center;
    background-size: cover;
    position: relative;
}
.registration{
	background:rgba(0,0,0,0.3);
	width:400px;
	height:300px;
	margin-top:50px;
	border-radius:10px;
	text-align:center;
}

h3{
	color:#fff;
}

.registrationformcontent{
	margin-top:10px;
}
.qw{
	background-color: rgba(0,0,0,0.3);
	width:400px;
	height:-300px;
	margin-top:50px;
	border-radius:10px;
	text-align:center;
}

    </style>
</head>
<body >
    <nav class="navbar navbar-expand-lg bg-body-tertiary bg-info">
        <div class="container-fluid">
          <a class="navbar-brand" href="#"><span style="color: black;"><b>Employee</b></span><span style="color: grey;"><b>Mangement</b></span></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
              
              </ul>
        </div> 
      </nav>
      <center><form  action="dashboard" method="post" class="registration" >
        <div class="registrationformcontent">
		<h3 >Login Page</h3>
		<label style="margin-left:-125px;color:#fff;">User ID: </label>
		<br>
		<input type="number" id="uid" name="userId" required>
		<br>
		<label style="margin-left:-120px;color:#fff;">Password: </label>
		<br>
		<input type="password" id="password" name="password" required>
        <br>
        <br>
		<div class="col-s-2" style="margin-left: -70px;">
			<input type="submit" value="Login" class="btn btn-primary">
           <!--   <a href="#">signUp</a>-->
		</div>
        
		</div>
		<div Style="color:red">${error}</div>
		</form></center>
		
</body>
</html>