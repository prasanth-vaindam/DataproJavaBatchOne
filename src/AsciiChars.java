
public class AsciiChars {

	public static void main(String[] args) {
		char ch = 65;
		
		System.out.println(ch);
		ch = 'Z';
		System.out.println(ch);
		
		for(int i=0;i<=255;i++) {
			System.out.printf("%d == %c\n", i,i);
		}

	}

}
