package pl.hornunge.behavioral.interpreter.expression.non_terminal;

import pl.hornunge.behavioral.interpreter.converter.ToBigDecimalConverter;
import pl.hornunge.behavioral.interpreter.expression.Expression;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

public abstract class OperatorExpression implements Expression {
    private Expression leftArgument;
    private Expression rightArgument;

    public void setArguments(Expression leftArgument, Expression rightArgument) {
        checkState(this.leftArgument == null, "Left argument already set.");
        checkState(this.rightArgument == null, "Right argument already set.");

        this.leftArgument = checkNotNull(leftArgument);
        this.rightArgument = checkNotNull(rightArgument);
    }

    @Override
    public BigDecimal interpret(ToBigDecimalConverter converter) {
        checkArgumentsAreSet();
        return doInterpret(converter);
    }

    private void checkArgumentsAreSet() {
        checkState(leftArgument != null, "Left argument not set.");
        checkState(rightArgument != null, "Right argument not set.");
    }

    protected abstract BigDecimal doInterpret(ToBigDecimalConverter converter);

    protected BigDecimal interpretLeftArgument(ToBigDecimalConverter converter) {
        return leftArgument.interpret(converter);
    }

    protected BigDecimal interpretRightArgument(ToBigDecimalConverter converter) {
        return rightArgument.interpret(converter);
    }
}
