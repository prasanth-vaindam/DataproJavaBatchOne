package D010;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                special++;
        }

        System.out.println("Uppercase Letters : " + upper);
        System.out.println("Lowercase Letters : " + lower);
        System.out.println("Digits            : " + digit);
        System.out.println("Special Characters: " + special);

        if (pwd.length() >= 8 &&
            upper > 0 &&
            lower > 0 &&
            digit > 0 &&
            special > 0) {

            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }

        sc.close();
    }
}
