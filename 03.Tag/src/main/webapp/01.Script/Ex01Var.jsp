<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>변수 사용해보기</h3>
	<%!int sVar = 0;%>
	<!-- 전역변수 -->
	<%
	int lVar = 0;
	%>
	<!-- 전역변수 -->
	<p>
		sVar
		<%=++sVar%></p>
	<p>
		lVar
		<%=++lVar%></p>
	<%
	String[] strArr = { "T", "E", "S", "T" };
	ArrayList<String> strList = new ArrayList<>();
	strList.add(0, "T");
	strList.add(1, "E");
	strList.add(2, "S");
	strList.add(3, "T");
	%>
	<p><%=strArr[0] + strArr[1] + strArr[2] + strArr[3]%></p>
	<p><%=strList.get(0) + strList.get(1) + strList.get(2) + strList.get(2)%></p>
</body>
</html>