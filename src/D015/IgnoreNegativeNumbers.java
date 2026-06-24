package D015;

public class IgnoreNegativeNumbers {
	public static void main(String[] args) {
		int[] marks = { 80, 75, -1, 92, -1, 67 };

		for (int mark : marks) {

			if (mark < 0) {
				continue;
			}

			System.out.println(mark);
		}
	}
}
