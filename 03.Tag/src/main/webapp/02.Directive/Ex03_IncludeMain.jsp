<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 반복되는 헤더나 푸터를 계속해서 복붙하고 작업하는것은 불합리
		 파일에 포함시키는 방식(미리 만들어놓은 다른파일을 이용)
		 장점 : 헤더와 푸터 파일 자체를 재사용 했기때문에 수정이 필요하다면 헤더파일 하나만 수정하면 해결가능
		 단점 : 헤더와 푸터가 기능이 안되거나 오류가 발생하면 모든 화면에서 X
	 -->
	<%@ include file="Ex03_Header.jsp"%>
	<p>컴퍼니</p>
	<p>메인페이지입니다.</p>
	<p>컨텐츠가 여기있음</p>
	<%@ include file="Ex03_Footer.jsp"%>
</body>
</html>