package D017;

class Student {

    // Static variable
    static int totalStudents = 0;

    // Instance variable
    String name;

    Student(String name) {
        this.name = name;
        totalStudents++;
    }

    void display() {

        // Local variable
        int marks = 100;

        System.out.println("----------------------------");
        System.out.println("Local Variable (marks)      : " + marks);
        System.out.println("Instance Variable (name)    : " + name);
        System.out.println("Static Variable (students)  : " + totalStudents);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        s1.display();
        

        Student s2 = new Student("Priya");
        s2.display();

        s1.display();
    }
}
