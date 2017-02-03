package pl.hornunge.behavioral.strategy.payment;

import java.math.BigDecimal;

public class PayPalPaymentStrategy implements PaymentStrategy {

    private String payPalId;

    public PayPalPaymentStrategy(String payPalId) {
        this.payPalId = payPalId;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(
                String.format(
                        "Amount: %s paid with payPal: %s.",
                        amount, payPalId
                ));
    }
}
