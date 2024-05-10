import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    JTextArea textArea;
    JButton button;

    Frame(){
        textArea =new JTextArea( 10,40);

        button =new JButton("Add Text");
        this.setLayout(new FlowLayout());
        this.add(textArea);
        this.add(button);
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            textArea.insert("hello",textArea.getCaretPosition());
        }
    }
}
