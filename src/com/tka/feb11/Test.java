 package com.tka.feb11;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student(); // Zero-parameter constructor
        s1.show(); 

        Student s2 = new Student(101, "Nikita", "nikita19@gmail.com");
        s2.show(); 

        Student s3 = new Student(102, "Pratiksha", "pratiksha19@gmail.com", 89899988977L);
        s3.show(); 
        
        s1.displayStudent();  // Calling the normal method, not the constructor
    }
}
