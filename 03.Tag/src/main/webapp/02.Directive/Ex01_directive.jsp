<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>디렉티브 태그 (Directive Tag)</h1>
	<h3>페이지가 어떤 언어와 설정을 통해서 SErvlet 클래스로 변환되는지에 대한 설정</h3>
	<h3>설정 자체는 변할일이 거의 없음</h3>
	<h4>ContentType : 어떤 형태로 페이지를 출력한건지에 대한 결정 : 웹은 text/html;고정</h4>
	<h4>charset=utf-8 : 문자 인코딩 (각 나라별 언어마다 인코딩 방식이 다름. 한글 = utf-8)</h4>
	<h4>import 자바 클래스를 servlet에 로딩 해야하는 경우 사용(Random)</h4>

	<p>
		import 구문 : 자바 클래스 추가
		<%=new Random().nextInt(10)%></p>
</body>
</html>