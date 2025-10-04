//STUDENT MANAGEMENT SYSTEM                  

            
//CRUD OPERATIONS: Make the menu program of all the given below operations
//
//Crud: Create retrieve update and delete
//1. Admin can add the Student information
//2. Admin can view the list of Students
//3. Admin can edit the Student information
//4. Admin can delete the Student information.
//
//Student Field: id, name, course, city, total marks, phone no.
//
//Technology: Core Java, JDBC and Mysql
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Studentmangementsystem {
public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		
		  while (true)
		  {
              System.out.println("\n---Student Mangement Menu ---");
              System.out.println("1. Add student info");
              System.out.println("2. View the list of student");
              System.out.println("3. Edit student info");
              System.out.println("4. Delete student info");
              System.out.println("5. Exit");
              System.out.print("Enter your choice: ");
              int choice = sc.nextInt();
              
          switch(choice)
          {
          case 1:
        	  System.out.println("Enter id");
        	  int id =sc.nextInt();
        	  sc.nextLine();
        	  System.out.println("Enter name");
        	  String name=sc.nextLine();
        	  System.out.println("Enter course");
        	  String course=sc.nextLine();
        	  System.out.println("Enter city");
        	  String city=sc.nextLine();
        	  System.out.println("Enter total marks");
        	  int marks=sc.nextInt();
        	  sc.nextLine();
        	  System.out.println("Enter phone number");
        	  String phone =sc.nextLine();
        	  
        	  PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
        	  ps.setInt(1, id);
        	  ps.setString(2, name);
        	  ps.setString(3, course);
        	  ps.setString(4, city);
        	  ps.setInt(5, marks);
        	  ps.setString(6, phone);
        	  
        	  ps.executeUpdate();
        	  System.out.println("Student add sucessfully");
        	  break;
        	  
          case 2:
        	  PreparedStatement ps1=con.prepareStatement("select * from student");
        	  ResultSet rs=ps1.executeQuery();
        	  System.out.println("\n -- student list --");
        	  while(rs.next())
        	  {
        		  System.out.println("ID: " + rs.getInt("id") +
                          ", Name: " + rs.getString("name") +
                          ", Course: " + rs.getString("course") +
                          ", City: " + rs.getString("city") +
                          ", Marks: " + rs.getInt("total_marks") +
                          ", Phone: " + rs.getString("phone_no"));
        	  }
        	  break;
          case 3:
        	  System.out.print("Enter ID of student to edit: ");
              int editId = sc.nextInt();
              sc.nextLine(); // clear buffer
              System.out.print("Enter New Name: ");
              String newName = sc.nextLine();
              System.out.print("Enter New Course: ");
              String newCourse = sc.nextLine();
              System.out.print("Enter New City: ");
              String newCity = sc.nextLine();
              System.out.print("Enter New Total Marks: ");
              int newMarks = sc.nextInt();
              sc.nextLine();
              System.out.print("Enter New Phone No: ");
              String newPhone = sc.nextLine();
              
              PreparedStatement ps2=con.prepareStatement("UPDATE student SET name=?, course=?, city=?, total_marks=?, phone_no=? WHERE id=?");
              	
              ps2.setString(1, newName);
              ps2.setString(2, newCourse);
              ps2.setString(3, newCity);
              ps2.setInt(4, newMarks);
              ps2.setString(5, newPhone);
              ps2.setInt(6, editId);
              
              int update =ps2.executeUpdate();
              if(update > 0)
              {
            	  System.out.println("Update succsesfully");
              }
              else
              {
            	  System.out.println("something went wrong");
              }
              break;
          case 4:
        	  System.out.println("enter id to delete");
        	  int delid=sc.nextInt();
        	  
        	  PreparedStatement ps3=con.prepareStatement("delete from student where id=?");
        	  ps3.setInt(1, delid);
        	  int delete =ps3.executeUpdate();
        	  if(delete >0)
        	  {
        		  System.out.println("id delete sucsesfuly");
        	  }
        	  else
        	  {
        		  System.out.println("something went wrong id not dlete");
        	  }
        	  break;
          case 5:
        	  System.out.println("exit program");
        	  con.close();
        	  sc.close();
        	  return;
          default :
        	  System.out.println("invalid choice try again !!!");
        	  
          }
        	  
		  }
		
		
	} catch (Exception e) {
	System.out.println("Error"+e);
	}
}
}

