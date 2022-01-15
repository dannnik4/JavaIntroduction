package com.hillel.homework.lesson08;

import static com.hillel.classwork.lesson09.ArraySort.fill;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int numbers[] = new int[20];
        fill(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] num1 = Arrays.copyOfRange(numbers, 0, 10);
        int[] num2 = Arrays.copyOfRange(numbers, 10, 20);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }

}