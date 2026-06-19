package D013;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 1234;

		int reverse = 0;
		for (; n > 0; n /= 10) {
			reverse = reverse * 10 + n % 10;
		}
		System.out.println(reverse);
	}

}
