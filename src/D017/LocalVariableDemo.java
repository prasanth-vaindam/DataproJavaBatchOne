package D017;

class LocalVariableDemo {

    void display() {

        int number = 10;     // Local variable

        number++;

        System.out.println("Number = " + number);
    }

    public static void main(String[] args) {

        LocalVariableDemo obj = new LocalVariableDemo();

        obj.display();
        obj.display();
        obj.display();
    }
}