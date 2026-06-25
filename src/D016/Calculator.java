package D016;

class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
    
    static void display() {
    	System.out.println("Welcome we are in display method\n");
    }
    
    static void display(String name) {
    	System.out.println("Welcome "+ name);
    }
    
    static int getNumber() {
    	return (int) Math.floor(Math.random() * 101);
    }

    public static void main(String[] args) {
    	
    	display(); // no parameter no return type (void)
    	
    	display("Hari");
    	int sum = Calculator.add(10, 20);
    	int randomNumber = getNumber();
       	System.out.println(randomNumber);
    	
    }
}