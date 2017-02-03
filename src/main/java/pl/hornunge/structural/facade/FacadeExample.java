package pl.hornunge.structural.facade;

import pl.hornunge.structural.facade.product.Product;
import pl.hornunge.structural.facade.service.InventoryService;
import pl.hornunge.structural.facade.service.PaymentService;
import pl.hornunge.structural.facade.service.ShippingService;

import java.math.BigDecimal;

public class FacadeExample {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade(new InventoryService(), new PaymentService(), new ShippingService());
        orderFacade.order(new Product(1, "TV", new BigDecimal("1000")));
        orderFacade.order(new Product(11, "PC", new BigDecimal("2000")));
        orderFacade.order(new Product(2, "Fridge", new BigDecimal("1200")));
    }
}
