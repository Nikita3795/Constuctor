 package com.tka.feb11;

public class Student {

    int sid;
    String sname;
    String email;
    long phone;

    // Normal method (renamed to avoid constructor conflict)
    void displayStudent() {
        System.out.println("Method displayStudent()");
    }

    // Zero-parameter constructor
    Student() {
        System.out.println("Zero Parameter Constructor");
    }

    // Three-parameter constructor
    Student(int id, String sn, String em) {
        System.out.println("3 Parameter Constructor");
        sid = id;
        sname = sn;
        email = em;
    }

    // Four-parameter constructor
    Student(int id, String sn, String em, long ph) {
        System.out.println("4 Parameter Constructor");
        sid = id;
        sname = sn;
        email = em;
        phone = ph;
    }

    // Show method to display student details
    void show() {
        System.out.println("Student Details:");
        System.out.println("ID: " + sid);
        System.out.println("Name: " + sname);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + (phone != 0 ? phone : "Not Provided"));
    }
}
