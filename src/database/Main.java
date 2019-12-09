package database;

import java.sql.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		// We call the instance of CreateTable class
		CreateTables create = new CreateTables();
		
		/*By calling these methods
		 * We create empty tables with necessary attributes to enter later*/
		
		//Courses Table
		create.createCoursesTable();
		//Course Requisites Table
		create.createCourseRequisitesTable();
		//Course Offerings Table
		create.createCourseOfferingsTable();
		//Course Offerings Timing Table
		create.createCourseOfferingsTimingTable();
		//Course Instructor Table
		create.createInstructorsTable();
		//Students table
		create.createStudentsTable();
		//Student Grade Table
		create.createStudentGradeTable();
		//Student Enrollment Courses
		create.createStudentEnrollmentCoursesTable();
		
		
		//Insert Class helps us insert data into our database by choosing which table we want to insert the data to
		InsertIntoTables insert = new InsertIntoTables();
		
		AccessDatabase access = new AccessDatabase();

	}
	//This static method helps connect our Java code with our MySQL database using Connector/J
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
