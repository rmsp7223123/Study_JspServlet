package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.CustomerDAO;
import customer.CustomerVO;

@WebServlet("*.cu") // 하나의 요청씩 처리
//					   특정 규칙을 가진 구분자의 모든 처리 (cu) : '/'(x), *.cu
//					   Servlet 파일 추가시 꼭 해야할 것 ==> 서버 리스타트
//					   페이지의 요청 : RequestDispatcher
public class customerController extends HttpServlet {
	RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mapping = req.getServletPath();
		CustomerDAO dao = new CustomerDAO();
		List<CustomerVO> list = dao.listSelect();
		if (mapping.equals("/list.cu")) {
			req.setAttribute("list", list); // jsp페이지에 조회 된 결과를 보여줌
			rd = req.getRequestDispatcher("customer/list.jsp");
		} else if (mapping.equals("/detail.cu")) {
//			url 또는 get post방식으로 servlet으로 오는 모든 데이터는 parameter(String)
//			req(요청) res(응답)
//			req객체의 set&getAttribute, getParameter
//			getParameter : jsp또는 html페이지에서 servlet(back)요청(a태그, from태그, url)
//			setAttribute, getAttribute : servlet에서 동작을 하고 데이터를 전송 ==> 
			int id = Integer.parseInt(req.getParameter("id"));
			rd = req.getRequestDispatcher("customer/detail.jsp");
			CustomerVO vo = dao.selectDetail(id);
			req.setAttribute("vo", vo);
		} else if (mapping.equals("/update.cu")) {
			String id = (req.getParameter("id"));
			String email = (req.getParameter("email"));
			String phone = (req.getParameter("phone"));
			dao.update(id, email, phone);
		} else if (mapping.equals("/insert.cu")) {
//			String id = (req.getParameter("id"));
//			String name = req.getParameter("name");
//			String gender = req.getParameter("gender");
//			String email = (req.getParameter("email"));
//			String phone = (req.getParameter("phone"));
			rd = req.getRequestDispatcher("customer/insert.jsp");
			// dao.insert(id, name, gender, email, phone);
		} else if (mapping.contentEquals("/new.cu")) {
			CustomerVO vo = new CustomerVO();
			vo.setId(Integer.parseInt(req.getParameter("id")));
			vo.setName(req.getParameter("name"));
			vo.setGender(req.getParameter("gender"));
			vo.setEmail(req.getParameter("email"));
			vo.setPhone(req.getParameter("phone"));
			dao.insert(vo);
		}

		else {
			System.out.println("잘못됨");
		}
		rd.forward(req, resp);
	}
}
