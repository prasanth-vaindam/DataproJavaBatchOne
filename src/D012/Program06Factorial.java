package D012;

public class Program06Factorial {

	public static void main(String[] args) {
		int fact = 1, number = 5;
		
		while(number >=1) {
			fact = fact *number;
			number--;
		}
		System.out.println(fact);
		
		

	}

}
