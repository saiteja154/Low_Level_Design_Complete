package org.example.threads;

public class PrintNumber implements Runnable{
    int number;

    PrintNumber(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("I am printing number "+number);
        System.out.println("Name of the Current Thread Exceution is : "+Thread.currentThread().getName());

    }
}
