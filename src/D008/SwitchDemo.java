package D008;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String grade = sc.next().toUpperCase();

		switch (grade) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Very Good");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
		case "E":
			System.out.println("Need to Improve");
			break;
		case "F":
			System.out.println("Try Again");
			break;
		default:
			System.out.println("Invalid Grade");

		}

		sc.close();
	}

}
