package D008;

/**
 * 
 * Math.random() generates a random decimal number between 0.0 and 1.0.
 * 
 * 0.0 <= Math.random() < 1.0
 * 0.123456 * 101 = 12.46 0.987654 * 101 = 99.75
 * 0.555555 * 101 = 56.11
 * 
 */
public class RandDemo {

	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 91);
		System.out.println("Random number between 1 and 90: " + randomNum);

	}

}
