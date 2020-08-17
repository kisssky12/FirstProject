package com.yedam.inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName(); // 부모Parent getName()
		child.getAge(); // 부모Parent getAge()
		child.getGrade();// 자신 getGrade()

		Parent parent = new Child("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//		parent.getGrade(); //자신 X

		Vehicle v1 = new Taxi();
		v1.run();
		v1 = new Bus();
		v1.run();
		// 상속의 관계로 매개값으로 다~ 들어 올 수 있다.
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
		
	}
}
