package org.demo.functionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperators {

    public static void main(String[] args) {

        // The generic type must be the same of the response
        UnaryOperator<String> strUpperCase = String::toUpperCase;

        System.out.println(strUpperCase.apply("java"));

        // Same as unary operator
        BinaryOperator<Integer> numericSum = (num1, num2) -> num1 + num2; // can be Integer::sum
        System.out.println(numericSum.apply(1, 2));

    }
}
