package ritesh;

public class CommandLineTest {
	int l=13;
	public void testInt()
	{
		int p=13;
		System.out.println(l==p);
	}
	public static void main(String[] args) {
		Integer i=new Integer(args[0]);
		int j = 12;
		Integer k=new Integer(12);
		System.out.println("It is " + (i==j) + "  that i==j");
		System.out.println(j==k);
		Integer l=new Integer(12);
		System.out.println(k==l);
		CommandLineTest clt=new CommandLineTest();
		clt.testInt();
		
	}
}
