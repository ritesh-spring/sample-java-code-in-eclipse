/**
 * 
 */
package ritesh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
 * @author RITESH
 *
 */
public class ConnectingMySql {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Connection connect=null;
try
{
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";
    String password = "mysql";
    connect = DriverManager.getConnection(url, username, password);
    
    java.sql.Statement stmt=connect.createStatement();
    ResultSet rs=stmt.executeQuery("select * from ContactNumber");
    while(rs.next())
    {
        long x=rs.getLong(1);
        String str1=rs.getString(2);
        String str2=rs.getString(3);
        String str3=rs.getString(4);
        System.out.println(x+" "+str1+" "+str2+" "+str3);
    }
  //connect.close();
}
catch(Exception e)
{
    e.printStackTrace();
System.err.println("Exception: " + e.getMessage());
}
//connection.close();
	}

}
