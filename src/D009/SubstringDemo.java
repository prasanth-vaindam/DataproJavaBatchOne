package D009;

import java.util.Scanner;

public class SubstringDemo {
	public static void main(String[] args) {
		String s = "Hello World";
		
		String result = s.substring(s.indexOf('W'));
		System.out.println(result);
	}
}
