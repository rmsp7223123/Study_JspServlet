package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mbj.MbjDAO;

@WebServlet("*.bat")
public class MybatisController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ㅁㄴㅇㅁㄴㅇ");
		MbjDAO dao = new MbjDAO();
		dao.test();

	}
}
