//Demonstrate different layout managers.
package layout.demonstration;

import javax.swing.*;
import java.awt.*;

class FlowLayoutDemo {
    public FlowLayoutDemo() {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
       frame.add(panel);
        frame.setVisible(true);
    }
}
class BorderLayoutDemo {
    public BorderLayoutDemo() {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JPanel panel = new JPanel();
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

//        frame.add(panel);
        frame.setVisible(true);
    }
}

class GridLayoutDemo {
    public GridLayoutDemo() {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));

        frame.add(panel);
        frame.setVisible(true);
    }
}

public class LayoutDemonstration {
    public static void main(String[] args) {
        new FlowLayoutDemo();
        new BorderLayoutDemo();
        new GridLayoutDemo();
    }
    
}
