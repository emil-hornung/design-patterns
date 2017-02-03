package pl.hornunge.structural.facade.service;

import java.math.BigDecimal;

public class PaymentService {
    public boolean pay(BigDecimal amount){
        System.out.println("Paying " + amount);
        return amount.compareTo(new BigDecimal("1000")) <= 0;
    }
}
