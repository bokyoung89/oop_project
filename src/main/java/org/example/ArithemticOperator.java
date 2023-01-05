package org.example;

import java.util.Arrays;

public enum ArithemticOperator {
    ADDITION("+") {
        //추상메소드에 대한 override 메소드 구현
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },
    SUBTRACTION("-") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },
    MULTIPLCATION("*") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },
    DIVISION("/") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithemticOperator(String operator) {
        this.operator = operator;
    }

    //추상메소드 선언
    public abstract int arithmeticCalculate(final int operand1, final int operand2);

    //외부에 노출되는 public interface
    public static int calculate(int operand1, String operator, int operand2) {
        ArithemticOperator arithemticOperator = Arrays.stream(values()) // 모든 enum 값을 가져옴
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
        return arithemticOperator.arithmeticCalculate(operand1, operand2);
    }
}
