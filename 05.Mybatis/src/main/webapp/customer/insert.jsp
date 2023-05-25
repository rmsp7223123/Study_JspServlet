<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="new.cu">
		<table>
			<tr>
				<td>id</td>
				<td>이름</td>
				<td>성별</td>
				<td>이메일</td>
				<td>번호</td>
			</tr>
			<tr>
				<td><input type="text" name="id" placeholder="아이디"></td>
				<td><input type="text" name="name" placeholder="이름"></td>
				<td><input type="text" name="gender" placeholder="성별"></td>
				<td><input type="text" name="email" placeholder="이메일"></td>
				<td><input type="text" name="phone" placeholder="번호"></td>
			</tr>
		</table>
		<input type="submit" value="추가">
	</form>
</body>
</html>