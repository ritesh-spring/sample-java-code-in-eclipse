package ritesh;

import java.io.*;

public class ObjDeserialization {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
	
		try {
    FileInputStream fis=new FileInputStream("storeobj");
     ObjectInputStream ois=new ObjectInputStream(fis);
     EmployeeSerialize es;
     while ((es=(EmployeeSerialize)ois.readObject())!=null) {
		es.display();
		System.exit(0);
	}
		ois.close();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("File Exception...");
		}
	}

}
