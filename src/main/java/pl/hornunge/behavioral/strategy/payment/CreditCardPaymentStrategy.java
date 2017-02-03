package pl.hornunge.behavioral.strategy.payment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String holdersName;
    private String cardNumber;
    private String cvv;
    private LocalDate expiryDate;

    public CreditCardPaymentStrategy(String holdersName, String cardNumber, String cvv, LocalDate expiryDate) {
        this.holdersName = holdersName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(
                String.format(
                        "Amount: %s paid with credit card: %s, %s, %s, %s.",
                        amount, holdersName, cardNumber, cvv, expiryDate
                ));
    }
}
