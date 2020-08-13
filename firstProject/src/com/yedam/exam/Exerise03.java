package com.yedam.exam;

public class Exerise03 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
			sum = sum + i;
			} //if에 대한 괄호
		}
		
		System.out.println(sum);
	}
}
