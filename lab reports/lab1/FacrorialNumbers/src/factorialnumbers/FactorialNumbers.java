package factorialnumbers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Factorial {
    JFrame frame;
    JLabel num;
    JTextField numTF;
    JButton factorialButton;

    Factorial() {
        frame = new JFrame();
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        num = new JLabel("Enter a number");
        frame.add(num);

        numTF = new JTextField(15);
        frame.add(numTF);

        factorialButton = new JButton("Factorial");
        frame.add(factorialButton);

        factorialButton.addActionListener((ActionEvent e) -> {
           
                int number = Integer.parseInt(numTF.getText());
                if (number < 0) {
                    JOptionPane.showMessageDialog(frame, "Factorial is not defined for negative numbers.");
                } else {
                    long res = 1;
                    for (int i = 1; i <= number; ++i) {
                        res *= i;
                    }
                    JOptionPane.showMessageDialog(frame, "The factorial of " + number + " is " + res);
                }
                          
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class FactorialNumbers {
    public static void main(String[] args) {
        new Factorial();
    }
}
