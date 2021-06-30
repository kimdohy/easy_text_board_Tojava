package easytextboard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("명령어를 입력하시오>>");
			String command = sc.nextLine();
			if (command.equals("article add")) {
				System.out.println("== 게시물 등록 ==");
				continue;
			}
			if (command.equals("article list")) {
				System.out.println("== 게시물 목록 ==");
				continue;
			}
			if (command.equals("exit")) {
				System.out.println("== 시스템 종료 ==");
				break;
			} else {
				System.out.println("없는 명령어 입니다 !!");
				continue;
			}

		}

	}

}
