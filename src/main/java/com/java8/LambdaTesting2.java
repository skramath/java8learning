package com.java8;

interface LambdaTestingInterf{
    public void m1();
}

public class LambdaTesting2 {
    int x =888;
    public void m2(){

        LambdaTestingInterf interf = () ->{
            int x =999;
            System.out.println(this.x);
            x = x +1;
            System.out.println(x);

        };
        interf.m1();
    }

    public static void main(String[] args) {
        new LambdaTesting2().m2();
    }
}
