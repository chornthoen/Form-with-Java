package Example1;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;

public class Test1 extends JFrame {
    private JLabel l1;
    private JButton bt1,bt2,bt3;
    private JTextField tf1;
    private JTextArea d;
    private Container c;
    private JScrollPane jsc;
    public Test1(){
        initForm();
        initUI();
        add();
        sort();
        clsoeForm();

    }
    public void sort() {
        bt2.addActionListener(e -> {
            String[] s = d.getText().split("\n");
            for (int i = 0; i < s.length; i++) {
                for (int j = i + 1; j < s.length; j++) {
                    if (s[i].compareTo(s[j]) > 0) {
                        String temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
            d.setText(null);
            IntStream.range(0, s.length).forEach(i -> d.append(s[i] + "\n"));
        });
    }
            // split the text area into an array of strings
    public void initUI(){
        c=getContentPane();
        c.setLayout(null);
        //label
        l1 = new JLabel("Input Name:");
        l1.setBounds(30,30,80,30);
        c.add(l1);
        //TextField
        tf1=new JTextField();
        tf1.setBounds(120,30,150,25);
        c.add(tf1);
        //button1
        bt1= new JButton("ADD");
        bt1.setBounds(30,80,60,25);
        c.add(bt1);
        //Button2
        bt2= new JButton("SORT");
        bt2.setBounds(100,80,70,25);
        c.add(bt2);
        //Button3
        bt3= new JButton("CLOSE");
        bt3.setBounds(180,80,90,25);
        c.add(bt3);
        //TextArea
        d=new JTextArea();
        jsc = new JScrollPane(d);
        jsc.setBounds(30,130,240,180);
       c.add(jsc);
    }
    public void clsoeForm(){
        bt3.addActionListener(e -> {
            System.exit(0);
        });
    }
    public void add(){
        bt1.addActionListener(e -> {

            String reprot= tf1.getText()+"\n";
            d.append(reprot);
            tf1.setText(null);
        });


    }
    public void initForm(){

        setSize(310,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test1();
    }
}
