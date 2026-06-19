package D009;

public class FindSecondOcc {
	public static void main(String[] args) {
		String s = "bananana";
		int first = s.indexOf('a');
		int second = s.indexOf('a', first+1);
		int third = s.indexOf('a',second+1);
		System.out.println(third);
		System.out.println("First occurrence of 'a' in banana is: " + first);
		System.out.println("Second Occ"+s.indexOf('a', first+1));
		System.out.println("last Occ of a"+ s.lastIndexOf('a'));
	}
}
