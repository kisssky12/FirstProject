package com.yedam.test;

public class IfExample {
	public static void main(String[] args) {
		int score = 77;
		String grade = "";
// 만약 80점이면 B,C등급에 만족하지만 처음 나온 B등급 하나의 조건에 만족하고 빠져나감!		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		System.out.println("등급은" + grade + "입니다.");

	}
}
