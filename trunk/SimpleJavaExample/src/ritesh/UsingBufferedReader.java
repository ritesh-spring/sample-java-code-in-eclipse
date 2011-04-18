/**
 * 
 */
package ritesh;
import java.io.*;
import java.util.*;
/**
 * @author RITESH
 *
 */
public class UsingBufferedReader {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name:");
String name=br.readLine();
System.out.println("My Name is:"+name);

	}

}
