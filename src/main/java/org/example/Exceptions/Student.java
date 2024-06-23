package org.example.Exceptions;

import java.sql.SQLException;

public class Student {


    // in this method we didnot handled the Exceptions we throw it to called method.
    public int findStudentbyRollNo(int rollNo ) throws ClassNotFoundException, OddNumberException {
        if(rollNo<30){
            throw new ClassNotFoundException();
        }
        else  if(rollNo%2==1){
            throw new OddNumberException();
        }
        else if (rollNo%2==0) {
            throw new EvenNumberException();
        }

        int a = 10, b = 5;
        if(b != 0) {
            int temp = a / b;
        }

        return 1;
        //return  1/0
    }


    // in this method we are handling the Exceptions .
    public int doSomething(int rollNo ) throws SQLException  {
        try {
            if (rollNo < 30) {
                throw new ClassNotFoundException();
            } else if (rollNo % 2 == 1) {
                throw new OddNumberException();
            } else if(rollNo%2==0){
                throw new EvenNumberException();
            }
            else{
                throw new SQLException();
            }
        }
        catch (ClassNotFoundException exp1){
            System.out.println("I am Handling Class Not Found Exception ");
            System.out.println("there is an error at"+exp1.getStackTrace().toString());
        }
        catch (OddNumberException exp2){
            System.out.println("I am Handling Odd Number Exception ");
        }
        catch (EvenNumberException exp3){
            System.out.println("I am Handling Even Number Exception ");
        }

         return  1;

    }



    public void doShit(int x){
        doShit( x);
    }
}
