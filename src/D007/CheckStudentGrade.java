package D007;

import java.util.Scanner;

public class CheckStudentGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		if (marks>=90) {
			System.out.println("Excellent");			
		}
		else if(marks >=80) {
			System.out.println("Very Good");
		}
		else if(marks >=70) {
			System.out.println("Good");
		}
		else if(marks >=60) {
			System.out.println("First Division");
		}
		else if(marks >=50) {
			System.out.println("Second Division");
		}
		else if(marks >=35) {
			System.out.println("Third Division");
		}
		else{
			System.out.println("Need To Improve");
		}
		
		sc.close();
	}
}
