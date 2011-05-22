package ritesh;
import java.awt.*;

import javax.swing.*;
public class ImageFrame extends JFrame {
 static Image img1;
 static ImageIcon img2;
 JLabel lbl;
	public ImageFrame() {
		// TODO Auto-generated constructor stub
		Container c=getContentPane();
		c.setLayout(null);
		img1=Toolkit.getDefaultToolkit().getImage("d://rit1.gif");
		img2=new ImageIcon("d://rit2.gif");
		lbl=new JLabel(img2);
		lbl.setBounds(150, 140, 140, 125);
		c.add(lbl);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImageFrame i=new ImageFrame();
i.setSize(500,400);
i.setTitle("Ritesh Image");
i.setIconImage(img1);
i.show();
	}

}
