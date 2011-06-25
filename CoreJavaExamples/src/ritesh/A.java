package ritesh;

public class A {

	private static int counter = 0;

	public static int getInstanceCount() {
	return counter;
	}

	public A() {
	 System.out.println(counter++);
	 }
}