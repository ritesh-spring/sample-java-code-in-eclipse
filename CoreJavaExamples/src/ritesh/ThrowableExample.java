package ritesh;

public class ThrowableExample {
	 static void test() throws Error {
		 if (true) throw new AssertionError();
		 System.out.print("test ");
		 }
		 public static void main(String[] args) {
		 try { test(); }
		 catch (Error ex) { System.out.print("exception "); }
		 System.out.print("elld ");
		 }
}
