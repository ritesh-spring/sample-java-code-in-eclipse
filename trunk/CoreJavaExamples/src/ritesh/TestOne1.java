package ritesh;

public class TestOne1 implements Runnable {
	public static void main (String[] args) throws Exception {
	Thread t = new Thread(new TestOne1());
	t.start();
	System.out.print("Started");
	t.join();
	System.out.print("Complete");
	}
	public void run() {
	 for (int i= 0; i< 4; i++) {
	 System.out.print(i);
	 }
	 }
	 }