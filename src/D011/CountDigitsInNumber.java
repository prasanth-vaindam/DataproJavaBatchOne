package D011;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		int n = 1;
		int count = 0;
		while(n>0) {
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}

}
