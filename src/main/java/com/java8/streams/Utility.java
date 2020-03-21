package com.java8.streams;

import java.util.ArrayList;
import java.util.function.Supplier;

class Utility{

    public ArrayList<Integer> getNumbers(){
        Supplier<ArrayList> numbers = () ->{
            ArrayList<Integer> numList = new ArrayList<>();
            numList.add(123);
            numList.add(32);
            numList.add(13);
            numList.add(26);
            numList.add(10);
            return numList;
        };
        return numbers.get();
    }
}
