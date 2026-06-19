package D011;

import java.util.Scanner;

public class Program07GuessThePassword {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String password = "";
	
	while(!password.equals("java1234")) {
		System.out.println("Enter password: ");
		password = sc.next();		
	}
	
}
}
