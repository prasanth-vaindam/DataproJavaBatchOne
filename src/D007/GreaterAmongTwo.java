package D007;

import java.util.Scanner;

public class GreaterAmongTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int first_num = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int second_num = sc.nextInt();
		
		if(first_num > second_num) {
			System.out.println(first_num + " is bigger");
		}
		else if(first_num == second_num) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println(second_num + " is bigger");
		}
		
		

	}

}
