package ritesh;

import java.text.NumberFormat;
import java.util.Locale;

public class TestNumberFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input = 314159.26;
		NumberFormat nf= NumberFormat.getInstance(Locale.ITALIAN);
		 String b;
		  b = nf.format(input);
		System.out.println(b);
	}

}
