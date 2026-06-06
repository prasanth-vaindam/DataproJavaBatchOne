
/* 
 * Author : Prasanth Vaindam
 * Date : 06-June-2026
 * This is a Program to demonstrate Variables and primitive Data types in Java

  
 */
public class Variables {
	
	
    public static void main(String[] args) {
        byte age = 17;
        short marks = 500;
        char grade = 'A';
        int villagePopulation = 10000;
        long countryPopulation = 900000000L;
        float gravitionalConstant = 9.8f;
        final double PI = 3.1459456;
        boolean isRaining = false;
        final byte MINUTES_PER_HOUR = 60; // this is a constant 
        
        var number = 12;
//        number = 9.878;
        var price = 99.99;
        price = 9;
        
        
        age = 19;
        
//        age = "Apple"; // you can't change the type
//        PI = 3.2;  // this is constant can't be changed 
//        MINUTES_PER_HOUR = 67;
        
        System.out.println("age of the student " + age);
        System.out.println("Grade of the student " + grade);
        System.out.println("Marks of the student " + marks);
        System.out.println("villagePopulation is "+ villagePopulation);
        System.out.println("countryPopulation is "+ countryPopulation);
        System.out.println("gravitionalConstant is "+ gravitionalConstant);
        System.out.println("PI = "+PI);
        System.out.println("Is it raining Outside "+ isRaining);
        


    }
}
