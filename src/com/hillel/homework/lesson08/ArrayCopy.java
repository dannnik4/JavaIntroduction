package com.hillel.homework.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCopy {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int numbers[] = new int[20];

        System.out.println("Введите 20 элементов массива (каждый новый элемент с новой строки): ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(READER.readLine());
        }

        System.out.println(Arrays.toString(numbers));
        int[] num1 = Arrays.copyOfRange(numbers, 0, 10);
        int[] num2 = Arrays.copyOfRange(numbers, 10, 20);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }

}