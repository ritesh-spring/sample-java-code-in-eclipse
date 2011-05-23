package ritesh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BoxRadioDemo extends JFrame implements ActionListener  
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JCheckBox cb1,cb2;
 JRadioButton rb1,rb2;
 ButtonGroup bg;
 JTextArea ta;
 String msg=" ";
	public BoxRadioDemo() {
		// TODO Auto-generated constructor stub
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		cb1=new JCheckBox("J2EE",true);
		cb2=new JCheckBox("J2SE",false);
		rb1=new JRadioButton("Male",false);
		rb2=new JRadioButton("Female",false);
		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		ta=new JTextArea(6,20);
		c.add(cb1);
		c.add(cb2);
		c.add(rb1);
		c.add(rb2);
		c.add(ta);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 public void actionPerformed(ActionEvent ae)
  {
	if(cb1.getModel().isSelected())
		msg+="J2EE";
	if(cb2.getModel().isSelected())
		msg+="J2SE";
	if(rb1.getModel().isSelected())
		msg+="Male";
	if(rb2.getModel().isSelected())
		msg+="Female";
	ta.setText(msg);
	msg=" ";
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BoxRadioDemo brd=new BoxRadioDemo();
brd.setSize(500, 400);
brd.setTitle("Ritesh Component");
brd.setVisible(true);
	}

}
