package com.example.inventory;

public class InventoryEvent {
    private final String productId;
    private final int quantity;

    public InventoryEvent(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}

