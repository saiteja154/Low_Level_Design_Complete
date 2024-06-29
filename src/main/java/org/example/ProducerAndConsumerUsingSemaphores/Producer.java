package org.example.ProducerAndConsumerUsingSemaphores;


import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;

    private Semaphore producerSemaphore;

    private Semaphore consumerSemaphore;
    Producer(Store st,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.store = st;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }
    @Override
    public void run() {
        while(true) {
            //100 threads/producers are here, current size is 10 and maxSize is 80


            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consumerSemaphore.release();
        }
    }
}