package pl.hornunge.behavioral.interpreter;

import pl.hornunge.behavioral.interpreter.converter.FromDecimalConverter;
import pl.hornunge.behavioral.interpreter.converter.FromHexadecimalConverter;
import pl.hornunge.behavioral.interpreter.expression.Expression;

import java.text.MessageFormat;

public class InterpreterExample {
    public static void main(String[] args) {
        String input = "3 + 5 - 2 - 9 + 123 - 1";
        String delimiter = " ";

        Expression expression = Parser.parseExpression(input, delimiter);

        System.out.println("Result when treated as decimal numbers = " + expression.interpret(new FromDecimalConverter()));
        System.out.println("Result when treated as hexadecimal numbers = " + expression.interpret(new FromHexadecimalConverter()));

        MessageFormat.format("", 1, "asd");
    }

}
