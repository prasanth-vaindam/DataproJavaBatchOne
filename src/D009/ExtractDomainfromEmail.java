package D009;

public class ExtractDomainfromEmail {

	public static void main(String[] args) {
		String email = "student@gmail.com";
		
		System.out.println(email.substring(email.indexOf('@')+1));
	}

}
