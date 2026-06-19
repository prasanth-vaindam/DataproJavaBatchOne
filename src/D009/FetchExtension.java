package D009;

import java.util.Scanner;

public class FetchExtension {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fileName = s.next();
		
		int pos = fileName.indexOf('.');
		System.out.println(pos);
		System.out.println(fileName.substring(pos+1));

	}

}
