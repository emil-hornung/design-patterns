package pl.hornunge.behavioral.strategy.payment;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal amount);
}
