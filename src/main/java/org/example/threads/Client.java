package org.example.threads;

public class Client {

    static void doSomething(){
        System.out.println("I am Printing something in Thread : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){


        System.out.println("Name of the Current Thread Exceution is : "+Thread.currentThread().getName());
        //doSomething();


        // Thread 1 with one task.
        //task1.run(); this will print using main thread since we didn't created a thread object to pass the task to thread.
        PrintHelloWordUsingThread task1=new PrintHelloWordUsingThread();
        Thread t1=new Thread(task1);
        t1.start();

        //New Thread with another task.
        PrintNumber task2=new PrintNumber(30);
        Thread t2=new Thread(task2);
        t2.start();




        //Printing 1 to 100 using 100 different threads;
        for(int i=1;i<=100;i++){

            PrintingOneToHundredUsingHundredDifferentThreads task3=new PrintingOneToHundredUsingHundredDifferentThreads(i);
            Thread t3=new Thread(task3);
            t3.start();
        }
    }

}
