package ritesh;

public class TestStringTokens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "a1b2c3";
		 String[] tokens = test.split("\\d"); 
		 for(String s: tokens) System.out.print(s +" ");
		// System.out.format("Pi is approximately %d"+Math.PI);
	}

}
