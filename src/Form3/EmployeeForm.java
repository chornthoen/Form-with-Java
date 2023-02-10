package Form3;


import javax.swing.*;
import java.awt.*;

public class EmployeeForm extends JFrame {
    private Container c;
    private JTextField txtID, txtName, txtHour;
    private JComboBox cboRate;
    private JRadioButton rdo15, rdo20, rdo30;
    private JButton btnAdd, btnExit;
    private JTextArea tAreaDisplay;
    private ButtonGroup gbRateTax;
    private JScrollPane jsp;

    public void initUI() {
        c = getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Employee Form"));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5, 2));
        p2.add(new JLabel("ID"));
        p2.add(txtID = new JTextField(12));

        p2.add(new JLabel("Name"));
        p2.add(txtName = new JTextField(12));
        p2.add(new JLabel("Hour"));
        p2.add(txtHour = new JTextField(12));


        p2.add(new JLabel("Rate"));
        p2.add(cboRate = new JComboBox<>());
        cboRate.addItem("10.0");
        cboRate.addItem("20.0");
        cboRate.addItem("30.0");

        p2.add(new JLabel("Rate Tax"));
        JPanel pg = new JPanel();
        pg.setLayout(new FlowLayout());
        pg.add(rdo15 = new JRadioButton("10%"));
        pg.add(rdo20 = new JRadioButton("15%"));
        pg.add(rdo30 = new JRadioButton("20%"));
        gbRateTax = new ButtonGroup();
        gbRateTax.add(rdo15);
        gbRateTax.add(rdo20);
        gbRateTax.add(rdo30);
        p2.add(pg);

        JPanel p12 = new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(p1, "North");
        p12.add(p2, "Center");

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(btnAdd = new JButton("Add"));
        p3.add(btnExit = new JButton("Exit"));

        JPanel p123 = new JPanel();
        p123.setLayout(new BorderLayout());
        p123.add(p12, "North");
        p123.add(p3, "Center");
        c.add(p123, "North");
        tAreaDisplay = new JTextArea(10, 20);
        jsp = new JScrollPane(tAreaDisplay);
        c.add(jsp, "Center");
    }

    public void clear() {
        btnExit.addActionListener(e -> {
            System.exit(0);
        });
    }

    public void submit() {
        btnAdd.addActionListener(e -> {
            String id = txtID.getText();
            String name = txtName.getText();
            double hour = Double.parseDouble(txtHour.getText());
            double rate = Double.parseDouble(cboRate.getSelectedItem().toString());
            double rateTax = 0;
            if (rdo15.isSelected()) rateTax = 0.1;
            if (rdo20.isSelected()) rateTax = 0.15;
            if (rdo30.isSelected()) rateTax = 0.2;
            double salary = Double.parseDouble(cboRate.getSelectedItem().toString())
                            * Double.parseDouble(txtHour.getText());
            double d1 = salary * rateTax;
            double d2 = salary - d1;
            String result = id + "   " + name + "   " + hour + "   "
                    + rate + "   " + salary + "   " + d1 + "   " + d2;
            tAreaDisplay.append(result + "\n");


        });
    }

    public EmployeeForm() {
        initUI();
        initForm();
        clear();
        submit();
    }

    public void initForm() {
        pack();
        setSize(400, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EmployeeForm();

    }
}

