package ritesh;

public class Thread4 { //Runnable r;
	public static void main (String[] args) {
	Thread4 th=new Thread4();
	th.go();
	}
	
	public void go() {
	Runnable r = new Runnable() {
	public void run() {
	System.out.println("foo");
	}};
	 Thread t = new Thread(r);
	 t.start(); 
	//Thread t2= new Thread();
	//t2.start();
	 }
	}