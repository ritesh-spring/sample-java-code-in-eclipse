package ritesh;

class ExceptionA {
	public void process() {
		System.out.print("A,");
	}
}

class ExceptionnTest extends ExceptionA {
	public void process()  {
		super.process();
		System.out.print("B,");
		//throw new Exception();
	}

	public static void main(String[] args) {
		try {
			new ExceptionnTest().process();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
