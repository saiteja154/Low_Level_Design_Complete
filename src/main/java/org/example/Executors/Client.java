package org.example.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String ars[]){
       ExecutorService ex= Executors.newFixedThreadPool(10);

       // two types: FixedThredpool , CachedThreadPool.
        //ExecutorService ex= Executors.newCachedThreadPool();
         ExecutorService ex1= Executors.newFixedThreadPool(10);

        // newCachedThreadPool.
        for(int i=1;i<=100;i++){
            PrintNumber task=new PrintNumber(i);
            ex.submit(task);
        }
    }
}
