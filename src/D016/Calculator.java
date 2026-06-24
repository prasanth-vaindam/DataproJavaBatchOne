package D016;

class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    	
    	Calculator c = new Calculator();
    	System.out.println(c.add(1, 10));
        System.out.println(Calculator.add(10, 20));
    }
}