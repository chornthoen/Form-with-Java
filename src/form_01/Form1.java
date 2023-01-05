package form_01;

import javax.swing.*;

public class Form1 {
    private JFrame frame;
    public Form1(){
        frame = new JFrame("Employee Form");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Form1();
    }

}
