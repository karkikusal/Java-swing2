import javax.swing.*;
import java.awt.*;
//import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Hello world");// frame to title set garxa
        frame.setSize(1400, 1400);// frame ko size fix gara
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBounds(100,100,250,250);
        frame.add(button);

        frame.getContentPane().setBackground(Color.GREEN);
        frame.setResizable(false);// resize garna dinna!
        frame.setLayout(null);
        frame.setVisible(true);// frame lai visible graxa!
    }
}