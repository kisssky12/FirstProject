package com.yedam.exam;

public class Exercise507 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		// array : i = 어레이 안에 i에 1을 실행하고 배열 실행
		for (int i : array) {
			if (i >= max) { 
				max = i;
			}

		}
		System.out.println("max :" + max);

	}
}
