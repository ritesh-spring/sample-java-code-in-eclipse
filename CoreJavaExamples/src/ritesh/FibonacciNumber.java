package ritesh;
import java.io.*;

public class FibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
int fab0=0,fab1=1,fab;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int len_of_series=Integer.parseInt(br.readLine());
if(len_of_series==1)
	System.out.println(fab0);
if(len_of_series==2)
	System.out.println(fab0+","+fab1);

	
	

	}

}
