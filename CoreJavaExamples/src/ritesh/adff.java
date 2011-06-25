package ritesh;

class ParseDemo {
	static float f;
	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			f = 0;
			//System.out.println(nfe.printStackTrce());
		} 
		finally {
			System.out.println(f);
			
		}
	}

	public static void main(String[] args) {
	 parse("invalid");
	 }
}