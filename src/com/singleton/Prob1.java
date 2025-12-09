package com.singleton;

class Student {
    private static Student obj;   // holds single object

    private Student() {           // private constructor
        System.out.println("Object created");
    }

    public static Student getObject() {
        if (obj == null) {
            obj = new Student();  // create only once
        }
        return obj;
    }
}

public class Prob1 {
    public static void main(String[] args) {
    	Student s1 = Student.getObject();
        Student s2 = Student.getObject();
        Student s3 = Student.getObject();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);  // all same object
    }
}

