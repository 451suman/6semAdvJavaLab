package studentconsoledb_lab1_m;

import java.sql.*;

public class StudentConsoleDb_Lab1_m {

    public static void main(String[] args) throws SQLException {
        
        String URL = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(URL, username, password);
        
        String insertQuery = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        
        // Insert first record
        pstmt.setInt(1, 101);
        pstmt.setString(2, "Ram");
        pstmt.setString(3, "Bachelor");
        pstmt.setString(4, "First");
        pstmt.setString(5, "Science");
        int rowAffected1 = pstmt.executeUpdate(); 
        if(rowAffected1 > 0)
            System.out.println("Record inserted successfully...");
        else
            System.out.println("Error while inserting record...");

        // Insert second record
        pstmt.setInt(1, 102);
        pstmt.setString(2, "Sita");
        pstmt.setString(3, "Bachelor");
        pstmt.setString(4, "Distinction");
        pstmt.setString(5, "Data Science");
        int rowAffected2 = pstmt.executeUpdate(); 
        if(rowAffected2 > 0)
            System.out.println("Record inserted successfully...");
        else
            System.out.println("Error while inserting record...");
        
        // Insert third record
        pstmt.setInt(1, 103);
        pstmt.setString(2, "Gita");
        pstmt.setString(3, "Bachelor");
        pstmt.setString(4, "Distinction");
        pstmt.setString(5, "Data Science");
        int rowAffected3 = pstmt.executeUpdate(); 
        if(rowAffected3 > 0)
            System.out.println("Record inserted successfully...");
        else
            System.out.println("Error while inserting record...");
        
        // Close the connection
        conn.close();
    }
}
