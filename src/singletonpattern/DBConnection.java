package singletonpattern;

public class DBConnection {

	private static DBConnection conn = new DBConnection () ;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		
		return conn;
	}
	
	public void showConectionDetails() {
		System.out.println("IP is 127.0.0.1");
	}
}
