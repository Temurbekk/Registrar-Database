package database;

import java.sql.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		createTable();
		post();
		get();

	}
	
	public static ArrayList<String> get() throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select * FROM Registration");
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			
			while(result.next()) {
				System.out.print(result.getString("first"));
				System.out.print(" ");
				System.out.print(result.getString("last"));
				
				array.add(result.getString("last"));
			}
			System.out.println(" ");
			
			System.out.println("All records have been selected");
			return array;
		}catch(Exception err) {
			System.out.println(err);
		}
		return null;
	}
	
	public static void post() throws Exception{
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
	
	public static void createTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS REGISTRATION " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Function has been completed");}
	}
	
	public static Connection getConnection() throws Exception{
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/My_Project";
		String username = "root";
		String password = "MySQLServer";
		
		
		try {
			
			Class.forName(driver);
			
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return con;
		}catch(Exception err) {
			System.out.println(err);
		}
		
		return null;
	}

}
