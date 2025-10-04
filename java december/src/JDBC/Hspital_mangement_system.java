//Hospital Management System Using JDBC
//Problem Statement:
//Design and implement a Hospital Management System (HMS) using JDBC with MySQL. The system should allow the hospital to manage patient records, doctor details, appointments, and billing efficiently.
//
//The system should have the following functionalities:
//
//Patient Management: Add, update, delete, and view patient records.
//
//Doctor Management: Add, update, delete, and view doctor details.
//
//Appointment Scheduling: Schedule appointments for patients with doctors.
//
//Billing System: Generate and view patient bills. give the jdbc code give the entire things oin one code
package JDBC;
import java.sql.*;
import java.util.Scanner;


public class Hspital_mangement_system {
	 public static void main(String[] args) {
	     

	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db","root","Jim@143143");
	             Scanner sc = new Scanner(System.in)) {

	            while (true) {
	                System.out.println("\n1.Add Patient  2.View Patients  3.Add Doctor  4.View Doctors");
	                System.out.println("5.Schedule Appointment  6.View Appointments  7.Generate Bill  8.View Bills  9.Exit");
	                System.out.print("Choose: ");
	                int choice = Integer.parseInt(sc.nextLine());

	                if (choice == 9) break;

	                switch (choice) {
	                    case 1 -> {
	                        System.out.print("Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Age: ");
	                        int age = Integer.parseInt(sc.nextLine());
	                        System.out.print("Gender: ");
	                        String gender = sc.nextLine();
	                        System.out.print("Contact: ");
	                        String contact = sc.nextLine();

	                        String sql = "INSERT INTO patients(name, age, gender, contact) VALUES (?, ?, ?, ?)";
	                        try (PreparedStatement ps = con.prepareStatement(sql)) {
	                            ps.setString(1, name);
	                            ps.setInt(2, age);
	                            ps.setString(3, gender);
	                            ps.setString(4, contact);
	                            ps.executeUpdate();
	                            System.out.println("Patient added.");
	                        }
	                    }
	                    case 2 -> {
	                        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM patients");
	                        while (rs.next()) {
	                            System.out.printf("%d: %s, Age:%d, Gender:%s, Contact:%s\n",
	                                    rs.getInt("patient_id"), rs.getString("name"),
	                                    rs.getInt("age"), rs.getString("gender"), rs.getString("contact"));
	                        }
	                    }
	                    case 3 -> {
	                        System.out.print("Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Specialization: ");
	                        String spec = sc.nextLine();
	                        System.out.print("Contact: ");
	                        String contact = sc.nextLine();

	                        String sql = "INSERT INTO doctors(name, specialization, contact) VALUES (?, ?, ?)";
	                        try (PreparedStatement ps = con.prepareStatement(sql)) {
	                            ps.setString(1, name);
	                            ps.setString(2, spec);
	                            ps.setString(3, contact);
	                            ps.executeUpdate();
	                            System.out.println("Doctor added.");
	                        }
	                    }
	                    case 4 -> {
	                        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM doctors");
	                        while (rs.next()) {
	                            System.out.printf("%d: %s, Spec:%s, Contact:%s\n",
	                                    rs.getInt("doctor_id"), rs.getString("name"),
	                                    rs.getString("specialization"), rs.getString("contact"));
	                        }
	                    }
	                    case 5 -> {
	                        System.out.print("Patient ID: ");
	                        int pid = Integer.parseInt(sc.nextLine());
	                        System.out.print("Doctor ID: ");
	                        int did = Integer.parseInt(sc.nextLine());
	                        System.out.print("Date (YYYY-MM-DD): ");
	                        String date = sc.nextLine();

	                        String sql = "INSERT INTO appointments(patient_id, doctor_id, appointment_date) VALUES (?, ?, ?)";
	                        try (PreparedStatement ps = con.prepareStatement(sql)) {
	                            ps.setInt(1, pid);
	                            ps.setInt(2, did);
	                            ps.setDate(3, Date.valueOf(date));
	                            ps.executeUpdate();
	                            System.out.println("Appointment scheduled.");
	                        }
	                    }
	                    case 6 -> {
	                        String sql = "SELECT a.appointment_id, p.name AS patient, d.name AS doctor, a.appointment_date " +
	                                "FROM appointments a JOIN patients p ON a.patient_id=p.patient_id " +
	                                "JOIN doctors d ON a.doctor_id=d.doctor_id ORDER BY a.appointment_date";
	                        ResultSet rs = con.createStatement().executeQuery(sql);
	                        while (rs.next()) {
	                            System.out.printf("%d: Patient:%s, Doctor:%s, Date:%s\n",
	                                    rs.getInt("appointment_id"), rs.getString("patient"),
	                                    rs.getString("doctor"), rs.getDate("appointment_date").toString());
	                        }
	                    }
	                    case 7 -> {
	                        System.out.print("Patient ID: ");
	                        int pid = Integer.parseInt(sc.nextLine());
	                        System.out.print("Amount: ");
	                        double amount = Double.parseDouble(sc.nextLine());

	                        String sql = "INSERT INTO bills(patient_id, amount, bill_date) VALUES (?, ?, CURDATE())";
	                        try (PreparedStatement ps = con.prepareStatement(sql)) {
	                            ps.setInt(1, pid);
	                            ps.setDouble(2, amount);
	                            ps.executeUpdate();
	                            System.out.println("Bill generated.");
	                        }
	                    }
	                    case 8 -> {
	                        String sql = "SELECT b.bill_id, p.name, b.amount, b.bill_date FROM bills b JOIN patients p ON b.patient_id=p.patient_id ORDER BY b.bill_date DESC";
	                        ResultSet rs = con.createStatement().executeQuery(sql);
	                        while (rs.next()) {
	                            System.out.printf("BillID:%d, Patient:%s, Amount:%.2f, Date:%s\n",
	                                    rs.getInt("bill_id"), rs.getString("name"),
	                                    rs.getDouble("amount"), rs.getDate("bill_date").toString());
	                        }
	                    }
	                    default -> System.out.println("Invalid choice!");
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}

