package ritesh;

	 public class B extends A {
	 public static void main(String []arg)
	 {
	 A a1 =new A();
	 System.out.println(a1);
	 System.out.println(A.getInstanceCount());
	 //A a2 =new A();
	 System.out.println(A.getInstanceCount());
	 //A a3 =new A();
	 System.out.println(new A().getInstanceCount());
	  }
	  }