import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JPanel;


public class Main{

    public static void main (String[] args){

        JFrame window =new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setSize(600,200);
         window.setLocation(400, 200);

         Container cp=window.getContentPane();
         JPanel panel=new JPanel();

         panel.add(new JTextField("Hello World"));
         panel.add(new JButton("CLICK ON ME"));

         panel.add(new JButton("Sign Up"));
         panel.add(new JTextField("Java World"));
         cp.add(panel);

         window.pack();
         window.setVisible(true);

        

    }
}