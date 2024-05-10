import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.GREEN);

        frame myFrame =new frame();
        myFrame.setTitle("Text Input application");
        myFrame.setSize(420,420);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}