package com.yedam.exam;

import java.util.Scanner; //이것이 있어야지 스캐너 사용가능

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0, input = 0; // 입출금 관련해 벨런스에 누적

		Scanner scanner = new Scanner(System.in); // 사용자가 누른 실제값을 처리 스캐너객체

		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();

			if (menu == 1) { //예금
				System.out.println("예금 금액을 입력하세요.");
				input = scanner.nextInt();
				balance = balance + input;
				
			} else if (menu ==2) { //출금
				System.out.println("출금 금액을 입력하세요.");
				input = scanner.nextInt();
				balance = balance - input;
				System.out.println("남은금액: " + balance);
			} else if (menu ==3) { //잔고
				System.out.println("잔고: " + balance);
			}
			else if (menu == 4) //종료
				run = false;
		} //while구문 중괄호
		System.out.println("Bye~Bye~ 호갱님!!!!!");
	} // end of main
} // end of class
