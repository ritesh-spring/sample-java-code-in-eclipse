package ritesh;

public class ClassATest {

	/**
	 * @param args
	 */
	public String doit(int x, int y) {
		 return "a";
		 }
		
		 public String doit(int... vals) {
		 return "b";
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassATest a1=new ClassATest();
		System.out.println(a1.doit(4,6));
		System.out.println(a1.doit(4));
	}

}
