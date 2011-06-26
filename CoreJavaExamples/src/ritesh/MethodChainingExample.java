package ritesh;

public class MethodChainingExample {
	 public String methodA() {
	 ClassBB ClassBB = new ClassBB();
	 String str=ClassBB.getValue();
	 return str;
	 }
	 public static void main(String arg[]){
	 MethodChainingExample mce=new MethodChainingExample();
	String str= mce.methodA();
	 System.out.println(str);
	 }
	 }

	 class ClassBB {
	 public ClassCC classC=new ClassCC();

	 public String getValue() {
	 return classC.getValue();
	 }
	 }

	 class ClassCC {
	 private String value;

	 public String getValue() {
	 value =  "ClassBB";
	 return value;
	 }
	 }