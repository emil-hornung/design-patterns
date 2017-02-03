package pl.hornunge.behavioral.interpreter;

import com.google.common.primitives.Doubles;
import pl.hornunge.behavioral.interpreter.expression.Expression;
import pl.hornunge.behavioral.interpreter.expression.non_terminal.AddExpression;
import pl.hornunge.behavioral.interpreter.expression.non_terminal.DivideExpression;
import pl.hornunge.behavioral.interpreter.expression.non_terminal.MultiplyExpression;
import pl.hornunge.behavioral.interpreter.expression.non_terminal.OperatorExpression;
import pl.hornunge.behavioral.interpreter.expression.non_terminal.SubtractExpression;
import pl.hornunge.behavioral.interpreter.expression.terminal.NumberExpression;

import java.util.Stack;

public class Parser {
    public static Expression parseExpression(String input, String delimiter) {
        Stack<Expression> expressionStack = new Stack<>();
        String[] inputAsTokens = input.split(delimiter);
        for (String token : inputAsTokens) {
            if (isNumber(token)) {
                handleNumber(expressionStack, token);
            } else {
                expressionStack.push(createOperatorExpression(token));
            }
        }
        return expressionStack.peek();
    }

    private static void handleNumber(Stack<Expression> expressionStack, String token) {
        if (expressionStack.isEmpty()) {
            expressionStack.push(new NumberExpression(token));
        } else {
            OperatorExpression operatorExpression = (OperatorExpression) expressionStack.pop();
            Expression leftArgument = expressionStack.pop();
            Expression rightArgument = new NumberExpression(token);

            operatorExpression.setArguments(leftArgument, rightArgument);
            expressionStack.push(operatorExpression);
        }
    }

    private static boolean isNumber(String string) {
        return Doubles.tryParse(string) != null;
    }

    private static Expression createOperatorExpression(String operator){
        //one way to avoid this switch that comes to my mind is a map or chain of responsibility
        switch (operator){
            case "+":
                return new AddExpression();
            case "-":
                return new SubtractExpression();
            case "*":
                return new MultiplyExpression();
            case "/":
                return new DivideExpression();
            default:
                throw new IllegalArgumentException("Can't create operator expression for operator: " + operator);
        }
    }

}
