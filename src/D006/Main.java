package D006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println(age);
		System.out.println(name);
		sc.close();
	}

}
