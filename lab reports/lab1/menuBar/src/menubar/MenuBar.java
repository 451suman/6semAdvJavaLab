
package menubar;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
class MenuBardemo{
     JFrame frame;
    JMenuBar menubar;
    JMenu fileMenu, editMenu, helpMenu,optionsMenu;
    JMenuItem cutItem, copyItem, pasteItem;
    JCheckBoxMenuItem chkReadonlyItem;
    JRadioButtonMenuItem rdInsertItem, rdOvertypeItem;
    ButtonGroup rdGroup;
    MenuBardemo(){
        frame = new JFrame();
        frame.setTitle("Swing Menu");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); /* Take frame to the Center Screen */
        frame.setLayout(null);
        //creating  object of menu
       menubar = new JMenuBar();
       //Creating menus so that we can add it to mbar
       fileMenu = new JMenu("File");
       menubar.add(fileMenu);
        editMenu = new JMenu("Edit");
       menubar.add(editMenu);
        helpMenu = new JMenu("Help");
       menubar.add(helpMenu);
        
       
        /* Create Menu items and add to respective menu */
        cutItem = new JMenuItem("Cut", new ImageIcon(getClass().getResource("/iconpack/cut.png")));
        editMenu.add(cutItem);
       copyItem = new JMenuItem("Copy", new ImageIcon(getClass().getResource("/iconpack/copy.png")));
        editMenu.add(copyItem);
        pasteItem = new JMenuItem("Paste", new ImageIcon(getClass().getResource("/iconpack/paste.png")));
        editMenu.add(pasteItem);
        optionsMenu = new JMenu("Options");
         editMenu.add(optionsMenu);
        
          /* Creating checkbox menu item and add to optionsMenu */
        chkReadonlyItem = new JCheckBoxMenuItem("Read-only");
        optionsMenu.add(chkReadonlyItem);
        
        /* Creating radio button menu item and add to optionsMenu */
         rdInsertItem = new JRadioButtonMenuItem("Insert");
         optionsMenu.add(rdInsertItem);
        rdOvertypeItem = new JRadioButtonMenuItem("Overtype");
         optionsMenu.add(rdOvertypeItem);
          rdGroup = new ButtonGroup();
        rdGroup.add(rdInsertItem);
        rdGroup.add(rdOvertypeItem);
         
          /* Setting Mnenomics */
        helpMenu.setMnemonic('H');
        editMenu.setMnemonic('E');
        
         /* Setting accelator to respective menu item */
         cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
          copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        
        /*Anonymous ActionEvent on exitItem without Lambda */
        exitItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                System.exit(0);
            }
        });
        
        /* Anonymouse Event using Lambda expression */
        cutItem.addActionListener((e)->
        {
            String str = e.getActionCommand();
            JOptionPane.showMessageDialog(frame, "You have selected -> "+str);
        });
        
        /* Adding menubar to JFrame using setJMenuBar() */
        frame.setJMenuBar(menubar);
       
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
public class MenuBar {

    public static void main(String[] args) {
     new MenuBardemo();
    }
    
}
