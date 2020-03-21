package com.java8;

interface Left{

    default void m1(){
        System.out.println("Left Default Method");
    }
}

interface  Right{

    default void m1(){
        System.out.println("Right Default Method");
    }
}

public class DefaultMethodTesting2 implements Left,Right{

    public static void main(String[] args) {
        DefaultMethodTesting2 t2 = new DefaultMethodTesting2();
        t2.m1();
    }

    @Override
    public void m1() {
        System.out.println("My Own Default Method");
        Left.super.m1();
        Right.super.m1();
    }
}
