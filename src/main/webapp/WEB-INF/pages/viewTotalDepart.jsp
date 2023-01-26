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
<h1>Department List</h1>
<table border="1">
		<tr>
			<th>Dept_Id</th>
			<th>Dept_Name</th>
			
			<c:forEach items="${departmentList}" var="dept">
				<tr>
					<td>${dept.getDepartId()}</td>
					<td>${dept.getDepartName()}</td>
				   
</tr></c:forEach>
</table>
</body>
</html>