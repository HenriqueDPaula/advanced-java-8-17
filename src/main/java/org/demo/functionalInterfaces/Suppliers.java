package org.demo.functionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) throws InterruptedException {

        Supplier<LocalDateTime> now = LocalDateTime::now;
        Supplier<Double> randomSupplier = Math::random;

        // invoke
        System.out.println(now.get());

        Thread.sleep(1500);

        // invoke again but with different value
        System.out.println(now.get());

        // Math random supplier
        System.out.println(randomSupplier.get());

    }

}
