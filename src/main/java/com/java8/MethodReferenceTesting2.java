package com.java8;

public class MethodReferenceTesting2 {

    public void m1(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        Thread  t = new Thread (new MethodReferenceTesting2()::m1);
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main thread");
        }

    }
}
