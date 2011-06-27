package ritesh;

import java.io.IOException;

class MyOverridingClass {
	protected void ovMethod() throws Exception {

		try {
			System.out.println("I am in parent Class???");

			throw new IOException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I am in parent Class catch block");
		}
	}
}

public class ExceptionInOverriding extends MyOverridingClass {

	public void ovMethod() throws IOException {
		try {
			System.out.println("I am in Subclass Class");
			throw new IOException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I am in SubClass Catch Block");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		MyOverridingClass moc = new ExceptionInOverriding();
		moc.ovMethod();
		MyOverridingClass moc1=new MyOverridingClass();
		moc1.ovMethod();
	}

}
