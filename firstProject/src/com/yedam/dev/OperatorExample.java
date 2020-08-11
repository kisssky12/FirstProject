package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = -3 + (8 - 5) * 4 + val1++;
		
		System.out.println(result);
		
		// 나머지 계산 10을 7로 남은 나머지(정수일 경우 의미가 있음)
		result = 10 % 7;
		System.out.println("나머지 : "  + result);
		// 나누기 계산
		result = 10 / 7;
		System.out.println("나누기1 : "  + result);
		
		double r1 = 10 / 7; //아무리 더블타입에 넣어도 정수 뒤로는 다 0
		System.out.println("나누기2 : "  + r1);
							  		
		double r2 = 10 / 7.0; // 실수 = 정수 / 실수 
		System.out.println("나누기3 : "  + r2);
		
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
			if(i % 2 == 1) {
				System.out.println(i +"는 홀수입니다.");
			} else {
				System.out.println(i +"는 짝수입니다.");
			}
		}
	}
}
