package com.demo;

import java.util.ArrayList;
import java.util.List;

public class theLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(); //onely string data
        colors.add("red");
        colors.add("green");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));

        colors.forEach(System.out::println);

        for (int i=0;i< colors.size();i++){
            System.out.println(colors.get(i));
        }

        //unchanged list
        List<String> colorsUnchange = List.of('red','green');
       // colors.add(0000); List colors = new ArrayList(); many types of data
       // colors.add(new Object());
    }
}
