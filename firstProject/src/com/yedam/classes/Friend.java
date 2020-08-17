package com.yedam.classes;

public class Friend {
	// 필드
	private String name;
	private String age;
	private String phone;

	// 생성자 생성 (왼쪽클릭 - source - GCusingF로 생성자 생성)
	public Friend(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	// get, set 생성(왼쪽클릭 - source - GGandS로 생성)
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getPhoen() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
