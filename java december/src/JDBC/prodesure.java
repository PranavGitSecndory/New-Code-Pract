package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.CallableStatement;




public class prodesure {
	  public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/batchname", "root", "Jim@143143");

	            Scanner sc = new Scanner(System.in);

	            while (true) {
	                System.out.print("Enter ID: ");
	                int id = sc.nextInt();
	                System.out.print("Enter Name: ");
	                String name = sc.next();
	                System.out.print("Enter City: ");
	                String city = sc.next();

	                CallableStatement cs = con.prepareCall("{call insert_into_nick(?, ?, ?)}");
	                cs.setInt(1, id);
	                cs.setString(2, name);
	                cs.setString(3, city);

	                cs.execute();
	                System.out.println("Data inserted successfully.");

	                cs.close();

	                System.out.print("Do you want to continue inserting? (Y/N): ");
	                char ch = sc.next().charAt(0);
	                if (ch == 'n' || ch == 'N')
	                    break;
	            }

	            sc.close();
	            con.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e);
	        }
	    }
}
