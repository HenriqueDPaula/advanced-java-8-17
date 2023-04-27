package org.demo.functionalInterfaces;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        // Simple Predicate
        Predicate<String> isBlank = String::isBlank;

        String s = "test";

        // Predicate with chained optional
        Optional.of(s)
                .filter(isBlank.negate())
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Blank String")
                );


        // BiPredicate
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;

        System.out.println(checkLength.test("Henrique", 8));
        System.out.println(checkLength.test("abc", 8));
    }
}
