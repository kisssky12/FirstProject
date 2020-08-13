package com.yedam.cond;

import java.io.IOException;

public class WhileExample2 {
	public static void main(String[] args) throws IOException {

		boolean run = true; //진실이기에 무한으로 계속반복 
		int num = 10;
		int keyCode = 0;
		System.out.println("키를 누르세요.");
		while (run) {
			keyCode = System.in.read(); //
			if (keyCode != 13 && keyCode != 10) {
				System.out.println(keyCode);
				System.out.println("키를 누르세요.");
			}
			System.in.read();
			System.in.read();
			
			if (keyCode == 57) //57이 키값 9 그것을 누르면 폴스로 반복문 종료
				run = false;
//			System.out.println("num:" + num);
//			if (num-- == 0)
//				run = false; // break;
		}
		System.out.println("프로그램 종료.");
	} // end of main
} // end of class
