package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NegativeNumbers {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите размер массива: ");
        int arraySize = Integer.parseInt(READER.readLine());

        int temp = 0;
        String inf;
        int[][] array = new int[arraySize][arraySize];
        Random newRandomNumber = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = newRandomNumber.nextInt(21) + -10;
                System.out.printf("%d  ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n" + "Номера ячеек с отрицательными числами:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i][j] < 0) {
                    System.out.printf("%d%d, ", i, j);
                }
            }
        }
        System.out.println();

    }

}