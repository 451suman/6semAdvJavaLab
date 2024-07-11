package arthmetic.calculator;
import javax.swing.*;
import java.awt.*;

class Calculate {
    JFrame frame;
    JLabel num1, num2, result;
    JTextField num1TF, num2TF, resultTF;
    JButton add, mul, sub, div;
    int num11, num22; // Declare as instance variables

    Calculate() {
        frame = new JFrame();
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));
        
        num1 = new JLabel("Enter a First number");
        frame.add(num1);
        num1TF = new JTextField(15);
        frame.add(num1TF);
        
        num2 = new JLabel("Enter a Second number");
        frame.add(num2);
        num2TF = new JTextField(15);
        frame.add(num2TF);
        
        result = new JLabel("Result");
        frame.add(result);
        resultTF = new JTextField(15);
        resultTF.setEditable(false);
        frame.add(resultTF);
        
        add = new JButton("Add");
        frame.add(add);
        
        sub = new JButton("Sub");
        frame.add(sub);
        
        div = new JButton("Div");
        frame.add(div);
        
        mul = new JButton("Mul");
        frame.add(mul);
        
        add.addActionListener(e -> ADD());
        sub.addActionListener(e -> SUB());
        div.addActionListener(e -> DIV());
        mul.addActionListener(e -> MUL());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void data() {
        try {
            num11 = Integer.parseInt(num1TF.getText());
            num22 = Integer.parseInt(num2TF.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
        }
    }

    public void ADD() {
        data();
        int result = num11 + num22;
        resultTF.setText(String.valueOf(result));
    }

    public void SUB() {
        data();
        int result = num11 - num22;
        resultTF.setText(String.valueOf(result));
    }

    public void DIV() {
        data();
        if (num22 != 0) {
            int result = num11 / num22;
            resultTF.setText(String.valueOf(result));
        } else {
            JOptionPane.showMessageDialog(frame, "Cannot divide by zero.");
        }
    }

    public void MUL() {
        data();
        int result = num11 * num22;
        resultTF.setText(String.valueOf(result));
    }
}

public class ArthmeticCalculator {
    public static void main(String[] args) {
        new Calculate();
    }
}
