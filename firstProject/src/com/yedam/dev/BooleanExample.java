package com.yedam.dev;

public class BooleanExample {
	public static void main(String[] args) {
		long l1 = 10L;
		int i1 = 10;
		
		boolean trueOrFalse = false; //여기에는 trueOrFalse만 들어올 수 있음
		
		trueOrFalse = l1 != i1; // 10 != 10 
		                        // == 두 값이 같은지 물어보는 것(비교연산자)
		if (trueOrFalse) {
			System.out.println("이 내용은 참일 경우에 출력됩니다.");
		
		}	
		
		// >, <, >=, <= (비교연산자)
		if(l1 >= i1) {
			System.out.println("왼쪽이 크거나 같습니다.");			
		}	
			
		System.out.println(trueOrFalse);
		
	}
}
