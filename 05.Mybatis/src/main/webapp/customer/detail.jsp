<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${vo.name}의상세정보</h1>
	<form action="update.cu">
		<input type="hidden" name="id" value="${vo.id}"> <input
			type="text" name="email" value="${vo.email}"><input
			type="text" name="phone" value="${vo.phone}"> <input
			type="submit" value="수정">
	</form>
</body>
</html>
