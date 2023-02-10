package Form3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BistroPizzaBillCalculator extends JFrame {
    private Container ct;
    private JLabel lblNameForm,lblOrder,lblCTMName,lblQty,lblRate,lblAmount,lblCostTopping,lblPizzaType,lblTopping;
    private JTextField txtOrder,txtCTMName,txtQty,txtRate,txtCostTopping;
    private JRadioButton rdoPanPizza,rdoSuffed,rdoRegular;
    private JCheckBox chkOnion,chkCheese,chkTomato,chkBabyCorn;
    private JButton btnGenerateBill,btnClear;
    private JTextArea txtArea,txtAmount;
    private JScrollPane jspDisplay;
    private ButtonGroup bgSize;
    public void initUI(){

        lblNameForm = new JLabel("Bistro Pizza Bill Calculator");
        lblNameForm.setForeground(Color.blue);
        lblNameForm.setFont(new Font("Arial",Font.ITALIC,20));
        lblNameForm.setBounds(140,10,250,20);
        ct.add(lblNameForm);

        lblOrder = new JLabel("Order");
        lblOrder.setBounds(10,40,100,20);
        ct.add(lblOrder);

        txtOrder = new JTextField();
        txtOrder.setBounds(120,40,80,20);
        txtOrder.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ct.add(txtOrder);

        lblCTMName = new JLabel("Customer Name");
        lblCTMName.setBounds(10,70,100,20);
        ct.add(lblCTMName);

        txtCTMName = new JTextField();
        txtCTMName.setBounds(120,70,80,20);
        txtCTMName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ct.add(txtCTMName);

        lblQty = new JLabel("Quantity");
        lblQty.setBounds(10,100,100,20);
        ct.add(lblQty);

        txtQty = new JTextField();
        txtQty.setBounds(120,100,80,20);
        txtQty.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ct.add(txtQty);

        lblRate = new JLabel("Rate");
        lblRate.setBounds(250,40,100,20);
        ct.add(lblRate);

        txtRate = new JTextField();
        txtRate.setBounds(320,40,80,20);
        txtRate.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ct.add(txtRate);

        lblAmount = new JLabel("Amount");
        lblAmount.setBounds(250,70,100,20);
        ct.add(lblAmount);

        txtAmount = new JTextArea();
        txtAmount.setBounds(320,70,80,20);
        txtAmount.setEditable(false);
        txtAmount.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jspDisplay = new JScrollPane(txtAmount);
        ct.add(txtAmount);

        lblCostTopping = new JLabel("Cost of Topping");
        lblCostTopping.setBounds(250,100,100,20);
        ct.add(lblCostTopping);

        txtCostTopping = new JTextField();
        txtCostTopping.setBounds(360,100,80,20);
        txtCostTopping.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        ct.add(txtCostTopping);
        lblPizzaType = new JLabel("Pizza Type");
        lblPizzaType.setBounds(30,150,100,20);
        ct.add(lblPizzaType);

        rdoPanPizza = new JRadioButton("Pan Pizza");
        rdoPanPizza.setBounds(40,180,80,20);
        ct.add(rdoPanPizza);
        rdoSuffed = new JRadioButton("Stuffed");
        rdoSuffed.setBounds(40,200,80,20);
        ct.add(rdoSuffed);
        rdoRegular = new JRadioButton("Regular");
        rdoRegular.setBounds(40,220,80,20);
        JPanel jp = new JPanel();
        jp.setBounds(30,170,150,100);
        jp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jp.setLayout(new GridLayout(3,1));
        bgSize = new ButtonGroup();
        bgSize.add(rdoPanPizza);
        bgSize.add(rdoSuffed);
        bgSize.add(rdoRegular);
        jp.add(rdoPanPizza);
        jp.add(rdoSuffed);
        jp.add(rdoRegular);
        ct.add(jp);

        lblTopping = new JLabel("Topping");
        lblTopping.setBounds(250,150,100,20);
        ct.add(lblTopping);
        JPanel jp2 = new JPanel();
        jp2.setBounds(250,170,150,100);
        jp2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jp2.setLayout(new GridLayout(4,1));
        chkOnion = new JCheckBox("Onion");
        chkCheese = new JCheckBox("Cheese");
        chkTomato = new JCheckBox("Tomato");
        chkBabyCorn = new JCheckBox("Baby Corn");
        jp2.add(chkOnion);
        jp2.add(chkCheese);
        jp2.add(chkTomato);
        jp2.add(chkBabyCorn);
        ct.add(jp2);

        //button
        btnGenerateBill = new JButton("Generate Bill");
        btnGenerateBill.setBounds(30,300,110,30);
        ct.add(btnGenerateBill);
        btnClear = new JButton("Clear");
        btnClear.setBounds(250,300,80,30);
        ct.add(btnClear);
        txtArea=new JTextArea();
        jspDisplay=new JScrollPane(txtArea);
        jspDisplay.setBounds(40,360,370,150);
        ct.add(jspDisplay);





    }
    public void generateBill(){
        btnGenerateBill.addActionListener(e -> {

            double amount = (Double.parseDouble(txtQty.getText()) *
                    Double.parseDouble(txtRate.getText()))+
                    Double.parseDouble(txtCostTopping.getText());
            txtAmount.append(amount+"");
            String order = txtOrder.getText();
            String name = txtCTMName.getText();
            String result = "Hello,your Order Id is: "+order+"\nName: "+name+"\nAMOUNT PAYABLE IS: "+amount;
            txtArea.append(result+"\n");

        });
    }
    public void clear(){
        btnClear.addActionListener(e -> {
            txtCTMName.setText("");
            txtQty.setText("");
            txtRate.setText("");
            txtAmount.setText("");
            txtCostTopping.setText("");
            txtArea.setText("");
            txtOrder.setText("");
            bgSize.clearSelection();
            chkOnion.setSelected(false);
            chkCheese.setSelected(false);
            chkTomato.setSelected(false);
            chkBabyCorn.setSelected(false);
        });
    }
    public void initForm(){
        ct = getContentPane();
        ct.setLayout(null);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public BistroPizzaBillCalculator(){
        initForm();
        initUI();
        generateBill();
        clear();
    }

    public static void main(String[] args) {
        new BistroPizzaBillCalculator();
    }
}
