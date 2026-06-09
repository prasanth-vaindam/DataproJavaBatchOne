
public class TCDataLossExample {

	public static void main(String[] args) {
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		char ch = 'A';
		i = ch;
		
		long population = 100000L;
		int peopleCount = (int)population;
		System.out.println(peopleCount);
		
		float g = 9.86f;
		double db = g;
		System.out.println("----->"+db);
		int G = (int)g;
		System.out.println("====>"+G);
		
		byte by = (byte)130;
		System.out.println(by);
	}

}
