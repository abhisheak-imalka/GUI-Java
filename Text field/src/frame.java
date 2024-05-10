import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    JTextField text;

    frame(){
        text =new JTextField();
        text.setColumns(15);
        text.setText("Welcome");

        button=new JButton("click");

        label =new JLabel("empty");
        this.setLayout(new FlowLayout());
        this.add(text);
        this.add(button);
        this.add(label);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setText(text.getText());
        }


    }
}
