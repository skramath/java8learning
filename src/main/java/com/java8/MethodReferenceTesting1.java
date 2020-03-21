package com.java8;

@FunctionalInterface
interface MethodRefInterf1{

    public void m1();
}

public class MethodReferenceTesting1 {

    public static void main(String[] args) {
        System.out.println("Method Reference Testing");
        MethodRefInterf1 m1 = MethodReferenceTesting1::m2;
        m1.m1();

        MethodReferenceTesting1 t1 = new MethodReferenceTesting1();
        MethodRefInterf1 m2 = t1::m3;
        m2.m1();
    }

    //instance method
    public void m3(){
        System.out.println("M3 : Already Implemented the M1 method here");
    }

    //static method
    public static void m2(){
        System.out.println("M2 : Already Implemented the M1 method here");
    }
}
