package ritesh;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
public class PrimeNoBetweenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the lower Bounnd value Number: ");
int low_bound=Integer.parseInt(br.readLine());
System.out.println("Enter the upper bound Number: ");
int up_bound=Integer.parseInt(br.readLine());
int count,k,i;
ArrayList<Integer> primeNo=new ArrayList<Integer>();
ArrayList<Integer> notPrimeNo=new ArrayList<Integer>();
for(i=low_bound;i<=up_bound;i++)
	{
	count=0;
	for(k=1;k<=i;k++)
  { 
		if(i%k==0)
			count++;
  }
	if(count==2)
	{//System.out.println(i+" is a prime number");
		primeNo.add(i);
	}
	else 
	{//System.out.println(i+" is NOT a prime Number");
		notPrimeNo.add(i);
	}//end of else
	   }//end of outer loop
System.out.println("Prime numbers between:"+low_bound+" and "+up_bound+" :are:"+primeNo);
System.out.println("Others number Exception Prime numbers between:"+low_bound+" and "+up_bound+" :are:"+notPrimeNo);

 }
}
