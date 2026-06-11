package D006;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println(name + "'s age is "+ age);
		sc.close();
	}
}
