package ritesh;

public class Hello {
	 String title;
	 int value;
	 public Hello() {
	 title += " World";
	 }
	 public Hello(int value) {
	 this.value = value;
	 title = "Hello";
	 //Hello();
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Hello c = new Hello(5);
		 System.out.println(c.title);
		 System.out.println(c.value);
	}

}
