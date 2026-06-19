package D013;

import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = "java123";

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Password: ");
            String input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("Login Successful");
                break;
            }

            System.out.println("Wrong Password");
        }
    }
}