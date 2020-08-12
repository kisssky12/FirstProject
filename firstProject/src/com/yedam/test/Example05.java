package com.yedam.test;

public class Example05 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;                  //(밑변+윗변)X1/2X높이
		double area = ((lengthBottom+lengthTop)*0.5*height); 
		System.out.println(area);
	}
}
