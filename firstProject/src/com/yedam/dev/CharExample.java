package com.yedam.dev;

// com.yedam.dev.CharExample
public class CharExample {
	public static void main(String[] args) {
		char c1 = 44032; // 65에 해당되는 unicode값 => A
		for(int i=0; i<26; i++) {
			System.out.print(c1++ + "\t");
		} //ctrl shift f 라인정렬
		
		char c2 = '나';
		System.out.println( (int) c2); //강제형 변환 : 정수변환
	}
}