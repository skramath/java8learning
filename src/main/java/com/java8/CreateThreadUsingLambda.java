package com.java8;

public class CreateThreadUsingLambda {

    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i=0 ; i<50; i++) {
                System.out.println("Inside Thread ->" + i);
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int i=0 ; i<50; i++) {
            System.out.println("Inside Main ->" + i);
        }

    }
}
