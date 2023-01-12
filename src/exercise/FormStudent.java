package exercise;

import javax.swing.*;
import java.awt.*;

public class FormStudent extends JFrame {
    private JLabel creatUser, id, name, year, group,gender;
    private JTextField txtID, txtName, txtYear;
    private JButton btnAdd;
    private JTextArea output;
    private Container ct;
    private JComboBox<Object> cboGroup;
    private JRadioButton rdoMale, rdoFemale;

    public FormStudent() {
        initForm();
        initControl();

    }

    public void initForm() {
        setTitle("Create User");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initControl() {
        ct = getContentPane();
        ct.setLayout(null);
        creatUser = new JLabel("Student Form");
        creatUser.setBounds(230, 30, 100, 20);
        ct.add(creatUser);
        id = new JLabel("ID:");
        id.setBounds(120, 60, 50, 20);
        ct.add(id);
        txtID = new JTextField();
        txtID.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtID.setBounds(190, 60, 170, 20);
        ct.add(txtID);
        name = new JLabel("Name:");
        name.setBounds(120, 100, 50, 20);
        ct.add(name);
        txtName = new JTextField();
        txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtName.setBounds(190, 100, 170, 20);
        ct.add(txtName);
        year = new JLabel("Year:");
        year.setBounds(120, 140, 50, 20);
        ct.add(year);
        txtYear = new JTextField();
        txtYear.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtYear.setBounds(190, 140, 170, 20);
        ct.add(txtYear);
        gender = new JLabel("Gender:");
        gender.setBounds(120, 180, 50, 20);
        ct.add(gender);
        rdoMale = new JRadioButton("Male");
        rdoMale.setBounds(190, 180, 80, 20);
        ct.add(rdoMale);
        rdoFemale = new JRadioButton("Female");
        rdoFemale.setBounds(290,180,80,20);
        ct.add(rdoFemale);
        group = new JLabel("Group:");
        group.setBounds(120, 220, 50, 20);
        ct.add(group);
        cboGroup = new JComboBox<>();
        cboGroup.addItem("A1");
        cboGroup.addItem("A2");
        cboGroup.addItem("A3");
        cboGroup.addItem("A4");
        cboGroup.addItem("A5");
        cboGroup.setBounds(190, 220, 170, 20);
        ct.add(cboGroup);

        btnAdd = new JButton("Add");
        btnAdd.setBackground(Color.WHITE);
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btnAdd.setBounds(100, 260, 80, 20);
        ct.add(btnAdd);
        output = new JTextArea();
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        output.setBounds(100, 300, 300, 100);
        ct.add(output);
        btnAdd.addActionListener(e -> {
            String id = txtID.getText();
            String name = txtName.getText();
            String year = txtYear.getText();
            String gender = "";
            if (rdoMale.isSelected()){
                gender = rdoMale.getText();
            }
            else if (rdoFemale.isSelected()){
                gender = rdoFemale.getText();
            }
            String group = cboGroup.getSelectedItem().toString();
            output.append( id + "  " + name + "   " + year + "  "+ group + "  "+gender+ "\n");
        });
    }

    public static void main(String[] args) {
        new FormStudent();
    }
}
