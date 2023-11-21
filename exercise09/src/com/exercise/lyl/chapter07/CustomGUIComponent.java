package com.exercise.lyl.chapter07;

import javax.swing.*;
import java.awt.*;

public class CustomGUIComponent extends JPanel {
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;

    public CustomGUIComponent() {
        // 设置布局管理器
        setLayout(new BorderLayout());

        // 创建GUI组件
        textField = new JTextField(15);
        button = new JButton("Submit");
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        // 将GUI组件添加到面板
        JPanel inputPanel = new JPanel();
        inputPanel.add(textField);
        inputPanel.add(button);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // 添加事件处理
        button.addActionListener(e -> {
            String input = textField.getText();
            textArea.append("You entered: " + input + "\n");
            textField.setText("");  // 清空文本框
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("月历GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CustomGUIComponent customComponent = new CustomGUIComponent();
        frame.add(customComponent);

        frame.pack();
        frame.setVisible(true);
    }
}

