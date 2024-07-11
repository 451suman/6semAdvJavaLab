 
package lab1_q_no_g;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class event extends MouseAdapter{
    JFrame frame;
    JButton btnTest;
    JLabel txt1,txt2 , result ;
    JTextField num1,num2;

    public event() {
        // Creating Object of JFrame
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        txt1 = new JLabel("Enter a number");
        frame.add(txt1);
        
        num1 = new JTextField(15);
        frame.add(num1);
        
        txt2 = new JLabel("Enter a number");
        frame.add(txt2);
        
        num2 = new JTextField(15);
        frame.add(num2);
        
           result = new JLabel("result: ");
        frame.add(result);
        
        // Creating and Adding GUI Controls 
        btnTest = new JButton("Button Test");
        frame.add(btnTest);
        
        // Add Mouse Event to Button using MouseAdapter for simplicity
        btnTest.addMouseListener(new MouseAdapter() {
           
            @Override
            public void mousePressed(MouseEvent e) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int c = a+b;
               result.setText(String.valueOf("result:"+c));
                
            }
            @Override
            public void mouseExited(MouseEvent e) {
               int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int c = a-b;
               result.setText(String.valueOf("result:"+c));
            }
        });

        // Make frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Lab1_Q_no_g {

    public static void main(String[] args) {
       new event();
    }
    
}
