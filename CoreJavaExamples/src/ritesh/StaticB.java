package ritesh;

import java.io.IOException;

class StaticA {
	 void process() throws Exception 
	 { 
		 try
		 {
			 
		 if(true)
			 System.out.println("Hi how r u STATIC A");
		 throw new IOException(); 
		 //System.out.println("Hi how r u");
		 }
		 catch(Throwable e)
		 {
			 System.out.println("My name is Ritesh");
		 }
	 }
	 }
 public class StaticB extends StaticA {
	 void process()throws Exception {
		 try {
		 throw new Exception();
		  }
		 catch(Throwable e)
		 {
			 System.out.println("Hi how are you? STATIC B");
		 }
		 }
	 public static void main(String[] args)throws Exception {
	 StaticA a=new StaticB();
	 a.process();
	 StaticA sa=new StaticA();
	 //System.out.println();
	 sa.process();
	 }
	 }