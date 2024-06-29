package org.example.ProducerAndConsumerUsingSemaphores;


import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize; //no of shelf in the store, isin't fixed?
    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public synchronized void removeItem() {
        //3 threads are running the remove() method at the same time
        //[2,3] -> []
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove(this.items.size() - 1);
    }
}