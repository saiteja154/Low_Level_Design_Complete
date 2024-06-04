package org.example.threads;

public class PrintHelloWordUsingThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing Hello World using: ((( "
                +Thread.currentThread().getName()+" ))) : Thread");
    }
}
