package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 2, 4 };

		int[] cpyAry = new int[5];
// for반복문은 가급적이면 기억하자!
//		for (int i = 0; i < origAry.length; i++) {
//			cpyAry[i] = origAry[i];
//			cpyAry[1] = origAry[1];
//			cpyAry[2] = origAry[2];
//			cpyAry[3] = origAry[3];
//			cpyAry[4] = origAry[4];
//		}

		System.arraycopy(origAry, 0, cpyAry, 0, 5);

		for (int i = 0; i < origAry.length; i++) {
			System.out.println(cpyAry[i]);
		} 
		
		// 확장 for() 이렇게 적는게 좀 편함
		for(int num : cpyAry) {
			System.out.println(num);
		}
		
	}
}
