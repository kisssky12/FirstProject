package com.yedam.classes;

public class UnivFriend extends Friend {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교친구 : " + super.getName() +", 번호입력: " + super.getPhone()
+ ",전공: " + this.getMajor();
	}
	
	
	
}
