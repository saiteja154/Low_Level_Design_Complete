package org.example.threads;

public class PrintingOneToHundredUsingHundredDifferentThreads implements Runnable{

    int number;

    PrintingOneToHundredUsingHundredDifferentThreads(int number){
        this.number=number;
    }
    @Override
    public void run() {

        System.out.println("Printing Number "+number+" Name of the Current Thread Exceution is : "
                +Thread.currentThread().getName());

    }
}
