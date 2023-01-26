<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update compliance!!</h1>
	<form action="<%=request.getContextPath() %>/compliance/update" method="post">
		<input type="number" value="${complianceId}" name=complianceId readonly="readonly" /><br />
		<br />
		<input type="text" value="${details}" name=details /><br />
		<br />
		<input type="text" value="${date1}" name=date1 /><br />
		<br />
		<input type="text" value="${departId}" name=departId readonly="readonly"/><br />
		<br />
		<input type="text" value="${emplcount}" name=emplcount /><br />
		<br/>
		<input type="text" value="${status1}" name=status1 /><br />
		<br/>
		<input type="number" value="${userId}" name=userId readonly="readonly"/><br />
		<br/>
		<input type="submit" value="Update"/>
	</form>
	<h3 style="color: red">${updateMsg}</h3>

</body>
</html>