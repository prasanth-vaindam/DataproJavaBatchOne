package D014;

public class StudentAges {

	public static void main(String[] args) {
		int numbers[] = { 21, 22, 24, 23, 25 };
		int sum = 0;
		int largest = numbers[0];
		int smallest = numbers[0];
		int evenCount =0, oddCount =0;
		int key = 25;
		for(int i=0; i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
			
		}
		
		System.out.println("smallest is: "+ smallest);
		System.out.println("largest is: "+ largest);
	}

}
