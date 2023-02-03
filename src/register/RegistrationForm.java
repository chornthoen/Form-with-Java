package register;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {

    private Container ct;
    private JTextField txtName,txtfName,txtPass,txtCpass,txtCity,txtEmail;
    private JComboBox cboGender;
    private JButton btnRegister,btnReset;


    public void initUI(){

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2));
        p1.add(new JLabel("Name:"));
        p1.add(txtName = new JTextField(10));
        ct.add(p1,"North");
    }

    public void initForm(){
        ct = getContentPane();
        //ct.setBackground(Color.pink);
        setSize(400,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public RegistrationForm(){
        initForm();
        initUI();
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
