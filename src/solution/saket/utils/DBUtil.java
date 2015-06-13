package solution.saket.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBUtil {
	
	private final static String URL = "jdbc:mysql://localhost:3306/emp_db";
	private final static String USER = "root";
	private final static String PASSWORD = "admin";

	static {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static Connection connectToDB() {
		
		Connection con = null;
		
	 try {
		con = (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("Connection Successful");
	 } catch(SQLException e){
		 e.printStackTrace();
		 System.err.println("Error establishing connection: " + e.getMessage());
	 }
		
		return con;
	}
	
	public static void main(String[] args) {
		
		DBUtil.connectToDB();
	}
}