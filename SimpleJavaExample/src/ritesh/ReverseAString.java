/**
 * 
 */
package ritesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author RITESH
 *
 */
public class ReverseAString {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name:");
		String name=br.readLine();
		System.out.println("My name is:"+name);
		StringBuffer sbr=new StringBuffer(name);
		String reverse=sbr.reverse().toString();
		System.out.println("After Reversing My Name is:"+reverse);
	}

}
