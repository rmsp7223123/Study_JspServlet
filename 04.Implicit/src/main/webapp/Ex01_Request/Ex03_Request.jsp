<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form action="../jdbclogin" Method="post">
		<input type="text" name="id" placeholder="아이디"> <input
			type="text" name="pw" placeholder="비밀번호"> <input
			type="submit">
	</form>
</body>
</html>