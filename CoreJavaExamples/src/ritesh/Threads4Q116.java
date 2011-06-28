package ritesh;


public class Threads4Q116 {
	Runnable r;
	public static void main (String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Hi am running");
			}	};
			Thread th=new Thread(r);
			th.start();
	}
}