package classNote.data527;

import javax.swing.JFrame;

public class Main1 {
    public static void main(String[] args){
        JFrame jf=new JFrame("Window");
        jf.setVisible(true);
        //JFrame.EXIT_ON_CLOSE关闭窗口并停止程序
        //JFrame.DO_NOTHING_ON_CLOSE什么都不做
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,400);
        jf.setLocation(300,300);
    }
}
