<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>create a status!!</h1>

<form action="addStatus" method="post">

<!--  <input type="number" name="statusId" placeholder="Enter the status Id"/><br>-->

Comments<br><input type="text" name="comments" placeholder="Enter the comments"/><br>

Date<br><input type="text" name="date2" placeholder="Enter the date"/><br>

userId<br><input type="number" name="userId" placeholder="Enter the userid"/><br>

ComplianceId<br><input type="number" name="complianceId" value="${id}" placeholder="Enter the complianceid"/><br>

DepartmentId<br><input type="number" name="departId" placeholder="Enter the departid"/><br>

<input type="submit" value="Add status"/><br>

</form>
<h3 style="color:red">${msg}</h3>
</body>
</html>