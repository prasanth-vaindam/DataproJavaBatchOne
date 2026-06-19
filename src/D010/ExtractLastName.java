package D010;

public class ExtractLastName {

	public static void main(String[] args) {
		String email ="PrasanthVaindam@gmail.com";
		String name = "Prasanth Vaindam";
		String password = "abcd1234!";
		
		System.out.println("Learn Java Today".matches(".*Java.*"));  // true
		System.out.println("Java".matches(".*Java.*"));              // true
		System.out.println("I Love Java".matches(".*Java.*"));     // true
		
		
		System.out.println("Hello".matches(".*"));      // true
		"123".matches(".*");        // true
		"@#$".matches(".*");        // true
		"".matches(".*");           // true
		
		System.out.println("-->"+"@password".matches(".*[^a-zA-Z0-9].*"));
		
		boolean hasSpecialChar = password.matches(".*[^0-9A-Za-z].*");
		System.out.println(hasSpecialChar);
		boolean hasDigit = password.matches(".*[0-9].*");
		System.out.println(hasDigit);
	

	}

}
