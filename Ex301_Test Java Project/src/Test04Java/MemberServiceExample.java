package Test04Java;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) { // 결과 (hong ,12345입력) 결과(1.2 입력)
		Scanner sc = new Scanner(System.in); // 로그인 되었습니다. id 또는 password가 올바르지 않습니다.
		MemberService memberService = new MemberService(); // 로그아웃 되었습니다.
		System.out.println("아이디를 입력해주세요.");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String userPw = sc.nextLine();

		if (memberService.login(userId, userPw)) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(userId);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}