package exercise;

import javax.swing.*;
import java.awt.*;

public class OrderProduct extends JFrame {
    private JLabel orderProduct, code, name, qty, qty_, discont;
    private JTextField txtCode, txtName, txtQty;
    private JButton btnAdd,bntExit;
    private JTextArea output;
    private Container ct;
    private JRadioButton rdo10, rdo15, rdo20;
    private JComboBox<Object> cboQty;
    public OrderProduct() {
        initForm();
        initControl();
    }

    public void initForm() {

        setTitle("Order Product");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initControl() {
        ct = getContentPane();
        ct.setLayout(null);
        orderProduct = new JLabel("Order Product");
        orderProduct.setBounds(230, 30, 100, 20);
        ct.add(orderProduct);
        code = new JLabel("Code:");
        code.setBounds(100, 60, 50, 20);
        ct.add(code);
        txtCode = new JTextField();
        txtCode.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtCode.setBounds(190, 60, 170, 20);
        ct.add(txtCode);
        name = new JLabel("Name:");
        name.setBounds(100, 100, 50, 20);
        ct.add(name);
        txtName = new JTextField();
        txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtName.setBounds(190, 100, 170, 20);
        ct.add(txtName);
        qty = new JLabel("Qty:");
        qty.setBounds(100, 140, 50, 20);
        ct.add(qty);
        txtQty = new JTextField();
        txtQty.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtQty.setBounds(190, 140, 170, 20);
        ct.add(txtQty);
        qty_ = new JLabel("Qty:");
        qty_.setBounds(100, 220, 50, 20);
        ct.add(qty_);
        cboQty = new JComboBox<>();
        cboQty.addItem("10");
        cboQty.addItem("15");
        cboQty.addItem("20");
        cboQty.setBounds(190, 220, 170, 20);
        ct.add(cboQty);
        discont = new JLabel("Discount:");
        discont.setBounds(100, 180, 80, 20);
        ct.add(discont);
        rdo10 = new JRadioButton("10%");
        rdo10.setBounds(190, 180, 50, 20);
        ct.add(rdo10);
        rdo15 = new JRadioButton("15%");
        rdo15.setBounds(240,180,50,20);
        ct.add(rdo15);
        rdo20 = new JRadioButton("20%");
        rdo20.setBounds(290,180,50,20);
        ct.add(rdo20);


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
            String id = txtCode.getText();
            String name = txtName.getText();
            String year = txtQty.getText();

            String group = cboQty.getSelectedItem().toString();
            output.append( id + "  " + name + "   " + year + "  "+ group + "\n");
        });
    }

    public static void main(String[] args) {
        new OrderProduct();
    }
}
