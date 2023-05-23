package Test04Java;

import java.util.Scanner;

public class ArrGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level;
		while (true) {
			System.out.println("난이도(1~10)를 입력해주세요.");
			try {
				level = Integer.parseInt(sc.nextLine());
				if (level > 1 && level < 11) {
					System.out.println("선택하신 난이도는 : " + level + " 입니다.");
					int[] gameArr = new int[level];
				} else {
					System.out.println("다시 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}

		}
	}
}
