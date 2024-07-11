
package arthmeticcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.*;

class Cal implements ActionListener  {
    JFrame frame;
    JLabel first , second, result ;
    JTextField num1, num2,resulttxt;
    JButton addd, sub, mul, div , clear;
    JPanel p1, p2;
    
    Cal()
    {
        frame = new JFrame();
        frame.setSize(420,145);
        frame.setTitle("Arthmetic Calculator");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));   
      frame.setResizable(false);
       
       
       p1= new JPanel();
       frame.add(p1);
       p1.setLayout(new GridLayout(3,2));
        first = new JLabel ("Enter a Number");
        p1.add(first);
        
        num1 = new JTextField(15);
        p1.add(num1);
        
        second= new JLabel("Enter a Second Number");
        p1.add(second);
        
        num2 = new JTextField(15);
        p1.add(num2);
        
        result = new JLabel("Result:");
        p1.add(result);
        resulttxt= new JTextField();
        p1.add(resulttxt);
        
      //  p1.setBackground(Color.red);
        p2 = new JPanel();
        frame.add(p2);
        p2.setLayout(new GridLayout(1,5));
        addd = new JButton("Add");
        sub = new JButton("Subract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        clear = new JButton("Clear");
        
        p2.add(addd);
        p2.add(sub);
        p2.add(mul);
        p2.add(div);
        p2.add(clear);
        
//        p2.setBackground(Color.blue);
        
       addd.addActionListener(this); 
        sub.addActionListener(this);
         mul.addActionListener(this);
         div.addActionListener(this);
        clear.addActionListener(this);
        
       frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
     try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            
            if (ae.getSource() == addd) {
                int sum = a + b;
                result.setText("Reusult: " + sum);
                JOptionPane.showMessageDialog("Result: " +sum);
            } else if (ae.getSource() == sub) {
                int su = a - b;
                result.setText("Reusult: " + su);
            } else if (ae.getSource() == mul) {
                int mu = a * b;
                result.setText("Reusult: " + mu);
            } else if (ae.getSource() == div) {
                if (b != 0) {
                    float d = (float) a / b;
                    result.setText("Reusult: " + d);
                } else {
                    result.setText("Cannot divide by zero");
                }
            } else if (ae.getSource() == clear) {
                num1.setText("");
                num2.setText("");
                result.setText("Result:    ");
            } else {
                result.setText("Invalid Operation");
            }
        } catch (NumberFormatException e) {
            result.setText("Invalid Input");
        } catch (Exception e) {
            result.setText("Invalid Operation");
        }
    } 
    
}
public class ArthmeticCalculator {
    public static void main(String[] args) {
     new Cal();
    }
    
}
