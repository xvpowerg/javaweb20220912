package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTools {
	
	private static String url;
	private static String account;
	private static String password;
	
	private DbTools() {}
	
	public static Connection getConnection() throws SQLException {
		return 	DriverManager.getConnection(url,account,password);	
	}
	

	public static void setUrl(String url) {
		System.out.println("setUrl:"+url);
		DbTools.url = url;
	}
	public static void setAccount(String account) {
		DbTools.account = account;
	}
	
	public static void setPassword(String password) {
		DbTools.password = password;
	}
}
