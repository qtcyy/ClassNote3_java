package classNote.data527;

import javax.swing.JFrame;
import java.awt.*;

public class Main1 extends JFrame {
    public Main1(){
//        JFrame jf=new JFrame("Window");
        setTitle("Window");
        setVisible(true);
        //JFrame.EXIT_ON_CLOSE关闭窗口并停止程序
        //JFrame.DO_NOTHING_ON_CLOSE什么都不做
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(300,300);
        setResizable(false);
        Container c = getContentPane();
        c.setBackground(Color.black);
    }
    public static void main(String[] args){
        new Main1();

    }
}
