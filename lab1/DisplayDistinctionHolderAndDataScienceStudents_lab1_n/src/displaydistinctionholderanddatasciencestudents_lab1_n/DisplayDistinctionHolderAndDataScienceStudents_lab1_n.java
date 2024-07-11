
package displaydistinctionholderanddatasciencestudents_lab1_n;

import java.sql.*; //step 1
public class DisplayDistinctionHolderAndDataScienceStudents_lab1_n {

    public static void main(String[] args) {
       try {
            /*Step 2: Load and Register the MySQL Driver */
      
        /*Step 3: Create and Establish the Connection with MySQL Server*/
        String URL = "jdbc:mysql://localhost:3306/college";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(URL, username, password);
        /*Step 4: Create a Statement */
        String selectQuery = "Select * from student Where division=? and major=?";
        PreparedStatement pstmt = conn.prepareStatement(selectQuery);
        /*Step 5: Execute SQL Statment */
         pstmt.setString(1, "Distinction");
         pstmt.setString(2, "Data Science");
         
         ResultSet rs = pstmt.executeQuery();
         System.out.println("Roll\tName\tLevel\t\tDivsion\t\tMajor");
         while(rs.next())
         {
             int roll = rs.getInt(1);
             String name = rs.getString(2);
             String level = rs.getString(3);
             String div = rs.getString(4);
             String major = rs.getString(5);
             System.out.println(roll+"\t"+name+"\t"+level+"\t"+div+"\t"+major);
         }
        /*Step 7: Close the Connection*/
        conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }  
    }
    
}
