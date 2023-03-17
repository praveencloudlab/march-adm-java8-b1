package com;

public class Bank implements Customer, BankEmployee, BankManager {

	public void netBanking() {
		System.out.println("Net Banking is enabled..");
	}

	public void deposit() {
		System.out.println("depositing");
	}

	public void withDraw() {
		System.out.println("withdrawing");
	}

	public void openAccount() {
		System.out.println("opening account");
	}

	public void closeAccount() {
		System.out.println("closing account");
	}

}
