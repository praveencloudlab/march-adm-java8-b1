package com;

public class Test {
	public static void main(String[] args) {
		
		//DBConnect c1=new DBConnect();
		//DBConnect c2=new DBConnect();
		//DBConnect c3=new DBConnect();
		
		//c1.connect();
		//c2.connect();
		//c3.connect();
		
		 DBConnect c1=DBConnect.getConnection();
		 DBConnect c2=DBConnect.getConnection();
		 DBConnect c3=DBConnect.getConnection();
		 DBConnect c4=DBConnect.getConnection();
		 
		 c1.connect();
		 c2.connect();
		 c3.connect();
		 c4.connect();
		
		
		
		
		
	}

}
