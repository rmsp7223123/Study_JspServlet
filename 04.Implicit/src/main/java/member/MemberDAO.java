package member;

public class MemberDAO {

	public boolean isLogin(String id, String pw) {
		if (id.equals("user") && pw.equals("user1234")) {
			return true;
		} else {
			return false;
		}
	}
}
