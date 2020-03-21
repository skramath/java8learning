package com.java8;

interface  StaticMethodInterf{
    static void m1(){
        System.out.println("Static Method Interface");
    }
}

public class InterfaceStaticMethodTesting implements StaticMethodInterf{

    public static void main(String[] args) {
        InterfaceStaticMethodTesting smt = new InterfaceStaticMethodTesting();
        StaticMethodInterf.m1();
    }
}
