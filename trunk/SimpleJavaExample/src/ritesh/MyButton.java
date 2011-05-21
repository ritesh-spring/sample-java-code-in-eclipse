package ritesh;

import java.awt.Button;
import java.awt.*;
import java.awt.event.*;

public class MyButton extends Frame implements ActionListener{
	Button b1,b2,b3;
	public MyButton() 
	{
		// TODO Auto-generated constructor stub
		this.setLayout(new FlowLayout());
		b1=new Button("Yellow");
		b2=new Button("Blue");
		b3=new Button("Pink");
		add(b1);
		add(b2);
		add(b3);
		b1.setBounds(50, 50, 75, 40);
		b2.setBounds(50, 100, 75, 40);
		b3.setBounds(50, 150, 75, 40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ae)
			{
				System.exit(0);
			}
		});
		
	} //end of constructor

	/**
	 * @param args
	 */
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Yellow"))
			setBackground(Color.yellow);
		if(str.equals("Blue"))
			setBackground(Color.blue);
		if(str.equals("Pink"))
			setBackground(Color.pink);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyButton mb=new MyButton();
mb.setSize(500, 400);
mb.setTitle("Ritesh Push Button");
mb.setVisible(true);
	}

}
