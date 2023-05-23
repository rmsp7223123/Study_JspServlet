package Controller;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mbj.MbjVO;

// 어떤글자.js <-로 끝나는 모든것들을 요청받게. => *.js
@WebServlet("*.mbj")
public class JstlController2 extends HttpServlet {
	// doGet , doPost <= Spring에서는 default로 두가지가 합쳐진 버전의 메소드를 활용을 한다.
	// service ( get , post 의 모든 요청을 받는 메소드 )
	RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getServletPath());
		if (req.getServletPath().equals("/list.mbj")) {
			ArrayList<MbjVO> list = new ArrayList<>();
//			<> <- Object를 상속받은 Class타입만 넣을 수 있음
			for (int i = 0; i < 10; i++) {
				MbjVO vo = new MbjVO();
				vo.setField1("필드" + i);
				vo.setField2(i);
				list.add(vo);
			}
			req.setAttribute("list", list);
			rd = req.getRequestDispatcher("mbj/list.jsp");// jsp,html페이지 경로를 써주는것
			// Model(MVC M ) : DAO DTO를 다음페이지로 넘겨주고 요청을 맡긴다.
		} else if (req.getServletPath().equals("/list2.mbj")) {
//			form 태그와 url로 넘어온 파라미터 => req.getParameter( set x )
//			controller에서 => jsp로 넘어갈 때 => req.getAttribute()
//			parameter로 q_bbsCode라는 이름으로 값 1013이 필요함
			System.out.println("asd");
			ArrayList<MbjVO> list = new ArrayList<>();
//			<> <- Object를 상속받은 Class타입만 넣을 수 있음
			for (int i = 0; i < 10; i++) {
				MbjVO vo = new MbjVO();
				vo.setField1("필드" + i);
				vo.setField2(i);
				list.add(vo);
			}
			req.setAttribute("list", list);

			rd = req.getRequestDispatcher("mbj/list2.jsp");
		} else {
			rd = req.getRequestDispatcher("error/list.jsp");// 나중에 추가예정KYM(20230523)->20230526
		}

		rd.forward(req, resp);// jsp페이지로 모든 정보를 넘기고 처리를 떠맡긴다.

	}

}
