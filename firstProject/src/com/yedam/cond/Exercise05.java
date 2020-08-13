package com.yedam.cond;

public class Exercise05 {
	public static void main(String[] args) {
		int num1;
		int num2;
		
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				num1=i;
				num2=j;
				if((4*i)+(5*j) == 60) {
					System.out.println(num1 + "," + num2);
				}
			}
		}
	}
}
