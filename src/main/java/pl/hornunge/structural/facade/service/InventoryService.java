package pl.hornunge.structural.facade.service;

import pl.hornunge.structural.facade.product.Product;

public class InventoryService {
    public boolean isAvailable(Product product) {
        System.out.println("Checking inventory for: " + product);
        return product.getId() <= 10;
    }
}
