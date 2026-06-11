package D007;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Grade: ");
		char grade = sc.next().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Very Good");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("First Division");
			break;
		case 'E':
			System.out.println("Second Division");
			break;
		default:
			System.out.println("Fail");
		}
		sc.close();
	}
}
