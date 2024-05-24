package org.example.ClassAndObject;

public class Student {
    int rollNumber;
    String name;
    String univerCity;
    int batch_id;
    double psp;

    void attendClass(){
        System.out.println("Student is attending the class");
    }

    void chnageBatch(int new_batch_id){
        batch_id=new_batch_id;
    }
    void pauseCourse(){
        System.out.println("Student is  requesting for pausing the class");
    }
}
