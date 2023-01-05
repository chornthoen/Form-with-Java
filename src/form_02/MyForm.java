package form_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {
    private JLabel label1, label2, label3;
    private JTextField field;
    private JButton button;
    private Container container;
    private JTextArea textArea;

    public MyForm() {
        initForm();
        initConstant();



    }
    public void initConstant(){
        container = getContentPane();
        container.setLayout(null);

        label1 = new JLabel("My Form");
        label1.setBounds(120, 30, 100, 20);
        container.add(label1);

        label2 = new JLabel("Name");
        label2.setBounds(70, 60, 50, 20);
        container.add(label2);

        field = new JTextField(12);
        field.setBounds(120, 60, 150, 20);
        container.add(field);

        button = new JButton("Add");
        button.setBounds(280, 60, 60, 20);
        container.add(button);

        label3 = new JLabel("");
        label3.setBounds(120, 100, 200, 20);
        container.add(label3);
        textArea = new JTextArea();
        textArea.setBounds(120,100,150,80);
        container.add(textArea);


        button.addActionListener(e -> {
            String st = field.getText();
            textArea.append(st+"\n");
        });
    }
    public void initForm(){
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyForm();
    }


}


