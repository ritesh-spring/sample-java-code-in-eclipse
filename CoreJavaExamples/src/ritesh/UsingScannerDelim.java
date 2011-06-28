package ritesh;

import java.util.Scanner;

public class UsingScannerDelim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String csv = "5,Sue,5,true,3";
		 Scanner scanner = new Scanner( csv);
		 scanner.useDelimiter(",");
		 int age = Integer.parseInt(scanner.next());
		 System.out.println(age);
	}

}
