package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50; 
		int sum = score1 + score2 + score3 + score4;
		// []배열 선언, 배열은 배열타입의 변수 이름이 필요
		int[] intAry = { 10, 20, 30, 40, 50 };
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50;

		sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("sum : " + sum);

		double[] dAry = { 2.3, 4.3 }; 

		String[] sAry = { "hello", "world", "nice", "good" };
		for (int i = 0; i < sAry.length; i++) {
			System.out.println(sAry[i]);
		}
		String[] scoreAry = new String[5];
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}

		int[] mathAry; //라인이 바뀌면 변수선언
		mathAry = new int[] { 1, 2, 3, 4 }; //new키에 배열

	}
}
