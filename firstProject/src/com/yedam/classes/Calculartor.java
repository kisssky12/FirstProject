package com.yedam.classes;

public class Calculartor {
	double pi = 3.14;

	// 가로, 세로 => 넓이를 반환해주는 메소드(getRectagle)
	public String getRectangle(int x, int y) {
		return "가로" + X + ",세로" + y + "의 넑이는" + calRectangle(x, y) + "입니다.";
	}
	public int calRectangle (int x, int y) {
		return 
	}
	public int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public double add(double x, double y) {
		return x + y;
	}

	public void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름" + a + "의 넓이는" + result);
	}

	public int getRectangle(int a, int b) {
		int result = a * b;
		return result;
	}
}