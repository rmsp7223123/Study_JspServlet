<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>반복문</h3>
	<%
	for (int i = 0; i < 10; i++) {
	%>
	<p>
		확인<%=i%></p>
	<%
	}
	%>
	<table border="1px solid #333">
		<%
		for (int i = 2; i < 10; i++) {
		%>
		<tr style="background-color: orange">
		</tr>
		<%
		for (int j = 1; j < 10; j++) {
		%>
		<td><%=i + "*" + j + "=" + (i * j)%></td>
		<%
		}
		%>
		<%
		}
		%>

	</table>

	<table border="1px solid #333">
		<%
		for (int i = 1; i < 10; i++) {
		%>
		<tr>
		</tr>
		<%
		for (int j = 2; j < 10; j++) {
		%>
		<td><%=j + "*" + i + "=" + (i * j)%></td>
		<%
		}
		%>
		<%
		}
		%>

		<table border="1px solid #333">
			<%
			for (int i = 2; i < 10; i++) {
			%>
			<%
			if (i % 2 == 1) {
			%>
			<tr style="background-color: orange"></tr>
			<%
			} else {
			%>
			<tr style="background-color: red"></tr>
			<%
			}
			%>
			<%
			for (int j = 1; j < 10; j++) {
			%>
			<td><%=i + "*" + j + "=" + (i * j)%></td>
			<%
			}
			%>
			<%
			}
			%>

		</table>

	</table>
</body>
</html>