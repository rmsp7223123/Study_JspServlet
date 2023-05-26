package mapping;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.test") // " " <== URL을 통해서 들어온 값 (구분자)
public class Test1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("여기까지옴");
		System.out.println(req.getParameter("key1"));
		System.out.println(req.getParameter("key2"));
//		resp.getWriter().println("test");
//		사용자가 어떤 요청을 하고 있을 때 필요한 정보가 있다면 url로 파라미터를 넘겨줌
//		GET : mapping?name=value
	}
}
