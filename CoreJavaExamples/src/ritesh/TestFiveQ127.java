package ritesh;

public class TestFiveQ127 {
		private int x;
		public void foo() {
			synchronized(this){
		int current = x;
		x = current + 1;
		System.out.print(x + ", ");
		}
		}
		public void go() {
		for(int i=0;i<5;i++) {
		new Thread() {
		 public void run() {
		 foo();
		 
		 } }.start();
		 }}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestFiveQ127 tf=new TestFiveQ127();	 
	tf.go();
	}

}
