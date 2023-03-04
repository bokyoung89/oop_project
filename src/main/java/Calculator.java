import calculate.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> artithmeticOperator = List.of(new AdditionOperator(), new DivisionOperator(), new MultiplicationOperator(), new SubtractionOperator());
    public static int calculate(int operand1, String operator, int operand2) {
        return artithmeticOperator.stream()
                .filter(artithmeticOperator -> artithmeticOperator.supports(operator))
                .map(artithmeticOperator -> artithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
