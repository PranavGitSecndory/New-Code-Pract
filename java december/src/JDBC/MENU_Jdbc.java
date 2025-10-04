package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MENU_Jdbc {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            // Load JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish Connection
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/batchname", "root", "Jim@143143");

	            while (true) {
	                System.out.println("\n--- MENU ---");
	                System.out.println("1. Search by ID");
	                System.out.println("2. Update by ID");
	                System.out.println("3. Delete by ID");
	                System.out.println("4. Fetch All");
	                System.out.println("5. Exit");
	                System.out.print("Enter your choice: ");
	                int choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter ID to search: ");
	                        int sid = sc.nextInt();
	                        PreparedStatement ps1 = con.prepareStatement("SELECT * FROM nick WHERE id = ?");
	                        ps1.setInt(1, sid);
	                        ResultSet rs1 = ps1.executeQuery();
	                        if (rs1.next()) {
	                            System.out.println("ID: " + rs1.getInt("id"));
	                            System.out.println("Name: " + rs1.getString("name"));
	                            System.out.println("City: " + rs1.getString("city"));
	                        } else {
	                            System.out.println("Record not found.");
	                        }
	                        break;

	                    case 2:
	                        System.out.print("Enter ID to update: ");
	                        int uid = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter new Name: ");
	                        String uname = sc.nextLine();
	                        System.out.print("Enter new City: ");
	                        String ucity = sc.nextLine();

	                        PreparedStatement ps2 = con.prepareStatement("UPDATE nick SET name = ?, city = ? WHERE id = ?");
	                        ps2.setString(1, uname);
	                        ps2.setString(2, ucity);
	                        ps2.setInt(3, uid);

	                        int updated = ps2.executeUpdate();
	                        System.out.println(updated > 0 ? "Record updated." : "ID not found.");
	                        break;

	                    case 3:
	                        System.out.print("Enter ID to delete: ");
	                        int did = sc.nextInt();

	                        PreparedStatement ps3 = con.prepareStatement("DELETE FROM nick WHERE id = ?");
	                        ps3.setInt(1, did);
	                        int deleted = ps3.executeUpdate();
	                        System.out.println(deleted > 0 ? "Record deleted." : "ID not found.");
	                        break;

	                    case 4:
	                    	PreparedStatement ps4 = con.prepareStatement("SELECT * FROM nick");
	                    	ResultSet rs2 = ps4.executeQuery();


	                        System.out.println("\nAll Records:");
	                        while (rs2.next()) {
	                            System.out.println(rs2.getInt("id") + " | " + rs2.getString("name") + " | " + rs2.getString("city"));
	                        }
	                        break;

	                    case 5:
	                        System.out.println("Exiting program.");
	                        con.close();
	                        sc.close();
	                        return;

	                    default:
	                        System.out.println("Invalid choice.");
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("Error: " + e);
	        }
	    }
}
