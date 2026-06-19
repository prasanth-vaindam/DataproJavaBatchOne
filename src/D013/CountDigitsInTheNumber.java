package D013;

public class CountDigitsInTheNumber {
public static void main(String[] args) {
	int n = 5234;
	int count =0;
	for(;n>0;n/=10) {
		count++;
	}
	System.out.println(count);
}
}
