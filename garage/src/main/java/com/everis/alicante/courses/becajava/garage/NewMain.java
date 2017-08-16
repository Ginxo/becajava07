package com.everis.alicante.courses.becajava.garage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by emingora on 24/07/2017.
 */
public class NewMain {
    public static void main(String... args) {
        List<Integer> integers = Arrays.asList(1, 1, 1, 3, 4, 5, 7, 8, 5, 6, 7, 8);
        integers.stream().reduce((a, b) -> a+b).ifPresent(System.out::println);
//        List<Integer> integersB = Arrays.asList(1, 1, 1, 3, 4, 5, 7, 8, 5, 6, 7, 8);


//        System.out.println(integers.stream().collect(Collectors.counting()));
    }
}
