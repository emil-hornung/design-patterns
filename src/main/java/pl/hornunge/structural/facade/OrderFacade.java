package pl.hornunge.structural.facade;

import pl.hornunge.structural.facade.product.Product;
import pl.hornunge.structural.facade.service.InventoryService;
import pl.hornunge.structural.facade.service.PaymentService;
import pl.hornunge.structural.facade.service.ShippingService;

public class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade(InventoryService inventoryService, PaymentService paymentService, ShippingService shippingService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    void order(Product product){
        System.out.println(String.format("--- Ordering %s ---", product));
        if (inventoryService.isAvailable(product)){
            if (paymentService.pay(product.getPrice())){
                shippingService.ship(product);
                System.out.println(product + " successfully paid and send for delivery.");
            }else{
                System.out.println("Payment failed, please try again.");
            }
        }else{
            System.out.println(String.format("Sorry, %s is currently unavailable, please try later.", product));
        }
    }
}
