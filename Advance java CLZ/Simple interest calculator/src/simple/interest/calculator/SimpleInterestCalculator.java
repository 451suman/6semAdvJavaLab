package simple.interest.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class si implements ActionListener {
    JFrame frame;
    JLabel principle, rate, time, resultLabel;
    JButton calculate;
    JTextField txtp, txtr, txtt;
    JPanel p1;
    
    si() {
        frame = new JFrame();
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setTitle("Simple Interest Calculator");
        
        p1 = new JPanel();
        p1.setBounds(20, 20, 340, 150);
        p1.setLayout(new GridLayout(4, 2, 10, 10));
        frame.add(p1);
        
        principle = new JLabel("Principle:");
        p1.add(principle);
        txtp = new JTextField();
        p1.add(txtp);
       
        rate = new JLabel("Rate:");
        p1.add(rate);
        txtr = new JTextField();
        p1.add(txtr);
       
        time = new JLabel("Time:");
        p1.add(time);
        txtt = new JTextField();
        p1.add(txtt);
       
        calculate = new JButton("Calculate");
        calculate.setBounds(140, 180, 100, 30);
        frame.add(calculate);
        
        calculate.addActionListener(this);
        
        
        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(20, 220, 340, 30);
        frame.add(resultLabel);
        
       
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
       {
            double p = Double.parseDouble(txtp.getText());
            double r = Double.parseDouble(txtr.getText());
            double t = Double.parseDouble(txtt.getText());
            double interest = (p * r * t) / 100;
            resultLabel.setText(String.valueOf("Result: "+interest));
           
           
       }
}

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        new si();
    }
}
