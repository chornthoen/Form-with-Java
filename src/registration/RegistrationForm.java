package registration;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {
    private Container ct;
    private JLabel lR,lName,lMobile,lGender,lBOB,lAddress;
    private JTextField tfName,tfMobile;
    private JRadioButton rbMale,rbFemale;
    private ButtonGroup bgGender;
    private JComboBox<String> cbDay;
    private JComboBox<String> cbMonth;
    private JComboBox<String> cbYear;
    private JTextArea taAddress,taResult;
    private JButton btnSubmit,btnReset;
    private JScrollPane jsp,jsp2;
    private JPanel p1,p2,p3,p4,p5,p6,p7;
    private String[] days =  {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    private JCheckBox checkBox;
    private Registration registration;


    public void initUI(){
        lR = new JLabel("Registration Form");
        lR.setBounds(150,10,200,20);
        ct.add(lR);
        lName = new JLabel("Name");
        lName.setBounds(50,50,100,20);
        ct.add(lName);
        tfName = new JTextField();
        tfName.setBounds(120,50,200,20);
        ct.add(tfName);
        lMobile = new JLabel("Mobile");
        lMobile.setBounds(50,80,100,20);
        ct.add(lMobile);
        tfMobile = new JTextField();
        tfMobile.setBounds(120,80,140,20);
        ct.add(tfMobile);
        lGender = new JLabel("Gender");
        lGender.setBounds(50,110,100,20);
        ct.add(lGender);
        rbMale = new JRadioButton("Male");
        rbMale.setBounds(120,110,80,20);
        ct.add(rbMale);
        rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(200,110,100,20);
        ct.add(rbFemale);
        bgGender = new ButtonGroup();
        bgGender.add(rbMale);
        bgGender.add(rbFemale);
        lBOB = new JLabel("DOB");
        lBOB.setBounds(50,140,100,20);
        ct.add(lBOB);
        cbDay = new JComboBox(days);
        cbDay.setBounds(120,140,50,20);
        ct.add(cbDay);
        cbMonth = new JComboBox<>(months);
        cbMonth.setBounds(180,140,90,20);
        ct.add(cbMonth);
        cbYear = new JComboBox<>(years);
        cbYear.setBounds(280,140,60,20);
        ct.add(cbYear);
        lAddress = new JLabel("Address");

        lAddress.setBounds(50,170,100,20);
        ct.add(lAddress);
        taAddress = new JTextArea();
        jsp = new JScrollPane(taAddress);
        jsp.setBorder(BorderFactory.createLineBorder(Color.white));
        jsp.setBounds(120,170,200,100);
        ct.add(jsp);
        checkBox = new JCheckBox("Accept Terms & Conditions");
        checkBox.setBounds(120,280,200,20);
        ct.add(checkBox);
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(120,310,100,20);
        ct.add(btnSubmit);
        btnReset = new JButton("Reset");
        btnReset.setBounds(230,310,100,20);
        ct.add(btnReset);
        taResult = new JTextArea();
        jsp2 = new JScrollPane(taResult);
        jsp2 = new JScrollPane(taResult);
        jsp2.setBorder(BorderFactory.createLineBorder(Color.white));
        jsp2.setBounds(380,50,330,300);
        ct.add(jsp2);

    }
    public void submit(){
        btnSubmit.addActionListener(e -> {
            String name = tfName.getText();
            String mobile = tfMobile.getText();
            String gender = "";
            if (rbFemale.isSelected()){
                gender += rbFemale.getText();
            }
            if (rbMale.isSelected()){
                gender += rbMale.getText();
            }
            String day = cbDay.getSelectedItem().toString();
            String month = cbMonth.getSelectedItem().toString();
            String year = cbYear.getSelectedItem().toString();
            String address = taAddress.getText();
            Registration registration = new Registration(name,mobile,gender,day,month,year,address);
            if (tfName.getText().isEmpty() && tfMobile.getText().isEmpty() && taAddress.getText().isEmpty()){
                taResult.setText(null);
            }else {
                taResult.append(registration.toString());
            }
            //taResult.append(registration.toString());
            // taResult.append(name+",  "+mobile+",  "+gender+",  "+day+"-"+month+"-"+year+",  "+address+" \n");

//            if (checkBox.isSelected()){
//                JOptionPane.showMessageDialog(null,"Registration Successful");
//            }
//            else {
//                JOptionPane.showMessageDialog(null,"Please Accept Terms & Conditions");
//            }


        });
    }
    public void reset(){
        btnReset.addActionListener(e -> {
            tfName.setText(null);
            tfMobile.setText(null);
            taAddress.setText(null);
            cbDay.setSelectedIndex(0);
            cbMonth.setSelectedIndex(0);
            cbYear.setSelectedIndex(0);
            bgGender.clearSelection();
            checkBox.setSelected(false);
        });
    }
    public void initForm(){
        setSize(800,500);
        setVisible(true);
        setTitle("Registration Form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ct = getContentPane();
        ct.setLayout(null);
    }
    public RegistrationForm(){
        initForm();
        initUI();
        submit();
        reset();
    }
    public static void main(String[] args) {
        new RegistrationForm();
    }
}
