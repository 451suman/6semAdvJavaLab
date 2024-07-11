/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class copya{
    
    JFrame f;
   JButton b;
    JTextField t1,t2;
    copya(){
        
        f= new JFrame();
        f.setTitle("copy text ");
        f.setSize(300,200);
          f.setLayout(new FlowLayout(FlowLayout.CENTER));   
        f.setLocationRelativeTo(null);
        
        t1 = new JTextField(20);
        f.add(t1);
        
       b= new JButton("Copy ->");
       f.add(b);
        
        t2 = new JTextField(20);
        f.add(t2);
        
        f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
       
      b.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae)
          {
              String s =t1.getText();
              
              if (s!=null && !s.isEmpty())
              {
                  t2.setText(String.valueOf(s));
              }
              else{
                    JOptionPane.showMessageDialog(null,"Text Box is Empty ");
              }
          }
      });
    }
}

public class Copy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new copya();
    }
    
}
