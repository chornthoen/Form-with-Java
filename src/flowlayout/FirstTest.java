package flowlayout;

import javax.swing.*;
import java.awt.*;

public class FirstTest extends JFrame {
    private Container ct;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private JPanel p;



    public FirstTest(){
        initForm();
        initUI();
    }

    public void initUI(){
        btn1 = new JButton("One");
        btn2 = new JButton("Two");
        btn3 = new JButton("Three");
        btn4 = new JButton("Four");
        btn5 = new JButton("Five");
        p = new JPanel();
        //p.setLayout(new FlowLayout());
        //p.setLayout(new GridLayout(3,2));
        p.setLayout(new BorderLayout());


        p.add(btn1,"North");
        p.add(btn2,"South");
        p.add(btn3,"East");
        p.add(btn4,"West");
        p.add(btn5,"Center");
        ct.add(p);
    }
    public void initForm(){
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        ct = getContentPane();

    }

    public static void main(String[] args) {
        new FirstTest();
    }
}
