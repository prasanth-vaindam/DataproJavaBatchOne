package D007;

import java.util.Scanner;

public class CheckEligibityToVote2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Do you have voter ID?");
		boolean has_id = sc.nextBoolean();

		if (age >= 18 && has_id) {
			System.out.println("You are eligble to vote");
		} else {
			System.out.println("Wait for " + (18 - age) + "Years to vote!");
		}

	}

}
