package ritesh;
import java.io.*;
import java.util.*;
public class FactorialOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a Number for which you want FACTORIAL: ");
int want_fact_of=Integer.parseInt(br.readLine());
int fact=1;
 if(want_fact_of==0)
	 System.out.println("Factorial of "+want_fact_of+"!="+fact);
 else
 {
	 for(int i=1;i<=want_fact_of;i++)
		 fact=fact*i;
	 System.out.println("Factorial of "+want_fact_of+"!="+fact);
		 
 }
	}

}
