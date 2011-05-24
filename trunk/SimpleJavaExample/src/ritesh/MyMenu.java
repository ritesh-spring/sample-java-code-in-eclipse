package ritesh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyMenu extends JFrame implements ActionListener {
 /**
	 * 
	 */
	private static final long serialVersionUID = -8382031848227884209L;
JMenuBar mb;
 JMenu file,edit,font;
 JMenuItem nw,cl,cp,pt;;
 JCheckBoxMenuItem pr;
	public MyMenu() 
	{
		// TODO Auto-generated constructor stub
	 Container c=getContentPane();
	 c.setLayout(new BorderLayout());
	 mb=new JMenuBar();
	 c.add("North",mb);
	 file=new JMenu("File");
	 edit=new JMenu("Edit");
	 mb.add(file);
	 mb.add(edit);
	 nw=new JMenuItem("New");
	 cl=new JMenuItem("Close");
	 cp=new JMenuItem("Copy");
	 pt=new JMenuItem("Paste");
	 
	 file.add(nw);
	 file.addSeparator();
	 file.add(cl);
	 file.addSeparator();
	 edit.add(cp);
	 edit.addSeparator();
	 edit.add(pt);file.addSeparator();
// Disable/Enable(false/true) the close Item
	 cl.setEnabled(true);
	 
// Create JCheckboxMennuItem
     pr=new JCheckBoxMenuItem("print");
     file.add(pr);
     file.addSeparator();
     font=new JMenu("Font");
     file.add(font);
     JMenuItem f1=new JMenuItem("Arial");
     JMenuItem f2=new JMenuItem("Times New Roman");
     
     font.add(f1);
     font.add(f2);
     
     //Attach ActionListener TO the Menu Item
     
     //new addActionListener(this)
     cl.addActionListener(this);
     cp.addActionListener(this);
     pt.addActionListener(this);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
public void actionPerformed(ActionEvent ae)
{
	if(nw.isArmed())
		System.out.println("New Selected");
	if(cl.isArmed())
		System.out.println("Close Selected");
	if(cp.isArmed())
		System.out.println("Copy Selected");
	if(pt.isArmed())
		System.out.println("Paste Selected");
	if(pr.getModel().isSelected())
		System.out.println("Printer ON");
}
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
 MyMenu mm=new MyMenu();
mm.setTitle("Ritesh Menu");
 mm.setSize(500, 400);
 mm.setVisible(true);
	}

}
