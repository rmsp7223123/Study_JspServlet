package mapping;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.test2") // mapping은 주소를 통해서 들어온 요청을 정확하게 구분하기 위한것이기 때문에 중복되면 X
public class Test2 extends HttpServlet {
//	resp : Servlet 자체에서 응답을 처리할 때
	RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ㅁㅇㄹㄴㅇㄹ");
//		resp.getWriter().println("asdfsdf");
		req.setAttribute("info", "asdsadasdad");
		rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
	}
}
