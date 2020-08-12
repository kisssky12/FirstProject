package com.yedam.oper;

public class BitOperatorExample { //비트연산자
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; //비트반전연산자
		System.out.println("v1 :" +v1);
		System.out.println("v2 :" +(v2+1));
		
		byte b1 = 10;
		byte b2 = 4;                 //p.76 %나머지를 구하는 연산
		int b3 = b1 % b2;
		//2.5 연산의 결과는 int형(정수) 소수점을 받기위해서는 ↓
		double result = 10 / 4.0; //double타입은 4.0처럼 타입변경 
		System.out.println(result);
		
	}

}
