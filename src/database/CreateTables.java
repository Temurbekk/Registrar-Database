package database;

import java.sql.*;

public class CreateTables  extends Main{
	public void createCoursesTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS CoursesTable " +
					"(CourseNumber INTEGER not NULL, " + //Primary Key
	                   " CourseName VARCHAR(255), " + 
	                   " CourseTitle VARCHAR(255), " + 
	                   " CourseCredits INTEGER, " + 
	                   " PRIMARY KEY ( CourseNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Courses Table Created!");}
	}
	
	public void createCourseRequisitesTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS CourseRequisitesTable " +
	                   "(CourseRequisitNumber INTEGER not NULL, " + //Primary Key
	                   " CourseName VARCHAR(255), " + 
	                   " CourseNumber VARCHAR(255), " +  //Foreign Key
	                   " PRIMARY KEY ( CourseRequisitNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Crouse Requisits Table Created!");}
	}
	
	public void createCourseOfferingsTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS CourseOfferingsTable " +
	                   "(CourseOfferingNumber INTEGER not NULL, " + //Primary Key
	                   " OfferingYear INTEGER, " + 
	                   " Semester VARCHAR(255), " + 
	                   " SectionNumber VARCHAR(255), " + 
	                   " Classroom VARCHAR(255), " + 
	                   " PRIMARY KEY ( CourseOfferingNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Course Offerings Table Created!");}
	}
	
	public void createCourseOfferingsTimingTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS CourseOfferingsTimingTable " +
	                   "(CourseOfferingTimingNumber INTEGER not NULL, " + //Primary Key
	                   " CourseOfferingNumber INTEGER, " + //Foreign Key
	                   " CourseTiming VARCHAR(255), " + 
	                   " PRIMARY KEY ( CourseOfferingTimingNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Course Offerings Timing Table Created!");}
	}
	
	public void createInstructorsTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS InstructorsTable " +
	                   "(InstructorNumber INTEGER not NULL, " + //Primary Key
	                   " CourseOfferingNumber VARCHAR(255), " + //Foreign key
	                   " DepartmentName VARCHAR(255), " + 
	                   " InstructorTitle VARCHAR(255), " +
	                   " InstructorName VARCHAR(255), " +
	                   " PRIMARY KEY ( InstructorNumber ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Instructors Table Created!");}
	}
	
	public void createStudentsTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS StudentTable " +
	                   "(StudentID INTEGER not NULL, " + //Primary Key
	                   " StudentName VARCHAR(255), " + 
	                   " Program VARCHAR(255), " + 
	                   " PRIMARY KEY ( StudentID ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Student Table Created!");}
	}
	
	public void createStudentGradeTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS StudentGradeTable " +
	                   "(StudentGradeID INTEGER not NULL, " +
	                   " CourseNumber INTEGER, " + 
	                   " CourseGrade VARCHAR(255), " + 
	                   " StudentID INTEGER, " + //Foreign Key
	                   " PRIMARY KEY ( StudentGradeID ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Student Grade Table Created!");}
	}
	
	public void createStudentEnrollmentCoursesTable() throws Exception{
		try {
			
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS StudentEnrollmentCoursesTable " +
	                   "(Enrolled INTEGER not NULL, " + //Primary Key(What is the type?)
	                   " StudentID INTEGER, " + //Foreign Key
	                   " Enrolled Courses VARCHAR(255), " + 
	                   " PRIMARY KEY ( Enrolled ))" );
			create.executeUpdate();
		}catch(Exception err) {
			System.out.println(err);
		}
		finally{System.out.println("Student Enrollment Courses Table Created!");}
	}
}
