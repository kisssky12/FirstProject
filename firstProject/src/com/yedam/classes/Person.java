package com.yedam.classes;

public class Person { // 필드는 속성값을 담당

	String name;
	int age;

	// 생성자 || 메소드
	public Person() {
		name = "anonymous"; 
		age = 10000; 
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String introduse() { // 메소드는 어떤 기능들을 수행한다.
		return "이름은" + name + "나이는"
				+ "" + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}
 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}
}
