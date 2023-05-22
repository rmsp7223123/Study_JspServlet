<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>2222</h1>
	<form action="../Ex02_Request" method="get">
		<%
		for (int i = 1; i <= 30; i++) {
		%>
		<input type="text" name="name<%=i%>" value="<%=i%>">
		<%
		}
		%>
		<input type="submit">
	</form>
</body>
</html>