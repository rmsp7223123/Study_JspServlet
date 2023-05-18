package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ts")
public class TestServlet extends HttpServlet {
//	02프로젝트는 세팅부분을 혼자 실습하고 request와 response를 대략적으로 살펴보는 프로젝트
//	URL : 톰캣 (localhost:portNumber(192.168.0.87:8080)/WebProject/Mapping)
//				192.168.0.87:8080/02.DogetDoPost/ts 요청시 dogetMethod가 자동으로 실행
//	프로젝트를 새로 만들었을 때 Tomcat이 프로젝트를 인식할 수 있게 add&remove를 통해서 프로젝트에 넣어줌

//	HttpServeletRequest : Request객체 톰캣에서 요청이 오면 모든 정보를 Request를 통해 담아서 Java코드로 줌
//						  요청에 관련된 모든 기능을 담당함
//	HttpServletReseponse : Reseponse객체 Request객체로 요청 처리를 받고 Client(크롬)에 응답을 주기 위한 객체
//						   페이지 전환, 페이지에 내용 표시 등의 크롬창 표시를 담당

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("호출");
		String param = req.getParameter("param");
		System.out.println("크롬을 통해 GET방식으로 param 정보가 들어옴 " + param);

//		Model : 현재 param.equals해놓은 부분을 DAO(JDBC)를 이용해 select 쿼리 수행 후 결과로 판단하게 수정
//		ex) id : 1234, pw : 123 ==> newPage, else 올바른 요청아님
		if (param != null && param.equals("newPage")) {
			RequestDispatcher rd = req.getRequestDispatcher("index.html"); // index.html을 요청
			rd.forward(req, res);
		} else {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=utf-8");
			PrintWriter writer = res.getWriter();
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>틀림</h1>");
			writer.println("</body>");
			writer.println("</html>");
		}

//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
