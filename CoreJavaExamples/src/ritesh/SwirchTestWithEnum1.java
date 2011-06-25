package ritesh;

public class SwirchTestWithEnum1 {
	public enum Dogs {collie, harrier, shepherd};
	public static void main(String [] args) {
	Dogs myDog = Dogs.shepherd;
	switch (myDog) {
	case collie:
	System.out.print(" collie ");
	case harrier:
	System.out.print("harrier ");
	default:
		System.out.print("retriever ");
	}
	}
	}
 
