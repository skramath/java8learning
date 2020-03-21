package com.java8;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTesting1 {

    public static void main(String[] args) {
        Supplier<ArrayList> sList = () -> {
            ArrayList arrList = new ArrayList<String>();
            arrList.add("Sarath");
            arrList.add("Sitara");
            arrList.add("Devna");
            return arrList;
        };
        sList.get();
    }

    public ArrayList get() {
        Supplier<ArrayList> sList1 = () -> {
            ArrayList arrList = new ArrayList<String>();
            arrList.add("Sarath");
            arrList.add("Sitara");
            arrList.add("Devna");
            return arrList;
        };
        return sList1.get();
    }
}
