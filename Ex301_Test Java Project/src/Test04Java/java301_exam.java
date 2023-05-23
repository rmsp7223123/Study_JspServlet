package Test04Java;

import java.util.Scanner;

public class java301_exam {
	Scanner sc = new Scanner(System.in);

	int rtnInt() {
		while (true) {
			try {
				System.out.println("숫자를 입력해주세요.");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("입력하신 숫자는 : " + num + " 입니다.");
				return num;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}

	public String rtnString() {
		String str = "";
		int number;
		System.out.println("문자를 입력해주세요.");
		try {
			while (true) {
				str = sc.nextLine();
				number = Integer.parseInt(str);
				System.out.println("문자만 입력해주세요.");
			}
		} catch (Exception e) {
			System.out.println("입력하신 문자는 : " + str + "입니다.");
			return str;
		}
	}

	public String rtnString1() {
		String str = "";
		int number;
		System.out.println("문자를 입력해주세요.");
		while (true) {
			try {
				str = sc.nextLine();
				number = Integer.parseInt(str);
				System.out.println("문자만 입력해주세요.");
			} catch (Exception e) {
				return "입력하신 문자는 : " + str + "입니다.";
			}
		}

	}

	public static void main(String[] args) {
		java301_exam exam = new java301_exam();
		System.out.println(exam.rtnString1());

	}
}
