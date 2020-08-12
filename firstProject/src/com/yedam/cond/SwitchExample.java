package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
		int m = (int) (Math.random() * 6) + 1; 
		System.out.println(m);
	
		switch(m) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break; //해당되는 구문을 한건으로 보고 싶으면 브레이크를 걸어라!
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
	
		}
	}
}
