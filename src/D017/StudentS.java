package D017;

public class StudentS {

    static String college = "ABC College";
    String name;

    void display() {
        System.out.println(name + " studies at " + college);
    }

    public static void main(String[] args) {

    	StudentS s1 = new StudentS();
    	StudentS s2 = new StudentS();

        s1.name = "Rahul";
        s2.name = "Priya";

        s1.display();
        s2.display();

        System.out.println("\nChanging college...\n");

        StudentS.college = "XYZ College";

        s1.display();
        s2.display();
    }
}