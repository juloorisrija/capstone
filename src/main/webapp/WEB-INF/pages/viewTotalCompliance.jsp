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
<h1>Compliance List</h1>
<table border="1">
		<tr>
			<th>comp_Id</th>
			<th>Details</th>
			<th>Date</th>
			<th>depart_Id</th>
			<th>employee_Count</th>
			<th>Status</th>
			<th>employee_Id</th>
			<th>Action</th>
			<c:forEach items="${complianceList}" var="comp">
				<tr>
					<td>${comp.getComplianceId()}</td>
					<td>${comp.getDetails()}</td>
					<td>${comp.getDate()}</td>
					<td>${comp.getDepartid()}</td>
				    <td>${comp.getEmplcount()}</td>
				    <td>${comp.getStatus()}</td>
                    <td>${comp.getUserid()}</td>
                    <td><a href="update/${comp.getDetails()}/${comp.getDate()}/${comp.getDepartid()}/${comp.getEmplcount()}/${comp.getStatus()}/${comp.getUserid()}">Update</a>&nbsp;
                    <a href="addStatus">create Status</a> </td>

</tr></c:forEach>
</table>
</body>
</html>