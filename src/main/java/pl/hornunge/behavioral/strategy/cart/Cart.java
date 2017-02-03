package pl.hornunge.behavioral.strategy.cart;

import pl.hornunge.behavioral.strategy.payment.PaymentStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartItem> cartItems = new ArrayList<>();

    public void addCartItem(CartItem cartItem){
        cartItems.add(cartItem);
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateAmountToPay());
    }

    private BigDecimal calculateAmountToPay() {
        return cartItems.stream()
                .map(CartItem::calculateTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
