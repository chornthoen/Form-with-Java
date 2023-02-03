package layoutEmployee;

import javax.swing.*;
import java.awt.*;

public class FormEmployee extends JFrame {
    private Container ct;
    private JLabel lbliD, lblName, lblGender, lblHour, lblRate;
    private JTextField txtID, txtName, txtHour;
    private JRadioButton rdoMale, rdoFemale;
    private ButtonGroup bgGender;
    private JComboBox cboRate;
    private JButton btnAdd, btnExit;
    private JScrollPane scrollPane;
    private JTextArea txtArea;


    public void initUI(){
        ct = getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Employee Form"));
        //ct.add(p1,"North");
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5,2));
        p2.add(new JLabel("ID:"));
        p2.add(txtID = new JTextField(10));
        p2.add(new JLabel("Name:"));
        p2.add(txtName = new JTextField(10));
        p2.add(new JLabel("Gender:"));
        JPanel pGender = new JPanel();
        pGender.setLayout(new FlowLayout());
        pGender.add(rdoMale = new JRadioButton("Male"));
        pGender.add(rdoFemale = new JRadioButton("Female"));
        bgGender = new ButtonGroup();
        bgGender.add(rdoMale);
        bgGender.add(rdoFemale);
        p2.add(pGender);
        p2.add(new JLabel("Hour:"));
        p2.add(txtHour = new JTextField(10));
        p2.add(new JLabel("Rate:"));
        p2.add(cboRate = new JComboBox());
        cboRate.addItem("100");
        cboRate.addItem("200");
        cboRate.addItem("300");
        //ct.add(p2,"Center");
        JPanel p12 = new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(p1,"North");
        p12.add(p2,"Center");
       // ct.add(p12,"North");

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(btnAdd = new JButton("Add"));
        p3.add(btnExit = new JButton("Exit"));
        ct.add(p3,"Center");

        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        p4.add(p12,"North");
        p4.add(p3,"Center");
        ct.add(p4,"North");

        txtArea=new JTextArea(10,40);
        scrollPane=new JScrollPane(txtArea);
        ct.add(scrollPane,"Center");


    }
    public void Add(){
        btnAdd.addActionListener(e -> {
            String id = txtID.getText();
            String name = txtName.getText();
            String gender = "";
            if (rdoMale.isSelected()){
                gender += rdoMale.getText();
            }
            if (rdoFemale.isSelected()){
                gender += rdoFemale.getText();
            }
            String hour = txtHour.getText();
            String rate = cboRate.getSelectedItem().toString();
            double salary = Double.parseDouble(hour) * Double.parseDouble(rate);
            txtArea.append(id+" "+name+" "+gender +" "+hour+" "+rate+ " "+ salary+"\n");

        });
    }
    public void Exit(){
        btnExit.addActionListener(e -> System.exit(0));
    }

    public FormEmployee(){
        initUI();
        init();
        Add();
        Exit();
    }
    public void init(){
        setTitle("Employee");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormEmployee();
    }
}
