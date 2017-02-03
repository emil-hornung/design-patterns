package pl.hornunge.behavioral.interpreter.converter;

import java.math.BigDecimal;

public class FromBinaryConverter implements ToBigDecimalConverter {

    private static final int BINARY_RADIX = 2;

    @Override
    public BigDecimal toBigDecimal(String string) {
        return new BigDecimal(Integer.parseInt(string, BINARY_RADIX));
    }
}
