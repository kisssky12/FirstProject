package com.yedam.oper;

public class IncreaseOperatorExample {
	public static void main(String[] args) {
		boolean run = false;
		int var1 = 0;

		var1--; // var1 = var1 + 1; 
		for(int i = 0; i < 3; i++) { 
			run = !run; // 논리부정연산자
			if(run) {
			   var1--; // 증강연산자
			}
		}	
		System.out.println(var1);
		
		
	}
}
