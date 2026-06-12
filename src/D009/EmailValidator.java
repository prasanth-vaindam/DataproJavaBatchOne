package D009;

import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        if(email.contains("@") && (email.endsWith(".com")|| email.endsWith(".co.in"))) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
        sc.close();
    }
}