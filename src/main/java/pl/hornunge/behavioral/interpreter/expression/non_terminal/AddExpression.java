package pl.hornunge.behavioral.interpreter.expression.non_terminal;

import pl.hornunge.behavioral.interpreter.converter.ToBigDecimalConverter;

import java.math.BigDecimal;

public class AddExpression extends OperatorExpression{
    @Override
    protected BigDecimal doInterpret(ToBigDecimalConverter converter) {
        return interpretLeftArgument(converter).add(interpretRightArgument(converter));
    }
}
