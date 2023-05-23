<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스코프(데이터 전달범위)</h1>
	<p>데이터를 전달하는 범위가 각각의 스코프(비율,배율)마다 차이가 있음</p>
	<p>많은 데이터를 사용하지 않음. 계속 전달을 하면 메모리에 기억을 해두고 유지를 해야함</p>
	<p>많은 데이터를 사용하는 경우, 계속 메모리에 누적시켜두면 홈페이지 자체가 느려짐</p>
	<p>PageContext(JSP페이지 내부에서만 데이터를 전달하는 목적으로 사용되는 객체.(사용빈도가 매우 낮음))</p>
	<p>※Request(요청이 들어왔을 때, Forward(페이지요청)시에 딱 한번만 데이터를 유지함.
		URL=>Servlet, Servlet=>URL)</p>
	<p>※Session(브라우저 내에서는 계속해서 유지되는 정보, 주로 로그인 정보나상태 정보등으로 건수가 많은 데이터가
		아닌 경우)</p>
	<p>ApplicationContext(어플리케이션이 완전히 종료되지 않는 한 계속해서 유지됨 => 버전 정보, 특정한
		업데이트를 위한 값 외에는 저장 X)</p>
	<%
	pageContext.setAttribute("pageCtx", "MBJ_PAGE_CTX"); // 페이지 내에만 사용하느 ㄴ객체
	request.setAttribute("req", "MBJ_REQ");
	//	Request => 1. getParmeter(URL 또는 FORM 태그를 이용한 경우 내부 태그를 name으로 구분하여 파라미터가 String으로 들어있음)
	//			   2. Attribute(어떤 요청을 통해서 오거나 Request가 Forward라는 기능으로 페이지 전환을 하는 경우 Object 들어있음)
	session.setAttribute("session", "MBJ_SESSION");
	application.setAttribute("app", "MBJ_APPV1.1");
	%>
	<p>
		pageContext :
		<%=pageContext.getAttribute("pageCtx")%></p>
	<!-- PageContext 페이지 내에서만 데이터가 유지됨(지역변수와 유사) -->
	<p>
		request :
		<%=request.getAttribute("request")%></p>
	<!-- Forward라는 페이지 요청이 있을때만 다음페이지로 전송, 넘어가는 처리가 됨(메소드 파라미터와 유사) -->
	<p>
		session :
		<%=session.getAttribute("session")%></p>
	<!-- 전역변수(필드)와 유사함 크롬창을 새로 띄우거나(브라우저 다른것) 또는 서버가(리스타트 되면서 유지가 되고 안되고가 랜덤) -->
	<p>
		application :
		<%=application.getAttribute("application")%></p>
	<jsp:forward page="Ex04_ScopeResult.jsp"></jsp:forward>
</body>
</html>