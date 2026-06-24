package D014;

public class SearchKey {
	public static void main(String[] args) {
		int numbers[] = { 21, 22, 24, 23, 25 };
		int key = 250;
		boolean notFound = true;
		for(int i=0; i<numbers.length;i++) {
			if(key == numbers[i])
			{
				notFound = false;
				System.out.println("found at index: "+i);
			}
		}
		if(notFound) {
			System.out.println("Key Not Found");
		}
	}
}
