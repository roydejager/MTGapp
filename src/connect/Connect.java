package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
	public static void connectDB() {
		Statement stmt = null;		
		Connection c = null;
		
		try{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:playerlife.db");
	          
			stmt = c.createStatement();
			stmt.close();


		} 
		catch (Exception e) {
		  e.printStackTrace();
		}
	}
}