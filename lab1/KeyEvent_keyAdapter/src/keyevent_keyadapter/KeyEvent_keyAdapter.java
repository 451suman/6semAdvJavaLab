
package keyevent_keyadapter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class KeyAdapterClass extends KeyAdapter
{
    JFrame frame;
    JTextArea jta;
    JLabel lblOutput;
    
    public KeyAdapterClass()
    {
         /* Creating Object of JFrame */
        frame = new JFrame();
        frame.setTitle("Key Event Adapter Class ");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); /* Take frame to the Center Screen */
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        jta = new JTextArea(6,10);
        jta.setBackground(Color.cyan);
        frame.add(jta);
        lblOutput = new JLabel("-------------------");
        frame.add(lblOutput);
        
        /*Add key event to textarea i.e. jta*/
        jta.addKeyListener(this);
                
        
         /* Make frame visible */
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /* Override key event methods outside Constructor */
    @Override
    public void keyPressed(KeyEvent k)
    {
        lblOutput.setText("Key has been Pressed...");
    }
     
    public void keyReleased(KeyEvent ke)
    {
        lblOutput.setText("Key Released...");
    }
}
public class KeyEvent_keyAdapter {

    public static void main(String[] args) {
      new KeyAdapterClass();
    }
    
}
