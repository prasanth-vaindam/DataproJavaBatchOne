package D010;

import java.util.Scanner;

public class PasswordStrength {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String password = sc.next();
	
//	String password = "12as9!";
	
	
	boolean hasNumber = password.matches(".*[0-9].*");
	System.out.println(hasNumber);
	boolean hasalpha = password.matches(".*[a-zA-Z].*");
	System.out.println(hasalpha);
	boolean hasSpecialChar = password.matches(".*[^0-9A-Za-z].*");
	System.out.println(hasSpecialChar);
	int length = password.length();
	
	if (length >=8 && hasalpha && hasNumber && hasSpecialChar) {
		System.out.println("Strong Password");
	}else {
		System.out.println("Weak Password");
	}
	sc.close();
}
}
