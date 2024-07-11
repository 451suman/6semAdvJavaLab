
package myfirstswing;


import javax.swing.*;
import java.awt.*;
class SwingClass {
    SwingClass(){
       //Creating Object of JFrame
        JFrame frame = new JFrame("My First Swing JFrame");
        //Setting the size of JFrame
        frame.setSize(500,500);
        
        //Other Featurs starts from here
        frame.setLayout(new BorderLayout.Center); /* Default layout for JFrame is BorderLayout() */
        
        //Taking JFraem to Center of the Screen
        frame.setLocationRelativeTo(null);
        
        //Setting Location of JFrame from left and top
        //frame.setLocation(400, 100);
        
        //Resizing of JFrame
        frame.setResizable(true);  //Default true
        
        //Making JFrame fullscreen or maximized
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.setBackground(Color.yellow);
        
        //Adding JComponents on JFrame
        JButton button = new JButton("Button 1");
        frame.add(button);
         JButton button2 = new JButton("Button 2");
        frame.add(button2);
        
       
        
        //Making JFrame Visible 
        frame.setVisible(true);   
        //Close JFrame Completely
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

public class MyFirstSwing {


    public static void main(String[] args) {
        new SwingClass();
    }
    
}
