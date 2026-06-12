package D009;

import java.util.Scanner;

public class UserNameGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        String userName =
                firstName.toLowerCase() +
                lastName.toLowerCase();

        System.out.println("Username: " + userName);
    }
}