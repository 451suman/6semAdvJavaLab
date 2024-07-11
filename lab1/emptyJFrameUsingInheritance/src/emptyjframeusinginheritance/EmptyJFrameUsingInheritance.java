//Write a Java program to create an empty JFrame using Object and Inheritance concepts
package emptyjframeusinginheritance;
import javax.swing.*;

class demoClass extends JFrame{
        demoClass(){
        setTitle("JFrame using Inheritance");
        setSize(300,200);   
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
public class EmptyJFrameUsingInheritance {
    public static void main(String[] args) {
        new demoClass();
    }
}
