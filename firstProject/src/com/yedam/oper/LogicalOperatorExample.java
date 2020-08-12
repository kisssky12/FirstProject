package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // A = 65
		if(charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}
		
		int num1 = 10;
		int num2 = 20;                 // 이러면 양쪽 다 증강됨↘ 
		if(num1++ < 10 && num2++ > 20 ) {//(num1++ < 10 || num2++ > 20 )
			System.out.println("참입니다.");
		} //이미 앞에 10의 값이 거짓(증강o)이라서 뒤에 값을 체크할 필요가 없어서 20임(증강x) 
		System.out.println(num1 + "," + num2);
		
		int a = 10, b = 11;
		int result = a & b; //비트논리연산자
		System.out.println("논리곱결과: " + result);
		
		result = a << 2;
		System.out.println("비트이동결과 : " + result);
		
		result = 30 << 3;
		System.out.println("결과=: " + result);
		
		result += 30; //result = result+30 (+=는 붙여야 함)
		boolean pass = false;
		
		pass =(result >= 80) ? true : false;
		System.out.println(pass);				
	}
}
