package Lesson4;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class WindowApp extends JFrame {


    public WindowApp() {
        setTitle("Test Window");
        ArrayList<String> textMessages = new ArrayList<String>();

        setBounds(1200, 400, 300, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        JTextArea textArea = new JTextArea(textMessages.toString());
        textArea.setBounds(10, 10, 265, 500);
        textArea.setLineWrap(true);
        textArea.setText(textMessages.toString());
        add(textArea);
        JTextField textField = new JTextField();
        textField.setBounds(10, 520, 200, 20);
        add(textField);
        JButton button = new JButton("отпр");
        button.setBounds(205, 520, 70, 20);
        add(button);


        setVisible(true);

    }

    public static void main(String[] args) {
        new WindowApp();
    }


}
