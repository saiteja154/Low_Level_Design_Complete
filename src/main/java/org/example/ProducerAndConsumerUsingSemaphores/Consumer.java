package org.example.ProducerAndConsumerUsingSemaphores;


import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;

    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Consumer(Store st,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.store = st;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }
    @Override
    public void run() {
        while(true) {
            //3 consumers have come at the same time but only 2 items are present
            //10 consumers are here and current size is 5


                //only 1 of them will come here at a time

            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            producerSemaphore.release();
        }
    }
}