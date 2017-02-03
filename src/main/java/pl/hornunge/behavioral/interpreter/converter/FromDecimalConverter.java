package pl.hornunge.behavioral.interpreter.converter;

import java.math.BigDecimal;

public class FromDecimalConverter implements ToBigDecimalConverter {
    @Override
    public BigDecimal toBigDecimal(String string) {
        return new BigDecimal(string);
    }
}
