package D013;

import java.util.Scanner;

public class Program04SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count =0;
		while(number >0) {
			count++;
			number = number/10;
		}
		System.out.println("number of digits : "+count);

	}

}
