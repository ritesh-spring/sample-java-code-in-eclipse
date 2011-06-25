package ritesh;

class Person {
	 static String name1 = "No name";
	 public Person(String nm) { name1 = nm; }
	 }

	 class Employee1 extends Person {
	 String empID="0000";
	 public Employee1(String name,String id) { super(name); empID = id; }
	 }

	 public class EmployeeTest {
	 public static void main(String[] args) {
	 Employee1 e = new Employee1("Ritesh","4321");
	 System.out.println(e.empID+" "+e.name1);
	 }
	 }