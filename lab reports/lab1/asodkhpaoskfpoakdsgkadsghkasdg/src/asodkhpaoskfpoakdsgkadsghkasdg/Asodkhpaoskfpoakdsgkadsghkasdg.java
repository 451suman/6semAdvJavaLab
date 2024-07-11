/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asodkhpaoskfpoakdsgkadsghkasdg;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author suman
 */
public class Asodkhpaoskfpoakdsgkadsghkasdg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                JFrame frame = new JFrame("JTextArea Example");
                frame.setLayout(new GridLayout(5,10));
                frame.setSize(500, 500);

        // Initial text and number of columns
        String initialText = "This is the initial text.";
        int columns = 10;

        // Create JTextArea with initial text and specified columns
        JTextArea textArea = new JTextArea(initialText, 1, columns);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);

    }
    
}
