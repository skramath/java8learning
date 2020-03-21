package com.java8;

import java.util.function.Consumer;

import static java.lang.System.*;

public class ConsumerTesting1 {

    public static void main(String[] args) {

        Consumer<String> c = (s) ->  {
            out.println(s);
            out.println(s.toUpperCase());
            out.println(s.length());

        };
        c.accept("Devna Sarath");

    }
}
