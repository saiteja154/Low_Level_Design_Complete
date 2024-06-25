package org.example.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//sorting by tens place digit.
class sortByTensPlace implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        int a=o1%10;
        int b=o2%10;
        return a-b;
    }

}

//sorting by String in descending order.
class sortByString implements Comparator<String>{

    @Override
    public int compare(String o1, String  o2) {
      return o2.compareTo(o1);
    }

}

//sorting by Length of a String in descending order.
class sortByLengthofString implements Comparator<String>{

    @Override
    public int compare(String o1, String  o2) {
        return o2.length()-o1.length();
    }

}


//Sort the Students based on there Age in ascending order..
class StudentSortByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.age-o2.age;
    }
}
public class Client {
    public static void main(String args[]){


        List<Integer> list1=new ArrayList<>();
        list1.add(18);
        list1.add(25);
        list1.add(34);
        list1.add(55);
        list1.add(87);
        list1.add(32);
        list1.add(49);
        list1.add(93);
        Collections.sort(list1,new sortByTensPlace());
        System.out.println(list1);
        System.out.println();

        List<String> list2=new ArrayList<>();
        list2.add("abhi");
        list2.add("vijay");
        list2.add("saikiran");
        list2.add("bhanuprasad");
        list2.add("pavankalyan");
        list2.add("venky");
        list2.add("sai");
        list2.add("vikram");
        System.out.println(list2);

        Collections.sort(list2,new sortByString());

        /*
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2);
            }
        });

        System.out.println(list2);
         */

        System.out.println(list2);

        System.out.println();



        Collections.sort(list2,new sortByLengthofString());
        System.out.println(list2);
        System.out.println();



        // Sort the Student by age.
        List<Student> students=new ArrayList<>();
        students.add(new Student(18,"Sai"));
        students.add(new Student(32,"Teja"));
        students.add(new Student(24,"Umang"));
        students.add(new Student(16,"Vikas"));
        Collections.sort(students,new StudentSortByAge());
        for(Student s:students){
            System.out.println(s.toString());
        }


    }
}
