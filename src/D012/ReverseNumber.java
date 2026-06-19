package D012;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int reverse=0;
		int temp = number;
		int digit = 0;
		while(number>0) {
			digit = number %10;
			reverse = reverse *10 + digit;
			number/=10;
		}
		System.out.println("orginal number is: "+temp);
		System.out.println("reversed number is: "+ reverse);
		
	}
}
