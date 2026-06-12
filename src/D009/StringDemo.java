package D009;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Original Name      : " + name);
        System.out.println("Length             : " + name.length());
        System.out.println("Upper Case         : " + name.toUpperCase());
        System.out.println("Lower Case         : " + name.toLowerCase());
        System.out.println("First Character    : " + name.charAt(0));
        System.out.println("Contains 'a'       : " + name.contains("a"));
        sc.close();
    }
}
