package demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayGameForm extends JFrame implements ActionListener{
   private Container c;
   private JLabel l1,l2,l3;
   private JTextField tfy;
   private JRadioButton t1,t2,t3;
   private ButtonGroup g;
   private JButton btp,bte;
   private JTextArea dis;
   private JScrollPane jsp;
   private Game game;
   
   
	public PlayGameForm() {
		initForm();
		
		
	}
	public void initUI() {
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("Play Random Game Lottory !!");
		l1.setBounds(100,30,200,20);
		c.add(l1);
		l2=new JLabel("Your num");
		l2.setBounds(60,55,100,20);
		c.add(l2);
		tfy=new JTextField();
		tfy.setBounds(165,55,150,20);
		c.add(tfy);
		l3=new JLabel("Choose Type");
		l3.setBounds(60,80,100,20);
		c.add(l3);
		t1=new JRadioButton("One");
		t2=new JRadioButton("Two");
		t3=new JRadioButton("Three");
		t1.setBounds(165,80,60,20);
		c.add(t1);
		t2.setBounds(230,80,60,20);
		c.add(t2);
		t3.setBounds(295,80,100,20);
		c.add(t3);
		g=new ButtonGroup();
		g.add(t1);g.add(t2);g.add(t3);
		btp=new JButton("Play");
		bte=new JButton("Exit");
		btp.setBounds(100,105,80,20);
		c.add(btp);
		bte.setBounds(185,105,80,20);
		c.add(bte);
		dis=new JTextArea();
		jsp=new JScrollPane(dis);
		jsp.setBounds(50,130,300,150);
		c.add(jsp);
		btp.addActionListener(this);
		bte.addActionListener(this);
		
		
	}
	public void initForm() {
		initUI();
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new PlayGameForm();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	int y;
	String t="";
	if(e.getSource()==btp) {
		 y=Integer.parseInt(tfy.getText().toString());
		 if(t1.isSelected()) t="one";
		 if(t2.isSelected()) t="two";
		 if(t3.isSelected()) t="three";
		 game=new Game(y,t);
		 dis.append(game.toString());
		 
		 
	 }
	 if(e.getSource()==bte) {
		 System.exit(0);
		 
	 }
		
	}

}
