package ritesh;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class ButtonDemo extends JFrame  {
  JButton b;
	public ButtonDemo() {
		// TODO Auto-generated constructor stub
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon ii=new ImageIcon("d://rit1.gif");
		b=new JButton("Click Me",ii);
		b.setBackground(Color.yellow);
		b.setForeground(Color.red);
		//Font f=new Font("Arial",Font.BOLD,30);
		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		b.setToolTipText("Hi this is Ritesh Button");
		b.setMnemonic('R');
		c.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ButtonDemo bd=new ButtonDemo();
bd.setSize(500,400);
bd.setTitle("Ritesh Button");
bd.setVisible(true);
	}

}
