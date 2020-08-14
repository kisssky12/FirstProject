package com.yedam.classes;

public class CalculartorExample {
	public static void main(String[] args) {
		Calculartor cal = new Calculartor();
		// cal은 다른 필드의 메소드를 담고 있다.

		System.out.println("10+20=" + cal.add(10, 20));
		System.out.println("10.0+20.0=" + cal.add(10.0, 20.0));

		double r1 = 3.5;
		cal.getArea(r1);

		System.out.println("가로4*세로5의 넓이는" + cal.getRectangle(4, 5) + "입니다");
		// => 가로 4, 세로 5의 넓이는 20입니다.
		
			System.out.println(cal.getRectangle(4, 5));
			

	}
}