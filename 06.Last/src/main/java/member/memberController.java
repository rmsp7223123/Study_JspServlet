package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.mem")
public class memberController extends HttpServlet {
	RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getServletPath().equals("/member/Loginpage.mem")) {
			rd = req.getRequestDispatcher("login.jsp");
		} else if (req.getServletPath().equals("/member/login.mem")) {
			System.out.println(req.getParameter("id"));
			System.out.println(req.getParameter("pw"));
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			if (id.equals("mbj") && pw.equals("123")) {
				resp.getWriter().print("O");
			} else {
				resp.getWriter().print("X");
			}
			return;
		} else {

		}
		rd.forward(req, resp);
	}
}
