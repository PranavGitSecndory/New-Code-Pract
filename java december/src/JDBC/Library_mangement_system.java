package JDBC;
import java.sql.*;
import java.util.Scanner;
public class Library_mangement_system {
	  

	    public static void main(String[] args) {
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db",
	        		   "root",
	        		    "Jim@143143");
	             Scanner sc = new Scanner(System.in)) {

	            while (true) {
	                System.out.println("\n--- Library Management Menu ---");
	                System.out.println("1. Add Book");
	                System.out.println("2. Update Book");
	                System.out.println("3. Delete Book");
	                System.out.println("4. View Books");
	                System.out.println("5. Search Book");
	                System.out.println("6. Add Member");
	                System.out.println("7. Update Member");
	                System.out.println("8. Delete Member");
	                System.out.println("9. Issue Book");
	                System.out.println("10. Return Book");
	                System.out.println("11. Generate Report");
	                System.out.println("12. Exit");
	                System.out.print("Enter your choice: ");

	                int choice = sc.nextInt();
	                sc.nextLine(); // consume newline

	                switch (choice) {
	                    case 1 -> {
	                        System.out.print("Enter Book ID: ");
	                        int id = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Title: ");
	                        String title = sc.nextLine();
	                        System.out.print("Enter Author: ");
	                        String author = sc.nextLine();
	                        System.out.print("Enter Category: ");
	                        String category = sc.nextLine();
	                        System.out.print("Enter Quantity: ");
	                        int qty = sc.nextInt();
	                        sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement(
	                            "INSERT INTO books(book_id, title, author, category, quantity) VALUES (?, ?, ?, ?, ?)");
	                        ps.setInt(1, id);
	                        ps.setString(2, title);
	                        ps.setString(3, author);
	                        ps.setString(4, category);
	                        ps.setInt(5, qty);
	                        ps.executeUpdate();
	                        System.out.println("Book added successfully!");
	                    }

	                    case 2 -> {
	                        System.out.print("Enter Book ID to update: ");
	                        int id = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter new Title: ");
	                        String newTitle = sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement("UPDATE books SET title=? WHERE book_id=?");
	                        ps.setString(1, newTitle);
	                        ps.setInt(2, id);
	                        int rows = ps.executeUpdate();
	                        if (rows > 0) System.out.println("Book updated successfully!");
	                        else System.out.println("Book ID not found!");
	                    }

	                    case 3 -> {
	                        System.out.print("Enter Book ID to delete: ");
	                        int id = sc.nextInt();
	                        sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement("DELETE FROM books WHERE book_id=?");
	                        ps.setInt(1, id);
	                        int rows = ps.executeUpdate();
	                        if (rows > 0) System.out.println("Book deleted successfully!");
	                        else System.out.println("Book ID not found!");
	                    }

	                    case 4 -> {
	                        Statement stmt = con.createStatement();
	                        ResultSet rs = stmt.executeQuery("SELECT * FROM books");
	                        System.out.println("BookID | Title | Author | Category | Quantity");
	                        while (rs.next()) {
	                            System.out.printf("%d | %s | %s | %s | %d%n",
	                                    rs.getInt("book_id"),
	                                    rs.getString("title"),
	                                    rs.getString("author"),
	                                    rs.getString("category"),
	                                    rs.getInt("quantity"));
	                        }
	                    }

	                    case 5 -> {
	                        System.out.print("Enter title keyword to search: ");
	                        String keyword = sc.nextLine();
	                        PreparedStatement ps = con.prepareStatement("SELECT * FROM books WHERE title LIKE ?");
	                        ps.setString(1, "%" + keyword + "%");
	                        ResultSet rs = ps.executeQuery();

	                        System.out.println("Search Results:");
	                        while (rs.next()) {
	                            System.out.printf("%d | %s | %s | %s | %d%n",
	                                    rs.getInt("book_id"),
	                                    rs.getString("title"),
	                                    rs.getString("author"),
	                                    rs.getString("category"),
	                                    rs.getInt("quantity"));
	                        }
	                    }

	                    case 6 -> {
	                        System.out.print("Enter Member ID: ");
	                        int mid = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Enter Address: ");
	                        String addr = sc.nextLine();
	                        System.out.print("Enter Phone: ");
	                        String phone = sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement(
	                            "INSERT INTO members(member_id, name, address, phone) VALUES (?, ?, ?, ?)");
	                        ps.setInt(1, mid);
	                        ps.setString(2, name);
	                        ps.setString(3, addr);
	                        ps.setString(4, phone);
	                        ps.executeUpdate();
	                        System.out.println("Member added successfully!");
	                    }

	                    case 7 -> {
	                        System.out.print("Enter Member ID to update: ");
	                        int mid = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter new Name: ");
	                        String newName = sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement("UPDATE members SET name=? WHERE member_id=?");
	                        ps.setString(1, newName);
	                        ps.setInt(2, mid);
	                        int rows = ps.executeUpdate();
	                        if (rows > 0) System.out.println("Member updated successfully!");
	                        else System.out.println("Member ID not found!");
	                    }

	                    case 8 -> {
	                        System.out.print("Enter Member ID to delete: ");
	                        int mid = sc.nextInt();
	                        sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement("DELETE FROM members WHERE member_id=?");
	                        ps.setInt(1, mid);
	                        int rows = ps.executeUpdate();
	                        if (rows > 0) System.out.println("Member deleted successfully!");
	                        else System.out.println("Member ID not found!");
	                    }

	                    case 9 -> {
	                        System.out.print("Enter Book ID to issue: ");
	                        int bid = sc.nextInt();
	                        System.out.print("Enter Member ID: ");
	                        int mid = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Issue Date (YYYY-MM-DD): ");
	                        String issueDate = sc.nextLine();

	                        PreparedStatement ps = con.prepareStatement(
	                            "INSERT INTO issued_books(book_id, member_id, issue_date) VALUES (?, ?, ?)");
	                        ps.setInt(1, bid);
	                        ps.setInt(2, mid);
	                        ps.setDate(3, Date.valueOf(issueDate));
	                        ps.executeUpdate();
	                        System.out.println("Book issued successfully!");
	                    }

	                    case 10 -> {
	                        System.out.print("Enter Issue ID to return: ");
	                        int issueId = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Return Date (YYYY-MM-DD): ");
	                        String returnDate = sc.nextLine();

	                        PreparedStatement psGet = con.prepareStatement("SELECT issue_date FROM issued_books WHERE issue_id=?");
	                        psGet.setInt(1, issueId);
	                        ResultSet rs = psGet.executeQuery();

	                        if (rs.next()) {
	                            Date issueDt = rs.getDate("issue_date");
	                            Date retDt = Date.valueOf(returnDate);

	                            long diffDays = (retDt.getTime() - issueDt.getTime()) / (1000 * 60 * 60 * 24);
	                            double fine = (diffDays > 7) ? (diffDays - 7) * 10 : 0;

	                            PreparedStatement psUpdate = con.prepareStatement(
	                                "UPDATE issued_books SET return_date=?, fine=? WHERE issue_id=?");
	                            psUpdate.setDate(1, retDt);
	                            psUpdate.setDouble(2, fine);
	                            psUpdate.setInt(3, issueId);
	                            psUpdate.executeUpdate();

	                            System.out.println("Book returned. Fine: Rs." + fine);
	                        } else {
	                            System.out.println("Invalid Issue ID!");
	                        }
	                    }

	                    case 11 -> {
	                        CallableStatement cs = con.prepareCall("{call generate_report()}");
	                        boolean moreResults = cs.execute();
	                        int step = 0;
	                        while (moreResults) {
	                            ResultSet rs = cs.getResultSet();
	                            if (step == 0 && rs.next()) {
	                                System.out.println("Total Books: " + rs.getInt(1));
	                            } else if (step == 1) {
	                                System.out.println("Currently Issued Books:");
	                                while (rs.next()) {
	                                    System.out.println("Issue ID: " + rs.getInt("issue_id") +
	                                                       ", Book ID: " + rs.getInt("book_id"));
	                                }
	                            } else if (step == 2 && rs.next()) {
	                                System.out.println("Total Fines Collected: Rs." + rs.getDouble(1));
	                            }
	                            moreResults = cs.getMoreResults();
	                            step++;
	                        }
	                    }

	                    case 12 -> {
	                        System.out.println("Goodbye!");
	                        return;
	                    }

	                    default -> System.out.println("Invalid choice. Try again.");
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
