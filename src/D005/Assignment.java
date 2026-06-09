package D005;

public class Assignment {
	public static void main(String[] args) {
		int x = 5;
		
		x >>=3; // Right shift operator 
		System.out.println(x);
		
		x <<=3; // left shift operator 
		System.out.println(x);
		
		x ^=3;
		System.out.println(x);
		
		
		x |=3;
		System.out.println(x);
		
		x &= 3; // x = x & 3 --> 5 & 3
		System.out.println(x);
		
		
		
		x += 4; // x = x + 4;
		System.out.println(x); //9
		
		x -= 1; // x = x - 1;
		System.out.println(x); // 8
		
		
		
		
	}
}
