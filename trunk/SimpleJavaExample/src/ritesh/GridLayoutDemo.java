package ritesh;
import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9221140630141530042L;
	JButton b1,b2,b3,b4;
	
	public GridLayoutDemo() {
		// TODO Auto-generated constructor stub
		Container c=getContentPane();
		
		GridLayout grid=new GridLayout(2,2,4,4);
		c.setLayout(grid);
		
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		b4=new JButton("Button4");
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GridLayoutDemo demo=new GridLayoutDemo();
demo.setTitle("Layout Demo");
demo.setSize(400, 500);
demo.setVisible(true);
	}

}
