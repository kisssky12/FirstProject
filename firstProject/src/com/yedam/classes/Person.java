package com.yedam.classes;

public class Person { // 필드는 속성값을 담당

	String name;
	int age;

	// 생성자 || 메소드
	public Person() {
		name = Messages.getString("Person.0");  //$NON-NLS-1$
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
		return Messages.getString("Person.1") + name + Messages.getString("Person.2") //$NON-NLS-1$ //$NON-NLS-2$
				+ Messages.getString("Person.3") + age; //$NON-NLS-1$
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
