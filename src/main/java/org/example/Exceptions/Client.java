package org.example.Exceptions;

import java.sql.SQLException;

public class Client {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Student st1=new Student();
        try {
            st1.findStudentbyRollNo(50);
        }
        catch (ClassNotFoundException ex1){
            System.out.println("I am Handling Class Not Found Exception ");
            // exception handling will be done as per business use case .
            //throw  new ClassNotFoundException();
        }
        catch (OddNumberException ex2){
            System.out.println("I am Handling Odd Number Exception ");
        }
        catch (EvenNumberException ex3){
            System.out.println("I am Handling Even Number Exception ");
        }
        finally{
            System.out.println("I am inside finally block, will execute irrespective of what happens");
        }




        try{
            st1.doSomething(20);
        }
        catch (SQLException sql){
            System.out.println("I am doing some work Around");
            throw new SQLException();
        }
        //st1.findStudentbyRollNo(34);

        //st1.doShit(10);
    }
}

/*
Types of Exceptions:
    Runtime Exceptions  ---> unchecked Exceptions.
        EX: Arithemetic Exception , IndexOutOfBoundException , NullPointerException. etc..

    Complime-time Exceptions---> checked Exceptions.
        EX: IOException , SQLException, ClassNotFoundException, etc...


       It is upto developer to check runtime exceptions / unchecked exceptions.
       Complier say to handle checked exceptions as


                                         Exception
                                        /         \
                                       /           \
        (Compile Time)  checkedExceptions         UnCheckedExceptions (Runtime )


        Only UncheckedExceptions (Run time Exceptions)  get inherited from RunTimeExceptions class
        and Checked Exceptions(compile time) are inherited by Exception class.


        Ideally , your code shouldn't have any runtime exceptions.


        How to Handle exceptions?
            try , catch , finally block.


        finally is something which will run irrespective of what happens.
        Even if the throw the unhandled exception also finally will execute.


 */