package ritesh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class NoOfLinesInAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
try {
	System.out.println("This code Counts the no of Lines in a File....");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the file name with extensions....");
	String fileName=br.readLine();
	File f=new File(fileName);
	if(f.exists())
	{
		LineNumberReader lnr=new LineNumberReader(new FileReader(f));
		int count=0;
		while(lnr.readLine()!=null)
			count++;
		System.out.println("Total no of Lines="+count);
		lnr.close();
	}
	else
		System.out.println("File does not exist...	");
	
} catch (Exception e) {
	// TODO: handle exception
	
	e.printStackTrace();
}		// TODO Auto-generated method stub

	}

}
