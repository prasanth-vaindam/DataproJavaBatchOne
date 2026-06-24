package D015;

import java.util.Scanner;

public class ExitMenu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input;
	while(true) {
		System.out.println("1.Add\n2.Delete\n3.Exit");
		input = sc.nextInt();
		if(input==1 || input == 2) {
			System.out.println("Processing....");
		}else {
			System.out.println("Thank You");
			break;
			
		}
	}
}
}
