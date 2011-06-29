package ritesh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class ObjSerialization {
	
	public static void main(String[] arg)throws IOException
	{
	File f=new File("storeobj");
	if(!f.exists())
		f.createNewFile();
	
	FileOutputStream fos=new FileOutputStream(f);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("How many objects you want to Serialize:");
	int n=Integer.parseInt(br.readLine());
	if(n==0)
	{
		//System.out.println("You have given an Invalid Value:"+n);
	System.err.println("You have given Invalid input:"+n);
	System.exit(0);
	
	}
	int m=0; 
	for(m=0;m<n;m++)
	{
		EmployeeSerialize e=EmployeeSerialize.getData();
		oos.writeObject(e);
	}
		oos.close();
	
}
}
   