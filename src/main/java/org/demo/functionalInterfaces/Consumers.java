package org.demo.functionalInterfaces;

import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {

        // Simple Consumer
        StringBuilder stringBuilder = new StringBuilder();

        Consumer<String> sbConsumer = stringBuilder::append;

        sbConsumer.accept("invoking ");
        sbConsumer.accept("stringBuilder::");
        sbConsumer.accept("append");

        System.out.println(stringBuilder);

        // BiConsumer
        var mapUniqueNames = new LinkedHashMap<Integer, String>();

        BiConsumer<Integer, String> mapPut = mapUniqueNames::put;
        BiConsumer<Integer, String> mapPrint = (id, name) -> System.out.println("id = " + id + ", name = " + name);

        mapPut.accept(1, "Henrique");
        mapPut.accept(1, "Henrique");
        mapPut.accept(2, "Java");

        mapUniqueNames.entrySet().forEach(System.out::println);
        mapUniqueNames.forEach(mapPrint);
    }
}
