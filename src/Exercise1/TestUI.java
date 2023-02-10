package Exercise1;



import javax.swing.*;
import java.awt.*;

public class TestUI extends JFrame {
    private Container c;
    private JTextField txtName, txtFName, txtCity, txtEmail;
    private JComboBox jcb;
    private JButton btnRegister, btnReset;
    private JPasswordField txtPass,txtCpass;
    private JTextArea d;
    private JScrollPane jsp;

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
        p2.add(jcb=new JComboBox());
        jcb.addItem("Male");
        jcb.addItem("Female");
        jcb.setSelectedIndex(-1);


        p2.add(new JLabel("FATHER NAME"));
        p2.add(txtFName =new JTextField(12));


        p2.add(new JLabel("PASSWORD"));
        p2.add(txtPass=new JPasswordField(12));

        p2.add(new JLabel("CONFIRM PASSWORD"));
        p2.add(txtCpass=new JPasswordField(12));

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
        d=new JTextArea(10,30);
        jsp=new JScrollPane(d);
        c.add(jsp,"Center");
    }
    public void clear(){
        btnReset.addActionListener(e -> {
            txtName.setText(null);
            jcb.setSelectedIndex(-1);
            txtFName.setText(null);
            txtPass.setText(null);
            txtCpass.setText(null);
            txtCity.setText(null);
            txtEmail.setText(null);
        });
    }
    public void submit(){
        btnRegister.addActionListener(e -> {
            String name = txtName.getText();
            String gender= jcb.getSelectedItem().toString();
            String fatherName= txtFName.getText();
            String pass="";
            if(txtPass.getText().equals(txtCpass.getText())){
                pass=txtPass.getText();
            }
            else{
                JOptionPane.showMessageDialog(null,"Password does not match");
            }
            String city = txtCity.getText();
            String email = txtEmail.getText();
            String result =name+"   "+fatherName+"   "+gender+"   "+pass+"   "+city+"   "+email;
            d.append(result+"\n");

        });
    }
    public TestUI() {
        initUI();
        initForm();
        clear();
        submit();
    }
    public void initForm() {
        pack();
        setTitle("Registration Form");
        getContentPane().setBackground(Color.PINK);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestUI();

    }
}

