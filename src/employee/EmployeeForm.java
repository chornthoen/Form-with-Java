package employee;

import javax.swing.*;
import java.awt.*;

public class EmployeeForm extends JFrame {
    private Container ct;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JTextField tID,tName,tHour;
    private JRadioButton ch1, ch2, ch3;
    private ButtonGroup g;
    private JComboBox jcb;
    private JButton bta, bte;
    private JTextArea d;
    private JScrollPane jsp;


    public EmployeeForm(){
        initForm();
        initUI();
        add();
        close();
    }
    public void initUI(){
        l1 = new JLabel("Employee Form");
        l1.setBounds(150,30,200,20);
        ct.add(l1);
        l2 = new JLabel("Employee ID");
        l2.setBounds(50,60,100,20);
        ct.add(l2);
        tID = new JTextField();
        tID.setBorder(BorderFactory.createLineBorder(Color.black));
        tID.setBounds(150,60,120,20);
        ct.add(tID);
        l3 = new JLabel("Employee Name");
        l3.setBounds(50,90,100,20);
        ct.add(l3);
        tName = new JTextField();
        tName.setBorder(BorderFactory.createLineBorder(Color.black));
        tName.setBounds(150,90,120,20);
        ct.add(tName);
        l4 = new JLabel("Hour");
        l4.setBounds(50,120,100,20);
        ct.add(l4);
        tHour = new JTextField();
        tHour.setBorder(BorderFactory.createLineBorder(Color.black));
        tHour.setBounds(150,120,120,20);
        ct.add(tHour);
        l5 = new JLabel("Rate");
        l5.setBounds(50,150,100,20);
        ct.add(l5);
        jcb = new JComboBox();
        jcb.setBounds(130, 150, 80, 20);
        ct.add(jcb);
        jcb.addItem("100");
        jcb.addItem("200");
        jcb.addItem("300");
        jcb.addItem("400");
        jcb.addItem("500");
        l6 = new JLabel("Rate Tax");
        l6.setBounds(50,180,100,20);
        ct.add(l6);
        ch1 = new JRadioButton("10%");
        ch1.setBounds(130,180,50,20);
        ct.add(ch1);
        ch2 = new JRadioButton("15%");
        ch2.setBounds(180,180,50,20);
        ct.add(ch2);
        ch3 = new JRadioButton("20%");
        ch3.setBounds(230,180,50,20);
        ct.add(ch3);
        g = new ButtonGroup();
        g.add(ch1);
        g.add(ch2);
        g.add(ch3);
        bta= new JButton("Add");
        bta.setBounds(50,210,80,20);
        ct.add(bta);
        bte= new JButton("Exit");
        bte.setBounds(150,210,80,20);
        ct.add(bte);
        d = new JTextArea();
        jsp = new JScrollPane(d);
        jsp.setBounds(50, 240, 290, 100);
        ct.add(jsp);



    }
    public void close(){
        bte.addActionListener(e -> System.exit(0));
    }
    public  void add(){
        bta.addActionListener(e -> {
            int id = Integer.parseInt(tID.getText());
            String name = tName.getText();
            double hour = Double.parseDouble(tHour.getText());
            double rate = Double.parseDouble(jcb.getSelectedItem().toString());
            double dis = 0;
            if (ch1.isSelected()){
                dis = 0.1;
            }
            if (ch2.isSelected()){
                dis = 0.15;
            }
            if (ch3.isSelected()){
                dis = 0.2;
            }
            Employee employee = new Employee(id,name,hour,rate,dis);
            d.append(employee.toString());
        });
    }


    public void initForm(){
        setSize(400,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ct = getContentPane();
        ct.setLayout(null);
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }

}
