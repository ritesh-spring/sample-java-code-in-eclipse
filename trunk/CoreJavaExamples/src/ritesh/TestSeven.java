package ritesh;

public class TestSeven extends Thread {
	 private static int x;
	static public synchronized void doThings() {
	 int current = x;
	 current++;
	 x = current;
	 System.out.println(x);
	 }
	 public void run() {
	 doThings();
	 }
	 public static void main(String[] arg){
		 TestSeven ts=new TestSeven();
		 ts.start();
		 TestSeven ts2=new TestSeven();
		 ts2.start();
		 TestSeven ts3=new TestSeven();
		 ts3.start();
		 TestSeven ts4=new  TestSeven();
		 ts4.start();
		 TestSeven ts5=new TestSeven();
		 ts5.start();
		 TestSeven.doThings();
	 }
	 }