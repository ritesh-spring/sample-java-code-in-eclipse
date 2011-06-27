package ritesh;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("123456789");
		s.delete(0,3).replace( 1,3, "24").delete(4,6);
		System.out.println(s);
		String s1 = "123456789";
		s1 = (s1+"123").replace('1','2')+"89";
		System.out.println(s1);
		StringBuilder s3 = new StringBuilder("123456789");
		s3.delete(0,3).delete( 1 ,3).delete(2,5).insert(1, "24");
		System.out.println(s3);
		}
	}
