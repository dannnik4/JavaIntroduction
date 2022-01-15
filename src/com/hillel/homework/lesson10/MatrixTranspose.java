package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTranspose {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите количество строк матрицы: ");
        int MatrixM = Integer.parseInt(READER.readLine());

        System.out.println("Введите количество столбцов матрицы: ");
        int MatrixN = Integer.parseInt(READER.readLine());

        int[][] Matrix = new int[MatrixM][MatrixN];

        InputMatrix(Matrix, MatrixM, MatrixN);
        OutputMatrix(Matrix, MatrixM, MatrixN);
        TransposeMatrix(Matrix, MatrixM, MatrixN);
        OutputTransposeMatrix(Matrix, MatrixM, MatrixN);

    }

    public static void InputMatrix(int[][] Matrix, int MatrixM, int MatrixN) throws IOException {

        System.out.println("Введите числа (каждое число с новой строки и после пустой строки новая строка):");
        for (int i = 0; i < MatrixM; i++) {
            for (int j = 0; j < MatrixN; j++) {
                Matrix[i][j] = Integer.parseInt(READER.readLine());
            }
            System.out.println();
        }

    }

    public static void OutputMatrix(int[][] Matrix, int MatrixM, int MatrixN) {

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < MatrixM; i++) {
            for (int j = 0; j < MatrixN; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void TransposeMatrix(int[][] Matrix, int MatrixM, int MatrixN) {

        for (int i = 0; i < MatrixM; i++) {
            for (int j = i; j < MatrixN; j++) {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }
        }

    }

    public static void OutputTransposeMatrix(int[][] Matrix, int MatrixM, int MatrixN) {

        System.out.println("\n" + "Транспонированная матрица: ");
        for (int i = 0; i < MatrixM; i++) {
            for (int j = 0; j < MatrixN; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}