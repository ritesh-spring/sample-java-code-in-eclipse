package ritesh;

public class ThrowInsideMethodExample {
	 static void test() throws RuntimeException
	 {
		 try {
		 System.out.print("test ");
		 throw new RuntimeException();
		 }
		 catch (RuntimeException ex) { System.out.print("exception "); }
		 finally {}
		 }
		 public static void main(String[] args) {
		 try { test(); }
		 catch (RuntimeException ex) { System.out.print("runtime "); }
		 System.out.print("end ");
		 }
}
