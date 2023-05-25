package customer;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Controller.customerController;

public class CustomerDAO {
//	싱글톤(static{} 블럭킹 만들어서 CustomerDAO가 사용될 때 먼저 실행될 코드를 넣어둠)
//	외부에서 사용할 수 있는(인스턴스멤버에서 SqlSession만 사용, 따라서 인스턴스멤버나 스태틱멤버로 만들어줌)
	private static SqlSession sql;
	static {
		String resource = "mybatis/conn.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sql = sqlSessionFactory.openSession();
	}

	public void test() {
		try (SqlSession session = sql) {
			int result = session.selectOne("Mbj.dual");
			System.out.println(result);
		}
	}

	public List<CustomerVO> listSelect() {
		List<CustomerVO> list = sql.selectList("cu.list");
		System.out.println(list.size());
		return list;
	}

	public CustomerVO selectDetail(int id) {
		CustomerVO vo = sql.selectOne("cu.detail", id);
		System.out.println(vo.getName());
		return vo;
	}

	public void update(String id, String email, String phone) {
		CustomerVO vo = new CustomerVO();
		vo.setId(Integer.parseInt(id));
		vo.setEmail(email);
		vo.setPhone(phone);

//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("id", id);
//		map.put("email", email);
//		map.put("phone", phone);

		int result = sql.update("cu.update", vo);
		sql.commit();
	}

	public void insert(CustomerVO vo) {
		int result = sql.insert("cu.insert", vo);
		sql.commit();
	}
}
