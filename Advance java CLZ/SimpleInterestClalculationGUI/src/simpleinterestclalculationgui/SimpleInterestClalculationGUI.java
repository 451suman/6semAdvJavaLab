package simpleinterestclalculationgui;

import javax.swing.*;
import java.awt.*;

class si{
    JFrame frame;
     JLabel p,t,r;
     JTextField txtp,txtr,txtt;
     JButton caculate;
     
     si(){
     frame=new JFrame();
     frame.setSize(230,180);
     frame.setTitle("Calculate Simple Interest");
     frame.setLayout(null);
    frame.getContentPane().setBackground(new Color(227, 253, 253));
         frame.setResizable(false);
             
     p = new JLabel("Principle");
     p.setBounds(20,20,50,20);
     frame.add(p);
     
     txtp = new JTextField(15);
     txtp.setBounds(90,20,100,20);
     frame.add(txtp);
     
      r = new JLabel("rate");
     r.setBounds(20,50,50,20);
     frame.add(r);
     
     txtr = new JTextField(15);
     txtr.setBounds(90,50,100,20);
     frame.add(txtr);
     
     
      t = new JLabel("Time");
     t.setBounds(20,80,50,20);
     frame.add(t);
     
     txtt = new JTextField(15);
     txtt.setBounds(90,80,100,20);
     frame.add(txtt);
     
     caculate = new JButton("Calculate");
     caculate.setBackground(new Color(203, 253, 253)); 
     caculate.setBounds(70,110,100,25);
     frame.add(caculate);
     
     
     
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
         
     
     
     
    }
}
public class SimpleInterestClalculationGUI {

 
    public static void main(String[] args) {
  new si();
    }
    
}
