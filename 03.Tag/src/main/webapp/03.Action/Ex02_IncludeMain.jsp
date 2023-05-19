<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>디렉티브 태그를 이용해 인클루드를 진행했음</h1>
	<p>액션태그의 include 태그가 열려있으면 어떤 인자값(파라미터)를 보내준다고 인식함</p>
	<p>디렉티브 태그와 액션태그의 include차이는 파라미터의 전달 여부</p>

	<h1>액션을 통한 인클루드</h1>
	<jsp:include page="Ex02_Header.jsp">
		<jsp:param value="Logo" name="logoName" />
	</jsp:include>
	<h2>액션태그 페이지 컨텐츠</h2>
	<jsp:include page="Ex02_Footer.jsp">
		<jsp:param value="Logo2" name="logoName2" />
	</jsp:include>
</body>
</html>