package com.yedam.classes.exam;

public class Account {
	private int balance;
	private int MIN_BALANCE = 0;
	private int MAX_BALANCE = 1000000;

	public Account(int balance, int mIN_BALANCE, int mAX_BALANCE) {
		this.balance = balance;
	}

	public Account() {

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;

		if (balance > 0 && balance < 100000);
	}

	public int getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(int mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}

	public int getMAX_BALANCE() {
		return MAX_BALANCE;
	}

	public void setMAX_BALANCE(int mAX_BALANCE) {
		MAX_BALANCE = mAX_BALANCE;
	}

}
