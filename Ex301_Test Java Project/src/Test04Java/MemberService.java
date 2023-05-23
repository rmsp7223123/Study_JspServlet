package Test04Java;

public class MemberService {
	public boolean login(String id, String pw) {
		if (id.equals("hong") && pw.equals("12345")) {
			return true;
		} else {
			return false;
		}

	}

	public boolean logout(String id) {
		if (id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
			return true;
		} else {
			return false;
		}
	}
}
