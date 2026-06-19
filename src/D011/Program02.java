package D011;
// multiples of 5, even numbers
public class Program02 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum of first 10 numbers is: "+sum );
	}

}
