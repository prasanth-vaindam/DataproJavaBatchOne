package D017;

public class StudentI {

    String name;      // Instance variable

    void display() {
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {

    	StudentI s1 = new StudentI();
    	StudentI s2 = new StudentI();

        s1.name = "Rahul";
        s2.name = "Priya";

        s1.display();
        s2.display();
        
        //Each object gets its own copy of the instance variable.
        //Changing One Object Doesn't Affect Another
//        System.out.println("After changing s1...");
//
//        s1.name = "Ramesh";
//
//        s1.display();
//        s2.display();
    }
}