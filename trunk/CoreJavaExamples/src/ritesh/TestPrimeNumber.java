package ritesh;
import java.io.*;
public class TestPrimeNumber {

	/**																
	 * @param args
	 */
	//static int count=0;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the Number to test:");
  int num_to_test=Integer.parseInt(br.readLine());
  int count=0;
   for(int i=1;i<=num_to_test;i++)
   {
	   if(num_to_test%i==0)
		  count++;
	}
   if(count==2)
	   System.out.println("Given no is a Prime Number:  "+num_to_test);
   else
	   System.out.println(num_to_test+" is not a prime number");
	}

}
