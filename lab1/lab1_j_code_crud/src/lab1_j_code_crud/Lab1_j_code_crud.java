package lab1_j_code_crud;

import java.sql.*;
import java.util.Scanner;

public class Lab1_j_code_crud {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Displaying the CRUD menu
        System.out.println("--------Console CRUD Menu---------");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Select");
        System.out.println("5. Exit");
        System.out.println("---------------------------------");

        int choice;

        do {
            System.out.println("Enter your choice from menu:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    insertRecord();
                    break;
                case 2:
                    updateRecord();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    selectRecord();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!!! Try again.....");
            }
        } while (choice != 5);

        input.close();
    }

    private static void insertRecord() {
        try {
            // Establishing database connection
            Connection conn = getConnection();

            // Creating statement
            Statement stmt = conn.createStatement();

            // SQL query for insert
            String insert = "INSERT INTO Book_Info (id, title, author, publication, price) " +
                            "VALUES (1, 'Fire', 'suman', 'HBO', 500)";

            // Executing insert query
            stmt.executeUpdate(insert);

            // Closing resources
            stmt.close();
            conn.close();

            System.out.println("Record Inserted Successfully");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static void updateRecord() {
        try {
            // Establishing database connection
            Connection conn = getConnection();

            // Creating statement
            Statement stmt = conn.createStatement();

            // SQL query for update
            String update = "UPDATE Book_Info SET title = 'dragon', " +
                            "author = 'khaire', publication = 'HBO', price = 456 " +
                            "WHERE id = "+1;

            // Executing update query
            stmt.executeUpdate(update);

            // Closing resources
            stmt.close();
            conn.close();

            System.out.println("Record Updated Successfully");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static void deleteRecord() {
        try {
            // Establishing database connection
            Connection conn = getConnection();

            // Creating statement
            Statement stmt = conn.createStatement();

            // SQL query for delete
            String delete = "DELETE FROM Book_Info WHERE id = 1";

            // Executing delete query
            stmt.executeUpdate(delete);

            // Closing resources
            stmt.close();
            conn.close();

            System.out.println("Record Deleted Successfully");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static void selectRecord() {
        try {
            // Establishing database connection
            Connection conn = getConnection();

            // Creating statement
            Statement stmt = conn.createStatement();

            // SQL query for select
            String selectQuery = "SELECT * FROM Book_Info";

            // Executing select query
            ResultSet rs = stmt.executeQuery(selectQuery);

            // Printing results
            System.out.println("ID\tTitle\t\tAuthor\t\tPublication\tPrice");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String pub = rs.getString("publication");
                int price = rs.getInt("price");
                System.out.println(id + "\t" + title + "\t\t" + author + "\t\t" + pub + "\t\t" + price);
            }

            // Closing resources
            rs.close();
            stmt.close();
            conn.close();

            System.out.println("Record Selected Successfully");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/BookDb";
        String username = "root";
        String password = "";

        // Registering JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }

        // Returning connection object
        return DriverManager.getConnection(url, username, password);
    }
}
