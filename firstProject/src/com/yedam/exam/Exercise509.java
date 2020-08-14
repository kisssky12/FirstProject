package com.yedam.exam;

import java.util.Scanner;

public class Exercise509 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; // 배열크기
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수 |2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) { // 배열의 크기를 정하도록 하겠다.
				System.out.print("학생수: ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // new int[5]
				System.out.println("배열이 생성되었습니다.");
			} else if (selectNo == 2) { // 배열의 크기만큼 입력을 받는다.
				System.out.println("점수입력 : ");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]" + "scores[i]");

				}
			} else if (selectNo == 4) { // 분석 : 평균, 최고점수
				int maxValue = 0; // 최대값을 구하는 변수
				int sum = 0;
				double avg = 0; // 평균을 구하는 변수
				for (int i = 0; i < scores.length; i++) {
					if (maxValue < scores[i])
						maxValue = scores[i];

					sum = sum + scores[i]; // sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("최고점수: " + maxValue);
				System.out.printf("평균%.2f " + avg);
				//printf는 포멧을 출력하는 의미 (표) %퍼센테이지에 .2f 소숫점 두자리까지 보여주겠다.
				System.out.println();
			} else if (selectNo == 5) {
				run = false; // run의 변수에 false를 넣으면 run값이 참일 때 반복하지만 false이기에 정지!
			}
		}
		System.out.println("프로그램 종료");
	}
}
