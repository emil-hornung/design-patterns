package pl.hornunge.behavioral.strategy.cart;

import java.math.BigDecimal;

public class CartItem {
    private String name;
    private int quantity;
    private BigDecimal unitPrice;

    public CartItem(String name, int quantity, BigDecimal unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public BigDecimal calculateTotal(){
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }
}
