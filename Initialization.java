// comments
package chapter1;
public class Initialization {
 
	private String variable = new String("string");
	static private int num = 1;
	
	{
		System.out.println("Instance Initialization");
		variable = "initialized" ;
	}

	public Initialization () {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		Initialization init = new Initialization();
	}
}
