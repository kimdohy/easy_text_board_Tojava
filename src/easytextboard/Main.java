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
				System.out.print("제목 :");
				String title = sc.nextLine();
				System.out.print("내용 :");
				String body = sc.nextLine();
				int id = 1;
				
				
				System.out.println("== 작성된 게시물 내용 ==");
				System.out.printf("제목 : %s \n",title);
				System.out.printf("내용 : %s \n",body);
				System.out.printf("번호 : %d \n",id);
			} else if (command.equals("article list")) {
				System.out.println("== 게시물 목록 ==");
			} else if (command.equals("exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			} else {
				System.out.println("없는 명령어 입니다 !! \n");
			}

		}
		sc.close();

	}

}
