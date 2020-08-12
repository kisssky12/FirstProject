package com.yedam.dev;

public class MorningCode { // 모닝코드클래스에 해당되는 괄호
	public static void main(String[] args) { //main 괄호
		String str1 = "Hello";
		String str2 = "World";
		String name = "띄무룩";
		System.out.println(str1 + "," + name);
		//한줄에 더 추가할려면 , 뒤에 붙이면 됨
		int v1 = 150, v2 = 270;
		int result = add(v1, v2); //add는 정수형 데이터만 계산가능
		System.out.println("결과값: " + result);
		
		introduce("띄무루크");
		
		int result2 = minus(v1, v2);
		System.out.println("결과값: " + result2);
	}
	
	//miuns 메소드를 정의해보기
	public static int minus(int x, int y) { //각각 메소드괄호
		int minus = x - y;
		return minus;
	}
		
	//매개변수,값이 없이 이것만 호출 (그러나, string타입의 매개값을 줄 수 있음)
	public static void introduce(String name) { 
		System.out.println("안녕하세요. 아임 " + name + "입니다.");
	}
	
	public static int add(int x, int y) { // method
		int sum = x + y;
		return sum; //return은 반환값으로 위에 있는 add를 찾아서 결과도출
	}
}
