package ritesh;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.JTableHeader;

public class JTableDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTableDemo() {
		// TODO Auto-generated constructor stub
		Vector data=new Vector();
		Vector row=new Vector();
		row.add("Ritesh");
		row.add("System Analyst");
		row.add("12000.00");
		data.add(row);
		row=new Vector();
		row.add("Haritha");
		row.add("Senior Programmer");
		row.add("24000.00");
		data.add(row);
		row=new Vector();
		row.add("Ramesh");
		row.add("Receptionist");
		row.add("6000.00");
		data.add(row);
		Vector cols=new Vector();
		cols.add("Employee Name");
		cols.add("Designation");
		cols.add("Salary");
		JTable tab=new JTable(data,cols);
		tab.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		JTableHeader head=tab.getTableHeader();
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		c.add("North",head);
		c.add("Center",tab);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JTableDemo jt=new JTableDemo();
jt.setTitle("Ritesh JTable");
jt.setSize(400,500);
jt.setVisible(true);
	}

}
