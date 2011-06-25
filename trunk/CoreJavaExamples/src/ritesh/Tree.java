package ritesh;

class Plant {
	private String name;

	public Plant(String name) {
		this.name = name;
		}
	public Plant() {
		this("Ritesh");
		
		}

	public String getName() {
		return name;
	}
}

public class Tree extends Plant {
	
 Tree(String nm)
{
super(nm); 
}
 Tree() {}
	public void growFruit() {
	}

	public void dropLeaves() {
	}
	public static void main(String agf[]) {
	Tree t=new Tree();
	Tree t1=new Tree("Rashmi");
	System.out.println(t.getName());
	System.out.println(t1.getName());
}
}