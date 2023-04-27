package org.demo.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        // Simple Function
        Function<String, String> lowerCaseFunc = String::toLowerCase;
        System.out.println("Function: " + lowerCaseFunc.apply("HENRIQUE"));

        // BiFunction
        BiFunction<String, String, Boolean> lowerCaseEquals = String::equalsIgnoreCase;
        System.out.println("BiFunction: " + lowerCaseEquals.apply("JAVA", "java"));

    }
}
