package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTranspose {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите количество строк матрицы: ");
        int matrixm = Integer.parseInt(READER.readLine());

        System.out.println("Введите количество столбцов матрицы: ");
        int matrixn = Integer.parseInt(READER.readLine());

        int[][] matrix = new int[matrixm][matrixn];

        inputmatrix(matrix, matrixm, matrixn);
        outputmatrix(matrix, matrixm, matrixn);
        transposematrix(matrix, matrixm, matrixn);

    }

    public static void inputmatrix(int[][] matrix, int matrixm, int matrixn) throws IOException {

        System.out.println("Введите числа (каждое число с новой строки и после пустой строки новая строка):");
        for (int i = 0; i < matrixm; i++) {
            for (int j = 0; j < matrixn; j++) {
                matrix[i][j] = Integer.parseInt(READER.readLine());
            }
            System.out.println();
        }

    }

    public static void outputmatrix(int[][] matrix, int matrixm, int matrixn) {

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrixm; i++) {
            for (int j = 0; j < matrixn; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transposematrix(int[][] matrix, int matrixm, int matrixn) {

        System.out.println("\n" + "Транспонированная матрица: ");
        for (int i = 0; i < matrixn; i++) {
            for (int j = 0; j < matrixm; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

}