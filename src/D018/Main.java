package D018;



class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class Main {

    public static void main(String args[]) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 15;

        s1.study();

    }

}
