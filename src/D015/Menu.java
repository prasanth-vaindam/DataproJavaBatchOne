package D015;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if(choice == 3){
                System.out.println("Thank You");
                break;
            }

            System.out.println("Processing...");
        }
        
        sc.close();
    }
}