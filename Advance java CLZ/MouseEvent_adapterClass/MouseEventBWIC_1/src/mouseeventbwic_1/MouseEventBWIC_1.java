package mouseeventbwic_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEvent{
    JFrame frame;
    JButton btnTest;
    JLabel lblOutput,res ;

    public MouseEvent() {
        // Creating Object of JFrame
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setSize(150, 150);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Creating and Adding GUI Controls 
        btnTest = new JButton("Button Test");
        frame.add(btnTest);
        lblOutput = new JLabel("-------------------");
        frame.add(lblOutput);
        res = new JLabel("dasdasdasdasd ");
        frame.add(res);

        // Add Mouse Event to Button using MouseAdapter for simplicity
        btnTest.addMouseListener(new MouseAdapter() {
           @Override
            public void mouseEntered(MouseEvent e) {
                lblOutput.setText("Mouse Entered on Button...");
            }
            @Override
            public void mousePressed(MouseEvent e) {
                res.setText("Mouse Pressed on Button...");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });

        // Make frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/* Driver Class */
public class MouseEventBWIC_1 {
    public static void main(String[] args) {
        new MouseEvent();
    }
}
