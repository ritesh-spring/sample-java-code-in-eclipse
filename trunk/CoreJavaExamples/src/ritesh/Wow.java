package ritesh;

public class Wow {
	 public static void go(int n) {System.out.println("int"); }
	 public static void go(Short n) {System.out.println("SHORT");}
	 public static void go(Long n) {System.out.println(" LONG"); }
	 public static void main(String [] args) {
	 Short y= 6;
	 short z=7;
	 long w=5L;
	 go(y);
	 go(z);
	 go(w);
	 }
	 }