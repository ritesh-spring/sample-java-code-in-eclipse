package ritesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Date;

public class EmployeeSerialize implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9114617708614784220L;
	int id;
	String name;
	float salary;
	Date doj;

	public EmployeeSerialize(int i, String nm, float sal, Date d) {
		// TODO Auto-generated constructor stub
		id = i;
		name = nm;
		salary = sal;
		doj = d;
	}
void display(){
	System.out.println("id="+id+",name="+name+",salary="+salary+",doj="+doj);
}
 static EmployeeSerialize getData()throws IOException
 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter Employee ID:");
	 int id=Integer.parseInt(br.readLine());
	 System.out.println("Enter Employees's Salary:");
	 float sal=Float.parseFloat(br.readLine());
	 System.out.println("Enter Employee Name:");
	 String nm=br.readLine();
	 //System.out.println("Enter Date of Joining:");
	 Date dj=new Date();
	 EmployeeSerialize e=new EmployeeSerialize(id, nm, sal, dj);
	 return e;
	 
 }
}
