package com;

public class Test {

	public static void main(String[] args) {
		Customer cust=new Bank();
		BankEmployee be=new Bank();
		BankManager mgr=new Bank();
		
		mgr.netBanking();

		cust.withDraw();
		cust.deposit();
		
		be.openAccount();
		be.closeAccount();	

	}

}
