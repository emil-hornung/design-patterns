package pl.hornunge.behavioral.strategy;

import pl.hornunge.behavioral.strategy.cart.Cart;
import pl.hornunge.behavioral.strategy.cart.CartItem;
import pl.hornunge.behavioral.strategy.payment.CreditCardPaymentStrategy;
import pl.hornunge.behavioral.strategy.payment.PayPalPaymentStrategy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StrategyExample {
    public static void main(String[] args) {
        Cart cart = new Cart();
        CartItem apples = new CartItem("Apples", 3, BigDecimal.valueOf(4));
        CartItem strawberries = new CartItem("Strawberries", 1, BigDecimal.valueOf(9));
        cart.addCartItem(apples);
        cart.addCartItem(strawberries);

        cart.pay(new CreditCardPaymentStrategy("Emil Hornung", "1234-1234-1234", "5674", LocalDate.of(2020,10,5)));
        cart.pay(new PayPalPaymentStrategy("EmilHornungPayPalID"));
    }
}
