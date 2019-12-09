package database;

import java.sql.*;
import java.util.ArrayList;

public class AccessDatabase extends Main{
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
}
