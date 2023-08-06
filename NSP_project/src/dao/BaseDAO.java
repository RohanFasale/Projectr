package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class BaseDAO{
	
	Connection conn;
	
	public BaseDAO() {
		
		try {
			System.out.println("Trying to load the driver..");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			System.out.println("Driver Loaded...");
			
			System.out.println("Trying to connect..");
			
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			System.out.println("Connected : "+ conn);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}