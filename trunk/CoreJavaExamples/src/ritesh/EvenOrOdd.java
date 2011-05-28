package ritesh;
import java.io.*;
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the Number to TEST:");
int num_to_test=Integer.parseInt(br.readLine());
 if(num_to_test%2==0)
	 System.out.println(num_to_test + "  is Even Number");
 else
	 System.out.println(num_to_test+ " Number is Odd");
	}

}
