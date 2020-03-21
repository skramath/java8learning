package com.java8;

interface DefaultInterf{

    default void m1(){
        System.out.println("Hello Default Method");
    }
}

    public class DefaultTesting implements DefaultInterf{

        public static void main(String[] args) {
             DefaultTesting test = new DefaultTesting();
             test.m1();

        }

        @Override
        public void m1() {
            System.out.println("My Own Default method Implementation");
        }
    }
