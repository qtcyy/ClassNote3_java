package classNote.data527;

import javax.swing.*;
import java.awt.*;

public class Main2 extends JFrame {
    public Main2(){
        setBounds(100,100,1000,1000);
        setTitle("对话框");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container=getContentPane();
        JLabel label=new JLabel("图片标签");
        Icon icon = new ImageIcon("src/WechatIMG2.jpg");
        label.setIcon(icon);
        label.setSize(200,200);
        container.add(label);
        setVisible(true);

    }
    public static void main(String[] args){
        new Main2();
    }
}
