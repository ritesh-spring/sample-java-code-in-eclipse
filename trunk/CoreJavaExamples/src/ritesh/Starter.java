package ritesh;

public class Starter extends Thread {
	 private int x= 2;
	 public static void main(String[] args) throws Exception {
	 new Starter().makeItSo();
	 System.out.println("My name is Mr. X");
	 }
	 public Starter() {
	 x=5;
	 start();
	 }
	 public void makeItSo() throws Exception {
	 join();
	 x=x- 1;
	 System.out.println("My name is Mr. Y");
	 System.out.println(x);
	 }
	 public void run() { x *= 2; }
}