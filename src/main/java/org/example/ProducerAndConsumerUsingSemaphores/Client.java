package org.example.ProducerAndConsumerUsingSemaphores;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);

        Semaphore producerSemaphore=new Semaphore(5);
        Semaphore consumerSemaphore=new Semaphore(0);
        //8 producer
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store,producerSemaphore,consumerSemaphore));
        }
        //20 consumers
        for(int i = 1 ; i <=20; ++i){
            ex.execute(new Consumer(store,producerSemaphore,consumerSemaphore));
        }
    }
}