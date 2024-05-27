package classNote.data527;

import javax.swing.*;
import java.awt.*;

public class Main5 extends JFrame {
    public Main5(){
        setTitle("calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,600);
        Container container = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField field=new JTextField();
        panel.add(field,BorderLayout.NORTH);
        container.add(panel,BorderLayout.NORTH);

        JPanel button=new JPanel();
        button.setLayout(new GridLayout(4,4));
        String[] texts={"7","8","9","*","4","5","6","+",
        "1","2","3","-","/","0",".","="};
        for (String str:texts){
            JButton b=new JButton(str);
            button.add(b);
        }
        container.add(button,BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String[] args){
        new Main5();
    }
}
