package com.java8;

import java.util.function.Function;

public class FunctionTesting1 {

    public static void main(String[] args) {
        Function<String,Integer> v1 = s -> s.length();
        Function<String,String>  v2 = s -> s.toUpperCase();

        System.out.println(v1.apply("Devna Sarath"));
        System.out.println(v2.apply("Devna Sarath"));

    }
}
