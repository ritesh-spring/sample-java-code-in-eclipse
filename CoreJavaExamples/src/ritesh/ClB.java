package ritesh;

 class ClA {
	 void process() throws Exception { throw new Exception(); }
	 }
	  public class ClB extends ClA {
	 void process() { System.out.println("B"); }
	
	 public static void main(String[] args) {
	 new ClB().process();
	 }
	 }
