package firstlayoutmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmployeeForm extends JFrame {
    private Container c;
    private JTextField tfi,tfn,tfh;
    private JRadioButton ch1,ch2;
    private ButtonGroup g;
    private JComboBox jcb;
    private JButton bta,bte;
    private JTextArea d;
    private JScrollPane jsp;
    
    public void initUI() {
    	c=getContentPane();
    	JPanel p1=new JPanel();
    	p1.setLayout(new FlowLayout());
    	p1.add(new JLabel("Employee Form"));
    	//c.add(p1,"North");
    	JPanel p2=new JPanel();
    	p2.setLayout(new GridLayout(5,2));
    	p2.add(new JLabel("ID"));
    	p2.add(tfi=new JTextField(12));
    	
    	p2.add(new JLabel("Name"));
    	p2.add(tfn=new JTextField(12));
    	
    	p2.add(new JLabel("Gender"));
    	JPanel pg=new JPanel();
    	pg.setLayout(new FlowLayout());
    	pg.add(ch1=new JRadioButton("Male"));
    	pg.add(ch2=new JRadioButton("Female"));
    	g=new ButtonGroup();
    	g.add(ch1);
    	g.add(ch2);
    	p2.add(pg);
    	
    	p2.add(new JLabel("Hour"));
    	p2.add(tfh=new JTextField(12));
    	
    	p2.add(new JLabel("Rate"));
    	p2.add(jcb=new JComboBox());
    	jcb.addItem("15.0");
        jcb.addItem("18.0");
        jcb.addItem("20.0");
        
    	//c.add(p2,"Center");
    	JPanel p12=new JPanel();
    	p12.setLayout(new BorderLayout());
    	p12.add(p1,"North");
    	p12.add(p2,"Center");
    	//c.add(p12,"North");
    	JPanel p3=new JPanel();
    	p3.setLayout(new FlowLayout());
    	p3.add(bta=new JButton("Add"));
    	p3.add(bte=new JButton("Exit"));
    	
    	JPanel p123=new JPanel();
    	p123.setLayout(new BorderLayout());
    	p123.add(p12,"North");
    	p123.add(p3,"Center");
    	c.add(p123,"North");
    	d=new JTextArea(10,40);
    	jsp=new JScrollPane(d);
    	
        c.add(jsp,"Center");
        
    	
    }
	public EmployeeForm() {
	initUI();
	initForm();
	}
	public void initForm() {
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	 new EmployeeForm();
	}

}
