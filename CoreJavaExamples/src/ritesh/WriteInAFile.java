package ritesh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  File f=new File("mytext1.txt");
   
	try {
		if(!f.exists())
		f.createNewFile();
		if(f.exists())
		{
		FileOutputStream fos=new FileOutputStream(f);
		String str="My name is Ritesh, I am searching a JOB";
		fos.write(str.getBytes());
		fos.flush();
		fos.close();
		System.out.println("Data has been written....");
		}
		else
			System.out.println("Data has NOT been written in the File...");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
  
	}

}
