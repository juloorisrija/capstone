<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update employee!!</h1>
	<form action="<%=request.getContextPath() %>/employee/update" method="post">
		<input type="number" value="${userId}" name=userId readonly="readonly" /><br />
		<br />
		<input type="text" value="${firstName}" name=firstName /><br />
		<br />
		<input type="text" value="${lastName}" name=lastName /><br />
		<br />
		<input type="text" value="${dob}" name=dob /><br />
		<br />
		<input type="text" value="${email}" name=email /><br />
		<br/>
		<input type="number" value="${departId}" name=departId /><br />
		<br/>
		<input type="submit" value="Update"/>
	</form>
	<h3 style="color: red">${updateMsg}</h3>

</body>
</html>-->