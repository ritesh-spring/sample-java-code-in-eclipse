package ritesh;

import javax.print.DocFlavor.STRING;

public class Question43 {
	public void doit() {
		System.out.println("ABC VOID");
	}

	public String doit(String as) {
		return "a";
	}

	public double doit(int x) {
		return 1.0;
	}

	public static void main(String arg[]) {
		Question43 q3=new Question43();
		String a;
		System.out.println(a=(q3.doit("a")));
	}
}
