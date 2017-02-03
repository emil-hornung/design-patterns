package pl.hornunge.behavioral.interpreter.converter;

import java.math.BigDecimal;

public class FromHexadecimalConverter implements ToBigDecimalConverter {
    private static final int HEX_RADIX = 16;

    @Override
    public BigDecimal toBigDecimal(String string) {
        return new BigDecimal(Integer.parseInt(string, HEX_RADIX));
    }
}
