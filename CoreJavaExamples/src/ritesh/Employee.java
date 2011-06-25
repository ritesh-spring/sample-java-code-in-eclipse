package ritesh;

interface Data { public void load(); }
abstract class Info { public abstract void load(); }

public class Employee extends Info implements Data  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public void load() { System.out.println("My name is ritesh"); }
		Employee e=new Employee();
		e.load();
	} 

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("My name is ritesh");
		
	}

} 
