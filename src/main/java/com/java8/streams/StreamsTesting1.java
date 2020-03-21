package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsTesting1 {

    public static void main(String[] args) {
        List<Integer> evenNumbers = new Utility().getNumbers().stream()
               .filter(i -> i % 2 == 0 )
               .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
