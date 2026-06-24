package D015;

public class ForEachDemo {
	public static void main(String[] args) {
		String names[] = {"Anil","Bhanu","Gopal","Manoj","Akhil"};
		
		String key = "Anil";
		boolean found = false;
		int numbers[] = {1,33,-1,44,55,-2,39};
		
		for(int number:numbers) {
			System.out.println(number);
		}
		for(String name:names) {
			if(name.equals(key)) {
				System.out.println("Found "+key+" in the given list!");
				found = true;
				break;
			}
//			System.out.println(name.toUpperCase());
		}
		
		if(!found) {
			System.out.println("Key value not found");
		}
	}
}
