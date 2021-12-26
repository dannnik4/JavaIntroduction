package com.hillel.classwork.lesson09;

import static com.hillel.classwork.lesson09.ArraySort.fill;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int numbers[] = new int[10];
        fill(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] ints = Arrays.copyOf(numbers, 20);
        System.out.println(Arrays.toString(ints));

    }

}