package com.hillel.homework.lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int first[] = new int[7];
        for(int i = 0; i < first.length; i++) {
            first[i] = (int)(Math.random() * 10);
        }
        Arrays.sort(first);

        int second[] = new int[7];
        System.out.println("Введите 7 цифр от 0 до 9: ");
        for (int i = 0; i < second.length; i++) {
            second[i] = Integer.parseInt(READER.readLine());
        }
        Arrays.sort(second);

        for (int i = 0; i < 7; i++) {
            if (first[i]==second[i])count++;
        }

        System.out.print(Arrays.toString(first) + "\n");
        System.out.print(Arrays.toString(second) + "\n");
        System.out.printf("Количество совпадений: %d", count);
    }
}