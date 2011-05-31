package ritesh;
import java.util.*;
import java.io.*;
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number for which you want a table:");
 int want_table_of=Integer.parseInt(br.readLine());
 System.out.println("Enter the size of the table: ");
 int table_size=Integer.parseInt(br.readLine());
  System.out.println("Table of: "+want_table_of);
 for(int i=1;i<=table_size;i++)
  System.out.println(want_table_of+"*"+i+"="+i*want_table_of);
 
	}

}
