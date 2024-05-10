import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.GREEN);
        Frame frame =new Frame();
        frame.setSize(420,420);
        frame.setTitle("Text Area");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}