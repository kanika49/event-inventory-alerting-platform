package com.example.inventory;

import java.util.concurrent.BlockingQueue;

public class EventProducer {

    private final BlockingQueue<InventoryEvent> queue;

    public EventProducer(BlockingQueue<InventoryEvent> queue) {
        this.queue = queue;
    }

    public void publishEvent(InventoryEvent event) throws InterruptedException {
        queue.put(event);
        System.out.println("📦 Inventory event published for product: "
                + event.getProductId());
    }
}

