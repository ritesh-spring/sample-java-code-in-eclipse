package ritesh;

import java.io.IOException;

class StaticA {
	 void process() throws IOException { throw new IOException(); }
	 }
 public class StaticB extends StaticA {
	 void process()throws RuntimeException { System.out.println("B "); }
	 public static void main(String[] args)throws Exception {
	 StaticA a=new StaticB();
	 a.process();
	 }
	 }