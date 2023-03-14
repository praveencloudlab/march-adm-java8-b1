package com;

// singleton
public class DBConnect {

	static private DBConnect connect = null;
	private DBConnect() {
	}

	public static DBConnect getConnection() {
		if (connect == null) {
			connect = new DBConnect();
			return connect;
		} else {
			return connect;
		}
	}
	
	public void connect() {
		System.out.println(">> connected to DB on "+this.hashCode());
	}

}
