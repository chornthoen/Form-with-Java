package registration;

import javax.swing.*;
import java.awt.*;

public class FormRegistraction extends JFrame {
    Container ct;
    private JTextField txtName,txtMobile;
    private JRadioButton rdoMale,rdoFemale;
    private ButtonGroup bgGender;
    private JComboBox cboday,cbomonth,cboyear;
    private JButton btnSubmit,btnReset;
    private JTextArea txtAddress,txtResult;
    private JScrollPane scrollPane;
    private JCheckBox chkAccept;

    String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
                        "15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String[] years = {"1998","1999","2000","2001","2002",
                        "2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014",
                        "2015","2016","2017","2018","2019","2020"};




    public void initUI(){
        JPanel pr = new JPanel();
        pr.setLayout(new FlowLayout());
        pr.add(new JLabel("Registration Form"));
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2));
        p1.add(new JLabel("Name:"));
        p1.add(txtName = new JTextField(10));
        p1.add(new JLabel("Mobile:"));
        p1.add(txtMobile = new JTextField(10));
        p1.add(new JLabel("Gender:"));
        JPanel pGender = new JPanel();
        pGender.setLayout(new FlowLayout());
        pGender.add(rdoMale = new JRadioButton("Male"));
        pGender.add(rdoFemale = new JRadioButton("Female"));
        bgGender = new ButtonGroup();
        bgGender.add(rdoMale);
        bgGender.add(rdoFemale);
        p1.add(pGender);
        p1.add(new JLabel("DOB:"));
        JPanel pDOB = new JPanel();
        pDOB.setLayout(new FlowLayout());
        pDOB.add(cboday = new JComboBox(days));
        pDOB.add(cbomonth = new JComboBox(months));
        pDOB.add(cboyear = new JComboBox(years));
        p1.add(pDOB);
        p1.add(new JLabel("Address:"));
        p1.add(txtAddress = new JTextArea(7,10));
        scrollPane = new JScrollPane(txtAddress);
        p1.add(scrollPane);

        JPanel p12 = new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(p1,"Center");

        JPanel pc = new JPanel();
        pc.setLayout(new FlowLayout());
        pc.add(chkAccept = new JCheckBox("Accept Terms and Conditions"));
        JPanel pp = new JPanel();
        pp.setLayout(new BorderLayout());
        pp.add(p12,"Center");
        pp.add(pc,"South");


        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(btnSubmit = new JButton("Submit"));
        p2.add(btnReset = new JButton("Reset"));


        JPanel p22 = new JPanel();
        p22.setLayout(new BorderLayout());
        p22.add(pp,"Center");
        p22.add(p2,"South");

        JPanel p3 = new JPanel();
        txtResult = new JTextArea(14,25);
        scrollPane = new JScrollPane(txtResult);
        p3.add(scrollPane);

        JPanel p33 = new JPanel();
        p33.setLayout(new BorderLayout());
        p33.add(pr,"North");
        p33.add(p22,"West");
        p33.add(p3,"Center");
        ct.add(p33,"Center");

    }
    public void initForm(){
        ct = getContentPane();
        setSize(650,300);
        //ct.setBackground(Color.pink);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public void Submit(){
        btnSubmit.addActionListener(e -> {
            String name = txtName.getText();
            String mobile = txtMobile.getText();
            String gender = "";
            if (rdoMale.isSelected()){
                gender+=rdoMale.getText();
            }
            if(rdoFemale.isSelected()){
                gender+=rdoFemale.getText();
            }
            String dob = cboday.getSelectedItem().toString();
            String month = cbomonth.getSelectedItem().toString();
            String year = cboyear.getSelectedItem().toString();
            String address = txtAddress.getText();
            String result = name+ "  "+mobile+"  "+gender+"  "+dob+"/"+month+"/"+year+"  "+address+"\n";
            txtResult.setText(result);


        });
    }
    public void Reset(){
        btnReset.addActionListener(e -> {
            txtName.setText("");
            txtMobile.setText("");
            bgGender.clearSelection();
            cboday.setSelectedIndex(0);
            cbomonth.setSelectedIndex(0);
            cboyear.setSelectedIndex(0);
            txtAddress.setText("");
            txtResult.setText("");
            chkAccept.setSelected(false);
        });
    }

    public FormRegistraction(){
        initForm();
        initUI();
        Submit();
        Reset();

    }

    public static void main(String[] args) {
        new FormRegistraction();
    }
}
