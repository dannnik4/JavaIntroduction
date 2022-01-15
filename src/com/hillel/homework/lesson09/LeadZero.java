package com.hillel.homework.lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LeadZero {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int numbers[] = new int[6];
        System.out.println("Введите 6 цифр:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(READER.readLine());
        }
        Arrays.sort(numbers);

        int a = 0;

        NumbersSort(numbers, a);

        System.out.print(Arrays.toString(numbers));

    }

    public static void NumbersSort(int[] numbers, int a) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] == 0) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
        }

    }
}