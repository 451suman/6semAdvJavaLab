
package keyevent_keylistener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


class KeyEventInterface implements KeyListener
{
    JFrame frame;
    JTextArea jta;
    JLabel lblOutput;
    
    public KeyEventInterface()
    {
         /* Creating Object of JFrame */
        frame = new JFrame();
        frame.setTitle("Key Event Interface");
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
    
    public void keyTyped(KeyEvent k)
    {
       
       lblOutput.setText("Key Typed...");
    }
    
    public void keyReleased(KeyEvent ke)
    {
        lblOutput.setText("Key Released...");
    }
}

public class KeyEvent_keyListener {

    public static void main(String[] args) {
        new KeyEventInterface();
    }
    
}
