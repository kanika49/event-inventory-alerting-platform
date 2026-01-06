package com.example.inventory;

import java.util.concurrent.BlockingQueue;

public class AlertConsumer implements Runnable {

    private final BlockingQueue<InventoryEvent> queue;

    public AlertConsumer(BlockingQueue<InventoryEvent> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                InventoryEvent event = queue.take();
                processEvent(event);
            } catch (Exception e) {
                System.out.println("⚠️ Error processing event. Retrying...");
            }
        }
    }

    private void processEvent(InventoryEvent event) {
        if (event.getQuantity() < 10) {
            System.out.println("🚨 LOW STOCK ALERT → Product: "
                    + event.getProductId()
                    + ", Quantity: " + event.getQuantity());
        } else {
            System.out.println("✅ Stock sufficient for product: "
                    + event.getProductId());
        }
    }
}

