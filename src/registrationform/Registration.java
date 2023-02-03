package registrationform;



import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame {
    private Container c;
    private JTextField txtName, txtFatherName, txtPass, txtCPass, txtCity, txtEmail;
    private JComboBox cboGender;
    private JButton btnRegister, btnReset;

    public void initUI() {
        c=getContentPane();
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel());
        p1.setBackground(Color.pink);
        //c.add(p1,"North");
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(8,2));
        p2.setBackground(Color.pink);
        p2.add(new JLabel("NAME"));
        p2.add(txtName =new JTextField(12));

        p2.add(new JLabel("GENDER"));
        p2.add(cboGender =new JComboBox());
        cboGender.addItem("Male");
        cboGender.addItem("Female");


        p2.add(new JLabel("FATHER NAME"));
        p2.add(txtFatherName =new JTextField(12));


        p2.add(new JLabel("PASSWORD"));
        p2.add(txtPass =new JTextField(12));

        p2.add(new JLabel("CONFIRM PASSWORD"));
        p2.add(txtCPass =new JTextField(12));

        p2.add(new JLabel("CITY"));
        p2.add(txtCity =new JTextField(12));

        p2.add(new JLabel("EMAIL"));
        p2.add(txtEmail =new JTextField(12));

        //c.add(p2,"Center");
        JPanel p12=new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(p1,"North");
        p12.add(p2,"Center");
        //c.add(p12,"North");
        JPanel p3=new JPanel();
        p3.setLayout(new FlowLayout());
       p3.setBackground(Color.PINK);
        p3.add(btnRegister =new JButton("REGISTER"));
        p3.add(btnReset =new JButton("RESET"));

        JPanel p123=new JPanel();
        p123.setLayout(new BorderLayout());
        p123.add(p12,"North");
        p123.add(p3,"Center");
        c.add(p123,"North");
        btnReset.addActionListener(e -> {
            System.exit(0);
        });


    }
    public Registration() {
        initUI();
        initForm();
    }
    public void initForm() {
        pack();
        setTitle("Registration Form");
        getContentPane().setBackground(Color.PINK);
        setSize(300,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Registration();

    }
}

