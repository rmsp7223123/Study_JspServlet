<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>선언문</h1>
	<!-- HTML 영역 -->
	<%!//자바코드 영역
	String var = "MBJ"; // 전역 변수 (필드, 멤버)%>
	<%
	String lv = "지역변수";
	%>
	<h3>
		var로 출력
		<%=var%></h3>
	<h3>
		lv로 출력
		<%=lv%></h3>
</body>
</html>
