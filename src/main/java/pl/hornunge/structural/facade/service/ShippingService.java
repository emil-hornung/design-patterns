package pl.hornunge.structural.facade.service;

import pl.hornunge.structural.facade.product.Product;

public class ShippingService {
    public void ship(Product product){
        System.out.println("Sending request to ship: " + product);
    }
}
