package ritesh;
import javax.swing.*;
import java.awt.*;
public class JTabbedPaneDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTabbedPaneDemo() {
		// TODO Auto-generated constructor stub
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Countries", new CountriesPanel());
        jtp.addTab("Capital",new CapitalsPanel());
        Container c=getContentPane();
        c.add(jtp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JTabbedPaneDemo demo=new JTabbedPaneDemo();
demo.setSize(400,500);
demo.setTitle("Ritesh Tabbed Panel");
demo.setVisible(true);
demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
