package pl.hornunge.behavioral.interpreter.expression;

import pl.hornunge.behavioral.interpreter.converter.ToBigDecimalConverter;

import java.math.BigDecimal;

public interface Expression {
    BigDecimal interpret(ToBigDecimalConverter converter);
}
