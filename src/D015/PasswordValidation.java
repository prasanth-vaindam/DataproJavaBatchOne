package D015;

public class PasswordValidation {

	public static void main(String[] args) {
		String password = "Java 123";

		for(int i=0;i<password.length();i++){

		    char ch = password.charAt(i);

		    if(ch == ' '){
		        continue;
		    }

		    System.out.println(ch);
		}

	}

}
