package my_form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyForm1 extends JFrame {
    private JLabel lblCreateUser,lblID,lblName,lblEmail;
    private JTextField txtID,txtName,txtEmail;
    private JButton btnInsert;
    private JTextArea jtaDisplay;
    private Container c;
    private JScrollPane js;
    public MyForm1() {
        initForm();
        initUI();

        insert();
    }
    public void initUI(){
        lblCreateUser = new JLabel("Create User");
        lblCreateUser.setBounds(230,30,100,20);
        c.add(lblCreateUser);

        lblID = new JLabel("ID");
        lblID.setBounds(100,60,100,20);
        c.add(lblID);
        txtID = new JTextField();
        txtID.setBounds(170,60,150,20);
        c.add(txtID);

        lblName = new JLabel("Name");
        lblName.setBounds(100,90,100,20);
        c.add(lblName);
        txtName = new JTextField();
        txtName.setBounds(170,90,150,20);
        c.add(txtName);

        lblEmail = new JLabel("Email");
        lblEmail.setBounds(100,120,100,20);
        c.add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(170,120,150,20);
        c.add(txtEmail);

        btnInsert = new JButton("Insert");
        btnInsert.setBounds(100,150,80,20);
        c.add(btnInsert);

        jtaDisplay = new JTextArea();
        jtaDisplay.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jtaDisplay.setBounds(100, 180, 300, 100);
        c.add(jtaDisplay);

    }
    public void insert(){
        btnInsert.addActionListener(e -> {
            String id= txtID.getText();
            String name = txtName.getText();
            String email = txtEmail.getText();
            jtaDisplay.setText(id+"  " +name+"   "+email+"\n");
        });
    }
    public void initForm(){
        //create object container
        c=getContentPane();
        c.setLayout(null);
        //setSize Form
        setSize(500,400);
        //show form
        setVisible(true);
        //show form in centre screen
        setLocationRelativeTo(null);
        //close form
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MyForm1();
    }
}