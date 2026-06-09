package D005;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 10, b = 3;
		double x = 10, y = 3;
		
		System.out.println(a+b);
		System.out.println(a/b);
		System.out.println("reminder when 10 /2 is: "+ 10%2); // 0
		System.out.println(x/y);
		
		// Increment Operator
		a++; // a = a + 1;
		System.out.println(a);
		
		int peoplecount = 0;
		// 3 people entered the room
		peoplecount++;
		peoplecount++;
		peoplecount++;
		System.out.println("After 3 people entering the strength in the hall is: "+peoplecount);
		// 1 person left the room
		peoplecount--;
		System.out.println("Present People Count is "+peoplecount);
		
		int count = 10;
		
		System.out.println(count--); //10
		System.out.println(count); //9
		
		
		

	}

}
