package database;

import java.sql.*;

public class InsertIntoTables extends Main{
	
	public static void IntoCoursesTable() throws Exception{
		final String firstName = "John";
		final String lastName = "Miller";
		
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO Registration " +
	                   "VALUES (100, '"+firstName+"', '"+lastName+"', 18)");
			posted.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally {System.out.println("Insert Completed");}
	}
}
