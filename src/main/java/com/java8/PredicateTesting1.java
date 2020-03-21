package com.java8;

import java.util.function.Predicate;

public class PredicateTesting1 {

    public static void main(String[] args) {
        Predicate<Integer> v1 = (I) -> (I > 10);
        Predicate<String> v2 = (S) -> S.length() > 5;
        Predicate<Double> v3 = (D) -> D.isNaN();

        System.out.println(v1.test(100)+ " "+v1.test(5));
        System.out.println(v2 .test("Devna")+ " "+v2.test("Devna Sarath"));
        System.out.println(v3.test(234.44)+ " "+v3.test(0.0));
    }
}

