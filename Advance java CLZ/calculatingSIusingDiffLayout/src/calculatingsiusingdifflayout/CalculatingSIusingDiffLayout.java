
package calculatingsiusingdifflayout;

import java.awt.*;

import javax.swing.*;

/**
 *
 * @author suman
 */
class siUsingNullLayout{
    JFrame frame;
     JLabel p,t,r;
     JTextField txtp,txtr,txtt;
     JButton caculate;
     
     siUsingNullLayout(){
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


class siUsingFlowLayout
        {
    JFrame frame;
     JLabel p,t,r;
     JTextField txtp,txtr,txtt;
     JButton caculate;
     
     siUsingFlowLayout(){
     frame=new JFrame();
     frame.setSize(400,300);
     frame.setTitle("Calculate Simple Interest");
    frame.getContentPane().setBackground(new Color(227, 253, 253));
     frame.setLayout(new FlowLayout(FlowLayout.CENTER));
             
     p = new JLabel("Principle");
     frame.add(p);
     
     txtp = new JTextField(15);
     frame.add(txtp);
     
      r = new JLabel("rate");
     frame.add(r);
     
     txtr = new JTextField(15);
     frame.add(txtr);

      t = new JLabel("Time");
     frame.add(t);
     
     txtt = new JTextField(15);
     frame.add(txtt);
     
     caculate = new JButton("Calculate");
     caculate.setBackground(new Color(203, 253, 253)); 
     frame.add(caculate);
     
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
     }
}

class siUsingGridLayout
        {
    JFrame frame;
     JLabel p,t,r;
     JTextField txtp,txtr,txtt;
     JButton caculate;
     JPanel p1, p2;
     
     siUsingGridLayout(){
     frame=new JFrame();
     frame.setSize(300,150);
     frame.setTitle("Calculate Simple Interest");
    frame.getContentPane().setBackground(new Color(227, 253, 253));
     frame.setLayout(new GridLayout(4,2) );
             
     p = new JLabel("Principle");
     frame.add(p);
     
     txtp = new JTextField(15);
     frame.add(txtp);
     
      r = new JLabel("rate");
     frame.add(r);
     
     txtr = new JTextField(15);
     frame.add(txtr);

      t = new JLabel("Time");
     frame.add(t);
     
     txtt = new JTextField(15);
     frame.add(txtt);
     
     p1 = new JPanel();
     p1.setLayout(null);
     p1.setBounds(10,150,200,30);
     frame.add(p1);
     
    
     
     
     
     caculate = new JButton("Calculate");
     caculate.setBounds(20,5,100,20);
     caculate.setBackground(new Color(203, 253, 253)); 
     
     p2 = new JPanel();
     p2.add(caculate);
     frame.add(p2);
     //p1.add(caculate);
     
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
     }
}
public class CalculatingSIusingDiffLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new siUsingNullLayout();
       new siUsingFlowLayout();
       new siUsingGridLayout();
       
    }
    
}
