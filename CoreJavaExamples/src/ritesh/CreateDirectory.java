package ritesh;

import java.io.File;

public class CreateDirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub
	try {
		String aDirectory="test";
		String manyDirectory="d1/d2/d3";
        boolean sucess=(new File(aDirectory)).mkdir();
        if(sucess)
        	System.out.println("Directory "+aDirectory+" Created.....");
        
        sucess=(new File(manyDirectory)).mkdirs();
        if(sucess)
        	System.out.println("Many Directory "+manyDirectory+" Created.....");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

	}

}
