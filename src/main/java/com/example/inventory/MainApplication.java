package com.example.inventory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        BlockingQueue<InventoryEvent> queue = new LinkedBlockingQueue<>();

        EventProducer producer = new EventProducer(queue);
        AlertConsumer consumer = new AlertConsumer(queue);

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        producer.publishEvent(new InventoryEvent("ITEM-101", 5));
        producer.publishEvent(new InventoryEvent("ITEM-102", 25));
    }
}
