package my_form;

import javax.swing.*;
import java.awt.*;

public class CreateUser extends JFrame {
    private JLabel creatUser, id, name, email;
    private JTextField txtID, txtName, txtEmail;
    private JButton btnInsert;
    private JTextArea output;
    private Container ct;

    public CreateUser() {
        initForm();
        initControl();

    }

    public void initForm() {
        setTitle("Create User");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initControl() {
        ct = getContentPane();
        ct.setLayout(null);
        creatUser = new JLabel("Create User");
        creatUser.setBounds(200, 30, 100, 20);
        ct.add(creatUser);
        id = new JLabel("ID:");
        id.setBounds(120, 60, 50, 20);
        ct.add(id);
        txtID = new JTextField();
        txtID.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtID.setBounds(190, 60, 170, 20);
        ct.add(txtID);
        name = new JLabel("Name:");
        name.setBounds(120, 100, 50, 20);
        ct.add(name);
        txtName = new JTextField();
        txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtName.setBounds(190, 100, 170, 20);
        ct.add(txtName);
        email = new JLabel("Email:");
        email.setBounds(120, 140, 50, 20);
        ct.add(email);
        txtEmail = new JTextField();
        txtEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtEmail.setBounds(190, 140, 170, 20);
        ct.add(txtEmail);
        btnInsert = new JButton("Insert");
        btnInsert.setBackground(Color.WHITE);
        btnInsert.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btnInsert.setBounds(100, 180, 80, 20);
        ct.add(btnInsert);
        output = new JTextArea();
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        output.setBounds(100, 220, 300, 100);
        ct.add(output);
        btnInsert.addActionListener(e -> {
            String id = txtID.getText();
            String name = txtName.getText();
            String email = txtEmail.getText();
            output.append("ID= " + id + "\nName= " + name + "\nEmail= " + email + "\n");
        });
    }

    public static void main(String[] args) {
        new CreateUser();
    }
}
