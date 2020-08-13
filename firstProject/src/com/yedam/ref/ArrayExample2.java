package com.yedam.ref;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		
		int[] numAry = { 2, 3, 4, 3, 5 };
		int result = addAry(new int[] { 2, 3, 4 });
		System.out.println("배열의 합: " + result);
		
	}
	
	

	// 메소드를 addAry로 주고                       //ary실제 값으로 들어옴 매개값
	public static int addAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
