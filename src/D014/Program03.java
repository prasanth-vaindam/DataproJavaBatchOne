package D014;

public class Program03 {
	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 5, 50 };
		int key = 10;
		int smallest = numbers[0];
		int evenCount=0, oCOunt=0;
		boolean notFound = true;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			if(numbers[i]%2==0) {
				evenCount++;
			}else {
				oCOunt++;				
			}
			if(key == numbers[i]) {
				System.out.println("found at index "+ i);
				notFound = false;
			}
		}
		if(notFound) {
			System.out.println("key not found");
		}
		System.out.println("smallest "+smallest);
		System.out.println("even count: "+evenCount);
		System.out.println("Odd COunt: "+oCOunt);
		
	}

}
