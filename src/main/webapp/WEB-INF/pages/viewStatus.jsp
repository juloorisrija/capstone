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
<h1>StatusReport</h1>
<table border="1">
		<tr>
			<th>StatusId</th>
			<th>comments</th>
			<th>Date</th>
			<th>userId</th>
			<th>complianceId</th>
			<th>departId</th>
			<th>Action</th>
		
			<c:forEach items="${StatusReportList}" var="stat">
				<tr>
					<td>${stat.getStatusId()}</td>
					<td>${stat.getComments()}</td>
					<td>${stat.getDate()}</td>
					<td>${stat.getUserId()}</td>
				    <td>${stat.getComplianceId()}</td>
				    <td>${stat.getDepartId()}</td>
                    <td><a href="add/${stat.getStatusId()}/${stat.getComments()}/${stat.getDate()}/${stat.getUserId()}/${stat.getComplianceId()}/${stat.getDepartId()}">add</a></td>
                      

</tr></c:forEach>
</table>
</body>
</html>