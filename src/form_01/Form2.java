package form_01;

import javax.swing.*;

public class Form2 extends JFrame {
    public Form2(){
        setTitle("This my Form");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Form2();
    }

}
