package mouseevent.witheventinheritance;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class event implements MouseListener{
    JFrame frame;
    JButton btnTest;
    JLabel lblOutput;
    event(){
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); /* Take frame to the Center Screen */
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //Creating and Adding GUI Controls 
        btnTest = new JButton("Button Test");
        frame.add(btnTest);
        lblOutput = new JLabel("-------------------");
        frame.add(lblOutput);
        
        /* Add Mouse Event to Button */
        btnTest.addMouseListener(this);
        
        
         /* Make frame visible */
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }

    /* Mouse Event methods outside Construcutor */
    @Override
    public void mouseClicked(MouseEvent e) {
       lblOutput.setText("Mouse Clicked on Button....");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lblOutput.setText("Mouse Pressed on Button...");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         lblOutput.setText("Mouse Released from Button...");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         lblOutput.setText("Mouse Entered on Button...");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lblOutput.setText("Mouse Exited from Button...");
    }
}
   


class MouseEventWithEventInheritance {
    public static void main(String[] args) {
        new event();
    }
}
