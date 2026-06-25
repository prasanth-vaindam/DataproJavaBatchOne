package D016;

public class Display {

	static void display()
	{
		System.out.println("Hello students welcome to class");
	}
	String name;
	void greet()
	{
		System.out.println("Welcome" + name);
	}
	public static void main(String[] args) {
		System.out.println("Main");
		
		Display.display();
		display();
		
		Display objR = new Display();
		Display objH = new Display();
//		
//		
//		objR.name = "Rupesh";
//		objR.greet();
//		
//		objH.name = "Harshit";
//		objH.greet();

	}

}
