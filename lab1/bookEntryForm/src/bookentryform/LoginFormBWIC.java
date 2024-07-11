/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookentryform;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

class LoginForm
{
     /* Declaration of Object */
    JFrame frame;   /* Declaring object of JFrame.. So, that we can create a frame */
    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField jpfPass;
    JButton btnLogin, btnReset;
    
    public LoginForm()
    {
        
        /* Creating Object of JFrame */
        frame = new JFrame();
        frame.setTitle("Login Form");
        frame.setSize(200, 170);
        frame.setLocationRelativeTo(null); /* Take frame to the Center Screen */
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
       // frame.setLayout(new GridLayout(3,2));
        
        /* Creating and Adding Components */
        lblUser = new JLabel("Username: ");
        lblPass = new JLabel("Password: ");
        txtUser = new JTextField(15);
        jpfPass = new JPasswordField(15);
        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");
        
        frame.add(lblUser); frame.add(txtUser);
        frame.add(lblPass); frame.add(jpfPass);
        frame.add(btnLogin); frame.add(btnReset);
        
        btnLogin.addActionListener(e -> loginCheck());
        btnReset.addActionListener(r -> clearFields());
      
        /* Make frame visible */
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void loginCheck()
    {
        String user = txtUser.getText();
        String pass = String.valueOf(jpfPass.getPassword());
        
      
     try {
            /*Step 2: Load and Register the MySQL Driver */
        Class.forName("com.mysql.jdbc.Driver");
        /*Step 3: Create and Establish the Connection with MySQL Server*/
        String URL = "jdbc:mysql://localhost:3306/bookdb";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(URL, username, password);
        /*Step 4: Create a Statement */
        Statement stmt = conn.createStatement();
        /*Step 5: Create and Execute SQL statment using above stmt */
        String selectQuery = "Select * from  logintbl Where username='"+user+"' and password='"+pass+"'";
        ResultSet rs = stmt.executeQuery(selectQuery);
        /* Step 6: Check or Process the above query is executed or not */
         if(rs.next())
         {
             clearFields();
             JOptionPane.showMessageDialog(frame, "Welcome "+user);
             frame.dispose();
             BEF obj =  new BEF();
             
         }
         else
         {
             JOptionPane.showMessageDialog(frame, "Username or password do not match...");
         }
        /* Step 7: Close the connection */
        conn.close(); 
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
        } 
     }
    private void clearFields()
    {
        txtUser.setText("");
        jpfPass.setText("");
    }
  }
public class LoginFormBWIC {
    public static void main(String[] args) {
        new LoginForm();
    }
}
