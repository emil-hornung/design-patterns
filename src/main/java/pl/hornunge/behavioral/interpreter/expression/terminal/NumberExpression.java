package pl.hornunge.behavioral.interpreter.expression.terminal;

import pl.hornunge.behavioral.interpreter.converter.ToBigDecimalConverter;
import pl.hornunge.behavioral.interpreter.expression.Expression;

import java.math.BigDecimal;

import static com.google.common.base.Preconditions.checkNotNull;

public class NumberExpression implements Expression {
    private final String numberAsString;

    public NumberExpression(String numberAsString) {
        this.numberAsString = checkNotNull(numberAsString);
    }

    @Override
    public BigDecimal interpret(ToBigDecimalConverter converter) {
        return converter.toBigDecimal(numberAsString);
    }
}
