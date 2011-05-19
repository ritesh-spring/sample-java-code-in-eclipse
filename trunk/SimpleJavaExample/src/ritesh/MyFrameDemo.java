package ritesh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrameDemo extends Frame {

	public MyFrameDemo() {
		// TODO Auto-generated constructor stub
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
  public void paint(Graphics g)
  {
	 this.setBackground(new Color(100,200,100));
	 Font fnt=new Font("Helveltica",Font.BOLD,30);
	 g.setFont(fnt);
	 g.setColor(Color.green);
	 g.drawString("Hello Ritesh",20,100);
	 
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyFrameDemo mfd=new MyFrameDemo();
 mfd.setSize(500,400);
 mfd.setTitle("Ritesh Frame");
 mfd.show();;
	}

}
