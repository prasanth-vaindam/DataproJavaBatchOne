package D006;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a = 10, b = 30;
		double price = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		String name = sc.next();
		sc.nextLine();
		System.out.println("Hello "+ name);
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
		System.out.println("Enter Price of the item: ");
		price = sc.nextDouble();
		System.out.println("The Price of the Item is: "+ price);
		

		
		

	}

}
