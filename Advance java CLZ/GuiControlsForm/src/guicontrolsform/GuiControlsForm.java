package guicontrolsform;

import javax.swing.*;
import java.awt.*;

class SwingControls
{
    JFrame frame;
    JLabel lblUser, lblPass, lblGender, lblHobbies, lblCountry, lblComment;
    JTextField txtUser;
    JPasswordField jpfPass;
    JRadioButton rdMale, rdFemale;
    ButtonGroup rdGroup;
    JCheckBox chk1, chk2, chk3, chk4;
    JComboBox jcb;
    JTextArea jta;
    JButton btnSubmit;
    
    public SwingControls()
    {
        /* Creating Object of JFrame */
        frame = new JFrame();
        frame.setTitle("Swing Controls");
        frame.setSize(300, 450);
        frame.setLocationRelativeTo(null); /* Take frame to the Center Screen */
        frame.setLayout(null);
        
        /* Creating Obejcts of Swing Controls */
        lblUser = new JLabel("Username: ");
        lblPass = new JLabel("Password: ");
        lblGender = new JLabel("Gender: ");
        lblHobbies = new JLabel("Hobbies: ");
        lblCountry = new JLabel("Select Country: ");
        lblComment = new JLabel("Comment: ");
        
        txtUser = new JTextField();
        jpfPass = new JPasswordField();
        
        rdMale = new JRadioButton("Male");
        rdFemale = new JRadioButton("Female");
        rdGroup = new ButtonGroup();
        
        chk1 = new JCheckBox("Playing");
        chk2 = new JCheckBox("Reading");
        chk3 = new JCheckBox("Visiting");
        chk4 = new JCheckBox("Ticketing");
        
        /* Adding Options to Combo box*/
        String[] countryList = {"Nepal","India","China","Other"};
        jcb = new JComboBox(countryList);
        
        jta = new JTextArea();
        btnSubmit = new JButton("Submit");
        
        /* Setting the boundary of each control */
        lblUser.setBounds(20, 30, 80, 25);
        txtUser.setBounds(120,30,150,25);
        lblPass.setBounds(20,60,80,25);
        jpfPass.setBounds(120,60,150,25);
        lblGender.setBounds(20,90,80,25);
        rdMale.setBounds(120, 90, 70, 25);
        rdFemale.setBounds(200, 90, 70, 25);
        lblHobbies.setBounds(20,120,80,25);
        chk1.setBounds(120, 120, 80, 25);
        chk2.setBounds(120, 150, 80, 25);
        chk3.setBounds(120, 180, 80, 25);
        chk4.setBounds(120, 210, 80, 25);
        lblCountry.setBounds(20, 240, 120, 25);
        
        jcb.setBounds(120, 240, 150, 25);
        lblComment.setBounds(20, 270, 80, 25);
        jta.setBounds(120, 270, 150, 80);
        btnSubmit.setBounds(120, 360, 100, 25);
        
        /* Setting background color of textarea to make it more visible */
        jta.setBackground(Color.CYAN);
     
        /* Adding above Objects to JFrame i.e. frame */
        frame.add(lblUser); frame.add(txtUser);
        frame.add(lblPass); frame.add(jpfPass);
        
        frame.add(lblGender); frame.add(rdMale); frame.add(rdFemale);
        rdGroup.add(rdMale); rdGroup.add(rdFemale);
        
        frame.add(lblHobbies); frame.add(chk1); frame.add(chk2); frame.add(chk3); frame.add(chk4);
        
        frame.add(lblCountry); frame.add(jcb);
        frame.add(lblComment); frame.add(jta);
        frame.add(btnSubmit);
        
        /* Make frame visible */
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
/* Driver Class */
public class GuiControlsForm {
    public static void main(String[] args) {
      new SwingControls();
    }
}