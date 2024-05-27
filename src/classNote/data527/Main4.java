package classNote.data527;

import javax.swing.*;
import java.awt.*;

public class Main4 extends JFrame {
    public Main4(){
        setLayout(new GridLayout(5,4));
        setSize(400,400);
        setLocation(300,200);
        JPanel jp=new JPanel();
        jp.add(new JButton("7"));jp.add(new JButton("8"));jp.add(new JButton("9"));
        jp.add(new JButton("*"));
        getContentPane().add(jp);
        jp.add(new JButton("4"));jp.add(new JButton("5"));jp.add(new JButton("6"));
        jp.add(new JButton("+"));
        getContentPane().add(jp);
        jp.add(new JButton("1"));jp.add(new JButton("2"));jp.add(new JButton("3"));
        jp.add(new JButton("-"));
        getContentPane().add(jp);
        jp.add(new JButton("/"));jp.add(new JButton("0"));jp.add(new JButton("%"));
        jp.add(new JButton("AC"));
        getContentPane().add(jp);

        setVisible(true);
    }

    public static void main(String[] args){
        new Main4();
    }
}
