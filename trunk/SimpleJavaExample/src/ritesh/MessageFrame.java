package ritesh;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
public class MessageFrame extends JFrame {
	
	JLabel jbl;
	public MessageFrame() {
		// TODO Auto-generated constructor stub
		Container c=this.getContentPane();
		jbl=new JLabel("Hello Ritesh",JLabel.CENTER);
		c.setBackground(Color.green);
		jbl.setForeground(Color.red);
		jbl.setFont(new Font("sanserif",Font.BOLD,50));
		c.add(jbl);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MessageFrame mf=new MessageFrame();
mf.setSize(500, 400);
mf.setTitle("Ritesh Frame");
mf.setVisible(true);
	}

}
