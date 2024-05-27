package classNote.data527;

import javax.swing.*;
import java.awt.*;

public class Main3 extends JFrame {
    public Main3(){
        setLayout(new GridLayout(4,4));
        setSize(500,500);
        setLocation(250,300);
        JButton b1=new JButton("click1");
        getContentPane().add(b1,BorderLayout.NORTH);
        JButton b2=new JButton("click2");
        getContentPane().add(b2,BorderLayout.SOUTH);
        JButton b3=new JButton("click3");
        getContentPane().add(b3,BorderLayout.WEST);
        JButton b4=new JButton("click4");

        JPanel jp = new JPanel();
        jp.add(new JButton("hello"));
        jp.add(new JButton("world"));
        getContentPane().add(jp);

        getContentPane().add(b4,BorderLayout.EAST);
//        JButton b5=new JButton("click5");
//        getContentPane().add(b5,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Main3 m=new Main3();
        m.setTitle("网格布局");
    }
}
