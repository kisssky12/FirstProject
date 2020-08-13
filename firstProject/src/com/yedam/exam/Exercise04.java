package com.yedam.exam;

public class Exercise04 {
	public static void main(String[] args) {
		int A = 0;
		int B = 0;

		while (true) {
			A = (int) (Math.random() * 6) + 1;
			B = (int) (Math.random() * 6) + 1;

			if (A + B == 5)
				break;

			System.out.println(A + "," + B);
		}

	}
}
