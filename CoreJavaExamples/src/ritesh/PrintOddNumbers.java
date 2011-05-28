package ritesh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintOddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Minimum Ranage Value:");
		int min_range=Integer.parseInt(br.readLine());
        System.out.println("Enter Max Range Value:");
        int max_range=Integer.parseInt(br.readLine());
        
        System.out.println("Odd Numbers Between: "+min_range+" And "+max_range+" are:::");
        for(int i=min_range;i<=max_range;i++)
        {
        	if((i%2!=0))
            System.out.println(i);
        }
	}

}
