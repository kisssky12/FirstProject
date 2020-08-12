package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		// 1 ~ 10 값의 합:
		int i = 0;
		int sum = 0;

		while (i < 10) {
			System.out.println(i);
			i++;
			sum = sum + i; // sum +=i 똑같음
		}
		System.out.println("1 ~ " + i + "까지 합:" + sum);

		int a = 2;
		int num = 1;

		while (a < 10) {
			num = 1;
			while (num < 10) {
				System.out.println(a + "*" + num + "=" + (a * num));
				num++;
			}
			a++;
		}
	}
}
