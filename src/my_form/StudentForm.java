package my_form;

import javax.swing.*;
import java.awt.*;

public class StudentForm extends JFrame {
    private JLabel lblStudentForm,lblID, lblName, lblGroup;
    private JTextField txtID, txtName;
    private JButton btnAdd;
    private JComboBox cboGroup;
    private JTextArea output;
    private Container ct;

    public StudentForm() {
        initForm();
        initUI();
    }

    public void initForm() {
        setTitle("Student Form");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ct = getContentPane();
        ct.setLayout(null);
    }

    public void initUI() {
        lblStudentForm = new JLabel("Student Form");
        lblStudentForm.setBounds(200, 30, 100, 20);
        ct.add(lblStudentForm);
        lblID = new JLabel("ID:");
        lblID.setBounds(100, 60, 50, 20);
        ct.add(lblID);
        txtID = new JTextField();
        txtID.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtID.setBounds(150, 60, 170, 20);
        ct.add(txtID);
        lblName = new JLabel("Name:");
        lblName.setBounds(100, 100, 50, 20);
        ct.add(lblName);
        txtName = new JTextField();
        txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtName.setBounds(150, 100, 170, 20);
        ct.add(txtName);
        lblGroup = new JLabel("Group:");
        lblGroup.setBounds(100, 140, 50, 20);
        ct.add(lblGroup);
        cboGroup = new JComboBox();
        cboGroup.addItem("A1");
        cboGroup.addItem("A2");
        cboGroup.addItem("A3");
        cboGroup.addItem("A4");
        cboGroup.addItem("A5");
        cboGroup.addItem("A6");
        cboGroup.setBounds(150, 140, 170, 20);
        ct.add(cboGroup);
        btnAdd = new JButton("Add");
        btnAdd.setBackground(Color.WHITE);
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btnAdd.setBounds(100, 180, 80, 20);
        ct.add(btnAdd);
        output = new JTextArea();
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        output.setBounds(100, 220, 300, 100);
        ct.add(output);
        btnAdd.addActionListener(e -> {
            String id = txtID.getText();
            String name = txtName.getText();
            String group = cboGroup.getSelectedItem().toString();
            output.setText("ID: " + id + " ,Name: " + name + " ,Group: " + group);

        });
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
