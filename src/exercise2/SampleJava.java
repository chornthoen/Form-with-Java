package exercise2;

import javax.swing.*;
import java.awt.*;

public class SampleJava extends JFrame {
    private Container c;
    private JTextField txtName, txtID, txtCountry, txtState, txtPhone;
    private JScrollPane jsp;
    private JButton btnSubmit, btnClear;
    private JTextArea d;
    private JPasswordField txtPassword, txtCPassword;
    public SampleJava(){
        initForm();
        initUI();
        Submit();
        Clear();
    }
    public void initUI(){
        c=getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Registration Form windows Form"));
        //c.add(p1 ,"North") ;

        JPanel p2= new JPanel();
        p2.setLayout(new GridLayout(7,2));
        p2.add(new JLabel("Name: "));
        p2.add(txtName = new JTextField(12));

        p2.add(new JLabel("Email-ID: "));
        p2.add(txtID = new JTextField(12));

        p2.add(new JLabel("Create Password: "));
        p2.add(txtPassword = new JPasswordField(12));


        p2.add(new JLabel("Conform Password: "));
        p2.add(txtCPassword = new JPasswordField(12));

        p2.add(new JLabel("Country: "));
        p2.add(txtCountry = new JTextField(12));

        p2.add(new JLabel("State: "));
        p2.add(txtState = new JTextField(12));

        p2.add(new JLabel("Phone no: "));
        p2.add(txtPhone = new JTextField(12));
        c.add(p2);

        JPanel p12= new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(p1,"North");
        p12.add(p2,"Center");

        JPanel p3=new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(btnSubmit =new JButton("Submit"));
        p3.add(btnClear =new JButton("Clear"));

        JPanel p123=new JPanel();
        p123.setLayout(new BorderLayout());
        p123.add(p12,"North");
        p123.add(p3,"Center");
        c.add(p123,"North");
        d=new JTextArea(10,30);
        jsp=new JScrollPane(d);
        c.add(jsp,"Center");
    }
    public void Submit(){
        btnSubmit.addActionListener(e -> {
            String name= txtName.getText();
            String id = txtID.getText();
            String password= txtPassword.getText();
            String cPassword= txtCPassword.getText();
            String country= txtCountry.getText();
            String state= txtState.getText();
            String phone= txtPhone.getText();
            String result = name+"  "+id+"  "+password+"  "+cPassword+"  "+country+"  "+state+"  "+phone;
            d.append(result+"\n");
        });
    }
    public void Clear(){
        btnClear.addActionListener(e -> {
            txtName.setText(null);
            txtID.setText(null);
            txtPassword.setText(null);
            txtCPassword.setText(null);
            txtCountry.setText(null);
            txtState.setText(null);
            txtPhone.setText(null);
        });

    }
    public void initForm(){
        pack();
        setTitle("Registration Form in Java");
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SampleJava();
    }
}
