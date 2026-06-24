package D015;

public class breakDemo {
	public static void main(String[] args) {
		for(int i =1; i<=10;i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println("iteration :"+i);
		}
		System.out.println("outside loop");
	}
}
