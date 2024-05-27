package classNote.data527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private final JTextField field;  // 文本字段用于显示输入和结果

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        Container container = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        field = new JTextField();
        field.setEditable(false);  // 设置文本框不可编辑，只用于显示
        panel.add(field, BorderLayout.NORTH);
        container.add(panel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));  // 4行4列的按钮布局
        String[] texts = {"7", "8", "9", "*", "4", "5", "6", "+",
                "1", "2", "3", "-", "0", ".", "/", "="};

        for (String str : texts) {
            JButton b = new JButton(str);
            b.addActionListener(this);  // 为每个按钮添加事件监听器
            buttonPanel.add(b);
        }
        container.add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == '=') {
            try {
                // 计算结果
                double result = eval(field.getText());
                field.setText(String.valueOf(result));
            } catch (Exception ex) {
                field.setText("Error");
            }
        } else {
            field.setText(field.getText() + command);
        }
    }

    // 简单的表达式计算函数，使用 ScriptEngine 来处理字符串形式的数学表达式
    private double eval(String expression) {
        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            return (double) engine.eval(expression);
        } catch (Exception e) {
            // 如果计算失败，返回NaN
            return Double.NaN;
        }
    }
}
