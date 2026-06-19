package D012;

import java.util.Scanner;

public class CountVowels {
public static void main(String[] args) {
	String s = "Ravi";
	Scanner sc = new Scanner(System.in);
	s = sc.next();
	int i =0, count=0;
	
	while(i<s.length())
	{
		char ch = s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
		i++;
	}
	
	
	System.out.println("Number of Vowels in the string are "+count);
	sc.close();
}
}
