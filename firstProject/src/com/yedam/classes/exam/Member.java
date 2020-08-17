package com.yedam.classes.exam;

public class Member {
	private String name;
	private String id;
	private int age;
	private String password;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public Member()	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
