
package guicontrolsform;
import javax.swing.*;
import java.awt.*;

class guiclass{
    JFrame frame;
    JLabel lblUser, lblPass, lblGender, lblHobbies, lblCountry, lblComment;
    JTextField txtUser;
    JPasswordField jpfPass;
    
    JRadioButton rdMale, rdFemale;
    ButtonGroup rdGroup;  // to grooup male and female
    
    JCheckBox chk1, chk2, chk3, chk4;
    
    JComboBox jcb;
    JTextArea jta;
    JButton btnSubmit;
    
    guiclass(){
        frame = new JFrame();
        frame.setTitle("GUI Form");
        frame.setSize(320,350);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocation(580,180);

           
        lblUser = new JLabel("Username");
        lblUser.setBounds(20,20,110,20);
        frame.add(lblUser);
        
        txtUser = new JTextField();
        txtUser.setBounds(110,20,170,20);
        frame.add(txtUser);
        
         lblPass = new JLabel("Password");
        lblPass.setBounds(20,50,110,20);
        frame.add(lblPass);
        
        jpfPass = new JPasswordField();
        jpfPass.setBounds(110,50,170,20);
        frame.add(jpfPass);

          lblGender = new JLabel("Gender");
        lblGender.setBounds(20,80,110,20);
        frame.add(lblGender);
        
//        radio button
        rdFemale = new JRadioButton("Female");
        rdFemale.setBounds(110,80,100,20);
        frame.add(rdFemale);
        
        rdMale = new JRadioButton("Male",true);
        rdMale.setBounds(210,80,110,20);
        frame.add(rdMale);
        
        rdGroup = new ButtonGroup();
        rdGroup.add(rdMale);
        rdGroup.add(rdFemale);
        
         lblHobbies = new JLabel("Hobbies");
        lblHobbies.setBounds(20,110,110,20);
        frame.add(lblHobbies);
        
//        Check box
        chk1 = new JCheckBox("Playing");
        chk1.setBounds(110,110,170,20);
        frame.add(chk1);
        
        chk2 = new JCheckBox("Reading");
        chk2.setBounds(110,130,170,20);
        frame.add(chk2);
        chk3 = new JCheckBox("Visiting");
        chk3.setBounds(110,150,170,20);
        frame.add(chk3);
        
        chk4 = new JCheckBox("Ticketing");
        chk4.setBounds(110,170,170,20);
        frame.add(chk4);
        
        
         lblCountry = new JLabel("Select Country");
        lblCountry.setBounds(20,190,110,20);
        frame.add(lblCountry);
        
//        JComboBox 
        String[] countryList = {"Nepal","India","China","Other"};
        jcb = new JComboBox(countryList);
        jcb.setBounds(110,190,170,20);
        frame.add(jcb);
        
        lblComment = new JLabel("Comment");
        lblComment.setBounds(20,220,110,20);
        frame.add(lblComment);
        
//         JTextArea 
        jta = new JTextArea();
        jta.setBounds(110,220,170,50);
        frame.add(jta);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(120,280,80,20);

        frame.add(btnSubmit);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class samesame {
    public static void main(String[] args) {
        new guiclass();
    }
 
}
