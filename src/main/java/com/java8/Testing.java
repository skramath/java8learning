package com.java8;

@FunctionalInterface
interface FuncInterf1 {
    public void m1(int x);
}

@FunctionalInterface
interface FuncInterf2 extends FuncInterf1 {

    void m1(int x);

}


public class Testing {

    public static void main(String[] args) {
        new Testing().printLambda().m1(200);

        FuncInterf2 f = (x) -> {
            System.out.println("main ->"+x);
        };

        f.m1(300);
    }

    FuncInterf1 printLambda(){
        FuncInterf2 f = (x) -> {
            System.out.println("hello ->"+x);
        };
        return f;
    }
}
