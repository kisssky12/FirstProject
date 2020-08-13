package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++랑 같음
		System.out.println("결과는" + sum);
		
		sum = 0;
		for ( int i = 0; i < 3; i++) { //초기값 , for구문 그리고 증강식
			sum = sum + 1;
		}
		sum +=1;
		
		sum= 0;
		for (int a = 3; a > 0; a--) {
			sum = sum + 1;
		}
		System.out.println("최종결과는" + sum);
	
		// 1 ~ 10 범위의 수 합계
		sum = 0;
		for( int j = 1; j <= 9; j++) {
			sum = sum + j;
		}
		// 1 = 0 + 1;
        // 3 = 1 + 2;
		// 6 = 3 + 3;
				   
		System.out.println("1 ~ 10 합:" + sum);
	}
	
	
}
