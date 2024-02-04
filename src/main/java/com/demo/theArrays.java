package com.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class theArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "green";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        // Corrected loop condition
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println("Index " + i + ": " + colors[i]);
        }
        System.out.println(colors.length);

        for (String color : colors){
            System.out.println(color);
        }
        Arrays.stream(colors).forEach(System.out::println);


        // int[] numbers = {100, 200};
    }
}
