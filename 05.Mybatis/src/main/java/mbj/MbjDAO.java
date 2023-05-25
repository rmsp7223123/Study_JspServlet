package mbj;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import customer.CustomerVO;

public class MbjDAO {
	public void test() {
		String resource = "mybatis/conn.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		try (SqlSession session = sqlSessionFactory.openSession()) {
//			MbjVO vo = session.selectOne("Mbj.voselect");
//			System.out.println(vo.getField1());
//			System.out.println(vo.getField2());
//			$, # <=
//			$ 표시는 ex) vo를 파라미터로 넘기면 vo에 값을 그대로 출력(조건으로 사용)
//				where id = field1 (x) field1이라는 컬럼이 없기때문에 오류
//			#표시는 데이터 타입에 맞춰서 처리가 됨
//				where id = 'field1' (o) 값 비교이기때문에 오류x
//			파라미터는 어떤 타입이든 상관없지만 하나만 전송할 수 있음(Parameter Object)

//			CustomerVO vo = new CustomerVO();
//			vo.setId(1);
//			vo.setName("NAME");

//			List<CustomerVO> list = session.selectList("Mbj.selectwhere3", 4);
//			System.out.println(list);
//			for (CustomerVO vo : list) {
//				System.out.println(vo.getId() + " " + vo.getName() + " " + vo.getEmail());
//			}
//			JUMIN_NUM, NAME
//			HashMap<K, V> 키와 밸류 둘다 클래스타입만 가능
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("jumin_num", 1);
			params.put("name", "이름");
			String jumin_num = session.selectOne("Mbj.mapselect", params);
		}
	}

}
