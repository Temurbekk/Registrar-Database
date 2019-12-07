package database;

import java.sql.*;

public class CreateTables  extends Main{
	public static void createCoursesTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS REGISTRATION " +
					"(CourseNumber INTEGER not NULL, " +
	                   " CourseName VARCHAR(255), " + 
	                   " CourseTitle VARCHAR(255), " + 
	                   " CourseCredits INTEGER, " + 
	                   " PRIMARY KEY ( CourseNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Function has been completed");}
	}
	
	public static void createCourserequisitsTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS REGISTRATION " +
	                   "(CourseRequisitNumber INTEGER not NULL, " +
	                   " CourseName VARCHAR(255), " + 
	                   " CourseNumber VARCHAR(255), " +  
	                   " PRIMARY KEY ( CourseRequisitNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Function has been completed");}
	}
	
	public static void createCourseOfferingsTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS REGISTRATION " +
	                   "(CourseOfferingNumber INTEGER not NULL, " +
	                   " OfferingYear INTEGER, " + 
	                   " Semester VARCHAR(255), " + 
	                   " SectionNumber VARCHAR(255), " + 
	                   " Classroom VARCHAR(255), " + 
	                   " PRIMARY KEY ( CourseOfferingNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Function has been completed");}
	}
	
	public static void createCourseOfferingsTimingTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS REGISTRATION " +
	                   "(CourseOfferingTimingNumber INTEGER not NULL, " +
	                   " CourseOfferingNumber INTEGER, " + 
	                   " CourseTiming VARCHAR(255), " + 
	                   " PRIMARY KEY ( CourseOfferingTimingNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Function has been completed");}
	}
	
	public static void createInstructorsTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS REGISTRATION " +
	                   "(InstructorNumber INTEGER not NULL, " +
	                   " CourseOfferingNumber VARCHAR(255), " + //foreign key
	                   " DepartmentName VARCHAR(255), " + 
	                   " InstructorTitle VARCHAR(255), " +
	                   " InstructorName VARCHAR(255), " +
	                   " PRIMARY KEY ( InstructorNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Function has been completed");}
	}
	
	public static void createStudentTable() throws Exception{
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
	
	public static void createStudentGradeTable() throws Exception{
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
	
	public static void createStudentEnrollmentCoursesTable() throws Exception{
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
}
