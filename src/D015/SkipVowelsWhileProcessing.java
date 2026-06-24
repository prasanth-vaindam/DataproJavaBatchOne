package D015;

public class SkipVowelsWhileProcessing {
	public static void main(String[] args) {
		String word = "Education";

		for (int i = 0; i < word.length(); i++) {

			char ch = Character.toLowerCase(word.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			}

			System.out.print(ch + " ");
		}
	}
}
