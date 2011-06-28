package ritesh;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class RandAcessFile {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the File Name with extension..");
   String fName=br.readLine();
   File f=new File(fName);
    if(!f.exists())
    {
    	System.out.println(fName+"  File entered does not Exist");
    	System.exit(0);
    }

    try {
		RandomAccessFile raf=new RandomAccessFile(f, "rw");
		raf.seek(f.length());
		raf.writeBytes("");
		raf.writeBytes("\n My name is Mr.Phhhhhh");
		raf.close();
		System.out.println("Data Written  to File...");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    
	}
}
